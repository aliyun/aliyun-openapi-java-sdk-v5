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
public class UpdateNetworkAclEntriesRequest extends RpcAcsRequest<UpdateNetworkAclEntriesResponse> {
	   

	private Long resourceOwnerId;

	private List<EgressAclEntries> egressAclEntries;

	private String clientToken;

	private String networkAclId;

	private Boolean updateIngressAclEntries;

	private String resourceOwnerAccount;

	private Boolean updateEgressAclEntries;

	private Long ownerId;

	private List<IngressAclEntries> ingressAclEntries;
	public UpdateNetworkAclEntriesRequest() {
		super("Vpc", "2016-04-28", "UpdateNetworkAclEntries", "vpc");
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

	public List<EgressAclEntries> getEgressAclEntries() {
		return this.egressAclEntries;
	}

	public void setEgressAclEntries(List<EgressAclEntries> egressAclEntries) {
		this.egressAclEntries = egressAclEntries;	
		if (egressAclEntries != null) {
			for (int depth1 = 0; depth1 < egressAclEntries.size(); depth1++) {
				putQueryParameter("EgressAclEntries." + (depth1 + 1) + ".NetworkAclEntryName" , egressAclEntries.get(depth1).getNetworkAclEntryName());
				putQueryParameter("EgressAclEntries." + (depth1 + 1) + ".NetworkAclEntryId" , egressAclEntries.get(depth1).getNetworkAclEntryId());
				putQueryParameter("EgressAclEntries." + (depth1 + 1) + ".Policy" , egressAclEntries.get(depth1).getPolicy());
				putQueryParameter("EgressAclEntries." + (depth1 + 1) + ".Protocol" , egressAclEntries.get(depth1).getBizProtocol());
				putQueryParameter("EgressAclEntries." + (depth1 + 1) + ".DestinationCidrIp" , egressAclEntries.get(depth1).getDestinationCidrIp());
				putQueryParameter("EgressAclEntries." + (depth1 + 1) + ".Port" , egressAclEntries.get(depth1).getPort());
				putQueryParameter("EgressAclEntries." + (depth1 + 1) + ".EntryType" , egressAclEntries.get(depth1).getEntryType());
				putQueryParameter("EgressAclEntries." + (depth1 + 1) + ".Description" , egressAclEntries.get(depth1).getDescription());
			}
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

	public String getNetworkAclId() {
		return this.networkAclId;
	}

	public void setNetworkAclId(String networkAclId) {
		this.networkAclId = networkAclId;
		if(networkAclId != null){
			putQueryParameter("NetworkAclId", networkAclId);
		}
	}

	public Boolean getUpdateIngressAclEntries() {
		return this.updateIngressAclEntries;
	}

	public void setUpdateIngressAclEntries(Boolean updateIngressAclEntries) {
		this.updateIngressAclEntries = updateIngressAclEntries;
		if(updateIngressAclEntries != null){
			putQueryParameter("UpdateIngressAclEntries", updateIngressAclEntries.toString());
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

	public Boolean getUpdateEgressAclEntries() {
		return this.updateEgressAclEntries;
	}

	public void setUpdateEgressAclEntries(Boolean updateEgressAclEntries) {
		this.updateEgressAclEntries = updateEgressAclEntries;
		if(updateEgressAclEntries != null){
			putQueryParameter("UpdateEgressAclEntries", updateEgressAclEntries.toString());
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

	public List<IngressAclEntries> getIngressAclEntries() {
		return this.ingressAclEntries;
	}

	public void setIngressAclEntries(List<IngressAclEntries> ingressAclEntries) {
		this.ingressAclEntries = ingressAclEntries;	
		if (ingressAclEntries != null) {
			for (int depth1 = 0; depth1 < ingressAclEntries.size(); depth1++) {
				putQueryParameter("IngressAclEntries." + (depth1 + 1) + ".NetworkAclEntryName" , ingressAclEntries.get(depth1).getNetworkAclEntryName());
				putQueryParameter("IngressAclEntries." + (depth1 + 1) + ".NetworkAclEntryId" , ingressAclEntries.get(depth1).getNetworkAclEntryId());
				putQueryParameter("IngressAclEntries." + (depth1 + 1) + ".Policy" , ingressAclEntries.get(depth1).getPolicy());
				putQueryParameter("IngressAclEntries." + (depth1 + 1) + ".Protocol" , ingressAclEntries.get(depth1).getBizProtocol());
				putQueryParameter("IngressAclEntries." + (depth1 + 1) + ".SourceCidrIp" , ingressAclEntries.get(depth1).getSourceCidrIp());
				putQueryParameter("IngressAclEntries." + (depth1 + 1) + ".Port" , ingressAclEntries.get(depth1).getPort());
				putQueryParameter("IngressAclEntries." + (depth1 + 1) + ".EntryType" , ingressAclEntries.get(depth1).getEntryType());
				putQueryParameter("IngressAclEntries." + (depth1 + 1) + ".Description" , ingressAclEntries.get(depth1).getDescription());
			}
		}	
	}

	public static class EgressAclEntries {

		private String networkAclEntryName;

		private String networkAclEntryId;

		private String policy;

		private String protocol;

		private String destinationCidrIp;

		private String port;

		private String entryType;

		private String description;

		public String getNetworkAclEntryName() {
			return this.networkAclEntryName;
		}

		public void setNetworkAclEntryName(String networkAclEntryName) {
			this.networkAclEntryName = networkAclEntryName;
		}

		public String getNetworkAclEntryId() {
			return this.networkAclEntryId;
		}

		public void setNetworkAclEntryId(String networkAclEntryId) {
			this.networkAclEntryId = networkAclEntryId;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getDestinationCidrIp() {
			return this.destinationCidrIp;
		}

		public void setDestinationCidrIp(String destinationCidrIp) {
			this.destinationCidrIp = destinationCidrIp;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getEntryType() {
			return this.entryType;
		}

		public void setEntryType(String entryType) {
			this.entryType = entryType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class IngressAclEntries {

		private String networkAclEntryName;

		private String networkAclEntryId;

		private String policy;

		private String protocol;

		private String sourceCidrIp;

		private String port;

		private String entryType;

		private String description;

		public String getNetworkAclEntryName() {
			return this.networkAclEntryName;
		}

		public void setNetworkAclEntryName(String networkAclEntryName) {
			this.networkAclEntryName = networkAclEntryName;
		}

		public String getNetworkAclEntryId() {
			return this.networkAclEntryId;
		}

		public void setNetworkAclEntryId(String networkAclEntryId) {
			this.networkAclEntryId = networkAclEntryId;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getEntryType() {
			return this.entryType;
		}

		public void setEntryType(String entryType) {
			this.entryType = entryType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public Class<UpdateNetworkAclEntriesResponse> getResponseClass() {
		return UpdateNetworkAclEntriesResponse.class;
	}

}
