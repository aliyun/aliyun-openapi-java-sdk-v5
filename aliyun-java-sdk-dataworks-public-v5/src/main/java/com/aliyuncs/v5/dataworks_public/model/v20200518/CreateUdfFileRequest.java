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

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUdfFileRequest extends RpcAcsRequest<CreateUdfFileResponse> {
	   

	private String returnValue;

	private String resources;

	private String functionType;

	private String cmdDescription;

	private String udfDescription;

	private String parameterDescription;

	private String projectIdentifier;

	private String example;

	private String fileName;

	private String className;

	private String fileFolderPath;

	private Long projectId;
	public CreateUdfFileRequest() {
		super("dataworks-public", "2020-05-18", "CreateUdfFile", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
		if(returnValue != null){
			putBodyParameter("ReturnValue", returnValue);
		}
	}

	public String getResources() {
		return this.resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
		if(resources != null){
			putBodyParameter("Resources", resources);
		}
	}

	public String getFunctionType() {
		return this.functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
		if(functionType != null){
			putBodyParameter("FunctionType", functionType);
		}
	}

	public String getCmdDescription() {
		return this.cmdDescription;
	}

	public void setCmdDescription(String cmdDescription) {
		this.cmdDescription = cmdDescription;
		if(cmdDescription != null){
			putBodyParameter("CmdDescription", cmdDescription);
		}
	}

	public String getUdfDescription() {
		return this.udfDescription;
	}

	public void setUdfDescription(String udfDescription) {
		this.udfDescription = udfDescription;
		if(udfDescription != null){
			putBodyParameter("UdfDescription", udfDescription);
		}
	}

	public String getParameterDescription() {
		return this.parameterDescription;
	}

	public void setParameterDescription(String parameterDescription) {
		this.parameterDescription = parameterDescription;
		if(parameterDescription != null){
			putBodyParameter("ParameterDescription", parameterDescription);
		}
	}

	public String getProjectIdentifier() {
		return this.projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
		if(projectIdentifier != null){
			putBodyParameter("ProjectIdentifier", projectIdentifier);
		}
	}

	public String getExample() {
		return this.example;
	}

	public void setExample(String example) {
		this.example = example;
		if(example != null){
			putBodyParameter("Example", example);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
		if(className != null){
			putBodyParameter("ClassName", className);
		}
	}

	public String getFileFolderPath() {
		return this.fileFolderPath;
	}

	public void setFileFolderPath(String fileFolderPath) {
		this.fileFolderPath = fileFolderPath;
		if(fileFolderPath != null){
			putBodyParameter("FileFolderPath", fileFolderPath);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	@Override
	public Class<CreateUdfFileResponse> getResponseClass() {
		return CreateUdfFileResponse.class;
	}

}
