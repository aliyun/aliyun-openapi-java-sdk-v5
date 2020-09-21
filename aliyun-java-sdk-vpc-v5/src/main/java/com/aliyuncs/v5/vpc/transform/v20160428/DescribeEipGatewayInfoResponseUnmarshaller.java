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

package com.aliyuncs.v5.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.vpc.model.v20160428.DescribeEipGatewayInfoResponse;
import com.aliyuncs.v5.vpc.model.v20160428.DescribeEipGatewayInfoResponse.EipInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeEipGatewayInfoResponseUnmarshaller {

	public static DescribeEipGatewayInfoResponse unmarshall(DescribeEipGatewayInfoResponse describeEipGatewayInfoResponse, UnmarshallerContext _ctx) {
		
		describeEipGatewayInfoResponse.setRequestId(_ctx.stringValue("DescribeEipGatewayInfoResponse.RequestId"));
		describeEipGatewayInfoResponse.setCode(_ctx.stringValue("DescribeEipGatewayInfoResponse.Code"));
		describeEipGatewayInfoResponse.setMessage(_ctx.stringValue("DescribeEipGatewayInfoResponse.Message"));

		List<EipInfo> eipInfosList = new ArrayList<EipInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEipGatewayInfoResponse.EipInfos.Length"); i++) {
			EipInfo eipInfo = new EipInfo();
			eipInfo.setIp(_ctx.stringValue("DescribeEipGatewayInfoResponse.EipInfos["+ i +"].Ip"));
			eipInfo.setIpGw(_ctx.stringValue("DescribeEipGatewayInfoResponse.EipInfos["+ i +"].IpGw"));
			eipInfo.setIpMask(_ctx.stringValue("DescribeEipGatewayInfoResponse.EipInfos["+ i +"].IpMask"));

			eipInfosList.add(eipInfo);
		}
		describeEipGatewayInfoResponse.setEipInfos(eipInfosList);
	 
	 	return describeEipGatewayInfoResponse;
	}
}