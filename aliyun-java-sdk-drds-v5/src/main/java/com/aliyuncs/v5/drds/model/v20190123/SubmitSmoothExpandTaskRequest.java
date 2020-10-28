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
public class SubmitSmoothExpandTaskRequest extends RpcAcsRequest<SubmitSmoothExpandTaskResponse> {
	   

	private String drdsInstanceId;

	private Boolean dbInstanceIsCreating;

	private List<RdsSuperInstances> rdsSuperInstances;

	private String dbName;

	private List<TransferTaskInfos> transferTaskInfos;
	public SubmitSmoothExpandTaskRequest() {
		super("Drds", "2019-01-23", "SubmitSmoothExpandTask", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<RdsSuperInstances> getRdsSuperInstances() {
		return this.rdsSuperInstances;
	}

	public void setRdsSuperInstances(List<RdsSuperInstances> rdsSuperInstances) {
		this.rdsSuperInstances = rdsSuperInstances;	
		if (rdsSuperInstances != null) {
			for (int depth1 = 0; depth1 < rdsSuperInstances.size(); depth1++) {
				putQueryParameter("RdsSuperInstances." + (depth1 + 1) + ".Password" , rdsSuperInstances.get(depth1).getPassword());
				putQueryParameter("RdsSuperInstances." + (depth1 + 1) + ".AccountName" , rdsSuperInstances.get(depth1).getAccountName());
				putQueryParameter("RdsSuperInstances." + (depth1 + 1) + ".RdsName" , rdsSuperInstances.get(depth1).getRdsName());
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

	public List<TransferTaskInfos> getTransferTaskInfos() {
		return this.transferTaskInfos;
	}

	public void setTransferTaskInfos(List<TransferTaskInfos> transferTaskInfos) {
		this.transferTaskInfos = transferTaskInfos;	
		if (transferTaskInfos != null) {
			for (int depth1 = 0; depth1 < transferTaskInfos.size(); depth1++) {
				putQueryParameter("TransferTaskInfos." + (depth1 + 1) + ".DbName" , transferTaskInfos.get(depth1).getDbName());
				putQueryParameter("TransferTaskInfos." + (depth1 + 1) + ".SrcInstanceName" , transferTaskInfos.get(depth1).getSrcInstanceName());
				putQueryParameter("TransferTaskInfos." + (depth1 + 1) + ".InstanceType" , transferTaskInfos.get(depth1).getInstanceType());
				putQueryParameter("TransferTaskInfos." + (depth1 + 1) + ".DstInstanceName" , transferTaskInfos.get(depth1).getDstInstanceName());
			}
		}	
	}

	public static class RdsSuperInstances {

		private String password;

		private String accountName;

		private String rdsName;

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

		public String getRdsName() {
			return this.rdsName;
		}

		public void setRdsName(String rdsName) {
			this.rdsName = rdsName;
		}
	}

	public static class TransferTaskInfos {

		private String dbName;

		private String srcInstanceName;

		private String instanceType;

		private String dstInstanceName;

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getSrcInstanceName() {
			return this.srcInstanceName;
		}

		public void setSrcInstanceName(String srcInstanceName) {
			this.srcInstanceName = srcInstanceName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getDstInstanceName() {
			return this.dstInstanceName;
		}

		public void setDstInstanceName(String dstInstanceName) {
			this.dstInstanceName = dstInstanceName;
		}
	}

	@Override
	public Class<SubmitSmoothExpandTaskResponse> getResponseClass() {
		return SubmitSmoothExpandTaskResponse.class;
	}

}
