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

import com.aliyuncs.v5.vpc.model.v20160428.DescribeIPv6TranslatorEntriesResponse;
import com.aliyuncs.v5.vpc.model.v20160428.DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntry;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeIPv6TranslatorEntriesResponseUnmarshaller {

	public static DescribeIPv6TranslatorEntriesResponse unmarshall(DescribeIPv6TranslatorEntriesResponse describeIPv6TranslatorEntriesResponse, UnmarshallerContext _ctx) {
		
		describeIPv6TranslatorEntriesResponse.setRequestId(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.RequestId"));
		describeIPv6TranslatorEntriesResponse.setTotalCount(_ctx.integerValue("DescribeIPv6TranslatorEntriesResponse.TotalCount"));
		describeIPv6TranslatorEntriesResponse.setPageNumber(_ctx.integerValue("DescribeIPv6TranslatorEntriesResponse.PageNumber"));
		describeIPv6TranslatorEntriesResponse.setPageSize(_ctx.integerValue("DescribeIPv6TranslatorEntriesResponse.PageSize"));

		List<Ipv6TranslatorEntry> ipv6TranslatorEntriesList = new ArrayList<Ipv6TranslatorEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries.Length"); i++) {
			Ipv6TranslatorEntry ipv6TranslatorEntry = new Ipv6TranslatorEntry();
			ipv6TranslatorEntry.setIpv6TranslatorId(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].Ipv6TranslatorId"));
			ipv6TranslatorEntry.setIpv6TranslatorEntryId(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].Ipv6TranslatorEntryId"));
			ipv6TranslatorEntry.setAllocateIpv6Addr(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].AllocateIpv6Addr"));
			ipv6TranslatorEntry.setAllocateIpv6Port(_ctx.integerValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].AllocateIpv6Port"));
			ipv6TranslatorEntry.setBackendIpv4Addr(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].BackendIpv4Addr"));
			ipv6TranslatorEntry.setBackendIpv4Port(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].BackendIpv4Port"));
			ipv6TranslatorEntry.setTransProtocol(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].TransProtocol"));
			ipv6TranslatorEntry.setEntryBandwidth(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].EntryBandwidth"));
			ipv6TranslatorEntry.setEntryDescription(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].EntryDescription"));
			ipv6TranslatorEntry.setEntryName(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].EntryName"));
			ipv6TranslatorEntry.setEntryStatus(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].EntryStatus"));
			ipv6TranslatorEntry.setAclStatus(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].AclStatus"));
			ipv6TranslatorEntry.setAclType(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].AclType"));
			ipv6TranslatorEntry.setAclId(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].AclId"));
			ipv6TranslatorEntry.setRegionId(_ctx.stringValue("DescribeIPv6TranslatorEntriesResponse.Ipv6TranslatorEntries["+ i +"].RegionId"));

			ipv6TranslatorEntriesList.add(ipv6TranslatorEntry);
		}
		describeIPv6TranslatorEntriesResponse.setIpv6TranslatorEntries(ipv6TranslatorEntriesList);
	 
	 	return describeIPv6TranslatorEntriesResponse;
	}
}