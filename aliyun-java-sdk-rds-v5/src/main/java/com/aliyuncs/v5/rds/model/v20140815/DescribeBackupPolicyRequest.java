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
public class DescribeBackupPolicyRequest extends RpcAcsRequest<DescribeBackupPolicyResponse> {
	   

	private Long resourceOwnerId;

	private String dBInstanceId;

	private String backupPolicyMode;

	private String releasedKeepPolicy;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String compressType;

	private Long ownerId;
	public DescribeBackupPolicyRequest() {
		super("Rds", "2014-08-15", "DescribeBackupPolicy", "rds");
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getBackupPolicyMode() {
		return this.backupPolicyMode;
	}

	public void setBackupPolicyMode(String backupPolicyMode) {
		this.backupPolicyMode = backupPolicyMode;
		if(backupPolicyMode != null){
			putQueryParameter("BackupPolicyMode", backupPolicyMode);
		}
	}

	public String getReleasedKeepPolicy() {
		return this.releasedKeepPolicy;
	}

	public void setReleasedKeepPolicy(String releasedKeepPolicy) {
		this.releasedKeepPolicy = releasedKeepPolicy;
		if(releasedKeepPolicy != null){
			putQueryParameter("ReleasedKeepPolicy", releasedKeepPolicy);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getCompressType() {
		return this.compressType;
	}

	public void setCompressType(String compressType) {
		this.compressType = compressType;
		if(compressType != null){
			putQueryParameter("CompressType", compressType);
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

	@Override
	public Class<DescribeBackupPolicyResponse> getResponseClass() {
		return DescribeBackupPolicyResponse.class;
	}

}
