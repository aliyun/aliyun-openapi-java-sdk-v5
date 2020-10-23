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

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.imm.transform.v20170906.UpdateProjectResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectResponse extends AcsResponse {

	private String requestId;

	private String project;

	private String createTime;

	private String modifyTime;

	private String serviceRole;

	private Integer cU;

	private String type;

	private String regionId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getServiceRole() {
		return this.serviceRole;
	}

	public void setServiceRole(String serviceRole) {
		this.serviceRole = serviceRole;
	}

	public Integer getCU() {
		return this.cU;
	}

	public void setCU(Integer cU) {
		this.cU = cU;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	@Override
	public UpdateProjectResponse getInstance(UnmarshallerContext context) {
		return	UpdateProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
