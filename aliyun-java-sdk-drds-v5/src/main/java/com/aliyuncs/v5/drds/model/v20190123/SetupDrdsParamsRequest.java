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
public class SetupDrdsParamsRequest extends RpcAcsRequest<SetupDrdsParamsResponse> {
	   

	private String paramLevel;

	private List<Data> data;

	private String drdsInstanceId;
	public SetupDrdsParamsRequest() {
		super("Drds", "2019-01-23", "SetupDrdsParams", "drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParamLevel() {
		return this.paramLevel;
	}

	public void setParamLevel(String paramLevel) {
		this.paramLevel = paramLevel;
		if(paramLevel != null){
			putQueryParameter("ParamLevel", paramLevel);
		}
	}

	public List<Data> getData() {
		return this.data;
	}

	public void setData(List<Data> data) {
		this.data = data;	
		if (data != null) {
			for (int depth1 = 0; depth1 < data.size(); depth1++) {
				putQueryParameter("Data." + (depth1 + 1) + ".ParamType" , data.get(depth1).getParamType());
				putQueryParameter("Data." + (depth1 + 1) + ".DbName" , data.get(depth1).getDbName());
				putQueryParameter("Data." + (depth1 + 1) + ".ParamRanges" , data.get(depth1).getParamRanges());
				putQueryParameter("Data." + (depth1 + 1) + ".ParamVariableName" , data.get(depth1).getParamVariableName());
				putQueryParameter("Data." + (depth1 + 1) + ".ParamValue" , data.get(depth1).getParamValue());
			}
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

	public static class Data {

		private String paramType;

		private String dbName;

		private String paramRanges;

		private String paramVariableName;

		private String paramValue;

		public String getParamType() {
			return this.paramType;
		}

		public void setParamType(String paramType) {
			this.paramType = paramType;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getParamRanges() {
			return this.paramRanges;
		}

		public void setParamRanges(String paramRanges) {
			this.paramRanges = paramRanges;
		}

		public String getParamVariableName() {
			return this.paramVariableName;
		}

		public void setParamVariableName(String paramVariableName) {
			this.paramVariableName = paramVariableName;
		}

		public String getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}
	}

	@Override
	public Class<SetupDrdsParamsResponse> getResponseClass() {
		return SetupDrdsParamsResponse.class;
	}

}
