package com.aliyuncs.v5.auth;


import com.aliyuncs.v5.DefaultAcsClient;
import com.aliyuncs.v5.IAcsClient;
import com.aliyuncs.v5.auth.sts.GenerateSessionAccessKeyResponse;
import com.aliyuncs.v5.auth.sts.GetSessionAccessKeyRequest;
import com.aliyuncs.v5.exceptions.ClientException;
import com.aliyuncs.v5.exceptions.ServerException;
import com.aliyuncs.v5.http.ProtocolType;
import com.aliyuncs.v5.profile.DefaultProfile;
import com.aliyuncs.v5.profile.IClientProfile;

public class STSGetSessionAccessKeyCredentialsProvider implements AlibabaCloudCredentialsProvider {

    public static final int DEFAULT_DURATION_SECONDS = 3600;
    private KeyPairCredentials keyPairCredentials;
    private String publicKeyId;
    private IAcsClient stsClient;
    private long sessionDurationSeconds = DEFAULT_DURATION_SECONDS;
    private BasicSessionCredentials sessionCredentials = null;

    public STSGetSessionAccessKeyCredentialsProvider(KeyPairCredentials keyPairCredentials,
                                                     IClientProfile profile) {
        this.keyPairCredentials = keyPairCredentials;
        this.stsClient = new DefaultAcsClient(profile, keyPairCredentials);
    }

    public STSGetSessionAccessKeyCredentialsProvider(String publicKeyId, String privateKey) {
        this.publicKeyId = publicKeyId;
        DefaultProfile profile = DefaultProfile.getProfile("ap-northeast-1", publicKeyId, privateKey);
        this.stsClient = new DefaultAcsClient(profile);
    }


    public STSGetSessionAccessKeyCredentialsProvider withDurationSeconds(long seconds) {
        this.sessionDurationSeconds = seconds;
        return this;
    }

    public STSGetSessionAccessKeyCredentialsProvider withSTSClient(IAcsClient client) {
        this.stsClient = client;
        return this;
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException, ServerException {
        if (sessionCredentials == null || sessionCredentials.willSoonExpire()) {
            sessionCredentials = getNewSessionCredentials();
        }
        return sessionCredentials;
    }

    private BasicSessionCredentials getNewSessionCredentials() throws ClientException, ServerException {
        GetSessionAccessKeyRequest request = new GetSessionAccessKeyRequest();
        if (null != publicKeyId) {
            request.setPublicKeyId(publicKeyId);
        } else {
            request.setPublicKeyId(keyPairCredentials.getAccessKeyId());
        }
        request.setDurationSeconds((int) sessionDurationSeconds);
        request.setSysProtocol(ProtocolType.HTTPS);

        GenerateSessionAccessKeyResponse response = this.stsClient.getAcsResponse(request);

        return new BasicSessionCredentials(
                response.getSessionAccessKey().getSessionAccessKeyId(),
                response.getSessionAccessKey().getSessionAccessKeySecert(),
                null,
                sessionDurationSeconds
        );
    }
}
