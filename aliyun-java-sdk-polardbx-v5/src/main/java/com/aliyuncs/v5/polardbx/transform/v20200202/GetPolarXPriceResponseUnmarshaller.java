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

package com.aliyuncs.v5.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.polardbx.model.v20200202.GetPolarXPriceResponse;
import com.aliyuncs.v5.polardbx.model.v20200202.GetPolarXPriceResponse.OrderPrice;
import com.aliyuncs.v5.polardbx.model.v20200202.GetPolarXPriceResponse.OrderPrice.Rule;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetPolarXPriceResponseUnmarshaller {

	public static GetPolarXPriceResponse unmarshall(GetPolarXPriceResponse getPolarXPriceResponse, UnmarshallerContext _ctx) {
		
		getPolarXPriceResponse.setRequestId(_ctx.stringValue("GetPolarXPriceResponse.RequestId"));

		List<OrderPrice> orderPriceListList = new ArrayList<OrderPrice>();
		for (int i = 0; i < _ctx.lengthValue("GetPolarXPriceResponse.OrderPriceList.Length"); i++) {
			OrderPrice orderPrice = new OrderPrice();
			orderPrice.setDBInstanceName(_ctx.stringValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].DBInstanceName"));
			orderPrice.setTotalCostAmount(_ctx.stringValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].TotalCostAmount"));
			orderPrice.setDiscountAmount(_ctx.stringValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].DiscountAmount"));
			orderPrice.setTradeAmount(_ctx.stringValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].TradeAmount"));
			orderPrice.setOriginalAmount(_ctx.stringValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].OriginalAmount"));
			orderPrice.setPayType(_ctx.stringValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].PayType"));

			List<Rule> rulesList = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setRuleDescId(_ctx.longValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].Rules["+ j +"].RuleDescId"));
				rule.setName(_ctx.stringValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].Rules["+ j +"].Name"));
				rule.setTitle(_ctx.stringValue("GetPolarXPriceResponse.OrderPriceList["+ i +"].Rules["+ j +"].Title"));

				rulesList.add(rule);
			}
			orderPrice.setRules(rulesList);

			orderPriceListList.add(orderPrice);
		}
		getPolarXPriceResponse.setOrderPriceList(orderPriceListList);
	 
	 	return getPolarXPriceResponse;
	}
}