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

package com.aliyuncs.v5.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.RegistrationDetails;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCode;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameter;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptConnection;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCode;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameter;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameter;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails.WizardConnection;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCode;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameter;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameter;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetDataServicePublishedApiResponseUnmarshaller {

	public static GetDataServicePublishedApiResponse unmarshall(GetDataServicePublishedApiResponse getDataServicePublishedApiResponse, UnmarshallerContext _ctx) {
		
		getDataServicePublishedApiResponse.setRequestId(_ctx.stringValue("GetDataServicePublishedApiResponse.RequestId"));
		getDataServicePublishedApiResponse.setErrorCode(_ctx.stringValue("GetDataServicePublishedApiResponse.ErrorCode"));
		getDataServicePublishedApiResponse.setErrorMessage(_ctx.stringValue("GetDataServicePublishedApiResponse.ErrorMessage"));
		getDataServicePublishedApiResponse.setHttpStatusCode(_ctx.integerValue("GetDataServicePublishedApiResponse.HttpStatusCode"));
		getDataServicePublishedApiResponse.setSuccess(_ctx.booleanValue("GetDataServicePublishedApiResponse.Success"));

		Data data = new Data();
		data.setApiId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.ApiId"));
		data.setApiMode(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ApiMode"));
		data.setApiName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ApiName"));
		data.setApiPath(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ApiPath"));
		data.setCreatedTime(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.CreatedTime"));
		data.setCreatorId(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.CreatorId"));
		data.setDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.Description"));
		data.setGroupId(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.GroupId"));
		data.setModifiedTime(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ModifiedTime"));
		data.setOperatorId(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.OperatorId"));
		data.setProjectId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.ProjectId"));
		data.setRequestMethod(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RequestMethod"));
		data.setResponseContentType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ResponseContentType"));
		data.setStatus(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.Status"));
		data.setTenantId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.TenantId"));
		data.setTimeout(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.Timeout"));
		data.setVisibleRange(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.VisibleRange"));

		List<Integer> protocols = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.Protocols.Length"); i++) {
			protocols.add(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.Protocols["+ i +"]"));
		}
		data.setProtocols(protocols);

		RegistrationDetails registrationDetails = new RegistrationDetails();
		registrationDetails.setFailedResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.FailedResultSample"));
		registrationDetails.setServiceContentType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.ServiceContentType"));
		registrationDetails.setServiceHost(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.ServiceHost"));
		registrationDetails.setServicePath(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.ServicePath"));
		registrationDetails.setServiceRequestBodyDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.ServiceRequestBodyDescription"));
		registrationDetails.setSuccessfulResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.SuccessfulResultSample"));

		List<RegistrationErrorCode> registrationErrorCodesList = new ArrayList<RegistrationErrorCode>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCodes.Length"); i++) {
			RegistrationErrorCode registrationErrorCode = new RegistrationErrorCode();
			registrationErrorCode.setErrorCode(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorCode"));
			registrationErrorCode.setErrorMessage(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorMessage"));
			registrationErrorCode.setErrorSolution(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorSolution"));

			registrationErrorCodesList.add(registrationErrorCode);
		}
		registrationDetails.setRegistrationErrorCodes(registrationErrorCodesList);

		List<RegistrationRequestParameter> registrationRequestParametersList = new ArrayList<RegistrationRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters.Length"); i++) {
			RegistrationRequestParameter registrationRequestParameter = new RegistrationRequestParameter();
			registrationRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].DefaultValue"));
			registrationRequestParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ExampleValue"));
			registrationRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].IsRequiredParameter"));
			registrationRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterDataType"));
			registrationRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterDescription"));
			registrationRequestParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterName"));
			registrationRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterOperator"));
			registrationRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterPosition"));

			registrationRequestParametersList.add(registrationRequestParameter);
		}
		registrationDetails.setRegistrationRequestParameters(registrationRequestParametersList);
		data.setRegistrationDetails(registrationDetails);

		ScriptDetails scriptDetails = new ScriptDetails();
		scriptDetails.setFailedResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.FailedResultSample"));
		scriptDetails.setIsPagedResponse(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.IsPagedResponse"));
		scriptDetails.setScript(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.Script"));
		scriptDetails.setSuccessfulResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.SuccessfulResultSample"));

		ScriptConnection scriptConnection = new ScriptConnection();
		scriptConnection.setConnectionId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptConnection.ConnectionId"));
		scriptConnection.setTableName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptConnection.TableName"));
		scriptDetails.setScriptConnection(scriptConnection);

		List<ScriptErrorCode> scriptErrorCodesList = new ArrayList<ScriptErrorCode>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCodes.Length"); i++) {
			ScriptErrorCode scriptErrorCode = new ScriptErrorCode();
			scriptErrorCode.setErrorCode(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCodes["+ i +"].ErrorCode"));
			scriptErrorCode.setErrorMessage(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCodes["+ i +"].ErrorMessage"));
			scriptErrorCode.setErrorSolution(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCodes["+ i +"].ErrorSolution"));

			scriptErrorCodesList.add(scriptErrorCode);
		}
		scriptDetails.setScriptErrorCodes(scriptErrorCodesList);

		List<ScriptRequestParameter> scriptRequestParametersList = new ArrayList<ScriptRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters.Length"); i++) {
			ScriptRequestParameter scriptRequestParameter = new ScriptRequestParameter();
			scriptRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].DefaultValue"));
			scriptRequestParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ExampleValue"));
			scriptRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].IsRequiredParameter"));
			scriptRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterDataType"));
			scriptRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterDescription"));
			scriptRequestParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterName"));
			scriptRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterOperator"));
			scriptRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterPosition"));

			scriptRequestParametersList.add(scriptRequestParameter);
		}
		scriptDetails.setScriptRequestParameters(scriptRequestParametersList);

		List<ScriptResponseParameter> scriptResponseParametersList = new ArrayList<ScriptResponseParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters.Length"); i++) {
			ScriptResponseParameter scriptResponseParameter = new ScriptResponseParameter();
			scriptResponseParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ExampleValue"));
			scriptResponseParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterDataType"));
			scriptResponseParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterDescription"));
			scriptResponseParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterName"));

			scriptResponseParametersList.add(scriptResponseParameter);
		}
		scriptDetails.setScriptResponseParameters(scriptResponseParametersList);
		data.setScriptDetails(scriptDetails);

		WizardDetails wizardDetails = new WizardDetails();
		wizardDetails.setFailedResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.FailedResultSample"));
		wizardDetails.setIsPagedResponse(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.WizardDetails.IsPagedResponse"));
		wizardDetails.setSuccessfulResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.SuccessfulResultSample"));

		WizardConnection wizardConnection = new WizardConnection();
		wizardConnection.setConnectionId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardConnection.ConnectionId"));
		wizardConnection.setTableName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardConnection.TableName"));
		wizardDetails.setWizardConnection(wizardConnection);

		List<WizardErrorCode> wizardErrorCodesList = new ArrayList<WizardErrorCode>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCodes.Length"); i++) {
			WizardErrorCode wizardErrorCode = new WizardErrorCode();
			wizardErrorCode.setErrorCode(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCodes["+ i +"].ErrorCode"));
			wizardErrorCode.setErrorMessage(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCodes["+ i +"].ErrorMessage"));
			wizardErrorCode.setErrorSolution(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCodes["+ i +"].ErrorSolution"));

			wizardErrorCodesList.add(wizardErrorCode);
		}
		wizardDetails.setWizardErrorCodes(wizardErrorCodesList);

		List<WizardRequestParameter> wizardRequestParametersList = new ArrayList<WizardRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters.Length"); i++) {
			WizardRequestParameter wizardRequestParameter = new WizardRequestParameter();
			wizardRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].DefaultValue"));
			wizardRequestParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ExampleValue"));
			wizardRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].IsRequiredParameter"));
			wizardRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterDataType"));
			wizardRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterDescription"));
			wizardRequestParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterName"));
			wizardRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterOperator"));
			wizardRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterPosition"));

			wizardRequestParametersList.add(wizardRequestParameter);
		}
		wizardDetails.setWizardRequestParameters(wizardRequestParametersList);

		List<WizardResponseParameter> wizardResponseParametersList = new ArrayList<WizardResponseParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters.Length"); i++) {
			WizardResponseParameter wizardResponseParameter = new WizardResponseParameter();
			wizardResponseParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ExampleValue"));
			wizardResponseParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterDataType"));
			wizardResponseParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterDescription"));
			wizardResponseParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterName"));

			wizardResponseParametersList.add(wizardResponseParameter);
		}
		wizardDetails.setWizardResponseParameters(wizardResponseParametersList);
		data.setWizardDetails(wizardDetails);
		getDataServicePublishedApiResponse.setData(data);
	 
	 	return getDataServicePublishedApiResponse;
	}
}