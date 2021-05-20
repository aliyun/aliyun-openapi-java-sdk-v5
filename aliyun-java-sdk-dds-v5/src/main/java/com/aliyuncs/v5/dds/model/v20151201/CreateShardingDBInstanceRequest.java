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

package com.aliyuncs.v5.dds.model.v20151201;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.dds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateShardingDBInstanceRequest extends RpcAcsRequest<CreateShardingDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String engineVersion;

	private String networkType;

	private List<ReplicaSet> replicaSet;

	private String storageEngine;

	private String securityToken;

	private String engine;

	private String dBInstanceDescription;

	private Integer period;

	private String restoreTime;

	private String resourceOwnerAccount;

	private String srcDBInstanceId;

	private String ownerAccount;

	private List<ConfigServer> configServer;

	private Long ownerId;

	private String securityIPList;

	private String vSwitchId;

	private List<Mongos> mongos;

	private String accountPassword;

	private String autoRenew;

	private String vpcId;

	private String zoneId;

	private String protocolType;

	private String chargeType;
	public CreateShardingDBInstanceRequest() {
		super("Dds", "2015-12-01", "CreateShardingDBInstance");
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

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public List<ReplicaSet> getReplicaSet() {
		return this.replicaSet;
	}

	public void setReplicaSet(List<ReplicaSet> replicaSet) {
		this.replicaSet = replicaSet;	
		if (replicaSet != null) {
			for (int depth1 = 0; depth1 < replicaSet.size(); depth1++) {
				putQueryParameter("ReplicaSet." + (depth1 + 1) + ".ReadonlyReplicas" , replicaSet.get(depth1).getReadonlyReplicas());
				putQueryParameter("ReplicaSet." + (depth1 + 1) + ".Storage" , replicaSet.get(depth1).getStorage());
				putQueryParameter("ReplicaSet." + (depth1 + 1) + ".Class" , replicaSet.get(depth1).get_Class());
			}
		}	
	}

	public String getStorageEngine() {
		return this.storageEngine;
	}

	public void setStorageEngine(String storageEngine) {
		this.storageEngine = storageEngine;
		if(storageEngine != null){
			putQueryParameter("StorageEngine", storageEngine);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
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

	public String getSrcDBInstanceId() {
		return this.srcDBInstanceId;
	}

	public void setSrcDBInstanceId(String srcDBInstanceId) {
		this.srcDBInstanceId = srcDBInstanceId;
		if(srcDBInstanceId != null){
			putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
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

	public List<ConfigServer> getConfigServer() {
		return this.configServer;
	}

	public void setConfigServer(List<ConfigServer> configServer) {
		this.configServer = configServer;	
		if (configServer != null) {
			for (int depth1 = 0; depth1 < configServer.size(); depth1++) {
				putQueryParameter("ConfigServer." + (depth1 + 1) + ".Storage" , configServer.get(depth1).getStorage());
				putQueryParameter("ConfigServer." + (depth1 + 1) + ".Class" , configServer.get(depth1).get_Class());
			}
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

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public List<Mongos> getMongos() {
		return this.mongos;
	}

	public void setMongos(List<Mongos> mongos) {
		this.mongos = mongos;	
		if (mongos != null) {
			for (int depth1 = 0; depth1 < mongos.size(); depth1++) {
				putQueryParameter("Mongos." + (depth1 + 1) + ".Class" , mongos.get(depth1).get_Class());
			}
		}	
	}

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
		if(accountPassword != null){
			putQueryParameter("AccountPassword", accountPassword);
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public static class ReplicaSet {

		private Integer readonlyReplicas;

		private Integer storage;

		private String _class;

		public Integer getReadonlyReplicas() {
			return this.readonlyReplicas;
		}

		public void setReadonlyReplicas(Integer readonlyReplicas) {
			this.readonlyReplicas = readonlyReplicas;
		}

		public Integer getStorage() {
			return this.storage;
		}

		public void setStorage(Integer storage) {
			this.storage = storage;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}
	}

	public static class ConfigServer {

		private Integer storage;

		private String _class;

		public Integer getStorage() {
			return this.storage;
		}

		public void setStorage(Integer storage) {
			this.storage = storage;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}
	}

	public static class Mongos {

		private String _class;

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}
	}

	@Override
	public Class<CreateShardingDBInstanceResponse> getResponseClass() {
		return CreateShardingDBInstanceResponse.class;
	}

}
