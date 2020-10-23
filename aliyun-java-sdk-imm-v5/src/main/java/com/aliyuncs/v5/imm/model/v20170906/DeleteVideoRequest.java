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
public class DeleteVideoRequest extends RpcAcsRequest<DeleteVideoResponse> {
	   

	private String project;

	private Boolean resources;

	private String videoUri;

	private String setId;
	public DeleteVideoRequest() {
		super("imm", "2017-09-06", "DeleteVideo", "imm");
		setMethod(MethodType.POST);
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

	public Boolean getResources() {
		return this.resources;
	}

	public void setResources(Boolean resources) {
		this.resources = resources;
		if(resources != null){
			putQueryParameter("Resources", resources.toString());
		}
	}

	public String getVideoUri() {
		return this.videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
		if(videoUri != null){
			putQueryParameter("VideoUri", videoUri);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	@Override
	public Class<DeleteVideoResponse> getResponseClass() {
		return DeleteVideoResponse.class;
	}

}
