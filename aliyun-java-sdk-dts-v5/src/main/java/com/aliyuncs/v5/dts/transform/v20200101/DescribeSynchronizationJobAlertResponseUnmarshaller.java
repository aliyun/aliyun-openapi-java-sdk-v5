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

import com.aliyuncs.v5.dts.model.v20200101.DescribeSynchronizationJobAlertResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeSynchronizationJobAlertResponseUnmarshaller {

	public static DescribeSynchronizationJobAlertResponse unmarshall(DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlertResponse, UnmarshallerContext _ctx) {
		
		describeSynchronizationJobAlertResponse.setRequestId(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.RequestId"));
		describeSynchronizationJobAlertResponse.setDelayAlertPhone(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.DelayAlertPhone"));
		describeSynchronizationJobAlertResponse.setDelayAlertStatus(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.DelayAlertStatus"));
		describeSynchronizationJobAlertResponse.setDelayOverSeconds(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.DelayOverSeconds"));
		describeSynchronizationJobAlertResponse.setErrCode(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.ErrCode"));
		describeSynchronizationJobAlertResponse.setErrMessage(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.ErrMessage"));
		describeSynchronizationJobAlertResponse.setErrorAlertPhone(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.ErrorAlertPhone"));
		describeSynchronizationJobAlertResponse.setErrorAlertStatus(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.ErrorAlertStatus"));
		describeSynchronizationJobAlertResponse.setSuccess(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.Success"));
		describeSynchronizationJobAlertResponse.setSynchronizationDirection(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.SynchronizationDirection"));
		describeSynchronizationJobAlertResponse.setSynchronizationJobId(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.SynchronizationJobId"));
		describeSynchronizationJobAlertResponse.setSynchronizationJobName(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.SynchronizationJobName"));
	 
	 	return describeSynchronizationJobAlertResponse;
	}
}