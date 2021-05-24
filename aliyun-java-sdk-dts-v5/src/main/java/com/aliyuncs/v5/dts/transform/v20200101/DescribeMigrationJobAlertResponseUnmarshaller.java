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

import com.aliyuncs.v5.dts.model.v20200101.DescribeMigrationJobAlertResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeMigrationJobAlertResponseUnmarshaller {

	public static DescribeMigrationJobAlertResponse unmarshall(DescribeMigrationJobAlertResponse describeMigrationJobAlertResponse, UnmarshallerContext _ctx) {
		
		describeMigrationJobAlertResponse.setRequestId(_ctx.stringValue("DescribeMigrationJobAlertResponse.RequestId"));
		describeMigrationJobAlertResponse.setDelayAlertPhone(_ctx.stringValue("DescribeMigrationJobAlertResponse.DelayAlertPhone"));
		describeMigrationJobAlertResponse.setDelayAlertStatus(_ctx.stringValue("DescribeMigrationJobAlertResponse.DelayAlertStatus"));
		describeMigrationJobAlertResponse.setDelayOverSeconds(_ctx.stringValue("DescribeMigrationJobAlertResponse.DelayOverSeconds"));
		describeMigrationJobAlertResponse.setErrCode(_ctx.stringValue("DescribeMigrationJobAlertResponse.ErrCode"));
		describeMigrationJobAlertResponse.setErrMessage(_ctx.stringValue("DescribeMigrationJobAlertResponse.ErrMessage"));
		describeMigrationJobAlertResponse.setErrorAlertPhone(_ctx.stringValue("DescribeMigrationJobAlertResponse.ErrorAlertPhone"));
		describeMigrationJobAlertResponse.setErrorAlertStatus(_ctx.stringValue("DescribeMigrationJobAlertResponse.ErrorAlertStatus"));
		describeMigrationJobAlertResponse.setMigrationJobId(_ctx.stringValue("DescribeMigrationJobAlertResponse.MigrationJobId"));
		describeMigrationJobAlertResponse.setMigrationJobName(_ctx.stringValue("DescribeMigrationJobAlertResponse.MigrationJobName"));
		describeMigrationJobAlertResponse.setSuccess(_ctx.stringValue("DescribeMigrationJobAlertResponse.Success"));
	 
	 	return describeMigrationJobAlertResponse;
	}
}