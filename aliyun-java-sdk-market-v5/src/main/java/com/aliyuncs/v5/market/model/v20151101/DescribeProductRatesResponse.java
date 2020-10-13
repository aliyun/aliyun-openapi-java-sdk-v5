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
import com.aliyuncs.v5.market.transform.v20151101.DescribeProductRatesResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProductRatesResponse extends AcsResponse {

	private Integer pageIndex;

	private Integer pageSize;

	private Long totalCount;

	private List<OrderRate> orderRates;

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<OrderRate> getOrderRates() {
		return this.orderRates;
	}

	public void setOrderRates(List<OrderRate> orderRates) {
		this.orderRates = orderRates;
	}

	public static class OrderRate {

		private Long id;

		private Long orderId;

		private String productCode;

		private Float score;

		private String content;

		private Long createOn;

		private String productName;

		private String buyerName;

		private Long aliUid;

		private Float price;

		private Integer distributionScore1;

		private Integer distributionScore2;

		private Integer distributionScore3;

		private Integer dimensions;

		private String explaintion;

		private String additionalContent;

		private String additionalExplaintion;

		private Long gmtExplaintion;

		private Long gmtAdditional;

		private Long gmtAdditionalExplaintion;

		private Integer rateType;

		private Boolean modified;

		private Boolean additionalModified;

		private Boolean deleted;

		private Boolean ddditionalDeleted;

		private Long gmtModified;

		private Long gmtAdditionalModified;

		private Long gmtDeleted;

		private Long gmtAdditionalDeleted;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getCreateOn() {
			return this.createOn;
		}

		public void setCreateOn(Long createOn) {
			this.createOn = createOn;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getBuyerName() {
			return this.buyerName;
		}

		public void setBuyerName(String buyerName) {
			this.buyerName = buyerName;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Float getPrice() {
			return this.price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public Integer getDistributionScore1() {
			return this.distributionScore1;
		}

		public void setDistributionScore1(Integer distributionScore1) {
			this.distributionScore1 = distributionScore1;
		}

		public Integer getDistributionScore2() {
			return this.distributionScore2;
		}

		public void setDistributionScore2(Integer distributionScore2) {
			this.distributionScore2 = distributionScore2;
		}

		public Integer getDistributionScore3() {
			return this.distributionScore3;
		}

		public void setDistributionScore3(Integer distributionScore3) {
			this.distributionScore3 = distributionScore3;
		}

		public Integer getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(Integer dimensions) {
			this.dimensions = dimensions;
		}

		public String getExplaintion() {
			return this.explaintion;
		}

		public void setExplaintion(String explaintion) {
			this.explaintion = explaintion;
		}

		public String getAdditionalContent() {
			return this.additionalContent;
		}

		public void setAdditionalContent(String additionalContent) {
			this.additionalContent = additionalContent;
		}

		public String getAdditionalExplaintion() {
			return this.additionalExplaintion;
		}

		public void setAdditionalExplaintion(String additionalExplaintion) {
			this.additionalExplaintion = additionalExplaintion;
		}

		public Long getGmtExplaintion() {
			return this.gmtExplaintion;
		}

		public void setGmtExplaintion(Long gmtExplaintion) {
			this.gmtExplaintion = gmtExplaintion;
		}

		public Long getGmtAdditional() {
			return this.gmtAdditional;
		}

		public void setGmtAdditional(Long gmtAdditional) {
			this.gmtAdditional = gmtAdditional;
		}

		public Long getGmtAdditionalExplaintion() {
			return this.gmtAdditionalExplaintion;
		}

		public void setGmtAdditionalExplaintion(Long gmtAdditionalExplaintion) {
			this.gmtAdditionalExplaintion = gmtAdditionalExplaintion;
		}

		public Integer getRateType() {
			return this.rateType;
		}

		public void setRateType(Integer rateType) {
			this.rateType = rateType;
		}

		public Boolean getModified() {
			return this.modified;
		}

		public void setModified(Boolean modified) {
			this.modified = modified;
		}

		public Boolean getAdditionalModified() {
			return this.additionalModified;
		}

		public void setAdditionalModified(Boolean additionalModified) {
			this.additionalModified = additionalModified;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Boolean getDdditionalDeleted() {
			return this.ddditionalDeleted;
		}

		public void setDdditionalDeleted(Boolean ddditionalDeleted) {
			this.ddditionalDeleted = ddditionalDeleted;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getGmtAdditionalModified() {
			return this.gmtAdditionalModified;
		}

		public void setGmtAdditionalModified(Long gmtAdditionalModified) {
			this.gmtAdditionalModified = gmtAdditionalModified;
		}

		public Long getGmtDeleted() {
			return this.gmtDeleted;
		}

		public void setGmtDeleted(Long gmtDeleted) {
			this.gmtDeleted = gmtDeleted;
		}

		public Long getGmtAdditionalDeleted() {
			return this.gmtAdditionalDeleted;
		}

		public void setGmtAdditionalDeleted(Long gmtAdditionalDeleted) {
			this.gmtAdditionalDeleted = gmtAdditionalDeleted;
		}
	}

	@Override
	public DescribeProductRatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeProductRatesResponseUnmarshaller.unmarshall(this, context);
	}
}
