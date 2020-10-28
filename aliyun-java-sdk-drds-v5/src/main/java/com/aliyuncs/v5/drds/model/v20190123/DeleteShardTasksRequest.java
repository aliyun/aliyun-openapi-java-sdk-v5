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
public class DeleteShardTasksRequest extends RpcAcsRequest<DeleteShardTasksResponse> {
	   

	private String drdsInstanceId;

	private String dbName;

	private List<TableName> tableName;
	public DeleteShardTasksRequest() {
		super("Drds", "2019-01-23", "DeleteShardTasks", "Drds");
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

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public List<TableName> getTableName() {
		return this.tableName;
	}

	public void setTableName(List<TableName> tableName) {
		this.tableName = tableName;	
		if (tableName != null) {
			for (int depth1 = 0; depth1 < tableName.size(); depth1++) {
				putQueryParameter("TableName." + (depth1 + 1) + ".SourceTableName" , tableName.get(depth1).getSourceTableName());
				putQueryParameter("TableName." + (depth1 + 1) + ".TargetTableName" , tableName.get(depth1).getTargetTableName());
			}
		}	
	}

	public static class TableName {

		private String sourceTableName;

		private String targetTableName;

		public String getSourceTableName() {
			return this.sourceTableName;
		}

		public void setSourceTableName(String sourceTableName) {
			this.sourceTableName = sourceTableName;
		}

		public String getTargetTableName() {
			return this.targetTableName;
		}

		public void setTargetTableName(String targetTableName) {
			this.targetTableName = targetTableName;
		}
	}

	@Override
	public Class<DeleteShardTasksResponse> getResponseClass() {
		return DeleteShardTasksResponse.class;
	}

}
