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

package com.aliyuncs.v5.market.model.v20151101;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.market.transform.v20151101.DescribeOrdersResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrdersResponse extends AcsResponse {

	private String requestId;

	private Long count;

	private Float paymentPrice;

	private Float couponPrice;

	private List<Order> orders;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Float getPaymentPrice() {
		return this.paymentPrice;
	}

	public void setPaymentPrice(Float paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

	public Float getCouponPrice() {
		return this.couponPrice;
	}

	public void setCouponPrice(Float couponPrice) {
		this.couponPrice = couponPrice;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public static class Order {

		private Long orderId;

		private Long aliUid;

		private Long supplierId;

		private String aliyunId;

		private String productType;

		private String productCode;

		private String productSKUCode;

		private String productName;

		private String orderType;

		private String orderStatus;

		private Long paidOn;

		private Long createdOn;

		private Float originalPrice;

		private Float totalPrice;

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Long getSupplierId() {
			return this.supplierId;
		}

		public void setSupplierId(Long supplierId) {
			this.supplierId = supplierId;
		}

		public String getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(String aliyunId) {
			this.aliyunId = aliyunId;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductSKUCode() {
			return this.productSKUCode;
		}

		public void setProductSKUCode(String productSKUCode) {
			this.productSKUCode = productSKUCode;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public Long getPaidOn() {
			return this.paidOn;
		}

		public void setPaidOn(Long paidOn) {
			this.paidOn = paidOn;
		}

		public Long getCreatedOn() {
			return this.createdOn;
		}

		public void setCreatedOn(Long createdOn) {
			this.createdOn = createdOn;
		}

		public Float getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Float originalPrice) {
			this.originalPrice = originalPrice;
		}

		public Float getTotalPrice() {
			return this.totalPrice;
		}

		public void setTotalPrice(Float totalPrice) {
			this.totalPrice = totalPrice;
		}
	}

	@Override
	public DescribeOrdersResponse getInstance(UnmarshallerContext context) {
		return	DescribeOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
