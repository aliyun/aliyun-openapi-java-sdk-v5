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

package com.aliyuncs.v5.drds.model.v20150413;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ProductInfoComplementRequest extends RpcAcsRequest<ProductInfoComplementResponse> {
	   

	private String gender;

	private String name;
	public ProductInfoComplementRequest() {
		super("Drds", "2015-04-13", "ProductInfoComplement", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		if(gender != null){
			putQueryParameter("gender", gender);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	@Override
	public Class<ProductInfoComplementResponse> getResponseClass() {
		return ProductInfoComplementResponse.class;
	}

}
