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
public class ListSetsRequest extends RpcAcsRequest<ListSetsResponse> {
	   

	private String project;

	private String marker;
	public ListSetsRequest() {
		super("imm", "2017-09-06", "ListSets", "imm");
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

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker != null){
			putQueryParameter("Marker", marker);
		}
	}

	@Override
	public Class<ListSetsResponse> getResponseClass() {
		return ListSetsResponse.class;
	}

}
