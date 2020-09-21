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

import com.aliyuncs.v5.vpc.model.v20160428.CreateGlobalAccelerationInstanceResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateGlobalAccelerationInstanceResponseUnmarshaller {

	public static CreateGlobalAccelerationInstanceResponse unmarshall(CreateGlobalAccelerationInstanceResponse createGlobalAccelerationInstanceResponse, UnmarshallerContext _ctx) {
		
		createGlobalAccelerationInstanceResponse.setRequestId(_ctx.stringValue("CreateGlobalAccelerationInstanceResponse.RequestId"));
		createGlobalAccelerationInstanceResponse.setGlobalAccelerationInstanceId(_ctx.stringValue("CreateGlobalAccelerationInstanceResponse.GlobalAccelerationInstanceId"));
		createGlobalAccelerationInstanceResponse.setIpAddress(_ctx.stringValue("CreateGlobalAccelerationInstanceResponse.IpAddress"));
	 
	 	return createGlobalAccelerationInstanceResponse;
	}
}