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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.openanalytics_open.model.v20180619.DescribeRegionListResponse;
import com.aliyuncs.v5.openanalytics_open.model.v20180619.DescribeRegionListResponse.RegionListItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeRegionListResponseUnmarshaller {

	public static DescribeRegionListResponse unmarshall(DescribeRegionListResponse describeRegionListResponse, UnmarshallerContext _ctx) {
		
		describeRegionListResponse.setRequestId(_ctx.stringValue("DescribeRegionListResponse.RequestId"));
		describeRegionListResponse.setRegionId(_ctx.stringValue("DescribeRegionListResponse.RegionId"));

		List<RegionListItem> regionListList = new ArrayList<RegionListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionListResponse.RegionList.Length"); i++) {
			RegionListItem regionListItem = new RegionListItem();
			regionListItem.setRegionID(_ctx.stringValue("DescribeRegionListResponse.RegionList["+ i +"].regionID"));

			regionListList.add(regionListItem);
		}
		describeRegionListResponse.setRegionList(regionListList);
	 
	 	return describeRegionListResponse;
	}
}