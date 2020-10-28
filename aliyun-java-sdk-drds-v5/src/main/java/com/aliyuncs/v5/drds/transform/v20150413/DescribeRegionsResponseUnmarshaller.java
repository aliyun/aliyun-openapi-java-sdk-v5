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

package com.aliyuncs.v5.drds.transform.v20150413;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.drds.model.v20150413.DescribeRegionsResponse;
import com.aliyuncs.v5.drds.model.v20150413.DescribeRegionsResponse.DrdsRegion;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setSuccess(_ctx.booleanValue("DescribeRegionsResponse.Success"));

		List<DrdsRegion> drdsRegionsList = new ArrayList<DrdsRegion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.DrdsRegions.Length"); i++) {
			DrdsRegion drdsRegion = new DrdsRegion();
			drdsRegion.setRegionId(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].RegionId"));
			drdsRegion.setRegionName(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].RegionName"));
			drdsRegion.setZoneId(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].ZoneId"));
			drdsRegion.setZoneName(_ctx.stringValue("DescribeRegionsResponse.DrdsRegions["+ i +"].ZoneName"));

			drdsRegionsList.add(drdsRegion);
		}
		describeRegionsResponse.setDrdsRegions(drdsRegionsList);
	 
	 	return describeRegionsResponse;
	}
}