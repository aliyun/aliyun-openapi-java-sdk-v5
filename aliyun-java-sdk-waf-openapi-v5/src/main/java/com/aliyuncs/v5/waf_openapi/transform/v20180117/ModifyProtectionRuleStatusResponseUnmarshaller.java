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

package com.aliyuncs.v5.waf_openapi.transform.v20180117;

import com.aliyuncs.v5.waf_openapi.model.v20180117.ModifyProtectionRuleStatusResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifyProtectionRuleStatusResponseUnmarshaller {

	public static ModifyProtectionRuleStatusResponse unmarshall(ModifyProtectionRuleStatusResponse modifyProtectionRuleStatusResponse, UnmarshallerContext _ctx) {
		
		modifyProtectionRuleStatusResponse.setRequestId(_ctx.stringValue("ModifyProtectionRuleStatusResponse.RequestId"));
		modifyProtectionRuleStatusResponse.setTaskStatus(_ctx.integerValue("ModifyProtectionRuleStatusResponse.TaskStatus"));
		modifyProtectionRuleStatusResponse.setWafTaskId(_ctx.integerValue("ModifyProtectionRuleStatusResponse.WafTaskId"));
	 
	 	return modifyProtectionRuleStatusResponse;
	}
}