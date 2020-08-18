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
public class ModifyDasInstanceConfigRequest extends RpcAcsRequest<ModifyDasInstanceConfigResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String dBInstanceId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private Integer storageUpperBound;

	private Integer storageThreshold;

	private String storageAutoScale;
	public ModifyDasInstanceConfigRequest() {
		super("Rds", "2014-08-15", "ModifyDasInstanceConfig", "rds");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Integer getStorageUpperBound() {
		return this.storageUpperBound;
	}

	public void setStorageUpperBound(Integer storageUpperBound) {
		this.storageUpperBound = storageUpperBound;
		if(storageUpperBound != null){
			putQueryParameter("StorageUpperBound", storageUpperBound.toString());
		}
	}

	public Integer getStorageThreshold() {
		return this.storageThreshold;
	}

	public void setStorageThreshold(Integer storageThreshold) {
		this.storageThreshold = storageThreshold;
		if(storageThreshold != null){
			putQueryParameter("StorageThreshold", storageThreshold.toString());
		}
	}

	public String getStorageAutoScale() {
		return this.storageAutoScale;
	}

	public void setStorageAutoScale(String storageAutoScale) {
		this.storageAutoScale = storageAutoScale;
		if(storageAutoScale != null){
			putQueryParameter("StorageAutoScale", storageAutoScale);
		}
	}

	@Override
	public Class<ModifyDasInstanceConfigResponse> getResponseClass() {
		return ModifyDasInstanceConfigResponse.class;
	}

}
