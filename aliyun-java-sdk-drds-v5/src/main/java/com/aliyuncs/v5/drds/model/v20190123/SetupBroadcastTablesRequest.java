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
public class SetupBroadcastTablesRequest extends RpcAcsRequest<SetupBroadcastTablesResponse> {
	   

	private Boolean active;

	private String drdsInstanceId;

	private String dbName;

	private List<String> tableName;
	public SetupBroadcastTablesRequest() {
		super("Drds", "2019-01-23", "SetupBroadcastTables", "drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
		if(active != null){
			putQueryParameter("Active", active.toString());
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

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public List<String> getTableName() {
		return this.tableName;
	}

	public void setTableName(List<String> tableName) {
		this.tableName = tableName;	
		if (tableName != null) {
			for (int i = 0; i < tableName.size(); i++) {
				putQueryParameter("TableName." + (i + 1) , tableName.get(i));
			}
		}	
	}

	@Override
	public Class<SetupBroadcastTablesResponse> getResponseClass() {
		return SetupBroadcastTablesResponse.class;
	}

}
