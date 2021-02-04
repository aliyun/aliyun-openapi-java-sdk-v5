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

package com.aliyuncs.v5.safconsole.model.v20210112;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendFeedbackRequest extends RpcAcsRequest<SendFeedbackResponse> {
	   

	private String riskLabel;

	private String sampleType;

	private String value;
	public SendFeedbackRequest() {
		super("safconsole", "2021-01-12", "SendFeedback", "saf");
		setMethod(MethodType.POST);
	}

	public String getRiskLabel() {
		return this.riskLabel;
	}

	public void setRiskLabel(String riskLabel) {
		this.riskLabel = riskLabel;
		if(riskLabel != null){
			putQueryParameter("RiskLabel", riskLabel);
		}
	}

	public String getSampleType() {
		return this.sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
		if(sampleType != null){
			putQueryParameter("SampleType", sampleType);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
	}

	@Override
	public Class<SendFeedbackResponse> getResponseClass() {
		return SendFeedbackResponse.class;
	}

}
