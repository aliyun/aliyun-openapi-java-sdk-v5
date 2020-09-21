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

import com.aliyuncs.v5.vpc.model.v20160428.CreateNetworkAclResponse;
import com.aliyuncs.v5.vpc.model.v20160428.CreateNetworkAclResponse.NetworkAclAttribute;
import com.aliyuncs.v5.vpc.model.v20160428.CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntry;
import com.aliyuncs.v5.vpc.model.v20160428.CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntry;
import com.aliyuncs.v5.vpc.model.v20160428.CreateNetworkAclResponse.NetworkAclAttribute.Resource;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateNetworkAclResponseUnmarshaller {

	public static CreateNetworkAclResponse unmarshall(CreateNetworkAclResponse createNetworkAclResponse, UnmarshallerContext _ctx) {
		
		createNetworkAclResponse.setRequestId(_ctx.stringValue("CreateNetworkAclResponse.RequestId"));
		createNetworkAclResponse.setNetworkAclId(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclId"));

		NetworkAclAttribute networkAclAttribute = new NetworkAclAttribute();
		networkAclAttribute.setNetworkAclId(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.NetworkAclId"));
		networkAclAttribute.setRegionId(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.RegionId"));
		networkAclAttribute.setNetworkAclName(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.NetworkAclName"));
		networkAclAttribute.setDescription(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.Description"));
		networkAclAttribute.setVpcId(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.VpcId"));
		networkAclAttribute.setCreationTime(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.CreationTime"));
		networkAclAttribute.setStatus(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.Status"));

		List<IngressAclEntry> ingressAclEntriesList = new ArrayList<IngressAclEntry>();
		for (int i = 0; i < _ctx.lengthValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries.Length"); i++) {
			IngressAclEntry ingressAclEntry = new IngressAclEntry();
			ingressAclEntry.setNetworkAclEntryId(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].NetworkAclEntryId"));
			ingressAclEntry.setPolicy(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].Policy"));
			ingressAclEntry.setBizProtocol(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].Protocol"));
			ingressAclEntry.setSourceCidrIp(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].SourceCidrIp"));
			ingressAclEntry.setPort(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].Port"));
			ingressAclEntry.setEntryType(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].EntryType"));
			ingressAclEntry.setNetworkAclEntryName(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].NetworkAclEntryName"));
			ingressAclEntry.setDescription(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].Description"));

			ingressAclEntriesList.add(ingressAclEntry);
		}
		networkAclAttribute.setIngressAclEntries(ingressAclEntriesList);

		List<EgressAclEntry> egressAclEntriesList = new ArrayList<EgressAclEntry>();
		for (int i = 0; i < _ctx.lengthValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries.Length"); i++) {
			EgressAclEntry egressAclEntry = new EgressAclEntry();
			egressAclEntry.setNetworkAclEntryId(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].NetworkAclEntryId"));
			egressAclEntry.setPolicy(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].Policy"));
			egressAclEntry.setBizProtocol(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].Protocol"));
			egressAclEntry.setDestinationCidrIp(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].DestinationCidrIp"));
			egressAclEntry.setPort(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].Port"));
			egressAclEntry.setEntryType(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].EntryType"));
			egressAclEntry.setDescription(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].Description"));
			egressAclEntry.setNetworkAclEntryName(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].NetworkAclEntryName"));

			egressAclEntriesList.add(egressAclEntry);
		}
		networkAclAttribute.setEgressAclEntries(egressAclEntriesList);

		List<Resource> resourcesList = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("CreateNetworkAclResponse.NetworkAclAttribute.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceId(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.Resources["+ i +"].ResourceId"));
			resource.setResourceType(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.Resources["+ i +"].ResourceType"));
			resource.setStatus(_ctx.stringValue("CreateNetworkAclResponse.NetworkAclAttribute.Resources["+ i +"].Status"));

			resourcesList.add(resource);
		}
		networkAclAttribute.setResources(resourcesList);
		createNetworkAclResponse.setNetworkAclAttribute(networkAclAttribute);
	 
	 	return createNetworkAclResponse;
	}
}