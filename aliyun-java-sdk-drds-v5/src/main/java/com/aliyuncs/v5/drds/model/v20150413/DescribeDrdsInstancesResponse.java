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

package com.aliyuncs.v5.drds.model.v20150413;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.drds.transform.v20150413.DescribeDrdsInstancesResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Instance> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Instance> getData() {
		return this.data;
	}

	public void setData(List<Instance> data) {
		this.data = data;
	}

	public static class Instance {

		private String drdsInstanceId;

		private String type;

		private String regionId;

		private String zoneId;

		private String description;

		private String networkType;

		private String status;

		private Long createTime;

		private Long version;

		private List<Vip> vips;

		public String getDrdsInstanceId() {
			return this.drdsInstanceId;
		}

		public void setDrdsInstanceId(String drdsInstanceId) {
			this.drdsInstanceId = drdsInstanceId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public List<Vip> getVips() {
			return this.vips;
		}

		public void setVips(List<Vip> vips) {
			this.vips = vips;
		}

		public static class Vip {

			private String iP;

			private String port;

			private String type;

			public String getIP() {
				return this.iP;
			}

			public void setIP(String iP) {
				this.iP = iP;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public DescribeDrdsInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
