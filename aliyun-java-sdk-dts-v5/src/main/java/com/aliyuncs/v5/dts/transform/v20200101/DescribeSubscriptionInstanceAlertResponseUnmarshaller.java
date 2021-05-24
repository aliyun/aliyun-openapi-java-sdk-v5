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

package com.aliyuncs.v5.dts.transform.v20200101;

import com.aliyuncs.v5.dts.model.v20200101.DescribeSubscriptionInstanceAlertResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeSubscriptionInstanceAlertResponseUnmarshaller {

	public static DescribeSubscriptionInstanceAlertResponse unmarshall(DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlertResponse, UnmarshallerContext _ctx) {
		
		describeSubscriptionInstanceAlertResponse.setRequestId(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.RequestId"));
		describeSubscriptionInstanceAlertResponse.setDelayAlertPhone(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayAlertPhone"));
		describeSubscriptionInstanceAlertResponse.setDelayAlertStatus(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayAlertStatus"));
		describeSubscriptionInstanceAlertResponse.setDelayOverSeconds(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayOverSeconds"));
		describeSubscriptionInstanceAlertResponse.setErrCode(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrCode"));
		describeSubscriptionInstanceAlertResponse.setErrMessage(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrMessage"));
		describeSubscriptionInstanceAlertResponse.setErrorAlertPhone(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrorAlertPhone"));
		describeSubscriptionInstanceAlertResponse.setErrorAlertStatus(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrorAlertStatus"));
		describeSubscriptionInstanceAlertResponse.setSubscriptionInstanceID(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.SubscriptionInstanceID"));
		describeSubscriptionInstanceAlertResponse.setSubscriptionInstanceName(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.SubscriptionInstanceName"));
		describeSubscriptionInstanceAlertResponse.setSuccess(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.Success"));
	 
	 	return describeSubscriptionInstanceAlertResponse;
	}
}