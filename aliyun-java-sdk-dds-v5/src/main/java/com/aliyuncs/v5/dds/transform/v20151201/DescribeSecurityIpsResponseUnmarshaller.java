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

package com.aliyuncs.v5.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dds.model.v20151201.DescribeSecurityIpsResponse;
import com.aliyuncs.v5.dds.model.v20151201.DescribeSecurityIpsResponse.SecurityIpGroup;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeSecurityIpsResponseUnmarshaller {

	public static DescribeSecurityIpsResponse unmarshall(DescribeSecurityIpsResponse describeSecurityIpsResponse, UnmarshallerContext _ctx) {
		
		describeSecurityIpsResponse.setRequestId(_ctx.stringValue("DescribeSecurityIpsResponse.RequestId"));
		describeSecurityIpsResponse.setSecurityIps(_ctx.stringValue("DescribeSecurityIpsResponse.SecurityIps"));

		List<SecurityIpGroup> securityIpGroupsList = new ArrayList<SecurityIpGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityIpsResponse.SecurityIpGroups.Length"); i++) {
			SecurityIpGroup securityIpGroup = new SecurityIpGroup();
			securityIpGroup.setSecurityIpGroupName(_ctx.stringValue("DescribeSecurityIpsResponse.SecurityIpGroups["+ i +"].SecurityIpGroupName"));
			securityIpGroup.setSecurityIpGroupAttribute(_ctx.stringValue("DescribeSecurityIpsResponse.SecurityIpGroups["+ i +"].SecurityIpGroupAttribute"));
			securityIpGroup.setSecurityIpList(_ctx.stringValue("DescribeSecurityIpsResponse.SecurityIpGroups["+ i +"].SecurityIpList"));

			securityIpGroupsList.add(securityIpGroup);
		}
		describeSecurityIpsResponse.setSecurityIpGroups(securityIpGroupsList);
	 
	 	return describeSecurityIpsResponse;
	}
}