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

import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.ConfigserverAttribute;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.MongosAttribute;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.ReplicaSet;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.ShardAttribute;
import com.aliyuncs.v5.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.Tag;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstance> dBInstancesList = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setReplacateId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplacateId"));
			dBInstance.setChargeType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ChargeType"));
			dBInstance.setVpcAuthMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VpcAuthMode"));
			dBInstance.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkType"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxIOPS"));
			dBInstance.setVPCCloudInstanceIds(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCCloudInstanceIds"));
			dBInstance.setProtocolType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ProtocolType"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CurrentKernelVersion"));
			dBInstance.setDBInstanceReleaseProtection(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceReleaseProtection"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainStartTime"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setLastDowngradeTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LastDowngradeTime"));
			dBInstance.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainEndTime"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCId"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStorage"));
			dBInstance.setReplicaSetName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSetName"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VSwitchId"));
			dBInstance.setStorageEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].StorageEngine"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ResourceGroupId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxConnections"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceClass"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setReadonlyReplicas(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReadonlyReplicas"));
			dBInstance.setReplicationFactor(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicationFactor"));
			dBInstance.setKindCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].KindCode"));
			dBInstance.setCapacityUnit(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CapacityUnit"));

			List<ReplicaSet> replicaSetsList = new ArrayList<ReplicaSet>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets.Length"); j++) {
				ReplicaSet replicaSet = new ReplicaSet();
				replicaSet.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VSwitchId"));
				replicaSet.setConnectionPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ConnectionPort"));
				replicaSet.setReplicaSetRole(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ReplicaSetRole"));
				replicaSet.setConnectionDomain(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ConnectionDomain"));
				replicaSet.setVPCCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VPCCloudInstanceId"));
				replicaSet.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].NetworkType"));
				replicaSet.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VPCId"));

				replicaSetsList.add(replicaSet);
			}
			dBInstance.setReplicaSets(replicaSetsList);

			List<Tag> tagsList = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags["+ j +"].Value"));

				tagsList.add(tag);
			}
			dBInstance.setTags(tagsList);

			List<MongosAttribute> mongosListList = new ArrayList<MongosAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList.Length"); j++) {
				MongosAttribute mongosAttribute = new MongosAttribute();
				mongosAttribute.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VpcCloudInstanceId"));
				mongosAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxIOPS"));
				mongosAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VSwitchId"));
				mongosAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeClass"));
				mongosAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxConnections"));
				mongosAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].Port"));
				mongosAttribute.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VPCId"));
				mongosAttribute.setConnectSting(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].ConnectSting"));
				mongosAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeDescription"));
				mongosAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeId"));
				mongosAttribute.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].Status"));

				mongosListList.add(mongosAttribute);
			}
			dBInstance.setMongosList(mongosListList);

			List<ShardAttribute> shardListList = new ArrayList<ShardAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList.Length"); j++) {
				ShardAttribute shardAttribute = new ShardAttribute();
				shardAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxIOPS"));
				shardAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].ConnectString"));
				shardAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeClass"));
				shardAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxConnections"));
				shardAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].Port"));
				shardAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeDescription"));
				shardAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeId"));
				shardAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeStorage"));
				shardAttribute.setReadonlyReplicas(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].ReadonlyReplicas"));
				shardAttribute.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].Status"));

				shardListList.add(shardAttribute);
			}
			dBInstance.setShardList(shardListList);

			List<ConfigserverAttribute> configserverListList = new ArrayList<ConfigserverAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList.Length"); j++) {
				ConfigserverAttribute configserverAttribute = new ConfigserverAttribute();
				configserverAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].MaxIOPS"));
				configserverAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].ConnectString"));
				configserverAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeClass"));
				configserverAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].MaxConnections"));
				configserverAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].Port"));
				configserverAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeDescription"));
				configserverAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeId"));
				configserverAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeStorage"));
				configserverAttribute.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].Status"));

				configserverListList.add(configserverAttribute);
			}
			dBInstance.setConfigserverList(configserverListList);

			dBInstancesList.add(dBInstance);
		}
		describeDBInstanceAttributeResponse.setDBInstances(dBInstancesList);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}