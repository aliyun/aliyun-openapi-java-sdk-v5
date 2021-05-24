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

import com.aliyuncs.v5.dts.model.v20200101.StartMigrationJobResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class StartMigrationJobResponseUnmarshaller {

	public static StartMigrationJobResponse unmarshall(StartMigrationJobResponse startMigrationJobResponse, UnmarshallerContext _ctx) {
		
		startMigrationJobResponse.setRequestId(_ctx.stringValue("StartMigrationJobResponse.RequestId"));
		startMigrationJobResponse.setErrCode(_ctx.stringValue("StartMigrationJobResponse.ErrCode"));
		startMigrationJobResponse.setErrMessage(_ctx.stringValue("StartMigrationJobResponse.ErrMessage"));
		startMigrationJobResponse.setSuccess(_ctx.stringValue("StartMigrationJobResponse.Success"));
	 
	 	return startMigrationJobResponse;
	}
}