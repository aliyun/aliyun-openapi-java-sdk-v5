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

package com.aliyuncs.v5.openanalytics_open.transform.v20180619;

import com.aliyuncs.v5.openanalytics_open.model.v20180619.DescribeCapacityResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeCapacityResponseUnmarshaller {

	public static DescribeCapacityResponse unmarshall(DescribeCapacityResponse describeCapacityResponse, UnmarshallerContext _ctx) {
		
		describeCapacityResponse.setRequestId(_ctx.stringValue("DescribeCapacityResponse.RequestId"));
		describeCapacityResponse.setRegionId(_ctx.stringValue("DescribeCapacityResponse.RegionId"));
		describeCapacityResponse.setStorage(_ctx.integerValue("DescribeCapacityResponse.Storage"));
	 
	 	return describeCapacityResponse;
	}
}