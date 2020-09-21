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

import com.aliyuncs.v5.vpc.model.v20160428.CreateIpv6EgressOnlyRuleResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateIpv6EgressOnlyRuleResponseUnmarshaller {

	public static CreateIpv6EgressOnlyRuleResponse unmarshall(CreateIpv6EgressOnlyRuleResponse createIpv6EgressOnlyRuleResponse, UnmarshallerContext _ctx) {
		
		createIpv6EgressOnlyRuleResponse.setRequestId(_ctx.stringValue("CreateIpv6EgressOnlyRuleResponse.RequestId"));
		createIpv6EgressOnlyRuleResponse.setIpv6EgressRuleId(_ctx.stringValue("CreateIpv6EgressOnlyRuleResponse.Ipv6EgressRuleId"));
	 
	 	return createIpv6EgressOnlyRuleResponse;
	}
}