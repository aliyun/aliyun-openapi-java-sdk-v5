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

package com.aliyuncs.v5.dbs.transform.v20190306;

import com.aliyuncs.v5.dbs.model.v20190306.ModifyBackupObjectsResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifyBackupObjectsResponseUnmarshaller {

	public static ModifyBackupObjectsResponse unmarshall(ModifyBackupObjectsResponse modifyBackupObjectsResponse, UnmarshallerContext _ctx) {
		
		modifyBackupObjectsResponse.setRequestId(_ctx.stringValue("ModifyBackupObjectsResponse.RequestId"));
		modifyBackupObjectsResponse.setSuccess(_ctx.booleanValue("ModifyBackupObjectsResponse.Success"));
		modifyBackupObjectsResponse.setErrCode(_ctx.stringValue("ModifyBackupObjectsResponse.ErrCode"));
		modifyBackupObjectsResponse.setErrMessage(_ctx.stringValue("ModifyBackupObjectsResponse.ErrMessage"));
		modifyBackupObjectsResponse.setHttpStatusCode(_ctx.integerValue("ModifyBackupObjectsResponse.HttpStatusCode"));
		modifyBackupObjectsResponse.setBackupPlanId(_ctx.stringValue("ModifyBackupObjectsResponse.BackupPlanId"));
		modifyBackupObjectsResponse.setNeedPrecheck(_ctx.booleanValue("ModifyBackupObjectsResponse.NeedPrecheck"));
	 
	 	return modifyBackupObjectsResponse;
	}
}