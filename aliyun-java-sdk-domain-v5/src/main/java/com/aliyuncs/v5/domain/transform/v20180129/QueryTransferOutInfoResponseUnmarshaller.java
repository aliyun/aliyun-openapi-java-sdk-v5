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

import com.aliyuncs.v5.domain.model.v20180129.QueryTransferOutInfoResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryTransferOutInfoResponseUnmarshaller {

	public static QueryTransferOutInfoResponse unmarshall(QueryTransferOutInfoResponse queryTransferOutInfoResponse, UnmarshallerContext _ctx) {
		
		queryTransferOutInfoResponse.setRequestId(_ctx.stringValue("QueryTransferOutInfoResponse.RequestId"));
		queryTransferOutInfoResponse.setStatus(_ctx.integerValue("QueryTransferOutInfoResponse.Status"));
		queryTransferOutInfoResponse.setEmail(_ctx.stringValue("QueryTransferOutInfoResponse.Email"));
		queryTransferOutInfoResponse.setTransferAuthorizationCodeSendDate(_ctx.stringValue("QueryTransferOutInfoResponse.TransferAuthorizationCodeSendDate"));
		queryTransferOutInfoResponse.setExpirationDate(_ctx.stringValue("QueryTransferOutInfoResponse.ExpirationDate"));
		queryTransferOutInfoResponse.setPendingRequestDate(_ctx.stringValue("QueryTransferOutInfoResponse.PendingRequestDate"));
		queryTransferOutInfoResponse.setResultCode(_ctx.stringValue("QueryTransferOutInfoResponse.ResultCode"));
		queryTransferOutInfoResponse.setResultMsg(_ctx.stringValue("QueryTransferOutInfoResponse.ResultMsg"));
	 
	 	return queryTransferOutInfoResponse;
	}
}