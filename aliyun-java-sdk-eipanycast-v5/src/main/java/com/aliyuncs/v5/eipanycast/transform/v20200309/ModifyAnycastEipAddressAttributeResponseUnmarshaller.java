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

package com.aliyuncs.v5.eipanycast.transform.v20200309;

import com.aliyuncs.v5.eipanycast.model.v20200309.ModifyAnycastEipAddressAttributeResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifyAnycastEipAddressAttributeResponseUnmarshaller {

	public static ModifyAnycastEipAddressAttributeResponse unmarshall(ModifyAnycastEipAddressAttributeResponse modifyAnycastEipAddressAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyAnycastEipAddressAttributeResponse.setRequestId(_ctx.stringValue("ModifyAnycastEipAddressAttributeResponse.RequestId"));
	 
	 	return modifyAnycastEipAddressAttributeResponse;
	}
}