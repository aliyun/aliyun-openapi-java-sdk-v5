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

package com.aliyuncs.v5.dbs.model.v20190306;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.dbs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPlanListRequest extends RpcAcsRequest<DescribeBackupPlanListResponse> {
	   

	private String clientToken;

	private String backupPlanId;

	private Integer pageNum;

	private String ownerId;

	private String backupPlanStatus;

	private String backupPlanName;

	private Integer pageSize;

	private String region;
	public DescribeBackupPlanListRequest() {
		super("Dbs", "2019-03-06", "DescribeBackupPlanList", "cbs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getBackupPlanId() {
		return this.backupPlanId;
	}

	public void setBackupPlanId(String backupPlanId) {
		this.backupPlanId = backupPlanId;
		if(backupPlanId != null){
			putQueryParameter("BackupPlanId", backupPlanId);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getBackupPlanStatus() {
		return this.backupPlanStatus;
	}

	public void setBackupPlanStatus(String backupPlanStatus) {
		this.backupPlanStatus = backupPlanStatus;
		if(backupPlanStatus != null){
			putQueryParameter("BackupPlanStatus", backupPlanStatus);
		}
	}

	public String getBackupPlanName() {
		return this.backupPlanName;
	}

	public void setBackupPlanName(String backupPlanName) {
		this.backupPlanName = backupPlanName;
		if(backupPlanName != null){
			putQueryParameter("BackupPlanName", backupPlanName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<DescribeBackupPlanListResponse> getResponseClass() {
		return DescribeBackupPlanListResponse.class;
	}

}
