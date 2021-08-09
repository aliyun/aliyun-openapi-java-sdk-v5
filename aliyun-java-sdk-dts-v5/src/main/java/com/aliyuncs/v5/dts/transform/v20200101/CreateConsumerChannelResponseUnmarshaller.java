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

import com.aliyuncs.v5.dts.model.v20200101.CreateConsumerChannelResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateConsumerChannelResponseUnmarshaller {

	public static CreateConsumerChannelResponse unmarshall(CreateConsumerChannelResponse createConsumerChannelResponse, UnmarshallerContext _ctx) {
		
		createConsumerChannelResponse.setRequestId(_ctx.stringValue("CreateConsumerChannelResponse.RequestId"));
		createConsumerChannelResponse.setErrCode(_ctx.stringValue("CreateConsumerChannelResponse.ErrCode"));
		createConsumerChannelResponse.setErrMessage(_ctx.stringValue("CreateConsumerChannelResponse.ErrMessage"));
		createConsumerChannelResponse.setSuccess(_ctx.stringValue("CreateConsumerChannelResponse.Success"));
		createConsumerChannelResponse.setConsumerGroupID(_ctx.stringValue("CreateConsumerChannelResponse.ConsumerGroupID"));
		createConsumerChannelResponse.setHttpStatusCode(_ctx.stringValue("CreateConsumerChannelResponse.HttpStatusCode"));
	 
	 	return createConsumerChannelResponse;
	}
}