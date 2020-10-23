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

package com.aliyuncs.v5.imm.model.v20170906;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetMediaMetaRequest extends RpcAcsRequest<GetMediaMetaResponse> {
	   

	private String mediaUri;

	private String project;
	public GetMediaMetaRequest() {
		super("imm", "2017-09-06", "GetMediaMeta", "imm");
		setMethod(MethodType.POST);
	}

	public String getMediaUri() {
		return this.mediaUri;
	}

	public void setMediaUri(String mediaUri) {
		this.mediaUri = mediaUri;
		if(mediaUri != null){
			putQueryParameter("MediaUri", mediaUri);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	@Override
	public Class<GetMediaMetaResponse> getResponseClass() {
		return GetMediaMetaResponse.class;
	}

}
