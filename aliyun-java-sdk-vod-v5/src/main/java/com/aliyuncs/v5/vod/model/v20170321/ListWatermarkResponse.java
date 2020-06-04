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

package com.aliyuncs.v5.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.vod.transform.v20170321.ListWatermarkResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWatermarkResponse extends AcsResponse {

	private String requestId;

	private List<WatermarkInfo> watermarkInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<WatermarkInfo> getWatermarkInfos() {
		return this.watermarkInfos;
	}

	public void setWatermarkInfos(List<WatermarkInfo> watermarkInfos) {
		this.watermarkInfos = watermarkInfos;
	}

	public static class WatermarkInfo {

		private String creationTime;

		private String type;

		private String isDefault;

		private String watermarkId;

		private String name;

		private String fileUrl;

		private String watermarkConfig;

		private String appId;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(String isDefault) {
			this.isDefault = isDefault;
		}

		public String getWatermarkId() {
			return this.watermarkId;
		}

		public void setWatermarkId(String watermarkId) {
			this.watermarkId = watermarkId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFileUrl() {
			return this.fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

		public String getWatermarkConfig() {
			return this.watermarkConfig;
		}

		public void setWatermarkConfig(String watermarkConfig) {
			this.watermarkConfig = watermarkConfig;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}
	}

	@Override
	public ListWatermarkResponse getInstance(UnmarshallerContext context) {
		return	ListWatermarkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
