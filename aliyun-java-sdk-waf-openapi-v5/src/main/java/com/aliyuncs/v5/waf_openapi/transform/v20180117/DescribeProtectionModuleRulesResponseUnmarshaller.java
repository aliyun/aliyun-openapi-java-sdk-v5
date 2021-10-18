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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.waf_openapi.model.v20180117.DescribeProtectionModuleRulesResponse;
import com.aliyuncs.v5.waf_openapi.model.v20180117.DescribeProtectionModuleRulesResponse.ModuleRulesItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeProtectionModuleRulesResponseUnmarshaller {

	public static DescribeProtectionModuleRulesResponse unmarshall(DescribeProtectionModuleRulesResponse describeProtectionModuleRulesResponse, UnmarshallerContext _ctx) {
		
		describeProtectionModuleRulesResponse.setRequestId(_ctx.stringValue("DescribeProtectionModuleRulesResponse.RequestId"));
		describeProtectionModuleRulesResponse.setTaskStatus(_ctx.integerValue("DescribeProtectionModuleRulesResponse.TaskStatus"));
		describeProtectionModuleRulesResponse.setTotal(_ctx.integerValue("DescribeProtectionModuleRulesResponse.Total"));

		List<ModuleRulesItem> moduleRulesList = new ArrayList<ModuleRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProtectionModuleRulesResponse.ModuleRules.Length"); i++) {
			ModuleRulesItem moduleRulesItem = new ModuleRulesItem();
			moduleRulesItem.setId(_ctx.longValue("DescribeProtectionModuleRulesResponse.ModuleRules["+ i +"].Id"));
			moduleRulesItem.setVersion(_ctx.longValue("DescribeProtectionModuleRulesResponse.ModuleRules["+ i +"].Version"));
			moduleRulesItem.setContent(_ctx.stringValue("DescribeProtectionModuleRulesResponse.ModuleRules["+ i +"].Content"));
			moduleRulesItem.setTime(_ctx.longValue("DescribeProtectionModuleRulesResponse.ModuleRules["+ i +"].Time"));

			moduleRulesList.add(moduleRulesItem);
		}
		describeProtectionModuleRulesResponse.setModuleRules(moduleRulesList);
	 
	 	return describeProtectionModuleRulesResponse;
	}
}