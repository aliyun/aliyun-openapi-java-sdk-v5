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

package com.aliyuncs.v5.cloudauth.model.v20190307;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceInfoRequest extends RpcAcsRequest<DescribeDeviceInfoResponse> {
	   

	private String userDeviceId;

	private Integer pageSize;

	private String expiredStartDay;

	private Integer currentPage;

	private String deviceId;

	private String bizType;

	private String expiredEndDay;
	public DescribeDeviceInfoRequest() {
		super("Cloudauth", "2019-03-07", "DescribeDeviceInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserDeviceId() {
		return this.userDeviceId;
	}

	public void setUserDeviceId(String userDeviceId) {
		this.userDeviceId = userDeviceId;
		if(userDeviceId != null){
			putQueryParameter("UserDeviceId", userDeviceId);
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

	public String getExpiredStartDay() {
		return this.expiredStartDay;
	}

	public void setExpiredStartDay(String expiredStartDay) {
		this.expiredStartDay = expiredStartDay;
		if(expiredStartDay != null){
			putQueryParameter("ExpiredStartDay", expiredStartDay);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getExpiredEndDay() {
		return this.expiredEndDay;
	}

	public void setExpiredEndDay(String expiredEndDay) {
		this.expiredEndDay = expiredEndDay;
		if(expiredEndDay != null){
			putQueryParameter("ExpiredEndDay", expiredEndDay);
		}
	}

	@Override
	public Class<DescribeDeviceInfoResponse> getResponseClass() {
		return DescribeDeviceInfoResponse.class;
	}

}
