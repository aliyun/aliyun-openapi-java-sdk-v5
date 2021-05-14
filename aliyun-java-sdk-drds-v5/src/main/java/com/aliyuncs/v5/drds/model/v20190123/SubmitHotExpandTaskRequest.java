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
public class SubmitHotExpandTaskRequest extends RpcAcsRequest<SubmitHotExpandTaskResponse> {
	   

	private List<Mapping> mapping;

	private String taskDesc;

	private List<SupperAccountMapping> supperAccountMapping;

	private List<ExtendedMapping> extendedMapping;

	private String taskName;

	private String drdsInstanceId;

	private List<InstanceDbMapping> instanceDbMapping;

	private String dbName;
	public SubmitHotExpandTaskRequest() {
		super("Drds", "2019-01-23", "SubmitHotExpandTask", "drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Mapping> getMapping() {
		return this.mapping;
	}

	public void setMapping(List<Mapping> mapping) {
		this.mapping = mapping;	
		if (mapping != null) {
			for (int depth1 = 0; depth1 < mapping.size(); depth1++) {
				putQueryParameter("Mapping." + (depth1 + 1) + ".DbShardColumn" , mapping.get(depth1).getDbShardColumn());
				putQueryParameter("Mapping." + (depth1 + 1) + ".TbShardColumn" , mapping.get(depth1).getTbShardColumn());
				putQueryParameter("Mapping." + (depth1 + 1) + ".ShardTbValue" , mapping.get(depth1).getShardTbValue());
				putQueryParameter("Mapping." + (depth1 + 1) + ".HotDbName" , mapping.get(depth1).getHotDbName());
				putQueryParameter("Mapping." + (depth1 + 1) + ".ShardDbValue" , mapping.get(depth1).getShardDbValue());
				putQueryParameter("Mapping." + (depth1 + 1) + ".HotTableName" , mapping.get(depth1).getHotTableName());
				putQueryParameter("Mapping." + (depth1 + 1) + ".LogicTable" , mapping.get(depth1).getLogicTable());
			}
		}	
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
		if(taskDesc != null){
			putQueryParameter("TaskDesc", taskDesc);
		}
	}

	public List<SupperAccountMapping> getSupperAccountMapping() {
		return this.supperAccountMapping;
	}

	public void setSupperAccountMapping(List<SupperAccountMapping> supperAccountMapping) {
		this.supperAccountMapping = supperAccountMapping;	
		if (supperAccountMapping != null) {
			for (int depth1 = 0; depth1 < supperAccountMapping.size(); depth1++) {
				putQueryParameter("SupperAccountMapping." + (depth1 + 1) + ".InstanceName" , supperAccountMapping.get(depth1).getInstanceName());
				putQueryParameter("SupperAccountMapping." + (depth1 + 1) + ".SupperAccount" , supperAccountMapping.get(depth1).getSupperAccount());
				putQueryParameter("SupperAccountMapping." + (depth1 + 1) + ".SupperPassword" , supperAccountMapping.get(depth1).getSupperPassword());
			}
		}	
	}

	public List<ExtendedMapping> getExtendedMapping() {
		return this.extendedMapping;
	}

	public void setExtendedMapping(List<ExtendedMapping> extendedMapping) {
		this.extendedMapping = extendedMapping;	
		if (extendedMapping != null) {
			for (int depth1 = 0; depth1 < extendedMapping.size(); depth1++) {
				putQueryParameter("ExtendedMapping." + (depth1 + 1) + ".SrcInstanceId" , extendedMapping.get(depth1).getSrcInstanceId());
				putQueryParameter("ExtendedMapping." + (depth1 + 1) + ".SrcDb" , extendedMapping.get(depth1).getSrcDb());
			}
		}	
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
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

	public List<InstanceDbMapping> getInstanceDbMapping() {
		return this.instanceDbMapping;
	}

	public void setInstanceDbMapping(List<InstanceDbMapping> instanceDbMapping) {
		this.instanceDbMapping = instanceDbMapping;	
		if (instanceDbMapping != null) {
			for (int depth1 = 0; depth1 < instanceDbMapping.size(); depth1++) {
				putQueryParameter("InstanceDbMapping." + (depth1 + 1) + ".DbList" , instanceDbMapping.get(depth1).getDbList());
				putQueryParameter("InstanceDbMapping." + (depth1 + 1) + ".InstanceName" , instanceDbMapping.get(depth1).getInstanceName());
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

	public static class Mapping {

		private String dbShardColumn;

		private String tbShardColumn;

		private String shardTbValue;

		private String hotDbName;

		private String shardDbValue;

		private String hotTableName;

		private String logicTable;

		public String getDbShardColumn() {
			return this.dbShardColumn;
		}

		public void setDbShardColumn(String dbShardColumn) {
			this.dbShardColumn = dbShardColumn;
		}

		public String getTbShardColumn() {
			return this.tbShardColumn;
		}

		public void setTbShardColumn(String tbShardColumn) {
			this.tbShardColumn = tbShardColumn;
		}

		public String getShardTbValue() {
			return this.shardTbValue;
		}

		public void setShardTbValue(String shardTbValue) {
			this.shardTbValue = shardTbValue;
		}

		public String getHotDbName() {
			return this.hotDbName;
		}

		public void setHotDbName(String hotDbName) {
			this.hotDbName = hotDbName;
		}

		public String getShardDbValue() {
			return this.shardDbValue;
		}

		public void setShardDbValue(String shardDbValue) {
			this.shardDbValue = shardDbValue;
		}

		public String getHotTableName() {
			return this.hotTableName;
		}

		public void setHotTableName(String hotTableName) {
			this.hotTableName = hotTableName;
		}

		public String getLogicTable() {
			return this.logicTable;
		}

		public void setLogicTable(String logicTable) {
			this.logicTable = logicTable;
		}
	}

	public static class SupperAccountMapping {

		private String instanceName;

		private String supperAccount;

		private String supperPassword;

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getSupperAccount() {
			return this.supperAccount;
		}

		public void setSupperAccount(String supperAccount) {
			this.supperAccount = supperAccount;
		}

		public String getSupperPassword() {
			return this.supperPassword;
		}

		public void setSupperPassword(String supperPassword) {
			this.supperPassword = supperPassword;
		}
	}

	public static class ExtendedMapping {

		private String srcInstanceId;

		private String srcDb;

		public String getSrcInstanceId() {
			return this.srcInstanceId;
		}

		public void setSrcInstanceId(String srcInstanceId) {
			this.srcInstanceId = srcInstanceId;
		}

		public String getSrcDb() {
			return this.srcDb;
		}

		public void setSrcDb(String srcDb) {
			this.srcDb = srcDb;
		}
	}

	public static class InstanceDbMapping {

		private String dbList;

		private String instanceName;

		public String getDbList() {
			return this.dbList;
		}

		public void setDbList(String dbList) {
			this.dbList = dbList;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}
	}

	@Override
	public Class<SubmitHotExpandTaskResponse> getResponseClass() {
		return SubmitHotExpandTaskResponse.class;
	}

}
