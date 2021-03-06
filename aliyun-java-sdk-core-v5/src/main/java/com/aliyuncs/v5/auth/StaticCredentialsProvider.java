package com.aliyuncs.v5.auth;

import com.aliyuncs.v5.profile.IClientProfile;

public class StaticCredentialsProvider implements AlibabaCloudCredentialsProvider {

    private AlibabaCloudCredentials credentials = null;

    public StaticCredentialsProvider(AlibabaCloudCredentials credentials) {
        this.credentials = credentials;
    }

    @SuppressWarnings("deprecation")
    public StaticCredentialsProvider(IClientProfile clientProfile) {
        IClientProfile clientProfile1 = clientProfile;
        Credential legacyCredential = clientProfile1.getCredential();
        if (null != legacyCredential.getSecurityToken()) {
            this.credentials = new BasicSessionCredentials(legacyCredential.getAccessKeyId(), legacyCredential
                    .getAccessSecret(), legacyCredential.getSecurityToken());
        } else {
            this.credentials = new LegacyCredentials(legacyCredential);
        }
    }

    @Override
    public AlibabaCloudCredentials getCredentials() {
        return this.credentials;
    }
}
