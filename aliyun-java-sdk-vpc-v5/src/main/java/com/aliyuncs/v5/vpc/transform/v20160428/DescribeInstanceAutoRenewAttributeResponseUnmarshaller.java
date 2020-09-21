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

import com.aliyuncs.v5.vpc.model.v20160428.DescribeInstanceAutoRenewAttributeResponse;
import com.aliyuncs.v5.vpc.model.v20160428.DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttribute;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeInstanceAutoRenewAttributeResponseUnmarshaller {

	public static DescribeInstanceAutoRenewAttributeResponse unmarshall(DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAutoRenewAttributeResponse.setRequestId(_ctx.stringValue("DescribeInstanceAutoRenewAttributeResponse.RequestId"));
		describeInstanceAutoRenewAttributeResponse.setTotalCount(_ctx.stringValue("DescribeInstanceAutoRenewAttributeResponse.TotalCount"));
		describeInstanceAutoRenewAttributeResponse.setPageSize(_ctx.stringValue("DescribeInstanceAutoRenewAttributeResponse.PageSize"));
		describeInstanceAutoRenewAttributeResponse.setPageNumber(_ctx.stringValue("DescribeInstanceAutoRenewAttributeResponse.PageNumber"));

		List<InstanceRenewAttribute> instanceRenewAttributesList = new ArrayList<InstanceRenewAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes.Length"); i++) {
			InstanceRenewAttribute instanceRenewAttribute = new InstanceRenewAttribute();
			instanceRenewAttribute.setInstanceId(_ctx.stringValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].InstanceId"));
			instanceRenewAttribute.setRenewalStatus(_ctx.stringValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].RenewalStatus"));
			instanceRenewAttribute.setDuration(_ctx.integerValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].Duration"));
			instanceRenewAttribute.setPricingCycle(_ctx.stringValue("DescribeInstanceAutoRenewAttributeResponse.InstanceRenewAttributes["+ i +"].PricingCycle"));

			instanceRenewAttributesList.add(instanceRenewAttribute);
		}
		describeInstanceAutoRenewAttributeResponse.setInstanceRenewAttributes(instanceRenewAttributesList);
	 
	 	return describeInstanceAutoRenewAttributeResponse;
	}
}