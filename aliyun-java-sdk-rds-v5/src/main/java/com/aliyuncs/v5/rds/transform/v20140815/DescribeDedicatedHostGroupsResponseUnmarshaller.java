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

import com.aliyuncs.v5.rds.model.v20140815.DescribeDedicatedHostGroupsResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeDedicatedHostGroupsResponse.DedicatedHostGroupsItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDedicatedHostGroupsResponseUnmarshaller {

	public static DescribeDedicatedHostGroupsResponse unmarshall(DescribeDedicatedHostGroupsResponse describeDedicatedHostGroupsResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostGroupsResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.RequestId"));

		List<DedicatedHostGroupsItem> dedicatedHostGroupsList = new ArrayList<DedicatedHostGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups.Length"); i++) {
			DedicatedHostGroupsItem dedicatedHostGroupsItem = new DedicatedHostGroupsItem();
			dedicatedHostGroupsItem.setDedicatedHostGroupId(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DedicatedHostGroupId"));
			dedicatedHostGroupsItem.setDedicatedHostGroupDesc(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DedicatedHostGroupDesc"));
			dedicatedHostGroupsItem.setCpuAllocationRatio(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].CpuAllocationRatio"));
			dedicatedHostGroupsItem.setMemAllocationRatio(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemAllocationRatio"));
			dedicatedHostGroupsItem.setDiskAllocationRatio(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskAllocationRatio"));
			dedicatedHostGroupsItem.setAllocationPolicy(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].AllocationPolicy"));
			dedicatedHostGroupsItem.setHostReplacePolicy(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].HostReplacePolicy"));
			dedicatedHostGroupsItem.setCreateTime(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].CreateTime"));
			dedicatedHostGroupsItem.setVPCId(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].VPCId"));
			dedicatedHostGroupsItem.setHostNumber(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].HostNumber"));
			dedicatedHostGroupsItem.setInstanceNumber(_ctx.integerValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].InstanceNumber"));
			dedicatedHostGroupsItem.setEngine(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].Engine"));
			dedicatedHostGroupsItem.setText(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].Text"));
			dedicatedHostGroupsItem.setDedicatedHostCountGroupByHostType(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DedicatedHostCountGroupByHostType"));
			dedicatedHostGroupsItem.setBastionInstanceId(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].BastionInstanceId"));
			dedicatedHostGroupsItem.setOpenPermission(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].OpenPermission"));
			dedicatedHostGroupsItem.setMemUtility(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemUtility"));
			dedicatedHostGroupsItem.setMemUsedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemUsedAmount"));
			dedicatedHostGroupsItem.setDiskUtility(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskUtility"));
			dedicatedHostGroupsItem.setDiskUsedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskUsedAmount"));
			dedicatedHostGroupsItem.setCpuAllocateRation(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].CpuAllocateRation"));
			dedicatedHostGroupsItem.setCpuAllocatedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].CpuAllocatedAmount"));
			dedicatedHostGroupsItem.setMemAllocateRation(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemAllocateRation"));
			dedicatedHostGroupsItem.setMemAllocatedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].MemAllocatedAmount"));
			dedicatedHostGroupsItem.setDiskAllocateRation(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskAllocateRation"));
			dedicatedHostGroupsItem.setDiskAllocatedAmount(_ctx.floatValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].DiskAllocatedAmount"));

			List<String> zoneIDList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].ZoneIDList.Length"); j++) {
				zoneIDList.add(_ctx.stringValue("DescribeDedicatedHostGroupsResponse.DedicatedHostGroups["+ i +"].ZoneIDList["+ j +"]"));
			}
			dedicatedHostGroupsItem.setZoneIDList(zoneIDList);

			dedicatedHostGroupsList.add(dedicatedHostGroupsItem);
		}
		describeDedicatedHostGroupsResponse.setDedicatedHostGroups(dedicatedHostGroupsList);
	 
	 	return describeDedicatedHostGroupsResponse;
	}
}