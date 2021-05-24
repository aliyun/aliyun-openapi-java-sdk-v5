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

import com.aliyuncs.v5.dts.model.v20200101.CreateMigrationJobResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateMigrationJobResponseUnmarshaller {

	public static CreateMigrationJobResponse unmarshall(CreateMigrationJobResponse createMigrationJobResponse, UnmarshallerContext _ctx) {
		
		createMigrationJobResponse.setRequestId(_ctx.stringValue("CreateMigrationJobResponse.RequestId"));
		createMigrationJobResponse.setErrCode(_ctx.stringValue("CreateMigrationJobResponse.ErrCode"));
		createMigrationJobResponse.setErrMessage(_ctx.stringValue("CreateMigrationJobResponse.ErrMessage"));
		createMigrationJobResponse.setMigrationJobId(_ctx.stringValue("CreateMigrationJobResponse.MigrationJobId"));
		createMigrationJobResponse.setSuccess(_ctx.stringValue("CreateMigrationJobResponse.Success"));
	 
	 	return createMigrationJobResponse;
	}
}