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

import com.aliyuncs.v5.dbs.model.v20190306.ModifyBackupSourceEndpointResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifyBackupSourceEndpointResponseUnmarshaller {

	public static ModifyBackupSourceEndpointResponse unmarshall(ModifyBackupSourceEndpointResponse modifyBackupSourceEndpointResponse, UnmarshallerContext _ctx) {
		
		modifyBackupSourceEndpointResponse.setRequestId(_ctx.stringValue("ModifyBackupSourceEndpointResponse.RequestId"));
		modifyBackupSourceEndpointResponse.setSuccess(_ctx.booleanValue("ModifyBackupSourceEndpointResponse.Success"));
		modifyBackupSourceEndpointResponse.setErrCode(_ctx.stringValue("ModifyBackupSourceEndpointResponse.ErrCode"));
		modifyBackupSourceEndpointResponse.setErrMessage(_ctx.stringValue("ModifyBackupSourceEndpointResponse.ErrMessage"));
		modifyBackupSourceEndpointResponse.setHttpStatusCode(_ctx.integerValue("ModifyBackupSourceEndpointResponse.HttpStatusCode"));
		modifyBackupSourceEndpointResponse.setBackupPlanId(_ctx.stringValue("ModifyBackupSourceEndpointResponse.BackupPlanId"));
		modifyBackupSourceEndpointResponse.setNeedPrecheck(_ctx.booleanValue("ModifyBackupSourceEndpointResponse.NeedPrecheck"));
	 
	 	return modifyBackupSourceEndpointResponse;
	}
}