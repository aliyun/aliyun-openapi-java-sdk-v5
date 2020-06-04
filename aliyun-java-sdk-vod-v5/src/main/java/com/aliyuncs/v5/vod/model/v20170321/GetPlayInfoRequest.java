/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.v5.vod.model.v20170321;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetPlayInfoRequest extends RpcAcsRequest<GetPlayInfoResponse> {
	   

	private Long resourceOwnerId;

	private String formats;

	private String reAuthInfo;

	private String playConfig;

	private String outputType;

	private String definition;

	private Long authTimeout;

	private String streamType;

	private String resourceOwnerAccount;

	private String videoId;

	private Long ownerId;

	private String resultType;
	public GetPlayInfoRequest() {
		super("vod", "2017-03-21", "GetPlayInfo", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getFormats() {
		return this.formats;
	}

	public void setFormats(String formats) {
		this.formats = formats;
		if(formats != null){
			putQueryParameter("Formats", formats);
		}
	}

	public String getReAuthInfo() {
		return this.reAuthInfo;
	}

	public void setReAuthInfo(String reAuthInfo) {
		this.reAuthInfo = reAuthInfo;
		if(reAuthInfo != null){
			putQueryParameter("ReAuthInfo", reAuthInfo);
		}
	}

	public String getPlayConfig() {
		return this.playConfig;
	}

	public void setPlayConfig(String playConfig) {
		this.playConfig = playConfig;
		if(playConfig != null){
			putQueryParameter("PlayConfig", playConfig);
		}
	}

	public String getOutputType() {
		return this.outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
		if(outputType != null){
			putQueryParameter("OutputType", outputType);
		}
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
		if(definition != null){
			putQueryParameter("Definition", definition);
		}
	}

	public Long getAuthTimeout() {
		return this.authTimeout;
	}

	public void setAuthTimeout(Long authTimeout) {
		this.authTimeout = authTimeout;
		if(authTimeout != null){
			putQueryParameter("AuthTimeout", authTimeout.toString());
		}
	}

	public String getStreamType() {
		return this.streamType;
	}

	public void setStreamType(String streamType) {
		this.streamType = streamType;
		if(streamType != null){
			putQueryParameter("StreamType", streamType);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putQueryParameter("VideoId", videoId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
		if(resultType != null){
			putQueryParameter("ResultType", resultType);
		}
	}

	@Override
	public Class<GetPlayInfoResponse> getResponseClass() {
		return GetPlayInfoResponse.class;
	}

}
