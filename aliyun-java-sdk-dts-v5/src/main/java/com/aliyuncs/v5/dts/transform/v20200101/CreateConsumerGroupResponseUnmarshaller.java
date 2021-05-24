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

import com.aliyuncs.v5.dts.model.v20200101.CreateConsumerGroupResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateConsumerGroupResponseUnmarshaller {

	public static CreateConsumerGroupResponse unmarshall(CreateConsumerGroupResponse createConsumerGroupResponse, UnmarshallerContext _ctx) {
		
		createConsumerGroupResponse.setRequestId(_ctx.stringValue("CreateConsumerGroupResponse.RequestId"));
		createConsumerGroupResponse.setConsumerGroupID(_ctx.stringValue("CreateConsumerGroupResponse.ConsumerGroupID"));
		createConsumerGroupResponse.setErrCode(_ctx.stringValue("CreateConsumerGroupResponse.ErrCode"));
		createConsumerGroupResponse.setErrMessage(_ctx.stringValue("CreateConsumerGroupResponse.ErrMessage"));
		createConsumerGroupResponse.setSuccess(_ctx.stringValue("CreateConsumerGroupResponse.Success"));
	 
	 	return createConsumerGroupResponse;
	}
}