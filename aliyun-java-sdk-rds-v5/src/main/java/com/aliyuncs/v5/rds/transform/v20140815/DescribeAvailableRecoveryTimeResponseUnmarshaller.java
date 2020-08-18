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

package com.aliyuncs.v5.rds.transform.v20140815;

import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableRecoveryTimeResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeAvailableRecoveryTimeResponseUnmarshaller {

	public static DescribeAvailableRecoveryTimeResponse unmarshall(DescribeAvailableRecoveryTimeResponse describeAvailableRecoveryTimeResponse, UnmarshallerContext _ctx) {
		
		describeAvailableRecoveryTimeResponse.setRequestId(_ctx.stringValue("DescribeAvailableRecoveryTimeResponse.RequestId"));
		describeAvailableRecoveryTimeResponse.setRecoveryBeginTime(_ctx.stringValue("DescribeAvailableRecoveryTimeResponse.RecoveryBeginTime"));
		describeAvailableRecoveryTimeResponse.setRecoveryEndTime(_ctx.stringValue("DescribeAvailableRecoveryTimeResponse.RecoveryEndTime"));
		describeAvailableRecoveryTimeResponse.setDBInstanceId(_ctx.stringValue("DescribeAvailableRecoveryTimeResponse.DBInstanceId"));
		describeAvailableRecoveryTimeResponse.setRegionId(_ctx.stringValue("DescribeAvailableRecoveryTimeResponse.RegionId"));
		describeAvailableRecoveryTimeResponse.setCrossBackupId(_ctx.integerValue("DescribeAvailableRecoveryTimeResponse.CrossBackupId"));
	 
	 	return describeAvailableRecoveryTimeResponse;
	}
}