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
public class DescribeVpnSslServerLogsRequest extends RpcAcsRequest<DescribeVpnSslServerLogsResponse> {
	   

	private Long resourceOwnerId;

	private Integer pageNumber;

	private Integer minutePeriod;

	private Integer pageSize;

	private String vpnSslServerId;

	private Integer from;

	private String sslVpnClientCertId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer to;
	public DescribeVpnSslServerLogsRequest() {
		super("Vpc", "2016-04-28", "DescribeVpnSslServerLogs", "vpc");
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getMinutePeriod() {
		return this.minutePeriod;
	}

	public void setMinutePeriod(Integer minutePeriod) {
		this.minutePeriod = minutePeriod;
		if(minutePeriod != null){
			putQueryParameter("MinutePeriod", minutePeriod.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getVpnSslServerId() {
		return this.vpnSslServerId;
	}

	public void setVpnSslServerId(String vpnSslServerId) {
		this.vpnSslServerId = vpnSslServerId;
		if(vpnSslServerId != null){
			putQueryParameter("VpnSslServerId", vpnSslServerId);
		}
	}

	public Integer getFrom() {
		return this.from;
	}

	public void setFrom(Integer from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from.toString());
		}
	}

	public String getSslVpnClientCertId() {
		return this.sslVpnClientCertId;
	}

	public void setSslVpnClientCertId(String sslVpnClientCertId) {
		this.sslVpnClientCertId = sslVpnClientCertId;
		if(sslVpnClientCertId != null){
			putQueryParameter("SslVpnClientCertId", sslVpnClientCertId);
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

	public Integer getTo() {
		return this.to;
	}

	public void setTo(Integer to) {
		this.to = to;
		if(to != null){
			putQueryParameter("To", to.toString());
		}
	}

	@Override
	public Class<DescribeVpnSslServerLogsResponse> getResponseClass() {
		return DescribeVpnSslServerLogsResponse.class;
	}

}