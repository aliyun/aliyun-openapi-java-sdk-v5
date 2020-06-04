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

package com.aliyuncs.v5.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.vod.model.v20170321.ListAuditSecurityIpResponse;
import com.aliyuncs.v5.vod.model.v20170321.ListAuditSecurityIpResponse.SecurityIp;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListAuditSecurityIpResponseUnmarshaller {

	public static ListAuditSecurityIpResponse unmarshall(ListAuditSecurityIpResponse listAuditSecurityIpResponse, UnmarshallerContext _ctx) {
		
		listAuditSecurityIpResponse.setRequestId(_ctx.stringValue("ListAuditSecurityIpResponse.RequestId"));

		List<SecurityIp> securityIpListList = new ArrayList<SecurityIp>();
		for (int i = 0; i < _ctx.lengthValue("ListAuditSecurityIpResponse.SecurityIpList.Length"); i++) {
			SecurityIp securityIp = new SecurityIp();
			securityIp.setSecurityGroupName(_ctx.stringValue("ListAuditSecurityIpResponse.SecurityIpList["+ i +"].SecurityGroupName"));
			securityIp.setIps(_ctx.stringValue("ListAuditSecurityIpResponse.SecurityIpList["+ i +"].Ips"));
			securityIp.setCreationTime(_ctx.stringValue("ListAuditSecurityIpResponse.SecurityIpList["+ i +"].CreationTime"));
			securityIp.setModificationTime(_ctx.stringValue("ListAuditSecurityIpResponse.SecurityIpList["+ i +"].ModificationTime"));

			securityIpListList.add(securityIp);
		}
		listAuditSecurityIpResponse.setSecurityIpList(securityIpListList);
	 
	 	return listAuditSecurityIpResponse;
	}
}