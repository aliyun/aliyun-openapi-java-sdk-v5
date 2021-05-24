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
import com.aliyuncs.v5.dts.transform.v20200101.DescribeSubscriptionInstanceStatusResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSubscriptionInstanceStatusResponse extends AcsResponse {

	private String beginTimestamp;

	private String consumptionCheckpoint;

	private String consumptionClient;

	private String endTimestamp;

	private String errMessage;

	private String payType;

	private String requestId;

	private String status;

	private String subscribeTopic;

	private String subscriptionInstanceID;

	private String subscriptionInstanceName;

	private String errCode;

	private String success;

	private String errorMessage;

	private String errorMessage1;

	private String taskId;

	private List<SynchronousObject> subscriptionObject;

	private SourceEndpoint sourceEndpoint;

	private SubscriptionDataType subscriptionDataType;

	private SubscriptionHost subscriptionHost;

	public String getBeginTimestamp() {
		return this.beginTimestamp;
	}

	public void setBeginTimestamp(String beginTimestamp) {
		this.beginTimestamp = beginTimestamp;
	}

	public String getConsumptionCheckpoint() {
		return this.consumptionCheckpoint;
	}

	public void setConsumptionCheckpoint(String consumptionCheckpoint) {
		this.consumptionCheckpoint = consumptionCheckpoint;
	}

	public String getConsumptionClient() {
		return this.consumptionClient;
	}

	public void setConsumptionClient(String consumptionClient) {
		this.consumptionClient = consumptionClient;
	}

	public String getEndTimestamp() {
		return this.endTimestamp;
	}

	public void setEndTimestamp(String endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubscribeTopic() {
		return this.subscribeTopic;
	}

	public void setSubscribeTopic(String subscribeTopic) {
		this.subscribeTopic = subscribeTopic;
	}

	public String getSubscriptionInstanceID() {
		return this.subscriptionInstanceID;
	}

	public void setSubscriptionInstanceID(String subscriptionInstanceID) {
		this.subscriptionInstanceID = subscriptionInstanceID;
	}

	public String getSubscriptionInstanceName() {
		return this.subscriptionInstanceName;
	}

	public void setSubscriptionInstanceName(String subscriptionInstanceName) {
		this.subscriptionInstanceName = subscriptionInstanceName;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage1() {
		return this.errorMessage1;
	}

	public void setErrorMessage1(String errorMessage1) {
		this.errorMessage1 = errorMessage1;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<SynchronousObject> getSubscriptionObject() {
		return this.subscriptionObject;
	}

	public void setSubscriptionObject(List<SynchronousObject> subscriptionObject) {
		this.subscriptionObject = subscriptionObject;
	}

	public SourceEndpoint getSourceEndpoint() {
		return this.sourceEndpoint;
	}

	public void setSourceEndpoint(SourceEndpoint sourceEndpoint) {
		this.sourceEndpoint = sourceEndpoint;
	}

	public SubscriptionDataType getSubscriptionDataType() {
		return this.subscriptionDataType;
	}

	public void setSubscriptionDataType(SubscriptionDataType subscriptionDataType) {
		this.subscriptionDataType = subscriptionDataType;
	}

	public SubscriptionHost getSubscriptionHost() {
		return this.subscriptionHost;
	}

	public void setSubscriptionHost(SubscriptionHost subscriptionHost) {
		this.subscriptionHost = subscriptionHost;
	}

	public static class SynchronousObject {

		private String databaseName;

		private String wholeDatabase;

		private List<String> tableList;

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getWholeDatabase() {
			return this.wholeDatabase;
		}

		public void setWholeDatabase(String wholeDatabase) {
			this.wholeDatabase = wholeDatabase;
		}

		public List<String> getTableList() {
			return this.tableList;
		}

		public void setTableList(List<String> tableList) {
			this.tableList = tableList;
		}
	}

	public static class SourceEndpoint {

		private String instanceID;

		private String instanceType;

		public String getInstanceID() {
			return this.instanceID;
		}

		public void setInstanceID(String instanceID) {
			this.instanceID = instanceID;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	public static class SubscriptionDataType {

		private Boolean dDL;

		private Boolean dML;

		public Boolean getDDL() {
			return this.dDL;
		}

		public void setDDL(Boolean dDL) {
			this.dDL = dDL;
		}

		public Boolean getDML() {
			return this.dML;
		}

		public void setDML(Boolean dML) {
			this.dML = dML;
		}
	}

	public static class SubscriptionHost {

		private String privateHost;

		private String publicHost;

		private String vPCHost;

		public String getPrivateHost() {
			return this.privateHost;
		}

		public void setPrivateHost(String privateHost) {
			this.privateHost = privateHost;
		}

		public String getPublicHost() {
			return this.publicHost;
		}

		public void setPublicHost(String publicHost) {
			this.publicHost = publicHost;
		}

		public String getVPCHost() {
			return this.vPCHost;
		}

		public void setVPCHost(String vPCHost) {
			this.vPCHost = vPCHost;
		}
	}

	@Override
	public DescribeSubscriptionInstanceStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeSubscriptionInstanceStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
