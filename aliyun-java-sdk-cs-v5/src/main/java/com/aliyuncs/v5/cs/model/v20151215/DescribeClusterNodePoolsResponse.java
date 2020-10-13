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

package com.aliyuncs.v5.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.cs.transform.v20151215.DescribeClusterNodePoolsResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterNodePoolsResponse extends AcsResponse {

	private List<NodepoolsItem> nodepools;

	public List<NodepoolsItem> getNodepools() {
		return this.nodepools;
	}

	public void setNodepools(List<NodepoolsItem> nodepools) {
		this.nodepools = nodepools;
	}

	public static class NodepoolsItem {

		private Tee_config tee_config;

		private Scaling_group scaling_group;

		private Kubernetes_config kubernetes_config;

		private Auto_scaling auto_scaling;

		private Nodepool_info nodepool_info;

		private Status status;

		public Tee_config getTee_config() {
			return this.tee_config;
		}

		public void setTee_config(Tee_config tee_config) {
			this.tee_config = tee_config;
		}

		public Scaling_group getScaling_group() {
			return this.scaling_group;
		}

		public void setScaling_group(Scaling_group scaling_group) {
			this.scaling_group = scaling_group;
		}

		public Kubernetes_config getKubernetes_config() {
			return this.kubernetes_config;
		}

		public void setKubernetes_config(Kubernetes_config kubernetes_config) {
			this.kubernetes_config = kubernetes_config;
		}

		public Auto_scaling getAuto_scaling() {
			return this.auto_scaling;
		}

		public void setAuto_scaling(Auto_scaling auto_scaling) {
			this.auto_scaling = auto_scaling;
		}

		public Nodepool_info getNodepool_info() {
			return this.nodepool_info;
		}

		public void setNodepool_info(Nodepool_info nodepool_info) {
			this.nodepool_info = nodepool_info;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public static class Tee_config {

			private Boolean tee_enable;

			public Boolean getTee_enable() {
				return this.tee_enable;
			}

			public void setTee_enable(Boolean tee_enable) {
				this.tee_enable = tee_enable;
			}
		}

		public static class Scaling_group {

			private String scaling_group_id;

			private Long period;

			private Long auto_renew_period;

			private String period_unit;

			private String security_group_id;

			private String multi_az_policy;

			private Long system_disk_size;

			private String platform;

			private String worker_hpc_cluster_id;

			private String ram_policy;

			private String instance_charge_type;

			private Boolean auto_renew;

			private String system_disk_category;

			private String image_id;

			private String scaling_policy;

			private List<Data_disksItem> data_disks;

			private List<TagsItem> tags;

			private List<String> instance_types;

			private List<String> rds_instances;

			private List<String> vswitch_ids;

			public String getScaling_group_id() {
				return this.scaling_group_id;
			}

			public void setScaling_group_id(String scaling_group_id) {
				this.scaling_group_id = scaling_group_id;
			}

			public Long getPeriod() {
				return this.period;
			}

			public void setPeriod(Long period) {
				this.period = period;
			}

			public Long getAuto_renew_period() {
				return this.auto_renew_period;
			}

			public void setAuto_renew_period(Long auto_renew_period) {
				this.auto_renew_period = auto_renew_period;
			}

			public String getPeriod_unit() {
				return this.period_unit;
			}

			public void setPeriod_unit(String period_unit) {
				this.period_unit = period_unit;
			}

			public String getSecurity_group_id() {
				return this.security_group_id;
			}

			public void setSecurity_group_id(String security_group_id) {
				this.security_group_id = security_group_id;
			}

			public String getMulti_az_policy() {
				return this.multi_az_policy;
			}

			public void setMulti_az_policy(String multi_az_policy) {
				this.multi_az_policy = multi_az_policy;
			}

			public Long getSystem_disk_size() {
				return this.system_disk_size;
			}

			public void setSystem_disk_size(Long system_disk_size) {
				this.system_disk_size = system_disk_size;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getWorker_hpc_cluster_id() {
				return this.worker_hpc_cluster_id;
			}

			public void setWorker_hpc_cluster_id(String worker_hpc_cluster_id) {
				this.worker_hpc_cluster_id = worker_hpc_cluster_id;
			}

			public String getRam_policy() {
				return this.ram_policy;
			}

			public void setRam_policy(String ram_policy) {
				this.ram_policy = ram_policy;
			}

			public String getInstance_charge_type() {
				return this.instance_charge_type;
			}

			public void setInstance_charge_type(String instance_charge_type) {
				this.instance_charge_type = instance_charge_type;
			}

			public Boolean getAuto_renew() {
				return this.auto_renew;
			}

			public void setAuto_renew(Boolean auto_renew) {
				this.auto_renew = auto_renew;
			}

			public String getSystem_disk_category() {
				return this.system_disk_category;
			}

			public void setSystem_disk_category(String system_disk_category) {
				this.system_disk_category = system_disk_category;
			}

			public String getImage_id() {
				return this.image_id;
			}

			public void setImage_id(String image_id) {
				this.image_id = image_id;
			}

			public String getScaling_policy() {
				return this.scaling_policy;
			}

			public void setScaling_policy(String scaling_policy) {
				this.scaling_policy = scaling_policy;
			}

			public List<Data_disksItem> getData_disks() {
				return this.data_disks;
			}

			public void setData_disks(List<Data_disksItem> data_disks) {
				this.data_disks = data_disks;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public List<String> getInstance_types() {
				return this.instance_types;
			}

			public void setInstance_types(List<String> instance_types) {
				this.instance_types = instance_types;
			}

			public List<String> getRds_instances() {
				return this.rds_instances;
			}

			public void setRds_instances(List<String> rds_instances) {
				this.rds_instances = rds_instances;
			}

			public List<String> getVswitch_ids() {
				return this.vswitch_ids;
			}

			public void setVswitch_ids(List<String> vswitch_ids) {
				this.vswitch_ids = vswitch_ids;
			}

			public static class Data_disksItem {

				private Long size;

				private String encrypted;

				private String category;

				public Long getSize() {
					return this.size;
				}

				public void setSize(Long size) {
					this.size = size;
				}

				public String getEncrypted() {
					return this.encrypted;
				}

				public void setEncrypted(String encrypted) {
					this.encrypted = encrypted;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}
			}

			public static class TagsItem {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}

		public static class Kubernetes_config {

			private String runtime_version;

			private String cpu_policy;

			private Boolean cms_enabled;

			private String runtime;

			private Boolean overwrite_hostname;

			private String user_data;

			private String node_name_mode;

			private List<TaintsItem> taints;

			private List<LabelsItem> labels;

			public String getRuntime_version() {
				return this.runtime_version;
			}

			public void setRuntime_version(String runtime_version) {
				this.runtime_version = runtime_version;
			}

			public String getCpu_policy() {
				return this.cpu_policy;
			}

			public void setCpu_policy(String cpu_policy) {
				this.cpu_policy = cpu_policy;
			}

			public Boolean getCms_enabled() {
				return this.cms_enabled;
			}

			public void setCms_enabled(Boolean cms_enabled) {
				this.cms_enabled = cms_enabled;
			}

			public String getRuntime() {
				return this.runtime;
			}

			public void setRuntime(String runtime) {
				this.runtime = runtime;
			}

			public Boolean getOverwrite_hostname() {
				return this.overwrite_hostname;
			}

			public void setOverwrite_hostname(Boolean overwrite_hostname) {
				this.overwrite_hostname = overwrite_hostname;
			}

			public String getUser_data() {
				return this.user_data;
			}

			public void setUser_data(String user_data) {
				this.user_data = user_data;
			}

			public String getNode_name_mode() {
				return this.node_name_mode;
			}

			public void setNode_name_mode(String node_name_mode) {
				this.node_name_mode = node_name_mode;
			}

			public List<TaintsItem> getTaints() {
				return this.taints;
			}

			public void setTaints(List<TaintsItem> taints) {
				this.taints = taints;
			}

			public List<LabelsItem> getLabels() {
				return this.labels;
			}

			public void setLabels(List<LabelsItem> labels) {
				this.labels = labels;
			}

			public static class TaintsItem {

				private String effect;

				private String value;

				private String key;

				public String getEffect() {
					return this.effect;
				}

				public void setEffect(String effect) {
					this.effect = effect;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}

			public static class LabelsItem {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}

		public static class Auto_scaling {

			private String health_check_type;

			private String eip_internet_charge_type;

			private Boolean enable;

			private Long min_instances;

			private Long max_instances;

			private String type;

			private Long eip_bandwidth;

			public String getHealth_check_type() {
				return this.health_check_type;
			}

			public void setHealth_check_type(String health_check_type) {
				this.health_check_type = health_check_type;
			}

			public String getEip_internet_charge_type() {
				return this.eip_internet_charge_type;
			}

			public void setEip_internet_charge_type(String eip_internet_charge_type) {
				this.eip_internet_charge_type = eip_internet_charge_type;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public Long getMin_instances() {
				return this.min_instances;
			}

			public void setMin_instances(Long min_instances) {
				this.min_instances = min_instances;
			}

			public Long getMax_instances() {
				return this.max_instances;
			}

			public void setMax_instances(Long max_instances) {
				this.max_instances = max_instances;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getEip_bandwidth() {
				return this.eip_bandwidth;
			}

			public void setEip_bandwidth(Long eip_bandwidth) {
				this.eip_bandwidth = eip_bandwidth;
			}
		}

		public static class Nodepool_info {

			private String resource_group_id;

			private String created;

			private String region_id;

			private String name;

			private String type;

			private Boolean is_default;

			private String updated;

			private String nodepool_id;

			public String getResource_group_id() {
				return this.resource_group_id;
			}

			public void setResource_group_id(String resource_group_id) {
				this.resource_group_id = resource_group_id;
			}

			public String getCreated() {
				return this.created;
			}

			public void setCreated(String created) {
				this.created = created;
			}

			public String getRegion_id() {
				return this.region_id;
			}

			public void setRegion_id(String region_id) {
				this.region_id = region_id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getIs_default() {
				return this.is_default;
			}

			public void setIs_default(Boolean is_default) {
				this.is_default = is_default;
			}

			public String getUpdated() {
				return this.updated;
			}

			public void setUpdated(String updated) {
				this.updated = updated;
			}

			public String getNodepool_id() {
				return this.nodepool_id;
			}

			public void setNodepool_id(String nodepool_id) {
				this.nodepool_id = nodepool_id;
			}
		}

		public static class Status {

			private Long serving_nodes;

			private Long total_nodes;

			private String state;

			private Long removing_nodes;

			private Long offline_nodes;

			private Long initial_nodes;

			private Long failed_nodes;

			private Long healthy_nodes;

			public Long getServing_nodes() {
				return this.serving_nodes;
			}

			public void setServing_nodes(Long serving_nodes) {
				this.serving_nodes = serving_nodes;
			}

			public Long getTotal_nodes() {
				return this.total_nodes;
			}

			public void setTotal_nodes(Long total_nodes) {
				this.total_nodes = total_nodes;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Long getRemoving_nodes() {
				return this.removing_nodes;
			}

			public void setRemoving_nodes(Long removing_nodes) {
				this.removing_nodes = removing_nodes;
			}

			public Long getOffline_nodes() {
				return this.offline_nodes;
			}

			public void setOffline_nodes(Long offline_nodes) {
				this.offline_nodes = offline_nodes;
			}

			public Long getInitial_nodes() {
				return this.initial_nodes;
			}

			public void setInitial_nodes(Long initial_nodes) {
				this.initial_nodes = initial_nodes;
			}

			public Long getFailed_nodes() {
				return this.failed_nodes;
			}

			public void setFailed_nodes(Long failed_nodes) {
				this.failed_nodes = failed_nodes;
			}

			public Long getHealthy_nodes() {
				return this.healthy_nodes;
			}

			public void setHealthy_nodes(Long healthy_nodes) {
				this.healthy_nodes = healthy_nodes;
			}
		}
	}

	@Override
	public DescribeClusterNodePoolsResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterNodePoolsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
