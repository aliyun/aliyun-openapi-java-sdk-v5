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

package com.aliyuncs.v5.vpc.transform.v20160428;

import com.aliyuncs.v5.vpc.model.v20160428.ModifyIPv6TranslatorBandwidthResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifyIPv6TranslatorBandwidthResponseUnmarshaller {

	public static ModifyIPv6TranslatorBandwidthResponse unmarshall(ModifyIPv6TranslatorBandwidthResponse modifyIPv6TranslatorBandwidthResponse, UnmarshallerContext _ctx) {
		
		modifyIPv6TranslatorBandwidthResponse.setRequestId(_ctx.stringValue("ModifyIPv6TranslatorBandwidthResponse.RequestId"));
		modifyIPv6TranslatorBandwidthResponse.setOrderId(_ctx.stringValue("ModifyIPv6TranslatorBandwidthResponse.OrderId"));
	 
	 	return modifyIPv6TranslatorBandwidthResponse;
	}
}