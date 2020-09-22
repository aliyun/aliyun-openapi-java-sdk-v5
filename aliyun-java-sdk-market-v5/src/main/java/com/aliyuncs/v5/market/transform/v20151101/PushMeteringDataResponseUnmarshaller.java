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

package com.aliyuncs.v5.market.transform.v20151101;

import com.aliyuncs.v5.market.model.v20151101.PushMeteringDataResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class PushMeteringDataResponseUnmarshaller {

	public static PushMeteringDataResponse unmarshall(PushMeteringDataResponse pushMeteringDataResponse, UnmarshallerContext _ctx) {
		
		pushMeteringDataResponse.setRequestId(_ctx.stringValue("PushMeteringDataResponse.RequestId"));
		pushMeteringDataResponse.setSuccess(_ctx.booleanValue("PushMeteringDataResponse.Success"));
	 
	 	return pushMeteringDataResponse;
	}
}