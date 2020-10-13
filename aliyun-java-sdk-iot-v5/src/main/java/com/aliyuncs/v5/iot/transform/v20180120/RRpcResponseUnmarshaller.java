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

import com.aliyuncs.v5.iot.model.v20180120.RRpcResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class RRpcResponseUnmarshaller {

	public static RRpcResponse unmarshall(RRpcResponse rRpcResponse, UnmarshallerContext _ctx) {
		
		rRpcResponse.setRequestId(_ctx.stringValue("RRpcResponse.RequestId"));
		rRpcResponse.setSuccess(_ctx.booleanValue("RRpcResponse.Success"));
		rRpcResponse.setCode(_ctx.stringValue("RRpcResponse.Code"));
		rRpcResponse.setErrorMessage(_ctx.stringValue("RRpcResponse.ErrorMessage"));
		rRpcResponse.setRrpcCode(_ctx.stringValue("RRpcResponse.RrpcCode"));
		rRpcResponse.setPayloadBase64Byte(_ctx.stringValue("RRpcResponse.PayloadBase64Byte"));
		rRpcResponse.setMessageId(_ctx.longValue("RRpcResponse.MessageId"));
	 
	 	return rRpcResponse;
	}
}