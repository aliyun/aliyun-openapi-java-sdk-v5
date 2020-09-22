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

import com.aliyuncs.v5.market.model.v20151101.DescribePriceResponse;
import com.aliyuncs.v5.market.model.v20151101.DescribePriceResponse.Coupon;
import com.aliyuncs.v5.market.model.v20151101.DescribePriceResponse.PromotionRule;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setProductCode(_ctx.stringValue("DescribePriceResponse.ProductCode"));
		describePriceResponse.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.OriginalPrice"));
		describePriceResponse.setTradePrice(_ctx.floatValue("DescribePriceResponse.TradePrice"));
		describePriceResponse.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.DiscountPrice"));
		describePriceResponse.setCuxiao(_ctx.booleanValue("DescribePriceResponse.Cuxiao"));
		describePriceResponse.setDuration(_ctx.integerValue("DescribePriceResponse.Duration"));
		describePriceResponse.setCycle(_ctx.stringValue("DescribePriceResponse.Cycle"));
		describePriceResponse.setInfoTitle(_ctx.stringValue("DescribePriceResponse.InfoTitle"));
		describePriceResponse.setExpressionCode(_ctx.stringValue("DescribePriceResponse.ExpressionCode"));
		describePriceResponse.setCurrency(_ctx.stringValue("DescribePriceResponse.Currency"));
		describePriceResponse.setExpressionMessage(_ctx.stringValue("DescribePriceResponse.ExpressionMessage"));

		List<PromotionRule> promotionRulesList = new ArrayList<PromotionRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PromotionRules.Length"); i++) {
			PromotionRule promotionRule = new PromotionRule();
			promotionRule.setRuleId(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].RuleId"));
			promotionRule.setName(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].Name"));
			promotionRule.setTitle(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].Title"));

			promotionRulesList.add(promotionRule);
		}
		describePriceResponse.setPromotionRules(promotionRulesList);

		List<Coupon> couponsList = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponOptionCode(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].CouponOptionCode"));
			coupon.setCouponOptionNo(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].CouponOptionNo"));
			coupon.setCouponName(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].CouponName"));
			coupon.setCouponDesc(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].CouponDesc"));
			coupon.setCanPromFee(_ctx.floatValue("DescribePriceResponse.Coupons["+ i +"].CanPromFee"));
			coupon.setIsSelected(_ctx.booleanValue("DescribePriceResponse.Coupons["+ i +"].IsSelected"));

			couponsList.add(coupon);
		}
		describePriceResponse.setCoupons(couponsList);
	 
	 	return describePriceResponse;
	}
}