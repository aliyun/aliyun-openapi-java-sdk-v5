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
public class CheckCreateDdrDBInstanceRequest extends RpcAcsRequest<CheckCreateDdrDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private Integer dBInstanceStorage;

	private String sourceDBInstanceName;

	private String binlogRole;

	private String engineVersion;

	private String engine;

	private String restoreTime;

	private String resourceOwnerAccount;

	private String backupSetId;

	private Long ownerId;

	private String binlogPosition;

	private String dBInstanceClass;

	private String restoreType;

	private String binlogName;

	private String sourceRegion;
	public CheckCreateDdrDBInstanceRequest() {
		super("Rds", "2014-08-15", "CheckCreateDdrDBInstance", "rds");
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

	public Integer getDBInstanceStorage() {
		return this.dBInstanceStorage;
	}

	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		this.dBInstanceStorage = dBInstanceStorage;
		if(dBInstanceStorage != null){
			putQueryParameter("DBInstanceStorage", dBInstanceStorage.toString());
		}
	}

	public String getSourceDBInstanceName() {
		return this.sourceDBInstanceName;
	}

	public void setSourceDBInstanceName(String sourceDBInstanceName) {
		this.sourceDBInstanceName = sourceDBInstanceName;
		if(sourceDBInstanceName != null){
			putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
		}
	}

	public String getBinlogRole() {
		return this.binlogRole;
	}

	public void setBinlogRole(String binlogRole) {
		this.binlogRole = binlogRole;
		if(binlogRole != null){
			putQueryParameter("BinlogRole", binlogRole);
		}
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public String getRestoreTime() {
		return this.restoreTime;
	}

	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
		if(restoreTime != null){
			putQueryParameter("RestoreTime", restoreTime);
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

	public String getBackupSetId() {
		return this.backupSetId;
	}

	public void setBackupSetId(String backupSetId) {
		this.backupSetId = backupSetId;
		if(backupSetId != null){
			putQueryParameter("BackupSetId", backupSetId);
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

	public String getBinlogPosition() {
		return this.binlogPosition;
	}

	public void setBinlogPosition(String binlogPosition) {
		this.binlogPosition = binlogPosition;
		if(binlogPosition != null){
			putQueryParameter("BinlogPosition", binlogPosition);
		}
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		if(dBInstanceClass != null){
			putQueryParameter("DBInstanceClass", dBInstanceClass);
		}
	}

	public String getRestoreType() {
		return this.restoreType;
	}

	public void setRestoreType(String restoreType) {
		this.restoreType = restoreType;
		if(restoreType != null){
			putQueryParameter("RestoreType", restoreType);
		}
	}

	public String getBinlogName() {
		return this.binlogName;
	}

	public void setBinlogName(String binlogName) {
		this.binlogName = binlogName;
		if(binlogName != null){
			putQueryParameter("BinlogName", binlogName);
		}
	}

	public String getSourceRegion() {
		return this.sourceRegion;
	}

	public void setSourceRegion(String sourceRegion) {
		this.sourceRegion = sourceRegion;
		if(sourceRegion != null){
			putQueryParameter("SourceRegion", sourceRegion);
		}
	}

	@Override
	public Class<CheckCreateDdrDBInstanceResponse> getResponseClass() {
		return CheckCreateDdrDBInstanceResponse.class;
	}

}
