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

import com.aliyuncs.v5.iot.model.v20180120.StopRuleResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class StopRuleResponseUnmarshaller {

	public static StopRuleResponse unmarshall(StopRuleResponse stopRuleResponse, UnmarshallerContext _ctx) {
		
		stopRuleResponse.setRequestId(_ctx.stringValue("StopRuleResponse.RequestId"));
		stopRuleResponse.setSuccess(_ctx.booleanValue("StopRuleResponse.Success"));
		stopRuleResponse.setCode(_ctx.stringValue("StopRuleResponse.Code"));
		stopRuleResponse.setErrorMessage(_ctx.stringValue("StopRuleResponse.ErrorMessage"));
	 
	 	return stopRuleResponse;
	}
}