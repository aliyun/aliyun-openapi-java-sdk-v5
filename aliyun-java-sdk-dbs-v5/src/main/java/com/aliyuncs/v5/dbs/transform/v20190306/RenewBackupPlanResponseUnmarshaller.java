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

import com.aliyuncs.v5.dbs.model.v20190306.RenewBackupPlanResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class RenewBackupPlanResponseUnmarshaller {

	public static RenewBackupPlanResponse unmarshall(RenewBackupPlanResponse renewBackupPlanResponse, UnmarshallerContext _ctx) {
		
		renewBackupPlanResponse.setRequestId(_ctx.stringValue("RenewBackupPlanResponse.RequestId"));
		renewBackupPlanResponse.setSuccess(_ctx.booleanValue("RenewBackupPlanResponse.Success"));
		renewBackupPlanResponse.setErrCode(_ctx.stringValue("RenewBackupPlanResponse.ErrCode"));
		renewBackupPlanResponse.setErrMessage(_ctx.stringValue("RenewBackupPlanResponse.ErrMessage"));
		renewBackupPlanResponse.setHttpStatusCode(_ctx.integerValue("RenewBackupPlanResponse.HttpStatusCode"));
		renewBackupPlanResponse.setBackupPlanId(_ctx.stringValue("RenewBackupPlanResponse.BackupPlanId"));
		renewBackupPlanResponse.setOrderId(_ctx.stringValue("RenewBackupPlanResponse.OrderId"));
	 
	 	return renewBackupPlanResponse;
	}
}