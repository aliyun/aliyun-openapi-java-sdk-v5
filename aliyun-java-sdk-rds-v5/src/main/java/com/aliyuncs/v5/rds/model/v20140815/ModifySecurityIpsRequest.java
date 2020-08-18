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

package com.aliyuncs.v5.rds.model.v20140815;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySecurityIpsRequest extends RpcAcsRequest<ModifySecurityIpsResponse> {
	   

	private String dBInstanceIPArrayName;

	private Long resourceOwnerId;

	private String securityIps;

	private String whitelistNetworkType;

	private String securityIPType;

	private String dBInstanceId;

	private String modifyMode;

	private String dBInstanceIPArrayAttribute;
	public ModifySecurityIpsRequest() {
		super("Rds", "2014-08-15", "ModifySecurityIps", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceIPArrayName() {
		return this.dBInstanceIPArrayName;
	}

	public void setDBInstanceIPArrayName(String dBInstanceIPArrayName) {
		this.dBInstanceIPArrayName = dBInstanceIPArrayName;
		if(dBInstanceIPArrayName != null){
			putQueryParameter("DBInstanceIPArrayName", dBInstanceIPArrayName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSecurityIps() {
		return this.securityIps;
	}

	public void setSecurityIps(String securityIps) {
		this.securityIps = securityIps;
		if(securityIps != null){
			putQueryParameter("SecurityIps", securityIps);
		}
	}

	public String getWhitelistNetworkType() {
		return this.whitelistNetworkType;
	}

	public void setWhitelistNetworkType(String whitelistNetworkType) {
		this.whitelistNetworkType = whitelistNetworkType;
		if(whitelistNetworkType != null){
			putQueryParameter("WhitelistNetworkType", whitelistNetworkType);
		}
	}

	public String getSecurityIPType() {
		return this.securityIPType;
	}

	public void setSecurityIPType(String securityIPType) {
		this.securityIPType = securityIPType;
		if(securityIPType != null){
			putQueryParameter("SecurityIPType", securityIPType);
		}
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

	public String getModifyMode() {
		return this.modifyMode;
	}

	public void setModifyMode(String modifyMode) {
		this.modifyMode = modifyMode;
		if(modifyMode != null){
			putQueryParameter("ModifyMode", modifyMode);
		}
	}

	public String getDBInstanceIPArrayAttribute() {
		return this.dBInstanceIPArrayAttribute;
	}

	public void setDBInstanceIPArrayAttribute(String dBInstanceIPArrayAttribute) {
		this.dBInstanceIPArrayAttribute = dBInstanceIPArrayAttribute;
		if(dBInstanceIPArrayAttribute != null){
			putQueryParameter("DBInstanceIPArrayAttribute", dBInstanceIPArrayAttribute);
		}
	}

	@Override
	public Class<ModifySecurityIpsResponse> getResponseClass() {
		return ModifySecurityIpsResponse.class;
	}

}
