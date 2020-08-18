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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.rds.model.v20140815.DescribeDBInstanceNetInfoResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo;
import com.aliyuncs.v5.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo.DBInstanceWeight;
import com.aliyuncs.v5.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo.SecurityIPGroup;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDBInstanceNetInfoResponseUnmarshaller {

	public static DescribeDBInstanceNetInfoResponse unmarshall(DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceNetInfoResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.RequestId"));
		describeDBInstanceNetInfoResponse.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.InstanceNetworkType"));
		describeDBInstanceNetInfoResponse.setSecurityIPMode(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.SecurityIPMode"));

		List<DBInstanceNetInfo> dBInstanceNetInfosList = new ArrayList<DBInstanceNetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfo dBInstanceNetInfo = new DBInstanceNetInfo();
			dBInstanceNetInfo.setUpgradeable(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Upgradeable"));
			dBInstanceNetInfo.setExpiredTime(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ExpiredTime"));
			dBInstanceNetInfo.setConnectionString(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfo.setIPAddress(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPAddress"));
			dBInstanceNetInfo.setIPType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPType"));
			dBInstanceNetInfo.setPort(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Port"));
			dBInstanceNetInfo.setVPCId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VPCId"));
			dBInstanceNetInfo.setVSwitchId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VSwitchId"));
			dBInstanceNetInfo.setConnectionStringType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionStringType"));
			dBInstanceNetInfo.setMaxDelayTime(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].MaxDelayTime"));
			dBInstanceNetInfo.setDistributionType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DistributionType"));

			List<SecurityIPGroup> securityIPGroupsList = new ArrayList<SecurityIPGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups.Length"); j++) {
				SecurityIPGroup securityIPGroup = new SecurityIPGroup();
				securityIPGroup.setSecurityIPGroupName(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPGroupName"));
				securityIPGroup.setSecurityIPs(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPs"));

				securityIPGroupsList.add(securityIPGroup);
			}
			dBInstanceNetInfo.setSecurityIPGroups(securityIPGroupsList);

			List<DBInstanceWeight> dBInstanceWeightsList = new ArrayList<DBInstanceWeight>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights.Length"); j++) {
				DBInstanceWeight dBInstanceWeight = new DBInstanceWeight();
				dBInstanceWeight.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceId"));
				dBInstanceWeight.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceType"));
				dBInstanceWeight.setAvailability(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Availability"));
				dBInstanceWeight.setWeight(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Weight"));

				dBInstanceWeightsList.add(dBInstanceWeight);
			}
			dBInstanceNetInfo.setDBInstanceWeights(dBInstanceWeightsList);

			dBInstanceNetInfosList.add(dBInstanceNetInfo);
		}
		describeDBInstanceNetInfoResponse.setDBInstanceNetInfos(dBInstanceNetInfosList);
	 
	 	return describeDBInstanceNetInfoResponse;
	}
}