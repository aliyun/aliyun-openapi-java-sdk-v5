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
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeEvaluateDataImportDbTopologysRequest extends RpcAcsRequest<DescribeEvaluateDataImportDbTopologysResponse> {
	   

	private String importParam;
	public DescribeEvaluateDataImportDbTopologysRequest() {
		super("Drds", "2019-01-23", "DescribeEvaluateDataImportDbTopologys", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImportParam() {
		return this.importParam;
	}

	public void setImportParam(String importParam) {
		this.importParam = importParam;
		if(importParam != null){
			putQueryParameter("ImportParam", importParam);
		}
	}

	@Override
	public Class<DescribeEvaluateDataImportDbTopologysResponse> getResponseClass() {
		return DescribeEvaluateDataImportDbTopologysResponse.class;
	}

}
