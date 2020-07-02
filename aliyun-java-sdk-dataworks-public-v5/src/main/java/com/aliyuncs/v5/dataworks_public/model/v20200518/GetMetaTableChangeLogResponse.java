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
import com.aliyuncs.v5.dataworks_public.transform.v20200518.GetMetaTableChangeLogResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTableChangeLogResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

		private Long totalCount;

		private List<DataEntityListItem> dataEntityList;

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

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<DataEntityListItem> getDataEntityList() {
			return this.dataEntityList;
		}

		public void setDataEntityList(List<DataEntityListItem> dataEntityList) {
			this.dataEntityList = dataEntityList;
		}

		public static class DataEntityListItem {

			private Long createTime;

			private Long modifiedTime;

			private String changeType;

			private String operator;

			private String objectType;

			private String changeContent;

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(Long modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getChangeType() {
				return this.changeType;
			}

			public void setChangeType(String changeType) {
				this.changeType = changeType;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getChangeContent() {
				return this.changeContent;
			}

			public void setChangeContent(String changeContent) {
				this.changeContent = changeContent;
			}
		}
	}

	@Override
	public GetMetaTableChangeLogResponse getInstance(UnmarshallerContext context) {
		return	GetMetaTableChangeLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
