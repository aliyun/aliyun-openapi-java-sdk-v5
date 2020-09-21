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

import com.aliyuncs.v5.vpc.model.v20160428.CreateIPv6TranslatorResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateIPv6TranslatorResponseUnmarshaller {

	public static CreateIPv6TranslatorResponse unmarshall(CreateIPv6TranslatorResponse createIPv6TranslatorResponse, UnmarshallerContext _ctx) {
		
		createIPv6TranslatorResponse.setRequestId(_ctx.stringValue("CreateIPv6TranslatorResponse.RequestId"));
		createIPv6TranslatorResponse.setIpv6TranslatorId(_ctx.stringValue("CreateIPv6TranslatorResponse.Ipv6TranslatorId"));
		createIPv6TranslatorResponse.setName(_ctx.stringValue("CreateIPv6TranslatorResponse.Name"));
		createIPv6TranslatorResponse.setSpec(_ctx.stringValue("CreateIPv6TranslatorResponse.Spec"));
		createIPv6TranslatorResponse.setOrderId(_ctx.longValue("CreateIPv6TranslatorResponse.OrderId"));
	 
	 	return createIPv6TranslatorResponse;
	}
}