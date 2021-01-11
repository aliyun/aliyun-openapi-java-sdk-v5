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

package com.aliyuncs.v5.polardbx.model.v20200202;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdatePolarDBXInstanceNodeRequest extends RpcAcsRequest<UpdatePolarDBXInstanceNodeResponse> {
	   

	private String dBInstanceName;

	private String clientToken;

	private String dbInstanceNodeCount;
	public UpdatePolarDBXInstanceNodeRequest() {
		super("polardbx", "2020-02-02", "UpdatePolarDBXInstanceNode", "polardbx");
		setMethod(MethodType.POST);
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
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

	public String getDbInstanceNodeCount() {
		return this.dbInstanceNodeCount;
	}

	public void setDbInstanceNodeCount(String dbInstanceNodeCount) {
		this.dbInstanceNodeCount = dbInstanceNodeCount;
		if(dbInstanceNodeCount != null){
			putQueryParameter("DbInstanceNodeCount", dbInstanceNodeCount);
		}
	}

	@Override
	public Class<UpdatePolarDBXInstanceNodeResponse> getResponseClass() {
		return UpdatePolarDBXInstanceNodeResponse.class;
	}

}
