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

package com.aliyuncs.v5.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.polardbx.transform.v20200202.CreatePolarxInstanceResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatePolarxInstanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long orderId;

		private List<String> drdsInstanceIdList;

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public List<String> getDrdsInstanceIdList() {
			return this.drdsInstanceIdList;
		}

		public void setDrdsInstanceIdList(List<String> drdsInstanceIdList) {
			this.drdsInstanceIdList = drdsInstanceIdList;
		}
	}

	@Override
	public CreatePolarxInstanceResponse getInstance(UnmarshallerContext context) {
		return	CreatePolarxInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
