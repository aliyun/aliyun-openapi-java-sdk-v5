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
import com.aliyuncs.v5.dataworks_public.transform.v20200518.ListDataServicePublishedApisResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataServicePublishedApisResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private Data data;

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

		private Integer totalCount;

		private List<Api> apis;

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

		public List<Api> getApis() {
			return this.apis;
		}

		public void setApis(List<Api> apis) {
			this.apis = apis;
		}

		public static class Api {

			private Long apiId;

			private Integer apiMode;

			private String apiName;

			private String apiPath;

			private String createdTime;

			private String creatorId;

			private String description;

			private String groupId;

			private String modifiedTime;

			private String operatorId;

			private Long projectId;

			private Integer requestMethod;

			private Integer responseContentType;

			private Integer status;

			private Long tenantId;

			private Integer timeout;

			private Integer visibleRange;

			private List<Integer> protocols;

			private RegistrationDetails registrationDetails;

			private ScriptDetails scriptDetails;

			private WizardDetails wizardDetails;

			public Long getApiId() {
				return this.apiId;
			}

			public void setApiId(Long apiId) {
				this.apiId = apiId;
			}

			public Integer getApiMode() {
				return this.apiMode;
			}

			public void setApiMode(Integer apiMode) {
				this.apiMode = apiMode;
			}

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public String getApiPath() {
				return this.apiPath;
			}

			public void setApiPath(String apiPath) {
				this.apiPath = apiPath;
			}

			public String getCreatedTime() {
				return this.createdTime;
			}

			public void setCreatedTime(String createdTime) {
				this.createdTime = createdTime;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getOperatorId() {
				return this.operatorId;
			}

			public void setOperatorId(String operatorId) {
				this.operatorId = operatorId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Integer getRequestMethod() {
				return this.requestMethod;
			}

			public void setRequestMethod(Integer requestMethod) {
				this.requestMethod = requestMethod;
			}

			public Integer getResponseContentType() {
				return this.responseContentType;
			}

			public void setResponseContentType(Integer responseContentType) {
				this.responseContentType = responseContentType;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(Long tenantId) {
				this.tenantId = tenantId;
			}

			public Integer getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Integer timeout) {
				this.timeout = timeout;
			}

			public Integer getVisibleRange() {
				return this.visibleRange;
			}

			public void setVisibleRange(Integer visibleRange) {
				this.visibleRange = visibleRange;
			}

			public List<Integer> getProtocols() {
				return this.protocols;
			}

			public void setProtocols(List<Integer> protocols) {
				this.protocols = protocols;
			}

			public RegistrationDetails getRegistrationDetails() {
				return this.registrationDetails;
			}

			public void setRegistrationDetails(RegistrationDetails registrationDetails) {
				this.registrationDetails = registrationDetails;
			}

			public ScriptDetails getScriptDetails() {
				return this.scriptDetails;
			}

			public void setScriptDetails(ScriptDetails scriptDetails) {
				this.scriptDetails = scriptDetails;
			}

			public WizardDetails getWizardDetails() {
				return this.wizardDetails;
			}

			public void setWizardDetails(WizardDetails wizardDetails) {
				this.wizardDetails = wizardDetails;
			}

			public static class RegistrationDetails {

				private String failedResultSample;

				private Integer serviceContentType;

				private String serviceHost;

				private String servicePath;

				private String serviceRequestBodyDescription;

				private String successfulResultSample;

				private List<RegistrationErrorCode> registrationErrorCodes;

				private List<RegistrationRequestParameter> registrationRequestParameters;

				public String getFailedResultSample() {
					return this.failedResultSample;
				}

				public void setFailedResultSample(String failedResultSample) {
					this.failedResultSample = failedResultSample;
				}

				public Integer getServiceContentType() {
					return this.serviceContentType;
				}

				public void setServiceContentType(Integer serviceContentType) {
					this.serviceContentType = serviceContentType;
				}

				public String getServiceHost() {
					return this.serviceHost;
				}

				public void setServiceHost(String serviceHost) {
					this.serviceHost = serviceHost;
				}

				public String getServicePath() {
					return this.servicePath;
				}

				public void setServicePath(String servicePath) {
					this.servicePath = servicePath;
				}

				public String getServiceRequestBodyDescription() {
					return this.serviceRequestBodyDescription;
				}

				public void setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
					this.serviceRequestBodyDescription = serviceRequestBodyDescription;
				}

				public String getSuccessfulResultSample() {
					return this.successfulResultSample;
				}

				public void setSuccessfulResultSample(String successfulResultSample) {
					this.successfulResultSample = successfulResultSample;
				}

				public List<RegistrationErrorCode> getRegistrationErrorCodes() {
					return this.registrationErrorCodes;
				}

				public void setRegistrationErrorCodes(List<RegistrationErrorCode> registrationErrorCodes) {
					this.registrationErrorCodes = registrationErrorCodes;
				}

				public List<RegistrationRequestParameter> getRegistrationRequestParameters() {
					return this.registrationRequestParameters;
				}

				public void setRegistrationRequestParameters(List<RegistrationRequestParameter> registrationRequestParameters) {
					this.registrationRequestParameters = registrationRequestParameters;
				}

				public static class RegistrationErrorCode {

					private String errorCode;

					private String errorMessage;

					private String errorSolution;

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

					public String getErrorSolution() {
						return this.errorSolution;
					}

					public void setErrorSolution(String errorSolution) {
						this.errorSolution = errorSolution;
					}
				}

				public static class RegistrationRequestParameter {

					private String defaultValue;

					private String exampleValue;

					private Boolean isRequiredParameter;

					private Integer parameterDataType;

					private String parameterDescription;

					private String parameterName;

					private Integer parameterOperator;

					private Integer parameterPosition;

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}

					public String getExampleValue() {
						return this.exampleValue;
					}

					public void setExampleValue(String exampleValue) {
						this.exampleValue = exampleValue;
					}

					public Boolean getIsRequiredParameter() {
						return this.isRequiredParameter;
					}

					public void setIsRequiredParameter(Boolean isRequiredParameter) {
						this.isRequiredParameter = isRequiredParameter;
					}

					public Integer getParameterDataType() {
						return this.parameterDataType;
					}

					public void setParameterDataType(Integer parameterDataType) {
						this.parameterDataType = parameterDataType;
					}

					public String getParameterDescription() {
						return this.parameterDescription;
					}

					public void setParameterDescription(String parameterDescription) {
						this.parameterDescription = parameterDescription;
					}

					public String getParameterName() {
						return this.parameterName;
					}

					public void setParameterName(String parameterName) {
						this.parameterName = parameterName;
					}

					public Integer getParameterOperator() {
						return this.parameterOperator;
					}

					public void setParameterOperator(Integer parameterOperator) {
						this.parameterOperator = parameterOperator;
					}

					public Integer getParameterPosition() {
						return this.parameterPosition;
					}

					public void setParameterPosition(Integer parameterPosition) {
						this.parameterPosition = parameterPosition;
					}
				}
			}

			public static class ScriptDetails {

				private String failedResultSample;

				private Boolean isPagedResponse;

				private String script;

				private String successfulResultSample;

				private List<ScriptErrorCode> scriptErrorCodes;

				private List<ScriptRequestParameter> scriptRequestParameters;

				private List<ScriptResponseParameter> scriptResponseParameters;

				private ScriptConnection scriptConnection;

				public String getFailedResultSample() {
					return this.failedResultSample;
				}

				public void setFailedResultSample(String failedResultSample) {
					this.failedResultSample = failedResultSample;
				}

				public Boolean getIsPagedResponse() {
					return this.isPagedResponse;
				}

				public void setIsPagedResponse(Boolean isPagedResponse) {
					this.isPagedResponse = isPagedResponse;
				}

				public String getScript() {
					return this.script;
				}

				public void setScript(String script) {
					this.script = script;
				}

				public String getSuccessfulResultSample() {
					return this.successfulResultSample;
				}

				public void setSuccessfulResultSample(String successfulResultSample) {
					this.successfulResultSample = successfulResultSample;
				}

				public List<ScriptErrorCode> getScriptErrorCodes() {
					return this.scriptErrorCodes;
				}

				public void setScriptErrorCodes(List<ScriptErrorCode> scriptErrorCodes) {
					this.scriptErrorCodes = scriptErrorCodes;
				}

				public List<ScriptRequestParameter> getScriptRequestParameters() {
					return this.scriptRequestParameters;
				}

				public void setScriptRequestParameters(List<ScriptRequestParameter> scriptRequestParameters) {
					this.scriptRequestParameters = scriptRequestParameters;
				}

				public List<ScriptResponseParameter> getScriptResponseParameters() {
					return this.scriptResponseParameters;
				}

				public void setScriptResponseParameters(List<ScriptResponseParameter> scriptResponseParameters) {
					this.scriptResponseParameters = scriptResponseParameters;
				}

				public ScriptConnection getScriptConnection() {
					return this.scriptConnection;
				}

				public void setScriptConnection(ScriptConnection scriptConnection) {
					this.scriptConnection = scriptConnection;
				}

				public static class ScriptErrorCode {

					private String errorCode;

					private String errorMessage;

					private String errorSolution;

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

					public String getErrorSolution() {
						return this.errorSolution;
					}

					public void setErrorSolution(String errorSolution) {
						this.errorSolution = errorSolution;
					}
				}

				public static class ScriptRequestParameter {

					private String defaultValue;

					private String exampleValue;

					private Boolean isRequiredParameter;

					private Integer parameterDataType;

					private String parameterDescription;

					private String parameterName;

					private Integer parameterOperator;

					private Integer parameterPosition;

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}

					public String getExampleValue() {
						return this.exampleValue;
					}

					public void setExampleValue(String exampleValue) {
						this.exampleValue = exampleValue;
					}

					public Boolean getIsRequiredParameter() {
						return this.isRequiredParameter;
					}

					public void setIsRequiredParameter(Boolean isRequiredParameter) {
						this.isRequiredParameter = isRequiredParameter;
					}

					public Integer getParameterDataType() {
						return this.parameterDataType;
					}

					public void setParameterDataType(Integer parameterDataType) {
						this.parameterDataType = parameterDataType;
					}

					public String getParameterDescription() {
						return this.parameterDescription;
					}

					public void setParameterDescription(String parameterDescription) {
						this.parameterDescription = parameterDescription;
					}

					public String getParameterName() {
						return this.parameterName;
					}

					public void setParameterName(String parameterName) {
						this.parameterName = parameterName;
					}

					public Integer getParameterOperator() {
						return this.parameterOperator;
					}

					public void setParameterOperator(Integer parameterOperator) {
						this.parameterOperator = parameterOperator;
					}

					public Integer getParameterPosition() {
						return this.parameterPosition;
					}

					public void setParameterPosition(Integer parameterPosition) {
						this.parameterPosition = parameterPosition;
					}
				}

				public static class ScriptResponseParameter {

					private String exampleValue;

					private Integer parameterDataType;

					private String parameterDescription;

					private String parameterName;

					public String getExampleValue() {
						return this.exampleValue;
					}

					public void setExampleValue(String exampleValue) {
						this.exampleValue = exampleValue;
					}

					public Integer getParameterDataType() {
						return this.parameterDataType;
					}

					public void setParameterDataType(Integer parameterDataType) {
						this.parameterDataType = parameterDataType;
					}

					public String getParameterDescription() {
						return this.parameterDescription;
					}

					public void setParameterDescription(String parameterDescription) {
						this.parameterDescription = parameterDescription;
					}

					public String getParameterName() {
						return this.parameterName;
					}

					public void setParameterName(String parameterName) {
						this.parameterName = parameterName;
					}
				}

				public static class ScriptConnection {

					private Long connectionId;

					private String tableName;

					public Long getConnectionId() {
						return this.connectionId;
					}

					public void setConnectionId(Long connectionId) {
						this.connectionId = connectionId;
					}

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}
				}
			}

			public static class WizardDetails {

				private String failedResultSample;

				private Boolean isPagedResponse;

				private String successfulResultSample;

				private List<WizardErrorCode> wizardErrorCodes;

				private List<WizardRequestParameter> wizardRequestParameters;

				private List<WizardResponseParameter> wizardResponseParameters;

				private WizardConnection wizardConnection;

				public String getFailedResultSample() {
					return this.failedResultSample;
				}

				public void setFailedResultSample(String failedResultSample) {
					this.failedResultSample = failedResultSample;
				}

				public Boolean getIsPagedResponse() {
					return this.isPagedResponse;
				}

				public void setIsPagedResponse(Boolean isPagedResponse) {
					this.isPagedResponse = isPagedResponse;
				}

				public String getSuccessfulResultSample() {
					return this.successfulResultSample;
				}

				public void setSuccessfulResultSample(String successfulResultSample) {
					this.successfulResultSample = successfulResultSample;
				}

				public List<WizardErrorCode> getWizardErrorCodes() {
					return this.wizardErrorCodes;
				}

				public void setWizardErrorCodes(List<WizardErrorCode> wizardErrorCodes) {
					this.wizardErrorCodes = wizardErrorCodes;
				}

				public List<WizardRequestParameter> getWizardRequestParameters() {
					return this.wizardRequestParameters;
				}

				public void setWizardRequestParameters(List<WizardRequestParameter> wizardRequestParameters) {
					this.wizardRequestParameters = wizardRequestParameters;
				}

				public List<WizardResponseParameter> getWizardResponseParameters() {
					return this.wizardResponseParameters;
				}

				public void setWizardResponseParameters(List<WizardResponseParameter> wizardResponseParameters) {
					this.wizardResponseParameters = wizardResponseParameters;
				}

				public WizardConnection getWizardConnection() {
					return this.wizardConnection;
				}

				public void setWizardConnection(WizardConnection wizardConnection) {
					this.wizardConnection = wizardConnection;
				}

				public static class WizardErrorCode {

					private String errorCode;

					private String errorMessage;

					private String errorSolution;

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

					public String getErrorSolution() {
						return this.errorSolution;
					}

					public void setErrorSolution(String errorSolution) {
						this.errorSolution = errorSolution;
					}
				}

				public static class WizardRequestParameter {

					private String defaultValue;

					private String exampleValue;

					private Boolean isRequiredParameter;

					private Integer parameterDataType;

					private String parameterDescription;

					private String parameterName;

					private Integer parameterOperator;

					private Integer parameterPosition;

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}

					public String getExampleValue() {
						return this.exampleValue;
					}

					public void setExampleValue(String exampleValue) {
						this.exampleValue = exampleValue;
					}

					public Boolean getIsRequiredParameter() {
						return this.isRequiredParameter;
					}

					public void setIsRequiredParameter(Boolean isRequiredParameter) {
						this.isRequiredParameter = isRequiredParameter;
					}

					public Integer getParameterDataType() {
						return this.parameterDataType;
					}

					public void setParameterDataType(Integer parameterDataType) {
						this.parameterDataType = parameterDataType;
					}

					public String getParameterDescription() {
						return this.parameterDescription;
					}

					public void setParameterDescription(String parameterDescription) {
						this.parameterDescription = parameterDescription;
					}

					public String getParameterName() {
						return this.parameterName;
					}

					public void setParameterName(String parameterName) {
						this.parameterName = parameterName;
					}

					public Integer getParameterOperator() {
						return this.parameterOperator;
					}

					public void setParameterOperator(Integer parameterOperator) {
						this.parameterOperator = parameterOperator;
					}

					public Integer getParameterPosition() {
						return this.parameterPosition;
					}

					public void setParameterPosition(Integer parameterPosition) {
						this.parameterPosition = parameterPosition;
					}
				}

				public static class WizardResponseParameter {

					private String exampleValue;

					private Integer parameterDataType;

					private String parameterDescription;

					private String parameterName;

					public String getExampleValue() {
						return this.exampleValue;
					}

					public void setExampleValue(String exampleValue) {
						this.exampleValue = exampleValue;
					}

					public Integer getParameterDataType() {
						return this.parameterDataType;
					}

					public void setParameterDataType(Integer parameterDataType) {
						this.parameterDataType = parameterDataType;
					}

					public String getParameterDescription() {
						return this.parameterDescription;
					}

					public void setParameterDescription(String parameterDescription) {
						this.parameterDescription = parameterDescription;
					}

					public String getParameterName() {
						return this.parameterName;
					}

					public void setParameterName(String parameterName) {
						this.parameterName = parameterName;
					}
				}

				public static class WizardConnection {

					private Long connectionId;

					private String tableName;

					public Long getConnectionId() {
						return this.connectionId;
					}

					public void setConnectionId(Long connectionId) {
						this.connectionId = connectionId;
					}

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}
				}
			}
		}
	}

	@Override
	public ListDataServicePublishedApisResponse getInstance(UnmarshallerContext context) {
		return	ListDataServicePublishedApisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
