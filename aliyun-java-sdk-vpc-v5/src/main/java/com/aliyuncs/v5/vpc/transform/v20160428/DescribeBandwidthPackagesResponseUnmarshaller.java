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

import com.aliyuncs.v5.vpc.model.v20160428.DescribeBandwidthPackagesResponse;
import com.aliyuncs.v5.vpc.model.v20160428.DescribeBandwidthPackagesResponse.BandwidthPackage;
import com.aliyuncs.v5.vpc.model.v20160428.DescribeBandwidthPackagesResponse.BandwidthPackage.PublicIpAddresse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeBandwidthPackagesResponseUnmarshaller {

	public static DescribeBandwidthPackagesResponse unmarshall(DescribeBandwidthPackagesResponse describeBandwidthPackagesResponse, UnmarshallerContext _ctx) {
		
		describeBandwidthPackagesResponse.setRequestId(_ctx.stringValue("DescribeBandwidthPackagesResponse.RequestId"));
		describeBandwidthPackagesResponse.setTotalCount(_ctx.integerValue("DescribeBandwidthPackagesResponse.TotalCount"));
		describeBandwidthPackagesResponse.setPageNumber(_ctx.integerValue("DescribeBandwidthPackagesResponse.PageNumber"));
		describeBandwidthPackagesResponse.setPageSize(_ctx.integerValue("DescribeBandwidthPackagesResponse.PageSize"));

		List<BandwidthPackage> bandwidthPackagesList = new ArrayList<BandwidthPackage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBandwidthPackagesResponse.BandwidthPackages.Length"); i++) {
			BandwidthPackage bandwidthPackage = new BandwidthPackage();
			bandwidthPackage.setBandwidthPackageId(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].BandwidthPackageId"));
			bandwidthPackage.setRegionId(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].RegionId"));
			bandwidthPackage.setName(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].Name"));
			bandwidthPackage.setDescription(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].Description"));
			bandwidthPackage.setZoneId(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].ZoneId"));
			bandwidthPackage.setNatGatewayId(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].NatGatewayId"));
			bandwidthPackage.setBandwidth(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].Bandwidth"));
			bandwidthPackage.setInstanceChargeType(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].InstanceChargeType"));
			bandwidthPackage.setInternetChargeType(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].InternetChargeType"));
			bandwidthPackage.setBusinessStatus(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].BusinessStatus"));
			bandwidthPackage.setIpCount(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].IpCount"));
			bandwidthPackage.setCreationTime(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].CreationTime"));
			bandwidthPackage.setStatus(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].Status"));
			bandwidthPackage.setISP(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].ISP"));

			List<PublicIpAddresse> publicIpAddressesList = new ArrayList<PublicIpAddresse>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].PublicIpAddresses.Length"); j++) {
				PublicIpAddresse publicIpAddresse = new PublicIpAddresse();
				publicIpAddresse.setAllocationId(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].AllocationId"));
				publicIpAddresse.setIpAddress(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].IpAddress"));
				publicIpAddresse.setUsingStatus(_ctx.stringValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].UsingStatus"));
				publicIpAddresse.setApAccessEnabled(_ctx.booleanValue("DescribeBandwidthPackagesResponse.BandwidthPackages["+ i +"].PublicIpAddresses["+ j +"].ApAccessEnabled"));

				publicIpAddressesList.add(publicIpAddresse);
			}
			bandwidthPackage.setPublicIpAddresses(publicIpAddressesList);

			bandwidthPackagesList.add(bandwidthPackage);
		}
		describeBandwidthPackagesResponse.setBandwidthPackages(bandwidthPackagesList);
	 
	 	return describeBandwidthPackagesResponse;
	}
}