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

package com.aliyuncs.v5.drds.model.v20190123;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTagResourcesRequest extends RpcAcsRequest<ListTagResourcesResponse> {
	   

	private List<String> resourceId;

	private String resourceType;

	private String nextToken;

	private List<Tag> tag;
	public ListTagResourcesRequest() {
		super("Drds", "2019-01-23", "ListTagResources", "drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(List<String> resourceId) {
		this.resourceId = resourceId;	
		if (resourceId != null) {
			for (int i = 0; i < resourceId.size(); i++) {
				putQueryParameter("ResourceId." + (i + 1) , resourceId.get(i));
			}
		}	
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
			}
		}	
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListTagResourcesResponse> getResponseClass() {
		return ListTagResourcesResponse.class;
	}

}
