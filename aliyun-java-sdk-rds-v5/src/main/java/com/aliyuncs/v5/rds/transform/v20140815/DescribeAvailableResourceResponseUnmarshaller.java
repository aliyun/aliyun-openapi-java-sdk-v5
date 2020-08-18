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

import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableResourceResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategory;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategory.SupportedStorageType;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategory.SupportedStorageType.AvailableResource;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategory.SupportedStorageType.AvailableResource.DBInstanceStorageRange;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceResponse.RequestId"));

		List<AvailableZone> availableZonesList = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setStatus(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].Status"));
			availableZone.setNetworkTypes(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].NetworkTypes"));

			List<SupportedEngine> supportedEnginesList = new ArrayList<SupportedEngine>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines.Length"); j++) {
				SupportedEngine supportedEngine = new SupportedEngine();
				supportedEngine.setEngine(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].Engine"));

				List<SupportedEngineVersion> supportedEngineVersionsList = new ArrayList<SupportedEngineVersion>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions.Length"); k++) {
					SupportedEngineVersion supportedEngineVersion = new SupportedEngineVersion();
					supportedEngineVersion.setVersion(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].Version"));

					List<SupportedCategory> supportedCategorysList = new ArrayList<SupportedCategory>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys.Length"); l++) {
						SupportedCategory supportedCategory = new SupportedCategory();
						supportedCategory.setCategory(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].Category"));

						List<SupportedStorageType> supportedStorageTypesList = new ArrayList<SupportedStorageType>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes.Length"); m++) {
							SupportedStorageType supportedStorageType = new SupportedStorageType();
							supportedStorageType.setStorageType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes["+ m +"].StorageType"));

							List<AvailableResource> availableResourcesList = new ArrayList<AvailableResource>();
							for (int n = 0; n < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes["+ m +"].AvailableResources.Length"); n++) {
								AvailableResource availableResource = new AvailableResource();
								availableResource.setDBInstanceClass(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes["+ m +"].AvailableResources["+ n +"].DBInstanceClass"));
								availableResource.setStorageRange(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes["+ m +"].AvailableResources["+ n +"].StorageRange"));

								DBInstanceStorageRange dBInstanceStorageRange = new DBInstanceStorageRange();
								dBInstanceStorageRange.setMax(_ctx.integerValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes["+ m +"].AvailableResources["+ n +"].DBInstanceStorageRange.Max"));
								dBInstanceStorageRange.setMin(_ctx.integerValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes["+ m +"].AvailableResources["+ n +"].DBInstanceStorageRange.Min"));
								dBInstanceStorageRange.setStep(_ctx.integerValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategorys["+ l +"].SupportedStorageTypes["+ m +"].AvailableResources["+ n +"].DBInstanceStorageRange.Step"));
								availableResource.setDBInstanceStorageRange(dBInstanceStorageRange);

								availableResourcesList.add(availableResource);
							}
							supportedStorageType.setAvailableResources(availableResourcesList);

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
		describeAvailableResourceResponse.setAvailableZones(availableZonesList);
	 
	 	return describeAvailableResourceResponse;
	}
}