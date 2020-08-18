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

import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableDedicatedHostZonesResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableDedicatedHostZonesResponse.DedicatedHostZones;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeAvailableDedicatedHostZonesResponseUnmarshaller {

	public static DescribeAvailableDedicatedHostZonesResponse unmarshall(DescribeAvailableDedicatedHostZonesResponse describeAvailableDedicatedHostZonesResponse, UnmarshallerContext _ctx) {
		
		describeAvailableDedicatedHostZonesResponse.setRequestId(_ctx.stringValue("DescribeAvailableDedicatedHostZonesResponse.RequestId"));

		List<DedicatedHostZones> zonesList = new ArrayList<DedicatedHostZones>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableDedicatedHostZonesResponse.Zones.Length"); i++) {
			DedicatedHostZones dedicatedHostZones = new DedicatedHostZones();
			dedicatedHostZones.setZoneId(_ctx.stringValue("DescribeAvailableDedicatedHostZonesResponse.Zones["+ i +"].ZoneId"));
			dedicatedHostZones.setDescription(_ctx.stringValue("DescribeAvailableDedicatedHostZonesResponse.Zones["+ i +"].Description"));

			zonesList.add(dedicatedHostZones);
		}
		describeAvailableDedicatedHostZonesResponse.setZones(zonesList);
	 
	 	return describeAvailableDedicatedHostZonesResponse;
	}
}