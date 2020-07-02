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

package com.aliyuncs.v5.dataworks_public.transform.v20200518;

import com.aliyuncs.v5.dataworks_public.model.v20200518.CreateQualityRuleResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateQualityRuleResponseUnmarshaller {

	public static CreateQualityRuleResponse unmarshall(CreateQualityRuleResponse createQualityRuleResponse, UnmarshallerContext _ctx) {
		
		createQualityRuleResponse.setRequestId(_ctx.stringValue("CreateQualityRuleResponse.RequestId"));
		createQualityRuleResponse.setErrorCode(_ctx.stringValue("CreateQualityRuleResponse.ErrorCode"));
		createQualityRuleResponse.setData(_ctx.stringValue("CreateQualityRuleResponse.Data"));
		createQualityRuleResponse.setSuccess(_ctx.booleanValue("CreateQualityRuleResponse.Success"));
		createQualityRuleResponse.setErrorMessage(_ctx.stringValue("CreateQualityRuleResponse.ErrorMessage"));
		createQualityRuleResponse.setHttpStatusCode(_ctx.integerValue("CreateQualityRuleResponse.HttpStatusCode"));
	 
	 	return createQualityRuleResponse;
	}
}