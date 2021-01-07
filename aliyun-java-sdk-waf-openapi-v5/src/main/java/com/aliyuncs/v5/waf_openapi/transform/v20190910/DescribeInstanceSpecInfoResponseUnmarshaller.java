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

package com.aliyuncs.v5.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.waf_openapi.model.v20190910.DescribeInstanceSpecInfoResponse;
import com.aliyuncs.v5.waf_openapi.model.v20190910.DescribeInstanceSpecInfoResponse.InstanceSpecInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeInstanceSpecInfoResponseUnmarshaller {

	public static DescribeInstanceSpecInfoResponse unmarshall(DescribeInstanceSpecInfoResponse describeInstanceSpecInfoResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSpecInfoResponse.setRequestId(_ctx.stringValue("DescribeInstanceSpecInfoResponse.RequestId"));
		describeInstanceSpecInfoResponse.setInstanceId(_ctx.stringValue("DescribeInstanceSpecInfoResponse.InstanceId"));
		describeInstanceSpecInfoResponse.setVersion(_ctx.stringValue("DescribeInstanceSpecInfoResponse.Version"));
		describeInstanceSpecInfoResponse.setExpireTime(_ctx.longValue("DescribeInstanceSpecInfoResponse.ExpireTime"));

		List<InstanceSpecInfo> instanceSpecInfosList = new ArrayList<InstanceSpecInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSpecInfoResponse.InstanceSpecInfos.Length"); i++) {
			InstanceSpecInfo instanceSpecInfo = new InstanceSpecInfo();
			instanceSpecInfo.setValue(_ctx.stringValue("DescribeInstanceSpecInfoResponse.InstanceSpecInfos["+ i +"].Value"));
			instanceSpecInfo.setCode(_ctx.stringValue("DescribeInstanceSpecInfoResponse.InstanceSpecInfos["+ i +"].Code"));

			instanceSpecInfosList.add(instanceSpecInfo);
		}
		describeInstanceSpecInfoResponse.setInstanceSpecInfos(instanceSpecInfosList);
	 
	 	return describeInstanceSpecInfoResponse;
	}
}