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
public class CreatePolarxOrderRequest extends RpcAcsRequest<CreatePolarxOrderResponse> {
	   

	private String dBInstanceName;

	private String nodeCount;
	public CreatePolarxOrderRequest() {
		super("polardbx", "2020-02-02", "CreatePolarxOrder", "polardbx");
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

	public String getNodeCount() {
		return this.nodeCount;
	}

	public void setNodeCount(String nodeCount) {
		this.nodeCount = nodeCount;
		if(nodeCount != null){
			putQueryParameter("NodeCount", nodeCount);
		}
	}

	@Override
	public Class<CreatePolarxOrderResponse> getResponseClass() {
		return CreatePolarxOrderResponse.class;
	}

}
