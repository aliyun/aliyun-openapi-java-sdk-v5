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

import com.aliyuncs.v5.market.model.v20151101.DescribeOrdersResponse;
import com.aliyuncs.v5.market.model.v20151101.DescribeOrdersResponse.Order;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeOrdersResponseUnmarshaller {

	public static DescribeOrdersResponse unmarshall(DescribeOrdersResponse describeOrdersResponse, UnmarshallerContext _ctx) {
		
		describeOrdersResponse.setRequestId(_ctx.stringValue("DescribeOrdersResponse.RequestId"));
		describeOrdersResponse.setCount(_ctx.longValue("DescribeOrdersResponse.Count"));
		describeOrdersResponse.setPaymentPrice(_ctx.floatValue("DescribeOrdersResponse.PaymentPrice"));
		describeOrdersResponse.setCouponPrice(_ctx.floatValue("DescribeOrdersResponse.CouponPrice"));

		List<Order> ordersList = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOrdersResponse.Orders.Length"); i++) {
			Order order = new Order();
			order.setOrderId(_ctx.longValue("DescribeOrdersResponse.Orders["+ i +"].OrderId"));
			order.setAliUid(_ctx.longValue("DescribeOrdersResponse.Orders["+ i +"].AliUid"));
			order.setSupplierId(_ctx.longValue("DescribeOrdersResponse.Orders["+ i +"].SupplierId"));
			order.setAliyunId(_ctx.stringValue("DescribeOrdersResponse.Orders["+ i +"].AliyunId"));
			order.setProductType(_ctx.stringValue("DescribeOrdersResponse.Orders["+ i +"].ProductType"));
			order.setProductCode(_ctx.stringValue("DescribeOrdersResponse.Orders["+ i +"].ProductCode"));
			order.setProductSKUCode(_ctx.stringValue("DescribeOrdersResponse.Orders["+ i +"].ProductSKUCode"));
			order.setProductName(_ctx.stringValue("DescribeOrdersResponse.Orders["+ i +"].ProductName"));
			order.setOrderType(_ctx.stringValue("DescribeOrdersResponse.Orders["+ i +"].OrderType"));
			order.setOrderStatus(_ctx.stringValue("DescribeOrdersResponse.Orders["+ i +"].OrderStatus"));
			order.setPaidOn(_ctx.longValue("DescribeOrdersResponse.Orders["+ i +"].PaidOn"));
			order.setCreatedOn(_ctx.longValue("DescribeOrdersResponse.Orders["+ i +"].CreatedOn"));
			order.setOriginalPrice(_ctx.floatValue("DescribeOrdersResponse.Orders["+ i +"].OriginalPrice"));
			order.setTotalPrice(_ctx.floatValue("DescribeOrdersResponse.Orders["+ i +"].TotalPrice"));

			ordersList.add(order);
		}
		describeOrdersResponse.setOrders(ordersList);
	 
	 	return describeOrdersResponse;
	}
}