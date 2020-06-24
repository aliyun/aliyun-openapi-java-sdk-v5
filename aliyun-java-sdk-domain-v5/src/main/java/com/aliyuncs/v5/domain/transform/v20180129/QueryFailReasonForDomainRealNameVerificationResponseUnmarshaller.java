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

import com.aliyuncs.v5.domain.model.v20180129.QueryFailReasonForDomainRealNameVerificationResponse;
import com.aliyuncs.v5.domain.model.v20180129.QueryFailReasonForDomainRealNameVerificationResponse.FailRecord;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryFailReasonForDomainRealNameVerificationResponseUnmarshaller {

	public static QueryFailReasonForDomainRealNameVerificationResponse unmarshall(QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerificationResponse, UnmarshallerContext _ctx) {
		
		queryFailReasonForDomainRealNameVerificationResponse.setRequestId(_ctx.stringValue("QueryFailReasonForDomainRealNameVerificationResponse.RequestId"));

		List<FailRecord> dataList = new ArrayList<FailRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryFailReasonForDomainRealNameVerificationResponse.Data.Length"); i++) {
			FailRecord failRecord = new FailRecord();
			failRecord.setDate(_ctx.stringValue("QueryFailReasonForDomainRealNameVerificationResponse.Data["+ i +"].Date"));
			failRecord.setFailReason(_ctx.stringValue("QueryFailReasonForDomainRealNameVerificationResponse.Data["+ i +"].FailReason"));
			failRecord.setDomainNameVerificationStatus(_ctx.stringValue("QueryFailReasonForDomainRealNameVerificationResponse.Data["+ i +"].DomainNameVerificationStatus"));

			dataList.add(failRecord);
		}
		queryFailReasonForDomainRealNameVerificationResponse.setData(dataList);
	 
	 	return queryFailReasonForDomainRealNameVerificationResponse;
	}
}