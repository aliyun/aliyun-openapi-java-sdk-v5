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

package com.aliyuncs.v5.domain.model.v20180129;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForCreatingOrderActivateRequest extends RpcAcsRequest<SaveBatchTaskForCreatingOrderActivateResponse> {
	   

	private List<OrderActivateParam> orderActivateParam;

	private String couponNo;

	private Boolean useCoupon;

	private String promotionNo;

	private String userClientIp;

	private String lang;

	private Boolean usePromotion;
	public SaveBatchTaskForCreatingOrderActivateRequest() {
		super("Domain", "2018-01-29", "SaveBatchTaskForCreatingOrderActivate", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<OrderActivateParam> getOrderActivateParam() {
		return this.orderActivateParam;
	}

	public void setOrderActivateParam(List<OrderActivateParam> orderActivateParam) {
		this.orderActivateParam = orderActivateParam;	
		if (orderActivateParam != null) {
			for (int depth1 = 0; depth1 < orderActivateParam.size(); depth1++) {
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".Country" , orderActivateParam.get(depth1).getCountry());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".SubscriptionDuration" , orderActivateParam.get(depth1).getSubscriptionDuration());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".PermitPremiumActivation" , orderActivateParam.get(depth1).getPermitPremiumActivation());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".City" , orderActivateParam.get(depth1).getCity());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".Dns2" , orderActivateParam.get(depth1).getDns2());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".Dns1" , orderActivateParam.get(depth1).getDns1());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".RegistrantProfileId" , orderActivateParam.get(depth1).getRegistrantProfileId());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".AliyunDns" , orderActivateParam.get(depth1).getAliyunDns());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".ZhCity" , orderActivateParam.get(depth1).getZhCity());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".TelExt" , orderActivateParam.get(depth1).getTelExt());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".ZhRegistrantName" , orderActivateParam.get(depth1).getZhRegistrantName());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".Province" , orderActivateParam.get(depth1).getProvince());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".PostalCode" , orderActivateParam.get(depth1).getPostalCode());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".Email" , orderActivateParam.get(depth1).getEmail());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".ZhRegistrantOrganization" , orderActivateParam.get(depth1).getZhRegistrantOrganization());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".Address" , orderActivateParam.get(depth1).getAddress());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".TelArea" , orderActivateParam.get(depth1).getTelArea());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".DomainName" , orderActivateParam.get(depth1).getDomainName());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".ZhAddress" , orderActivateParam.get(depth1).getZhAddress());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".RegistrantType" , orderActivateParam.get(depth1).getRegistrantType());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".Telephone" , orderActivateParam.get(depth1).getTelephone());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".TrademarkDomainActivation" , orderActivateParam.get(depth1).getTrademarkDomainActivation());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".ZhProvince" , orderActivateParam.get(depth1).getZhProvince());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".RegistrantOrganization" , orderActivateParam.get(depth1).getRegistrantOrganization());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".EnableDomainProxy" , orderActivateParam.get(depth1).getEnableDomainProxy());
				putQueryParameter("OrderActivateParam." + (depth1 + 1) + ".RegistrantName" , orderActivateParam.get(depth1).getRegistrantName());
			}
		}	
	}

	public String getCouponNo() {
		return this.couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
		if(couponNo != null){
			putQueryParameter("CouponNo", couponNo);
		}
	}

	public Boolean getUseCoupon() {
		return this.useCoupon;
	}

	public void setUseCoupon(Boolean useCoupon) {
		this.useCoupon = useCoupon;
		if(useCoupon != null){
			putQueryParameter("UseCoupon", useCoupon.toString());
		}
	}

	public String getPromotionNo() {
		return this.promotionNo;
	}

	public void setPromotionNo(String promotionNo) {
		this.promotionNo = promotionNo;
		if(promotionNo != null){
			putQueryParameter("PromotionNo", promotionNo);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Boolean getUsePromotion() {
		return this.usePromotion;
	}

	public void setUsePromotion(Boolean usePromotion) {
		this.usePromotion = usePromotion;
		if(usePromotion != null){
			putQueryParameter("UsePromotion", usePromotion.toString());
		}
	}

	public static class OrderActivateParam {

		private String country;

		private Integer subscriptionDuration;

		private Boolean permitPremiumActivation;

		private String city;

		private String dns2;

		private String dns1;

		private Long registrantProfileId;

		private Boolean aliyunDns;

		private String zhCity;

		private String telExt;

		private String zhRegistrantName;

		private String province;

		private String postalCode;

		private String email;

		private String zhRegistrantOrganization;

		private String address;

		private String telArea;

		private String domainName;

		private String zhAddress;

		private String registrantType;

		private String telephone;

		private Boolean trademarkDomainActivation;

		private String zhProvince;

		private String registrantOrganization;

		private Boolean enableDomainProxy;

		private String registrantName;

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Integer getSubscriptionDuration() {
			return this.subscriptionDuration;
		}

		public void setSubscriptionDuration(Integer subscriptionDuration) {
			this.subscriptionDuration = subscriptionDuration;
		}

		public Boolean getPermitPremiumActivation() {
			return this.permitPremiumActivation;
		}

		public void setPermitPremiumActivation(Boolean permitPremiumActivation) {
			this.permitPremiumActivation = permitPremiumActivation;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDns2() {
			return this.dns2;
		}

		public void setDns2(String dns2) {
			this.dns2 = dns2;
		}

		public String getDns1() {
			return this.dns1;
		}

		public void setDns1(String dns1) {
			this.dns1 = dns1;
		}

		public Long getRegistrantProfileId() {
			return this.registrantProfileId;
		}

		public void setRegistrantProfileId(Long registrantProfileId) {
			this.registrantProfileId = registrantProfileId;
		}

		public Boolean getAliyunDns() {
			return this.aliyunDns;
		}

		public void setAliyunDns(Boolean aliyunDns) {
			this.aliyunDns = aliyunDns;
		}

		public String getZhCity() {
			return this.zhCity;
		}

		public void setZhCity(String zhCity) {
			this.zhCity = zhCity;
		}

		public String getTelExt() {
			return this.telExt;
		}

		public void setTelExt(String telExt) {
			this.telExt = telExt;
		}

		public String getZhRegistrantName() {
			return this.zhRegistrantName;
		}

		public void setZhRegistrantName(String zhRegistrantName) {
			this.zhRegistrantName = zhRegistrantName;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getPostalCode() {
			return this.postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getZhRegistrantOrganization() {
			return this.zhRegistrantOrganization;
		}

		public void setZhRegistrantOrganization(String zhRegistrantOrganization) {
			this.zhRegistrantOrganization = zhRegistrantOrganization;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTelArea() {
			return this.telArea;
		}

		public void setTelArea(String telArea) {
			this.telArea = telArea;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getZhAddress() {
			return this.zhAddress;
		}

		public void setZhAddress(String zhAddress) {
			this.zhAddress = zhAddress;
		}

		public String getRegistrantType() {
			return this.registrantType;
		}

		public void setRegistrantType(String registrantType) {
			this.registrantType = registrantType;
		}

		public String getTelephone() {
			return this.telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public Boolean getTrademarkDomainActivation() {
			return this.trademarkDomainActivation;
		}

		public void setTrademarkDomainActivation(Boolean trademarkDomainActivation) {
			this.trademarkDomainActivation = trademarkDomainActivation;
		}

		public String getZhProvince() {
			return this.zhProvince;
		}

		public void setZhProvince(String zhProvince) {
			this.zhProvince = zhProvince;
		}

		public String getRegistrantOrganization() {
			return this.registrantOrganization;
		}

		public void setRegistrantOrganization(String registrantOrganization) {
			this.registrantOrganization = registrantOrganization;
		}

		public Boolean getEnableDomainProxy() {
			return this.enableDomainProxy;
		}

		public void setEnableDomainProxy(Boolean enableDomainProxy) {
			this.enableDomainProxy = enableDomainProxy;
		}

		public String getRegistrantName() {
			return this.registrantName;
		}

		public void setRegistrantName(String registrantName) {
			this.registrantName = registrantName;
		}
	}

	@Override
	public Class<SaveBatchTaskForCreatingOrderActivateResponse> getResponseClass() {
		return SaveBatchTaskForCreatingOrderActivateResponse.class;
	}

}
