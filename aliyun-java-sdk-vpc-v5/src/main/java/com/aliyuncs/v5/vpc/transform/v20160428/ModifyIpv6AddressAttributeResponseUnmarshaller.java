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

import com.aliyuncs.v5.vpc.model.v20160428.ModifyIpv6AddressAttributeResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifyIpv6AddressAttributeResponseUnmarshaller {

	public static ModifyIpv6AddressAttributeResponse unmarshall(ModifyIpv6AddressAttributeResponse modifyIpv6AddressAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyIpv6AddressAttributeResponse.setRequestId(_ctx.stringValue("ModifyIpv6AddressAttributeResponse.RequestId"));
	 
	 	return modifyIpv6AddressAttributeResponse;
	}
}