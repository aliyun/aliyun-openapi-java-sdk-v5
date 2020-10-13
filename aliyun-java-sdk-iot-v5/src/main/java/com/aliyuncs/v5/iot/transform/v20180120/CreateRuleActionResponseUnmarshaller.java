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

package com.aliyuncs.v5.iot.transform.v20180120;

import com.aliyuncs.v5.iot.model.v20180120.CreateRuleActionResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateRuleActionResponseUnmarshaller {

	public static CreateRuleActionResponse unmarshall(CreateRuleActionResponse createRuleActionResponse, UnmarshallerContext _ctx) {
		
		createRuleActionResponse.setRequestId(_ctx.stringValue("CreateRuleActionResponse.RequestId"));
		createRuleActionResponse.setCode(_ctx.stringValue("CreateRuleActionResponse.Code"));
		createRuleActionResponse.setSuccess(_ctx.booleanValue("CreateRuleActionResponse.Success"));
		createRuleActionResponse.setErrorMessage(_ctx.stringValue("CreateRuleActionResponse.ErrorMessage"));
		createRuleActionResponse.setActionId(_ctx.longValue("CreateRuleActionResponse.ActionId"));
	 
	 	return createRuleActionResponse;
	}
}