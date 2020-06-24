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

package com.aliyuncs.v5.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.domain.model.v20180129.SubmitEmailVerificationResponse;
import com.aliyuncs.v5.domain.model.v20180129.SubmitEmailVerificationResponse.SendResult;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SubmitEmailVerificationResponseUnmarshaller {

	public static SubmitEmailVerificationResponse unmarshall(SubmitEmailVerificationResponse submitEmailVerificationResponse, UnmarshallerContext _ctx) {
		
		submitEmailVerificationResponse.setRequestId(_ctx.stringValue("SubmitEmailVerificationResponse.RequestId"));

		List<SendResult> successListList = new ArrayList<SendResult>();
		for (int i = 0; i < _ctx.lengthValue("SubmitEmailVerificationResponse.SuccessList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(_ctx.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Email"));
			sendResult.setCode(_ctx.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Code"));
			sendResult.setMessage(_ctx.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Message"));

			successListList.add(sendResult);
		}
		submitEmailVerificationResponse.setSuccessList(successListList);

		List<SendResult> failListList = new ArrayList<SendResult>();
		for (int i = 0; i < _ctx.lengthValue("SubmitEmailVerificationResponse.FailList.Length"); i++) {
			SendResult sendResult_ = new SendResult();
			sendResult_.setEmail(_ctx.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Email"));
			sendResult_.setCode(_ctx.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Code"));
			sendResult_.setMessage(_ctx.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Message"));

			failListList.add(sendResult_);
		}
		submitEmailVerificationResponse.setFailList(failListList);

		List<SendResult> existListList = new ArrayList<SendResult>();
		for (int i = 0; i < _ctx.lengthValue("SubmitEmailVerificationResponse.ExistList.Length"); i++) {
			SendResult sendResult_ = new SendResult();
			sendResult_.setEmail(_ctx.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Email"));
			sendResult_.setCode(_ctx.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Code"));
			sendResult_.setMessage(_ctx.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Message"));

			existListList.add(sendResult_);
		}
		submitEmailVerificationResponse.setExistList(existListList);
	 
	 	return submitEmailVerificationResponse;
	}
}