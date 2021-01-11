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
public class EnableSqlAuditRequest extends RpcAcsRequest<EnableSqlAuditResponse> {
	   

	private String dBInstanceId;

	private Integer expireAfterDays;
	public EnableSqlAuditRequest() {
		super("polardbx", "2020-02-02", "EnableSqlAudit", "polardbx");
		setMethod(MethodType.POST);
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public Integer getExpireAfterDays() {
		return this.expireAfterDays;
	}

	public void setExpireAfterDays(Integer expireAfterDays) {
		this.expireAfterDays = expireAfterDays;
		if(expireAfterDays != null){
			putQueryParameter("ExpireAfterDays", expireAfterDays.toString());
		}
	}

	@Override
	public Class<EnableSqlAuditResponse> getResponseClass() {
		return EnableSqlAuditResponse.class;
	}

}
