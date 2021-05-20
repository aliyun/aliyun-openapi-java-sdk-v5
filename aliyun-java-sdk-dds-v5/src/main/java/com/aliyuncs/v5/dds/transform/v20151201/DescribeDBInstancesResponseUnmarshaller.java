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

package com.aliyuncs.v5.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstancesResponse;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstancesResponse.DBInstance.MongosAttribute;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstancesResponse.DBInstance.ShardAttribute;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstancesResponse.DBInstance.Tag;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setTotalCount(_ctx.integerValue("DescribeDBInstancesResponse.TotalCount"));
		describeDBInstancesResponse.setPageSize(_ctx.integerValue("DescribeDBInstancesResponse.PageSize"));
		describeDBInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancesResponse.PageNumber"));

		List<DBInstance> dBInstancesList = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setCreationTime(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setChargeType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ChargeType"));
			dBInstance.setVpcAuthMode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].VpcAuthMode"));
			dBInstance.setNetworkType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].NetworkType"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setLastDowngradeTime(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].LastDowngradeTime"));
			dBInstance.setDestroyTime(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DestroyTime"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceStorage"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ResourceGroupId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceClass"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setReplicationFactor(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ReplicationFactor"));
			dBInstance.setKindCode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].KindCode"));

			List<Tag> tagsList = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Tags["+ j +"].Value"));

				tagsList.add(tag);
			}
			dBInstance.setTags(tagsList);

			List<MongosAttribute> mongosListList = new ArrayList<MongosAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList.Length"); j++) {
				MongosAttribute mongosAttribute = new MongosAttribute();
				mongosAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeClass"));
				mongosAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeDescription"));
				mongosAttribute.setNodeId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeId"));

				mongosListList.add(mongosAttribute);
			}
			dBInstance.setMongosList(mongosListList);

			List<ShardAttribute> shardListList = new ArrayList<ShardAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList.Length"); j++) {
				ShardAttribute shardAttribute = new ShardAttribute();
				shardAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeClass"));
				shardAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeDescription"));
				shardAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeStorage"));
				shardAttribute.setNodeId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeId"));
				shardAttribute.setReadonlyReplicas(_ctx.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].ReadonlyReplicas"));

				shardListList.add(shardAttribute);
			}
			dBInstance.setShardList(shardListList);

			dBInstancesList.add(dBInstance);
		}
		describeDBInstancesResponse.setDBInstances(dBInstancesList);
	 
	 	return describeDBInstancesResponse;
	}
}