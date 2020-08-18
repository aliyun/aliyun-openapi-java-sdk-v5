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
public class ModifyDBInstanceProxyConfigurationRequest extends RpcAcsRequest<ModifyDBInstanceProxyConfigurationResponse> {
	   

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String proxyConfigurationValue;

	private Long ownerId;

	private String proxyConfigurationKey;

	private String dBInstanceId;
	public ModifyDBInstanceProxyConfigurationRequest() {
		super("Rds", "2014-08-15", "ModifyDBInstanceProxyConfiguration", "rds");
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

	public String getProxyConfigurationValue() {
		return this.proxyConfigurationValue;
	}

	public void setProxyConfigurationValue(String proxyConfigurationValue) {
		this.proxyConfigurationValue = proxyConfigurationValue;
		if(proxyConfigurationValue != null){
			putQueryParameter("ProxyConfigurationValue", proxyConfigurationValue);
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

	public String getProxyConfigurationKey() {
		return this.proxyConfigurationKey;
	}

	public void setProxyConfigurationKey(String proxyConfigurationKey) {
		this.proxyConfigurationKey = proxyConfigurationKey;
		if(proxyConfigurationKey != null){
			putQueryParameter("ProxyConfigurationKey", proxyConfigurationKey);
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

	@Override
	public Class<ModifyDBInstanceProxyConfigurationResponse> getResponseClass() {
		return ModifyDBInstanceProxyConfigurationResponse.class;
	}

}
