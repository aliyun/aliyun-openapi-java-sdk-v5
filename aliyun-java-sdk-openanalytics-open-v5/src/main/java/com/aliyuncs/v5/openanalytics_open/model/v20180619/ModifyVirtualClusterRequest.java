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

package com.aliyuncs.v5.openanalytics_open.model.v20180619;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyVirtualClusterRequest extends RpcAcsRequest<ModifyVirtualClusterResponse> {
	   

	private String defaultExecutorSpecName;

	private String sparkModuleReleaseName;

	private String description;

	private Long defaultExecutorNumbers;

	private String name;

	private String defaultDriverSpecName;
	public ModifyVirtualClusterRequest() {
		super("openanalytics-open", "2018-06-19", "ModifyVirtualCluster", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDefaultExecutorSpecName() {
		return this.defaultExecutorSpecName;
	}

	public void setDefaultExecutorSpecName(String defaultExecutorSpecName) {
		this.defaultExecutorSpecName = defaultExecutorSpecName;
		if(defaultExecutorSpecName != null){
			putBodyParameter("DefaultExecutorSpecName", defaultExecutorSpecName);
		}
	}

	public String getSparkModuleReleaseName() {
		return this.sparkModuleReleaseName;
	}

	public void setSparkModuleReleaseName(String sparkModuleReleaseName) {
		this.sparkModuleReleaseName = sparkModuleReleaseName;
		if(sparkModuleReleaseName != null){
			putBodyParameter("SparkModuleReleaseName", sparkModuleReleaseName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Long getDefaultExecutorNumbers() {
		return this.defaultExecutorNumbers;
	}

	public void setDefaultExecutorNumbers(Long defaultExecutorNumbers) {
		this.defaultExecutorNumbers = defaultExecutorNumbers;
		if(defaultExecutorNumbers != null){
			putBodyParameter("DefaultExecutorNumbers", defaultExecutorNumbers.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getDefaultDriverSpecName() {
		return this.defaultDriverSpecName;
	}

	public void setDefaultDriverSpecName(String defaultDriverSpecName) {
		this.defaultDriverSpecName = defaultDriverSpecName;
		if(defaultDriverSpecName != null){
			putBodyParameter("DefaultDriverSpecName", defaultDriverSpecName);
		}
	}

	@Override
	public Class<ModifyVirtualClusterResponse> getResponseClass() {
		return ModifyVirtualClusterResponse.class;
	}

}
