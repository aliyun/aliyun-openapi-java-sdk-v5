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
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateNatGatewayRequest extends RpcAcsRequest<CreateNatGatewayResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String description;

	private String spec;

	private String duration;

	private String natType;

	private List<BandwidthPackage> bandwidthPackage;

	private String instanceChargeType;

	private Boolean autoPay;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String vSwitchId;

	private String internetChargeType;

	private String vpcId;

	private String name;

	private String pricingCycle;
	public CreateNatGatewayRequest() {
		super("Vpc", "2016-04-28", "CreateNatGateway", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
		}
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration);
		}
	}

	public String getNatType() {
		return this.natType;
	}

	public void setNatType(String natType) {
		this.natType = natType;
		if(natType != null){
			putQueryParameter("NatType", natType);
		}
	}

	public List<BandwidthPackage> getBandwidthPackage() {
		return this.bandwidthPackage;
	}

	public void setBandwidthPackage(List<BandwidthPackage> bandwidthPackage) {
		this.bandwidthPackage = bandwidthPackage;	
		if (bandwidthPackage != null) {
			for (int depth1 = 0; depth1 < bandwidthPackage.size(); depth1++) {
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".Bandwidth" , bandwidthPackage.get(depth1).getBandwidth());
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".Zone" , bandwidthPackage.get(depth1).getZone());
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".InternetChargeType" , bandwidthPackage.get(depth1).getInternetChargeType());
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".ISP" , bandwidthPackage.get(depth1).getISP());
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".IpCount" , bandwidthPackage.get(depth1).getIpCount());
			}
		}	
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
		}
	}

	public static class BandwidthPackage {

		private Integer bandwidth;

		private String zone;

		private String internetChargeType;

		private String iSP;

		private Integer ipCount;

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public Integer getIpCount() {
			return this.ipCount;
		}

		public void setIpCount(Integer ipCount) {
			this.ipCount = ipCount;
		}
	}

	@Override
	public Class<CreateNatGatewayResponse> getResponseClass() {
		return CreateNatGatewayResponse.class;
	}

}
