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

import com.aliyuncs.v5.rds.model.v20140815.ModifySecurityGroupConfigurationResponse;
import com.aliyuncs.v5.rds.model.v20140815.ModifySecurityGroupConfigurationResponse.EcsSecurityGroupRelation;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifySecurityGroupConfigurationResponseUnmarshaller {

	public static ModifySecurityGroupConfigurationResponse unmarshall(ModifySecurityGroupConfigurationResponse modifySecurityGroupConfigurationResponse, UnmarshallerContext _ctx) {
		
		modifySecurityGroupConfigurationResponse.setRequestId(_ctx.stringValue("ModifySecurityGroupConfigurationResponse.RequestId"));
		modifySecurityGroupConfigurationResponse.setDBInstanceName(_ctx.stringValue("ModifySecurityGroupConfigurationResponse.DBInstanceName"));

		List<EcsSecurityGroupRelation> itemsList = new ArrayList<EcsSecurityGroupRelation>();
		for (int i = 0; i < _ctx.lengthValue("ModifySecurityGroupConfigurationResponse.Items.Length"); i++) {
			EcsSecurityGroupRelation ecsSecurityGroupRelation = new EcsSecurityGroupRelation();
			ecsSecurityGroupRelation.setRegionId(_ctx.stringValue("ModifySecurityGroupConfigurationResponse.Items["+ i +"].RegionId"));
			ecsSecurityGroupRelation.setSecurityGroupId(_ctx.stringValue("ModifySecurityGroupConfigurationResponse.Items["+ i +"].SecurityGroupId"));
			ecsSecurityGroupRelation.setNetworkType(_ctx.stringValue("ModifySecurityGroupConfigurationResponse.Items["+ i +"].NetworkType"));

			itemsList.add(ecsSecurityGroupRelation);
		}
		modifySecurityGroupConfigurationResponse.setItems(itemsList);
	 
	 	return modifySecurityGroupConfigurationResponse;
	}
}