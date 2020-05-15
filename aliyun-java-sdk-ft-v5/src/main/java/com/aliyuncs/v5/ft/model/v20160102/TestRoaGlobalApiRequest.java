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

package com.aliyuncs.v5.ft.model.v20160102;

import com.aliyuncs.v5.RoaAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TestRoaGlobalApiRequest extends RoaAcsRequest<TestRoaGlobalApiResponse> {
	   

	private String queryParam;

	private String headerParam;

	private String pathParam;

	private String bodyParam;
	public TestRoaGlobalApiRequest() {
		super("Ft", "2016-01-02", "TestRoaGlobalApi", "ft", "innerAPI");
		setUriPattern("/web/getData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueryParam() {
		return this.queryParam;
	}

	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
		if(queryParam != null){
			putQueryParameter("queryParam", queryParam);
		}
	}

	public String getHeaderParam() {
		return this.headerParam;
	}

	public void setHeaderParam(String headerParam) {
		this.headerParam = headerParam;
		if(headerParam != null){
			putHeaderParameter("headerParam", headerParam);
		}
	}

	public String getPathParam() {
		return this.pathParam;
	}

	public void setPathParam(String pathParam) {
		this.pathParam = pathParam;
		if(pathParam != null){
			putPathParameter("pathParam", pathParam);
		}
	}

	public String getBodyParam() {
		return this.bodyParam;
	}

	public void setBodyParam(String bodyParam) {
		this.bodyParam = bodyParam;
		if(bodyParam != null){
			putBodyParameter("bodyParam", bodyParam);
		}
	}

	@Override
	public Class<TestRoaGlobalApiResponse> getResponseClass() {
		return TestRoaGlobalApiResponse.class;
	}

}
