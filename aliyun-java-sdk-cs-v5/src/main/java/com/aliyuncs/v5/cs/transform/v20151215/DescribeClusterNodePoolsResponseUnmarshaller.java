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

package com.aliyuncs.v5.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Auto_scaling;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Kubernetes_config;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Kubernetes_config.LabelsItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Kubernetes_config.TaintsItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Nodepool_info;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Scaling_group;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Scaling_group.Data_disksItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Scaling_group.TagsItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Status;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolsResponse.NodepoolsItem.Tee_config;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeClusterNodePoolsResponseUnmarshaller {

	public static DescribeClusterNodePoolsResponse unmarshall(DescribeClusterNodePoolsResponse describeClusterNodePoolsResponse, UnmarshallerContext _ctx) {
		

		List<NodepoolsItem> nodepoolsList = new ArrayList<NodepoolsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools.Length"); i++) {
			NodepoolsItem nodepoolsItem = new NodepoolsItem();

			Tee_config tee_config = new Tee_config();
			tee_config.setTee_enable(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].tee_config.tee_enable"));
			nodepoolsItem.setTee_config(tee_config);

			Scaling_group scaling_group = new Scaling_group();
			scaling_group.setScaling_group_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.scaling_group_id"));
			scaling_group.setPeriod(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.period"));
			scaling_group.setAuto_renew_period(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.auto_renew_period"));
			scaling_group.setPeriod_unit(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.period_unit"));
			scaling_group.setSecurity_group_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.security_group_id"));
			scaling_group.setMulti_az_policy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.multi_az_policy"));
			scaling_group.setSystem_disk_size(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.system_disk_size"));
			scaling_group.setPlatform(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.platform"));
			scaling_group.setWorker_hpc_cluster_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.worker_hpc_cluster_id"));
			scaling_group.setRam_policy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.ram_policy"));
			scaling_group.setInstance_charge_type(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.instance_charge_type"));
			scaling_group.setAuto_renew(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.auto_renew"));
			scaling_group.setSystem_disk_category(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.system_disk_category"));
			scaling_group.setImage_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.image_id"));
			scaling_group.setScaling_policy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.scaling_policy"));

			List<String> instance_types = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.instance_types.Length"); j++) {
				instance_types.add(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.instance_types["+ j +"]"));
			}
			scaling_group.setInstance_types(instance_types);

			List<String> rds_instances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.rds_instances.Length"); j++) {
				rds_instances.add(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.rds_instances["+ j +"]"));
			}
			scaling_group.setRds_instances(rds_instances);

			List<String> vswitch_ids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.vswitch_ids.Length"); j++) {
				vswitch_ids.add(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.vswitch_ids["+ j +"]"));
			}
			scaling_group.setVswitch_ids(vswitch_ids);

			List<Data_disksItem> data_disksList = new ArrayList<Data_disksItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks.Length"); j++) {
				Data_disksItem data_disksItem = new Data_disksItem();
				data_disksItem.setSize(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks["+ j +"].size"));
				data_disksItem.setEncrypted(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks["+ j +"].encrypted"));
				data_disksItem.setCategory(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.data_disks["+ j +"].category"));

				data_disksList.add(data_disksItem);
			}
			scaling_group.setData_disks(data_disksList);

			List<TagsItem> tagsList = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.tags["+ j +"].value"));
				tagsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].scaling_group.tags["+ j +"].key"));

				tagsList.add(tagsItem);
			}
			scaling_group.setTags(tagsList);
			nodepoolsItem.setScaling_group(scaling_group);

			Kubernetes_config kubernetes_config = new Kubernetes_config();
			kubernetes_config.setRuntime_version(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.runtime_version"));
			kubernetes_config.setCpu_policy(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.cpu_policy"));
			kubernetes_config.setCms_enabled(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.cms_enabled"));
			kubernetes_config.setRuntime(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.runtime"));
			kubernetes_config.setOverwrite_hostname(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.overwrite_hostname"));
			kubernetes_config.setUser_data(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.user_data"));
			kubernetes_config.setNode_name_mode(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.node_name_mode"));

			List<TaintsItem> taintsList = new ArrayList<TaintsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.taints.Length"); j++) {
				TaintsItem taintsItem = new TaintsItem();
				taintsItem.setEffect(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.taints["+ j +"].effect"));
				taintsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.taints["+ j +"].value"));
				taintsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.taints["+ j +"].key"));

				taintsList.add(taintsItem);
			}
			kubernetes_config.setTaints(taintsList);

			List<LabelsItem> labelsList = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.labels["+ j +"].value"));
				labelsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].kubernetes_config.labels["+ j +"].key"));

				labelsList.add(labelsItem);
			}
			kubernetes_config.setLabels(labelsList);
			nodepoolsItem.setKubernetes_config(kubernetes_config);

			Auto_scaling auto_scaling = new Auto_scaling();
			auto_scaling.setHealth_check_type(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.health_check_type"));
			auto_scaling.setEip_internet_charge_type(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.eip_internet_charge_type"));
			auto_scaling.setEnable(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.enable"));
			auto_scaling.setMin_instances(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.min_instances"));
			auto_scaling.setMax_instances(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.max_instances"));
			auto_scaling.setType(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.type"));
			auto_scaling.setEip_bandwidth(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].auto_scaling.eip_bandwidth"));
			nodepoolsItem.setAuto_scaling(auto_scaling);

			Nodepool_info nodepool_info = new Nodepool_info();
			nodepool_info.setResource_group_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.resource_group_id"));
			nodepool_info.setCreated(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.created"));
			nodepool_info.setRegion_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.region_id"));
			nodepool_info.setName(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.name"));
			nodepool_info.setType(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.type"));
			nodepool_info.setIs_default(_ctx.booleanValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.is_default"));
			nodepool_info.setUpdated(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.updated"));
			nodepool_info.setNodepool_id(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].nodepool_info.nodepool_id"));
			nodepoolsItem.setNodepool_info(nodepool_info);

			Status status = new Status();
			status.setServing_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.serving_nodes"));
			status.setTotal_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.total_nodes"));
			status.setState(_ctx.stringValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.state"));
			status.setRemoving_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.removing_nodes"));
			status.setOffline_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.offline_nodes"));
			status.setInitial_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.initial_nodes"));
			status.setFailed_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.failed_nodes"));
			status.setHealthy_nodes(_ctx.longValue("DescribeClusterNodePoolsResponse.nodepools["+ i +"].status.healthy_nodes"));
			nodepoolsItem.setStatus(status);

			nodepoolsList.add(nodepoolsItem);
		}
		describeClusterNodePoolsResponse.setNodepools(nodepoolsList);
	 
	 	return describeClusterNodePoolsResponse;
	}
}