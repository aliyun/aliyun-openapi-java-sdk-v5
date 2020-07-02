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

package com.aliyuncs.v5.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.dataworks_public.transform.v20200518.ListBaselineConfigsResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBaselineConfigsResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<BaselinesItem> baselines;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<BaselinesItem> getBaselines() {
			return this.baselines;
		}

		public void setBaselines(List<BaselinesItem> baselines) {
			this.baselines = baselines;
		}

		public static class BaselinesItem {

			private Long baselineId;

			private Integer priority;

			private String baselineName;

			private String owner;

			private Long projectId;

			private Boolean useFlag;

			private String baselineType;

			private Integer expHour;

			private Integer expMinu;

			private Integer slaHour;

			private Integer slaMinu;

			private String hourExpDetail;

			private String hourSlaDetail;

			private Boolean isDefault;

			public Long getBaselineId() {
				return this.baselineId;
			}

			public void setBaselineId(Long baselineId) {
				this.baselineId = baselineId;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getBaselineName() {
				return this.baselineName;
			}

			public void setBaselineName(String baselineName) {
				this.baselineName = baselineName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Boolean getUseFlag() {
				return this.useFlag;
			}

			public void setUseFlag(Boolean useFlag) {
				this.useFlag = useFlag;
			}

			public String getBaselineType() {
				return this.baselineType;
			}

			public void setBaselineType(String baselineType) {
				this.baselineType = baselineType;
			}

			public Integer getExpHour() {
				return this.expHour;
			}

			public void setExpHour(Integer expHour) {
				this.expHour = expHour;
			}

			public Integer getExpMinu() {
				return this.expMinu;
			}

			public void setExpMinu(Integer expMinu) {
				this.expMinu = expMinu;
			}

			public Integer getSlaHour() {
				return this.slaHour;
			}

			public void setSlaHour(Integer slaHour) {
				this.slaHour = slaHour;
			}

			public Integer getSlaMinu() {
				return this.slaMinu;
			}

			public void setSlaMinu(Integer slaMinu) {
				this.slaMinu = slaMinu;
			}

			public String getHourExpDetail() {
				return this.hourExpDetail;
			}

			public void setHourExpDetail(String hourExpDetail) {
				this.hourExpDetail = hourExpDetail;
			}

			public String getHourSlaDetail() {
				return this.hourSlaDetail;
			}

			public void setHourSlaDetail(String hourSlaDetail) {
				this.hourSlaDetail = hourSlaDetail;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}
		}
	}

	@Override
	public ListBaselineConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListBaselineConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
