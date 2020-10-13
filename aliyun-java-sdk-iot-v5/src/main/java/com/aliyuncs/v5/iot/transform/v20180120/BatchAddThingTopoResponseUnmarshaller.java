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

import com.aliyuncs.v5.iot.model.v20180120.BatchAddThingTopoResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class BatchAddThingTopoResponseUnmarshaller {

	public static BatchAddThingTopoResponse unmarshall(BatchAddThingTopoResponse batchAddThingTopoResponse, UnmarshallerContext _ctx) {
		
		batchAddThingTopoResponse.setRequestId(_ctx.stringValue("BatchAddThingTopoResponse.RequestId"));
		batchAddThingTopoResponse.setSuccess(_ctx.booleanValue("BatchAddThingTopoResponse.Success"));
		batchAddThingTopoResponse.setCode(_ctx.stringValue("BatchAddThingTopoResponse.Code"));
		batchAddThingTopoResponse.setErrorMessage(_ctx.stringValue("BatchAddThingTopoResponse.ErrorMessage"));
	 
	 	return batchAddThingTopoResponse;
	}
}