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

package com.aliyuncs.v5.waf_openapi.transform.v20180117;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.waf_openapi.model.v20180117.DescribeRegionsResponse;
import com.aliyuncs.v5.waf_openapi.model.v20180117.DescribeRegionsResponse.Region;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));

		List<Region> regionsList = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setDisplay(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Display"));
			region.setRegion(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].Region"));

			regionsList.add(region);
		}
		describeRegionsResponse.setRegions(regionsList);
	 
	 	return describeRegionsResponse;
	}
}