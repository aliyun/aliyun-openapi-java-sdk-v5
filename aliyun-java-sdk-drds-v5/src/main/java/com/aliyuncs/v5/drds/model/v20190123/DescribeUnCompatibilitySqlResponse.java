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

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.drds.transform.v20190123.DescribeUnCompatibilitySqlResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUnCompatibilitySqlResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<String> errorSqls;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<String> getErrorSqls() {
		return this.errorSqls;
	}

	public void setErrorSqls(List<String> errorSqls) {
		this.errorSqls = errorSqls;
	}

	@Override
	public DescribeUnCompatibilitySqlResponse getInstance(UnmarshallerContext context) {
		return	DescribeUnCompatibilitySqlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
