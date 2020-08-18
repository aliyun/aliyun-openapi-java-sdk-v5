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

import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableZonesResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableZonesResponse.AvailableZone;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableZonesResponse.AvailableZone.SupportedEngine;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableZonesResponse.AvailableZone.SupportedEngine.SupportedEngineVersion;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableZonesResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategory;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableZonesResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategory.SupportedStorageType;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeAvailableZonesResponseUnmarshaller {

	public static DescribeAvailableZonesResponse unmarshall(DescribeAvailableZonesResponse describeAvailableZonesResponse, UnmarshallerContext _ctx) {
		
		describeAvailableZonesResponse.setRequestId(_ctx.stringValue("DescribeAvailableZonesResponse.RequestId"));

		List<AvailableZone> availableZonesList = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableZonesResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setNetworkTypes(_ctx.stringValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].NetworkTypes"));

			List<SupportedEngine> supportedEnginesList = new ArrayList<SupportedEngine>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].SupportedEngines.Length"); j++) {
				SupportedEngine supportedEngine = new SupportedEngine();
				supportedEngine.setEngine(_ctx.stringValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].Engine"));

				List<SupportedEngineVersion> supportedEngineVersionsList = new ArrayList<SupportedEngineVersion>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions.Length"); k++) {
					SupportedEngineVersion supportedEngineVersion = new SupportedEngineVersion();
					supportedEngineVersion.setVersion(_ctx.stringValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].Version"));

					List<SupportedCategory> supportedCategorysList = new ArrayList<SupportedCategory>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys.Length"); l++) {
						SupportedCategory supportedCategory = new SupportedCategory();
						supportedCategory.setCategory(_ctx.stringValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].Category"));

						List<SupportedStorageType> supportedStorageTypesList = new ArrayList<SupportedStorageType>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes.Length"); m++) {
							SupportedStorageType supportedStorageType = new SupportedStorageType();
							supportedStorageType.setStorageType(_ctx.stringValue("DescribeAvailableZonesResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes["+ m +"].StorageType"));

							supportedStorageTypesList.add(supportedStorageType);
						}
						supportedCategory.setSupportedStorageTypes(supportedStorageTypesList);

						supportedCategorysList.add(supportedCategory);
					}
					supportedEngineVersion.setSupportedCategorys(supportedCategorysList);

					supportedEngineVersionsList.add(supportedEngineVersion);
				}
				supportedEngine.setSupportedEngineVersions(supportedEngineVersionsList);

				supportedEnginesList.add(supportedEngine);
			}
			availableZone.setSupportedEngines(supportedEnginesList);

			availableZonesList.add(availableZone);
		}
		describeAvailableZonesResponse.setAvailableZones(availableZonesList);
	 
	 	return describeAvailableZonesResponse;
	}
}