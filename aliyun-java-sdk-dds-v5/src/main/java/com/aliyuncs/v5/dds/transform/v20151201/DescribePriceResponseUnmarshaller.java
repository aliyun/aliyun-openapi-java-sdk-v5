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

package com.aliyuncs.v5.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dds.model.v20151201.DescribePriceResponse;
import com.aliyuncs.v5.dds.model.v20151201.DescribePriceResponse.Order;
import com.aliyuncs.v5.dds.model.v20151201.DescribePriceResponse.Order.Coupon;
import com.aliyuncs.v5.dds.model.v20151201.DescribePriceResponse.Rule;
import com.aliyuncs.v5.dds.model.v20151201.DescribePriceResponse.SubOrder;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));
		describePriceResponse.setTraceId(_ctx.stringValue("DescribePriceResponse.TraceId"));
		describePriceResponse.setOrderParams(_ctx.stringValue("DescribePriceResponse.OrderParams"));

		Order order = new Order();
		order.setCurrency(_ctx.stringValue("DescribePriceResponse.Order.Currency"));
		order.setTradeAmount(_ctx.stringValue("DescribePriceResponse.Order.TradeAmount"));
		order.setOriginalAmount(_ctx.stringValue("DescribePriceResponse.Order.OriginalAmount"));
		order.setDiscountAmount(_ctx.stringValue("DescribePriceResponse.Order.DiscountAmount"));

		List<String> ruleIds1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.RuleIds.Length"); i++) {
			ruleIds1.add(_ctx.stringValue("DescribePriceResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds1(ruleIds1);

		List<Coupon> couponsList = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].IsSelected"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.Order.Coupons["+ i +"].Name"));

			couponsList.add(coupon);
		}
		order.setCoupons(couponsList);
		describePriceResponse.setOrder(order);

		List<SubOrder> subOrdersList = new ArrayList<SubOrder>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.SubOrders.Length"); i++) {
			SubOrder subOrder = new SubOrder();
			subOrder.setInstanceId(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].InstanceId"));
			subOrder.setTradeAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].TradeAmount"));
			subOrder.setOriginalAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].OriginalAmount"));
			subOrder.setDiscountAmount(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].DiscountAmount"));

			List<String> ruleIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.SubOrders["+ i +"].RuleIds.Length"); j++) {
				ruleIds.add(_ctx.stringValue("DescribePriceResponse.SubOrders["+ i +"].RuleIds["+ j +"]"));
			}
			subOrder.setRuleIds(ruleIds);

			subOrdersList.add(subOrder);
		}
		describePriceResponse.setSubOrders(subOrdersList);

		List<Rule> rulesList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(_ctx.longValue("DescribePriceResponse.Rules["+ i +"].RuleDescId"));
			rule.setTitle(_ctx.stringValue("DescribePriceResponse.Rules["+ i +"].Title"));
			rule.setName(_ctx.stringValue("DescribePriceResponse.Rules["+ i +"].Name"));

			rulesList.add(rule);
		}
		describePriceResponse.setRules(rulesList);
	 
	 	return describePriceResponse;
	}
}