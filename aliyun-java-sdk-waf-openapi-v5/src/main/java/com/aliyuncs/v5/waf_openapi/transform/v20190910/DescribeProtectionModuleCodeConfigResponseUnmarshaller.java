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

package com.aliyuncs.v5.waf_openapi.transform.v20190910;

import com.aliyuncs.v5.waf_openapi.model.v20190910.DescribeProtectionModuleCodeConfigResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeProtectionModuleCodeConfigResponseUnmarshaller {

	public static DescribeProtectionModuleCodeConfigResponse unmarshall(DescribeProtectionModuleCodeConfigResponse describeProtectionModuleCodeConfigResponse, UnmarshallerContext _ctx) {
		
		describeProtectionModuleCodeConfigResponse.setRequestId(_ctx.stringValue("DescribeProtectionModuleCodeConfigResponse.RequestId"));
		describeProtectionModuleCodeConfigResponse.setCodeConfigs(_ctx.stringValue("DescribeProtectionModuleCodeConfigResponse.CodeConfigs"));
	 
	 	return describeProtectionModuleCodeConfigResponse;
	}
}