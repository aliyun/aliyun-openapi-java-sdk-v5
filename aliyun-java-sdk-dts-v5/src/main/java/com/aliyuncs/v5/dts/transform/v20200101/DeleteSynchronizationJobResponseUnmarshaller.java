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

import com.aliyuncs.v5.dts.model.v20200101.DeleteSynchronizationJobResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DeleteSynchronizationJobResponseUnmarshaller {

	public static DeleteSynchronizationJobResponse unmarshall(DeleteSynchronizationJobResponse deleteSynchronizationJobResponse, UnmarshallerContext _ctx) {
		
		deleteSynchronizationJobResponse.setRequestId(_ctx.stringValue("DeleteSynchronizationJobResponse.RequestId"));
		deleteSynchronizationJobResponse.setErrCode(_ctx.stringValue("DeleteSynchronizationJobResponse.ErrCode"));
		deleteSynchronizationJobResponse.setErrMessage(_ctx.stringValue("DeleteSynchronizationJobResponse.ErrMessage"));
		deleteSynchronizationJobResponse.setSuccess(_ctx.stringValue("DeleteSynchronizationJobResponse.Success"));
	 
	 	return deleteSynchronizationJobResponse;
	}
}