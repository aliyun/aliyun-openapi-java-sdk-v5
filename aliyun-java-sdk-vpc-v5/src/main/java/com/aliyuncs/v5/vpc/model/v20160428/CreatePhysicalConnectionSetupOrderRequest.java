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

package com.aliyuncs.v5.vpc.model.v20160428;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePhysicalConnectionSetupOrderRequest extends RpcAcsRequest<CreatePhysicalConnectionSetupOrderResponse> {
	   

	private String accessPointId;

	private Long resourceOwnerId;

	private String portType;

	private String clientToken;

	private String redundantPhysicalConnectionId;

	private Boolean autoPay;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String lineOperator;
	public CreatePhysicalConnectionSetupOrderRequest() {
		super("Vpc", "2016-04-28", "CreatePhysicalConnectionSetupOrder", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccessPointId() {
		return this.accessPointId;
	}

	public void setAccessPointId(String accessPointId) {
		this.accessPointId = accessPointId;
		if(accessPointId != null){
			putQueryParameter("AccessPointId", accessPointId);
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

	public String getPortType() {
		return this.portType;
	}

	public void setPortType(String portType) {
		this.portType = portType;
		if(portType != null){
			putQueryParameter("PortType", portType);
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

	public String getRedundantPhysicalConnectionId() {
		return this.redundantPhysicalConnectionId;
	}

	public void setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
		this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
		if(redundantPhysicalConnectionId != null){
			putQueryParameter("RedundantPhysicalConnectionId", redundantPhysicalConnectionId);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getLineOperator() {
		return this.lineOperator;
	}

	public void setLineOperator(String lineOperator) {
		this.lineOperator = lineOperator;
		if(lineOperator != null){
			putQueryParameter("LineOperator", lineOperator);
		}
	}

	@Override
	public Class<CreatePhysicalConnectionSetupOrderResponse> getResponseClass() {
		return CreatePhysicalConnectionSetupOrderResponse.class;
	}

}