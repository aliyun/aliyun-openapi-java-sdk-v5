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

package com.aliyuncs.v5.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.dts.transform.v20200101.DescribeInitializationStatusResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInitializationStatusResponse extends AcsResponse {

	private String errCode;

	private String errMessage;

	private String requestId;

	private String success;

	private List<DataInitializationDetail> dataInitializationDetails;

	private List<DataSynchronizationDetail> dataSynchronizationDetails;

	private List<StructureInitializationDetail> structureInitializationDetails;

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<DataInitializationDetail> getDataInitializationDetails() {
		return this.dataInitializationDetails;
	}

	public void setDataInitializationDetails(List<DataInitializationDetail> dataInitializationDetails) {
		this.dataInitializationDetails = dataInitializationDetails;
	}

	public List<DataSynchronizationDetail> getDataSynchronizationDetails() {
		return this.dataSynchronizationDetails;
	}

	public void setDataSynchronizationDetails(List<DataSynchronizationDetail> dataSynchronizationDetails) {
		this.dataSynchronizationDetails = dataSynchronizationDetails;
	}

	public List<StructureInitializationDetail> getStructureInitializationDetails() {
		return this.structureInitializationDetails;
	}

	public void setStructureInitializationDetails(List<StructureInitializationDetail> structureInitializationDetails) {
		this.structureInitializationDetails = structureInitializationDetails;
	}

	public static class DataInitializationDetail {

		private String destinationOwnerDBName;

		private String errorMessage;

		private String finishRowNum;

		private String sourceOwnerDBName;

		private String status;

		private String tableName;

		private String totalRowNum;

		private String usedTime;

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getFinishRowNum() {
			return this.finishRowNum;
		}

		public void setFinishRowNum(String finishRowNum) {
			this.finishRowNum = finishRowNum;
		}

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTotalRowNum() {
			return this.totalRowNum;
		}

		public void setTotalRowNum(String totalRowNum) {
			this.totalRowNum = totalRowNum;
		}

		public String getUsedTime() {
			return this.usedTime;
		}

		public void setUsedTime(String usedTime) {
			this.usedTime = usedTime;
		}
	}

	public static class DataSynchronizationDetail {

		private String destinationOwnerDBName;

		private String errorMessage;

		private String sourceOwnerDBName;

		private String status;

		private String tableName;

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}
	}

	public static class StructureInitializationDetail {

		private String destinationOwnerDBName;

		private String errorMessage;

		private String objectDefinition;

		private String objectName;

		private String objectType;

		private String sourceOwnerDBName;

		private String status;

		private List<StructureInitializationDetail1> constraints;

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getObjectDefinition() {
			return this.objectDefinition;
		}

		public void setObjectDefinition(String objectDefinition) {
			this.objectDefinition = objectDefinition;
		}

		public String getObjectName() {
			return this.objectName;
		}

		public void setObjectName(String objectName) {
			this.objectName = objectName;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<StructureInitializationDetail1> getConstraints() {
			return this.constraints;
		}

		public void setConstraints(List<StructureInitializationDetail1> constraints) {
			this.constraints = constraints;
		}

		public static class StructureInitializationDetail1 {

			private String destinationOwnerDBName;

			private String errorMessage;

			private String objectDefinition;

			private String objectName;

			private String objectType;

			private String sourceOwnerDBName;

			private String status;

			public String getDestinationOwnerDBName() {
				return this.destinationOwnerDBName;
			}

			public void setDestinationOwnerDBName(String destinationOwnerDBName) {
				this.destinationOwnerDBName = destinationOwnerDBName;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getObjectDefinition() {
				return this.objectDefinition;
			}

			public void setObjectDefinition(String objectDefinition) {
				this.objectDefinition = objectDefinition;
			}

			public String getObjectName() {
				return this.objectName;
			}

			public void setObjectName(String objectName) {
				this.objectName = objectName;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getSourceOwnerDBName() {
				return this.sourceOwnerDBName;
			}

			public void setSourceOwnerDBName(String sourceOwnerDBName) {
				this.sourceOwnerDBName = sourceOwnerDBName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeInitializationStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeInitializationStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
