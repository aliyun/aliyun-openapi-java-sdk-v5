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

package com.aliyuncs.v5.cs.model.v20151215;

import com.aliyuncs.v5.RoaAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ResumeComponentUpgradeRequest extends RoaAcsRequest<ResumeComponentUpgradeResponse> {
	   

	private String componentid;

	private String clusterid;
	public ResumeComponentUpgradeRequest() {
		super("CS", "2015-12-15", "ResumeComponentUpgrade");
		setUriPattern("/clusters/[clusterid]/components/[componentid]/resume");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getComponentid() {
		return this.componentid;
	}

	public void setComponentid(String componentid) {
		this.componentid = componentid;
		if(componentid != null){
			putPathParameter("componentid", componentid);
		}
	}

	public String getClusterid() {
		return this.clusterid;
	}

	public void setClusterid(String clusterid) {
		this.clusterid = clusterid;
		if(clusterid != null){
			putPathParameter("clusterid", clusterid);
		}
	}

	@Override
	public Class<ResumeComponentUpgradeResponse> getResponseClass() {
		return ResumeComponentUpgradeResponse.class;
	}

}
