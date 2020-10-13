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

package com.aliyuncs.v5.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.iot.transform.v20180120.QueryDevicePropertyDataResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDevicePropertyDataResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean nextValid;

		private Long nextTime;

		private List<PropertyInfo> list;

		public Boolean getNextValid() {
			return this.nextValid;
		}

		public void setNextValid(Boolean nextValid) {
			this.nextValid = nextValid;
		}

		public Long getNextTime() {
			return this.nextTime;
		}

		public void setNextTime(Long nextTime) {
			this.nextTime = nextTime;
		}

		public List<PropertyInfo> getList() {
			return this.list;
		}

		public void setList(List<PropertyInfo> list) {
			this.list = list;
		}

		public static class PropertyInfo {

			private String time;

			private String value;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public QueryDevicePropertyDataResponse getInstance(UnmarshallerContext context) {
		return	QueryDevicePropertyDataResponseUnmarshaller.unmarshall(this, context);
	}
}
