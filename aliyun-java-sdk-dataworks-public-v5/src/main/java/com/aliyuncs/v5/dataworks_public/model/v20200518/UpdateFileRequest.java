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
public class UpdateFileRequest extends RpcAcsRequest<UpdateFileResponse> {
	   

	private String outputList;

	private String dependentNodeIdList;

	private String content;

	private String projectIdentifier;

	private Long projectId;

	private Long startEffectDate;

	private String cycleType;

	private Long fileId;

	private Integer autoRerunIntervalMillis;

	private String inputList;

	private String rerunMode;

	private String paraValue;

	private Integer autoRerunTimes;

	private String cronExpress;

	private Long endEffectDate;

	private String fileName;

	private Boolean stop;

	private String dependentType;

	private String fileFolderPath;

	private String fileDescription;
	public UpdateFileRequest() {
		super("dataworks-public", "2020-05-18", "UpdateFile", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutputList() {
		return this.outputList;
	}

	public void setOutputList(String outputList) {
		this.outputList = outputList;
		if(outputList != null){
			putBodyParameter("OutputList", outputList);
		}
	}

	public String getDependentNodeIdList() {
		return this.dependentNodeIdList;
	}

	public void setDependentNodeIdList(String dependentNodeIdList) {
		this.dependentNodeIdList = dependentNodeIdList;
		if(dependentNodeIdList != null){
			putBodyParameter("DependentNodeIdList", dependentNodeIdList);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
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

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public Long getStartEffectDate() {
		return this.startEffectDate;
	}

	public void setStartEffectDate(Long startEffectDate) {
		this.startEffectDate = startEffectDate;
		if(startEffectDate != null){
			putBodyParameter("StartEffectDate", startEffectDate.toString());
		}
	}

	public String getCycleType() {
		return this.cycleType;
	}

	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
		if(cycleType != null){
			putBodyParameter("CycleType", cycleType);
		}
	}

	public Long getFileId() {
		return this.fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
		if(fileId != null){
			putBodyParameter("FileId", fileId.toString());
		}
	}

	public Integer getAutoRerunIntervalMillis() {
		return this.autoRerunIntervalMillis;
	}

	public void setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
		this.autoRerunIntervalMillis = autoRerunIntervalMillis;
		if(autoRerunIntervalMillis != null){
			putBodyParameter("AutoRerunIntervalMillis", autoRerunIntervalMillis.toString());
		}
	}

	public String getInputList() {
		return this.inputList;
	}

	public void setInputList(String inputList) {
		this.inputList = inputList;
		if(inputList != null){
			putBodyParameter("InputList", inputList);
		}
	}

	public String getRerunMode() {
		return this.rerunMode;
	}

	public void setRerunMode(String rerunMode) {
		this.rerunMode = rerunMode;
		if(rerunMode != null){
			putBodyParameter("RerunMode", rerunMode);
		}
	}

	public String getParaValue() {
		return this.paraValue;
	}

	public void setParaValue(String paraValue) {
		this.paraValue = paraValue;
		if(paraValue != null){
			putBodyParameter("ParaValue", paraValue);
		}
	}

	public Integer getAutoRerunTimes() {
		return this.autoRerunTimes;
	}

	public void setAutoRerunTimes(Integer autoRerunTimes) {
		this.autoRerunTimes = autoRerunTimes;
		if(autoRerunTimes != null){
			putBodyParameter("AutoRerunTimes", autoRerunTimes.toString());
		}
	}

	public String getCronExpress() {
		return this.cronExpress;
	}

	public void setCronExpress(String cronExpress) {
		this.cronExpress = cronExpress;
		if(cronExpress != null){
			putBodyParameter("CronExpress", cronExpress);
		}
	}

	public Long getEndEffectDate() {
		return this.endEffectDate;
	}

	public void setEndEffectDate(Long endEffectDate) {
		this.endEffectDate = endEffectDate;
		if(endEffectDate != null){
			putBodyParameter("EndEffectDate", endEffectDate.toString());
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

	public Boolean getStop() {
		return this.stop;
	}

	public void setStop(Boolean stop) {
		this.stop = stop;
		if(stop != null){
			putBodyParameter("Stop", stop.toString());
		}
	}

	public String getDependentType() {
		return this.dependentType;
	}

	public void setDependentType(String dependentType) {
		this.dependentType = dependentType;
		if(dependentType != null){
			putBodyParameter("DependentType", dependentType);
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

	public String getFileDescription() {
		return this.fileDescription;
	}

	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
		if(fileDescription != null){
			putBodyParameter("FileDescription", fileDescription);
		}
	}

	@Override
	public Class<UpdateFileResponse> getResponseClass() {
		return UpdateFileResponse.class;
	}

}
