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

package com.aliyuncs.v5.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.market.model.v20151101.DescribeProductRatesResponse;
import com.aliyuncs.v5.market.model.v20151101.DescribeProductRatesResponse.OrderRate;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeProductRatesResponseUnmarshaller {

	public static DescribeProductRatesResponse unmarshall(DescribeProductRatesResponse describeProductRatesResponse, UnmarshallerContext _ctx) {
		
		describeProductRatesResponse.setPageIndex(_ctx.integerValue("DescribeProductRatesResponse.PageIndex"));
		describeProductRatesResponse.setPageSize(_ctx.integerValue("DescribeProductRatesResponse.PageSize"));
		describeProductRatesResponse.setTotalCount(_ctx.longValue("DescribeProductRatesResponse.TotalCount"));

		List<OrderRate> orderRatesList = new ArrayList<OrderRate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductRatesResponse.OrderRates.Length"); i++) {
			OrderRate orderRate = new OrderRate();
			orderRate.setId(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].Id"));
			orderRate.setOrderId(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].OrderId"));
			orderRate.setProductCode(_ctx.stringValue("DescribeProductRatesResponse.OrderRates["+ i +"].ProductCode"));
			orderRate.setScore(_ctx.floatValue("DescribeProductRatesResponse.OrderRates["+ i +"].Score"));
			orderRate.setContent(_ctx.stringValue("DescribeProductRatesResponse.OrderRates["+ i +"].Content"));
			orderRate.setCreateOn(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].CreateOn"));
			orderRate.setProductName(_ctx.stringValue("DescribeProductRatesResponse.OrderRates["+ i +"].ProductName"));
			orderRate.setBuyerName(_ctx.stringValue("DescribeProductRatesResponse.OrderRates["+ i +"].BuyerName"));
			orderRate.setAliUid(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].AliUid"));
			orderRate.setPrice(_ctx.floatValue("DescribeProductRatesResponse.OrderRates["+ i +"].Price"));
			orderRate.setDistributionScore1(_ctx.integerValue("DescribeProductRatesResponse.OrderRates["+ i +"].DistributionScore1"));
			orderRate.setDistributionScore2(_ctx.integerValue("DescribeProductRatesResponse.OrderRates["+ i +"].DistributionScore2"));
			orderRate.setDistributionScore3(_ctx.integerValue("DescribeProductRatesResponse.OrderRates["+ i +"].DistributionScore3"));
			orderRate.setDimensions(_ctx.integerValue("DescribeProductRatesResponse.OrderRates["+ i +"].Dimensions"));
			orderRate.setExplaintion(_ctx.stringValue("DescribeProductRatesResponse.OrderRates["+ i +"].Explaintion"));
			orderRate.setAdditionalContent(_ctx.stringValue("DescribeProductRatesResponse.OrderRates["+ i +"].AdditionalContent"));
			orderRate.setAdditionalExplaintion(_ctx.stringValue("DescribeProductRatesResponse.OrderRates["+ i +"].AdditionalExplaintion"));
			orderRate.setGmtExplaintion(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].GmtExplaintion"));
			orderRate.setGmtAdditional(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].GmtAdditional"));
			orderRate.setGmtAdditionalExplaintion(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].GmtAdditionalExplaintion"));
			orderRate.setRateType(_ctx.integerValue("DescribeProductRatesResponse.OrderRates["+ i +"].RateType"));
			orderRate.setModified(_ctx.booleanValue("DescribeProductRatesResponse.OrderRates["+ i +"].Modified"));
			orderRate.setAdditionalModified(_ctx.booleanValue("DescribeProductRatesResponse.OrderRates["+ i +"].AdditionalModified"));
			orderRate.setDeleted(_ctx.booleanValue("DescribeProductRatesResponse.OrderRates["+ i +"].Deleted"));
			orderRate.setDdditionalDeleted(_ctx.booleanValue("DescribeProductRatesResponse.OrderRates["+ i +"].DdditionalDeleted"));
			orderRate.setGmtModified(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].GmtModified"));
			orderRate.setGmtAdditionalModified(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].GmtAdditionalModified"));
			orderRate.setGmtDeleted(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].GmtDeleted"));
			orderRate.setGmtAdditionalDeleted(_ctx.longValue("DescribeProductRatesResponse.OrderRates["+ i +"].GmtAdditionalDeleted"));

			orderRatesList.add(orderRate);
		}
		describeProductRatesResponse.setOrderRates(orderRatesList);
	 
	 	return describeProductRatesResponse;
	}
}