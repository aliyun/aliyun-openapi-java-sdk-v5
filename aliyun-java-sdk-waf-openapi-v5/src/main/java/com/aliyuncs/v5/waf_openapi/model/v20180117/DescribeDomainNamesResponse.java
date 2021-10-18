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

package com.aliyuncs.v5.waf_openapi.model.v20180117;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.waf_openapi.transform.v20180117.DescribeDomainNamesResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainNamesResponse extends AcsResponse {

	private String requestId;

	private List<String> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getResult() {
		return this.result;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}

	@Override
	public DescribeDomainNamesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainNamesResponseUnmarshaller.unmarshall(this, context);
	}
}
