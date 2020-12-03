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

import com.aliyuncs.v5.iot.model.v20180120.CreateSpeechModelResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateSpeechModelResponseUnmarshaller {

	public static CreateSpeechModelResponse unmarshall(CreateSpeechModelResponse createSpeechModelResponse, UnmarshallerContext _ctx) {
		
		createSpeechModelResponse.setRequestId(_ctx.stringValue("CreateSpeechModelResponse.RequestId"));
		createSpeechModelResponse.setSuccess(_ctx.booleanValue("CreateSpeechModelResponse.Success"));
		createSpeechModelResponse.setCode(_ctx.stringValue("CreateSpeechModelResponse.Code"));
		createSpeechModelResponse.setErrorMessage(_ctx.stringValue("CreateSpeechModelResponse.ErrorMessage"));
		createSpeechModelResponse.setData(_ctx.stringValue("CreateSpeechModelResponse.Data"));
	 
	 	return createSpeechModelResponse;
	}
}