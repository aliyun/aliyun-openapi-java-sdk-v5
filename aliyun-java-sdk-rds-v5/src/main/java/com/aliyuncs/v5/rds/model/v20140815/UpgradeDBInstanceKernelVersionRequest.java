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

package com.aliyuncs.v5.rds.model.v20140815;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradeDBInstanceKernelVersionRequest extends RpcAcsRequest<UpgradeDBInstanceKernelVersionResponse> {
	   

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String upgradeTime;

	private String dBInstanceId;

	private String switchTime;
	public UpgradeDBInstanceKernelVersionRequest() {
		super("Rds", "2014-08-15", "UpgradeDBInstanceKernelVersion", "rds");
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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

	public String getUpgradeTime() {
		return this.upgradeTime;
	}

	public void setUpgradeTime(String upgradeTime) {
		this.upgradeTime = upgradeTime;
		if(upgradeTime != null){
			putQueryParameter("UpgradeTime", upgradeTime);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getSwitchTime() {
		return this.switchTime;
	}

	public void setSwitchTime(String switchTime) {
		this.switchTime = switchTime;
		if(switchTime != null){
			putQueryParameter("SwitchTime", switchTime);
		}
	}

	@Override
	public Class<UpgradeDBInstanceKernelVersionResponse> getResponseClass() {
		return UpgradeDBInstanceKernelVersionResponse.class;
	}

}
