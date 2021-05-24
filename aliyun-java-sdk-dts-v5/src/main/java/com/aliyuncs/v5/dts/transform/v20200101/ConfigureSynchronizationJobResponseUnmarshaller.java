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

package com.aliyuncs.v5.dts.transform.v20200101;

import com.aliyuncs.v5.dts.model.v20200101.ConfigureSynchronizationJobResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ConfigureSynchronizationJobResponseUnmarshaller {

	public static ConfigureSynchronizationJobResponse unmarshall(ConfigureSynchronizationJobResponse configureSynchronizationJobResponse, UnmarshallerContext _ctx) {
		
		configureSynchronizationJobResponse.setRequestId(_ctx.stringValue("ConfigureSynchronizationJobResponse.RequestId"));
		configureSynchronizationJobResponse.setErrCode(_ctx.stringValue("ConfigureSynchronizationJobResponse.ErrCode"));
		configureSynchronizationJobResponse.setErrMessage(_ctx.stringValue("ConfigureSynchronizationJobResponse.ErrMessage"));
		configureSynchronizationJobResponse.setSuccess(_ctx.stringValue("ConfigureSynchronizationJobResponse.Success"));
	 
	 	return configureSynchronizationJobResponse;
	}
}