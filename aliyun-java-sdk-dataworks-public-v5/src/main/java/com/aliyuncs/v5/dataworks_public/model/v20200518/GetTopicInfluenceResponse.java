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
import com.aliyuncs.v5.dataworks_public.transform.v20200518.GetTopicInfluenceResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTopicInfluenceResponse extends AcsResponse {

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

		private Long topicId;

		private List<InfluencesItem> influences;

		public Long getTopicId() {
			return this.topicId;
		}

		public void setTopicId(Long topicId) {
			this.topicId = topicId;
		}

		public List<InfluencesItem> getInfluences() {
			return this.influences;
		}

		public void setInfluences(List<InfluencesItem> influences) {
			this.influences = influences;
		}

		public static class InfluencesItem {

			private Long baselineId;

			private Long bizdate;

			private Integer inGroupId;

			private String baselineName;

			private String owner;

			private String status;

			private Long projectId;

			private Integer priority;

			private Long buffer;

			public Long getBaselineId() {
				return this.baselineId;
			}

			public void setBaselineId(Long baselineId) {
				this.baselineId = baselineId;
			}

			public Long getBizdate() {
				return this.bizdate;
			}

			public void setBizdate(Long bizdate) {
				this.bizdate = bizdate;
			}

			public Integer getInGroupId() {
				return this.inGroupId;
			}

			public void setInGroupId(Integer inGroupId) {
				this.inGroupId = inGroupId;
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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public Long getBuffer() {
				return this.buffer;
			}

			public void setBuffer(Long buffer) {
				this.buffer = buffer;
			}
		}
	}

	@Override
	public GetTopicInfluenceResponse getInstance(UnmarshallerContext context) {
		return	GetTopicInfluenceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
