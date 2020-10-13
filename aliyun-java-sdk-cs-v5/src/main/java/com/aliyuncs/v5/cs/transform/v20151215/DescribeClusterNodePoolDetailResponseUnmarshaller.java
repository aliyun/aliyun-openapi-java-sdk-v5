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

import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Auto_scaling;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Kubernetes_config;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Kubernetes_config.LabelsItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Kubernetes_config.TaintsItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Nodepool_info;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Scaling_group;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Scaling_group.Data_disk;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Scaling_group.TagsItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Status;
import com.aliyuncs.v5.cs.model.v20151215.DescribeClusterNodePoolDetailResponse.Tee_config;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeClusterNodePoolDetailResponseUnmarshaller {

	public static DescribeClusterNodePoolDetailResponse unmarshall(DescribeClusterNodePoolDetailResponse describeClusterNodePoolDetailResponse, UnmarshallerContext _ctx) {
		

		Tee_config tee_config = new Tee_config();
		tee_config.setTee_enable(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.tee_config.tee_enable"));
		describeClusterNodePoolDetailResponse.setTee_config(tee_config);

		Scaling_group scaling_group = new Scaling_group();
		scaling_group.setScaling_group_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.scaling_group_id"));
		scaling_group.setPeriod(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.period"));
		scaling_group.setAuto_renew_period(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.auto_renew_period"));
		scaling_group.setPeriod_unit(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.period_unit"));
		scaling_group.setSecurity_group_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.security_group_id"));
		scaling_group.setMulti_az_policy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.multi_az_policy"));
		scaling_group.setSystem_disk_size(_ctx.longValue("DescribeClusterNodePoolDetailResponse.scaling_group.system_disk_size"));
		scaling_group.setPlatform(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.platform"));
		scaling_group.setRam_policy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.ram_policy"));
		scaling_group.setInstance_charge_type(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.instance_charge_type"));
		scaling_group.setAuto_renew(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.scaling_group.auto_renew"));
		scaling_group.setSystem_disk_category(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.system_disk_category"));
		scaling_group.setImage_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.image_id"));
		scaling_group.setScaling_policy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.scaling_policy"));

		List<String> instance_types = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.instance_types.Length"); i++) {
			instance_types.add(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.instance_types["+ i +"]"));
		}
		scaling_group.setInstance_types(instance_types);

		List<String> rds_instances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.rds_instances.Length"); i++) {
			rds_instances.add(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.rds_instances["+ i +"]"));
		}
		scaling_group.setRds_instances(rds_instances);

		List<String> vswitch_ids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.vswitch_ids.Length"); i++) {
			vswitch_ids.add(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.vswitch_ids["+ i +"]"));
		}
		scaling_group.setVswitch_ids(vswitch_ids);

		List<Data_disk> data_disksList = new ArrayList<Data_disk>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks.Length"); i++) {
			Data_disk data_disk = new Data_disk();
			data_disk.setSize(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks["+ i +"].size"));
			data_disk.setEncrypted(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks["+ i +"].encrypted"));
			data_disk.setCategory(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.data_disks["+ i +"].category"));

			data_disksList.add(data_disk);
		}
		scaling_group.setData_disks(data_disksList);

		List<TagsItem> tagsList = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.scaling_group.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.tags["+ i +"].value"));
			tagsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.scaling_group.tags["+ i +"].key"));

			tagsList.add(tagsItem);
		}
		scaling_group.setTags(tagsList);
		describeClusterNodePoolDetailResponse.setScaling_group(scaling_group);

		Kubernetes_config kubernetes_config = new Kubernetes_config();
		kubernetes_config.setRuntime_version(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.runtime_version"));
		kubernetes_config.setCpu_policy(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.cpu_policy"));
		kubernetes_config.setCms_enabled(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.cms_enabled"));
		kubernetes_config.setRuntime(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.runtime"));
		kubernetes_config.setOverwrite_hostname(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.overwrite_hostname"));
		kubernetes_config.setUser_data(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.user_data"));
		kubernetes_config.setNode_name_mode(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.node_name_mode"));

		List<TaintsItem> taintsList = new ArrayList<TaintsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.taints.Length"); i++) {
			TaintsItem taintsItem = new TaintsItem();
			taintsItem.setEffect(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.taints["+ i +"].effect"));
			taintsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.taints["+ i +"].value"));
			taintsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.taints["+ i +"].key"));

			taintsList.add(taintsItem);
		}
		kubernetes_config.setTaints(taintsList);

		List<LabelsItem> labelsList = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setValue(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.labels["+ i +"].value"));
			labelsItem.setKey(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.kubernetes_config.labels["+ i +"].key"));

			labelsList.add(labelsItem);
		}
		kubernetes_config.setLabels(labelsList);
		describeClusterNodePoolDetailResponse.setKubernetes_config(kubernetes_config);

		Auto_scaling auto_scaling = new Auto_scaling();
		auto_scaling.setHealth_check_type(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.auto_scaling.health_check_type"));
		auto_scaling.setEip_internet_charge_type(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.auto_scaling.eip_internet_charge_type"));
		auto_scaling.setEnable(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.auto_scaling.enable"));
		auto_scaling.setMin_instances(_ctx.longValue("DescribeClusterNodePoolDetailResponse.auto_scaling.min_instances"));
		auto_scaling.setMax_instances(_ctx.longValue("DescribeClusterNodePoolDetailResponse.auto_scaling.max_instances"));
		auto_scaling.setType(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.auto_scaling.type"));
		auto_scaling.setEip_bandwidth(_ctx.longValue("DescribeClusterNodePoolDetailResponse.auto_scaling.eip_bandwidth"));
		auto_scaling.setIs_bond_eip(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.auto_scaling.is_bond_eip"));
		describeClusterNodePoolDetailResponse.setAuto_scaling(auto_scaling);

		Nodepool_info nodepool_info = new Nodepool_info();
		nodepool_info.setResource_group_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.resource_group_id"));
		nodepool_info.setCreated(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.created"));
		nodepool_info.setRegion_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.region_id"));
		nodepool_info.setName(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.name"));
		nodepool_info.setType(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.type"));
		nodepool_info.setIs_default(_ctx.booleanValue("DescribeClusterNodePoolDetailResponse.nodepool_info.is_default"));
		nodepool_info.setUpdated(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.updated"));
		nodepool_info.setNodepool_id(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.nodepool_info.nodepool_id"));
		describeClusterNodePoolDetailResponse.setNodepool_info(nodepool_info);

		Status status = new Status();
		status.setServing_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.serving_nodes"));
		status.setTotal_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.total_nodes"));
		status.setState(_ctx.stringValue("DescribeClusterNodePoolDetailResponse.status.state"));
		status.setRemoving_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.removing_nodes"));
		status.setOffline_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.offline_nodes"));
		status.setInitial_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.initial_nodes"));
		status.setFailed_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.failed_nodes"));
		status.setHealthy_nodes(_ctx.longValue("DescribeClusterNodePoolDetailResponse.status.healthy_nodes"));
		describeClusterNodePoolDetailResponse.setStatus(status);
	 
	 	return describeClusterNodePoolDetailResponse;
	}
}