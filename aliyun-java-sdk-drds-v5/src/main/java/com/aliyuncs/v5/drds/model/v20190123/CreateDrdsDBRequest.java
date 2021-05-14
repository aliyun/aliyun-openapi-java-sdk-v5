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

package com.aliyuncs.v5.drds.model.v20190123;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDrdsDBRequest extends RpcAcsRequest<CreateDrdsDBResponse> {
	   

	private String encode;

	private List<String> rdsInstance;

	private String type;

	private String password;

	private List<RdsSuperAccount> rdsSuperAccount;

	private String accountName;

	private String drdsInstanceId;

	private Boolean dbInstanceIsCreating;

	private List<InstDbName> instDbName;

	private String dbName;

	private String dbInstType;
	public CreateDrdsDBRequest() {
		super("Drds", "2019-01-23", "CreateDrdsDB", "drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEncode() {
		return this.encode;
	}

	public void setEncode(String encode) {
		this.encode = encode;
		if(encode != null){
			putQueryParameter("Encode", encode);
		}
	}

	public List<String> getRdsInstance() {
		return this.rdsInstance;
	}

	public void setRdsInstance(List<String> rdsInstance) {
		this.rdsInstance = rdsInstance;	
		if (rdsInstance != null) {
			for (int i = 0; i < rdsInstance.size(); i++) {
				putQueryParameter("RdsInstance." + (i + 1) , rdsInstance.get(i));
			}
		}	
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public List<RdsSuperAccount> getRdsSuperAccount() {
		return this.rdsSuperAccount;
	}

	public void setRdsSuperAccount(List<RdsSuperAccount> rdsSuperAccount) {
		this.rdsSuperAccount = rdsSuperAccount;	
		if (rdsSuperAccount != null) {
			for (int depth1 = 0; depth1 < rdsSuperAccount.size(); depth1++) {
				putQueryParameter("RdsSuperAccount." + (depth1 + 1) + ".Password" , rdsSuperAccount.get(depth1).getPassword());
				putQueryParameter("RdsSuperAccount." + (depth1 + 1) + ".AccountName" , rdsSuperAccount.get(depth1).getAccountName());
				putQueryParameter("RdsSuperAccount." + (depth1 + 1) + ".DbInstanceId" , rdsSuperAccount.get(depth1).getDbInstanceId());
			}
		}	
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public Boolean getDbInstanceIsCreating() {
		return this.dbInstanceIsCreating;
	}

	public void setDbInstanceIsCreating(Boolean dbInstanceIsCreating) {
		this.dbInstanceIsCreating = dbInstanceIsCreating;
		if(dbInstanceIsCreating != null){
			putQueryParameter("DbInstanceIsCreating", dbInstanceIsCreating.toString());
		}
	}

	public List<InstDbName> getInstDbName() {
		return this.instDbName;
	}

	public void setInstDbName(List<InstDbName> instDbName) {
		this.instDbName = instDbName;	
		if (instDbName != null) {
			for (int depth1 = 0; depth1 < instDbName.size(); depth1++) {
				if (instDbName.get(depth1).getShardDbName() != null) {
					for (int i = 0; i < instDbName.get(depth1).getShardDbName().size(); i++) {
						putQueryParameter("InstDbName." + (depth1 + 1) + ".ShardDbName." + (i + 1) , instDbName.get(depth1).getShardDbName().get(i));
					}
				}
				putQueryParameter("InstDbName." + (depth1 + 1) + ".DbInstanceId" , instDbName.get(depth1).getDbInstanceId());
			}
		}	
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getDbInstType() {
		return this.dbInstType;
	}

	public void setDbInstType(String dbInstType) {
		this.dbInstType = dbInstType;
		if(dbInstType != null){
			putQueryParameter("DbInstType", dbInstType);
		}
	}

	public static class RdsSuperAccount {

		private String password;

		private String accountName;

		private String dbInstanceId;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}
	}

	public static class InstDbName {

		private List<String> shardDbName;

		private String dbInstanceId;

		public List<String> getShardDbName() {
			return this.shardDbName;
		}

		public void setShardDbName(List<String> shardDbName) {
			this.shardDbName = shardDbName;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}
	}

	@Override
	public Class<CreateDrdsDBResponse> getResponseClass() {
		return CreateDrdsDBResponse.class;
	}

}
