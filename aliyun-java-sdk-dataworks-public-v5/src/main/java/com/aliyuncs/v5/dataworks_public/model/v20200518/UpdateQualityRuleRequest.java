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
public class UpdateQualityRuleRequest extends RpcAcsRequest<UpdateQualityRuleResponse> {
	   

	private String trend;

	private Integer blockType;

	private String propertyType;

	private Long entityId;

	private String ruleName;

	private Integer checker;

	private String operator;

	private String property;

	private Long id;

	private String warningThreshold;

	private String methodName;

	private String projectName;

	private Integer ruleType;

	private Integer templateId;

	private String expectValue;

	private String whereCondition;

	private String criticalThreshold;

	private String comment;

	private Integer predictType;
	public UpdateQualityRuleRequest() {
		super("dataworks-public", "2020-05-18", "UpdateQualityRule", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTrend() {
		return this.trend;
	}

	public void setTrend(String trend) {
		this.trend = trend;
		if(trend != null){
			putBodyParameter("Trend", trend);
		}
	}

	public Integer getBlockType() {
		return this.blockType;
	}

	public void setBlockType(Integer blockType) {
		this.blockType = blockType;
		if(blockType != null){
			putBodyParameter("BlockType", blockType.toString());
		}
	}

	public String getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
		if(propertyType != null){
			putBodyParameter("PropertyType", propertyType);
		}
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId.toString());
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putBodyParameter("RuleName", ruleName);
		}
	}

	public Integer getChecker() {
		return this.checker;
	}

	public void setChecker(Integer checker) {
		this.checker = checker;
		if(checker != null){
			putBodyParameter("Checker", checker.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
		if(property != null){
			putBodyParameter("Property", property);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getWarningThreshold() {
		return this.warningThreshold;
	}

	public void setWarningThreshold(String warningThreshold) {
		this.warningThreshold = warningThreshold;
		if(warningThreshold != null){
			putBodyParameter("WarningThreshold", warningThreshold);
		}
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
		if(methodName != null){
			putBodyParameter("MethodName", methodName);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public Integer getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putBodyParameter("RuleType", ruleType.toString());
		}
	}

	public Integer getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	public String getExpectValue() {
		return this.expectValue;
	}

	public void setExpectValue(String expectValue) {
		this.expectValue = expectValue;
		if(expectValue != null){
			putBodyParameter("ExpectValue", expectValue);
		}
	}

	public String getWhereCondition() {
		return this.whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
		if(whereCondition != null){
			putBodyParameter("WhereCondition", whereCondition);
		}
	}

	public String getCriticalThreshold() {
		return this.criticalThreshold;
	}

	public void setCriticalThreshold(String criticalThreshold) {
		this.criticalThreshold = criticalThreshold;
		if(criticalThreshold != null){
			putBodyParameter("CriticalThreshold", criticalThreshold);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putBodyParameter("Comment", comment);
		}
	}

	public Integer getPredictType() {
		return this.predictType;
	}

	public void setPredictType(Integer predictType) {
		this.predictType = predictType;
		if(predictType != null){
			putBodyParameter("PredictType", predictType.toString());
		}
	}

	@Override
	public Class<UpdateQualityRuleResponse> getResponseClass() {
		return UpdateQualityRuleResponse.class;
	}

}
