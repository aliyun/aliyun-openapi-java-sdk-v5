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

package com.aliyuncs.v5.cs.model.v20151215;

import com.aliyuncs.v5.RoaAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTemplateRequest extends RoaAcsRequest<UpdateTemplateResponse> {
	   

	private String templateId;
	public UpdateTemplateRequest() {
		super("CS", "2015-12-15", "UpdateTemplate");
		setUriPattern("/templates/[TemplateId]");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putPathParameter("TemplateId", templateId);
		}
	}

	@Override
	public Class<UpdateTemplateResponse> getResponseClass() {
		return UpdateTemplateResponse.class;
	}

}
