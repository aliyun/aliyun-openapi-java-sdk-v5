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

package com.aliyuncs.v5.dds.transform.v20151201;

import com.aliyuncs.v5.dds.model.v20151201.TransformToPrePaidResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class TransformToPrePaidResponseUnmarshaller {

	public static TransformToPrePaidResponse unmarshall(TransformToPrePaidResponse transformToPrePaidResponse, UnmarshallerContext _ctx) {
		
		transformToPrePaidResponse.setRequestId(_ctx.stringValue("TransformToPrePaidResponse.RequestId"));
		transformToPrePaidResponse.setEndTime(_ctx.stringValue("TransformToPrePaidResponse.EndTime"));
		transformToPrePaidResponse.setOrderId(_ctx.stringValue("TransformToPrePaidResponse.OrderId"));
	 
	 	return transformToPrePaidResponse;
	}
}