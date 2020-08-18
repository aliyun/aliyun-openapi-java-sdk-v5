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

package com.aliyuncs.v5.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.rds.transform.v20140815.DescribeDBProxyPerformanceResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBProxyPerformanceResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String startTime;

	private String endTime;

	private List<PerformanceKey> performanceKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<PerformanceKey> getPerformanceKeys() {
		return this.performanceKeys;
	}

	public void setPerformanceKeys(List<PerformanceKey> performanceKeys) {
		this.performanceKeys = performanceKeys;
	}

	public static class PerformanceKey {

		private String key;

		private String valueFormat;

		private List<PerformanceValue> values;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValueFormat() {
			return this.valueFormat;
		}

		public void setValueFormat(String valueFormat) {
			this.valueFormat = valueFormat;
		}

		public List<PerformanceValue> getValues() {
			return this.values;
		}

		public void setValues(List<PerformanceValue> values) {
			this.values = values;
		}

		public static class PerformanceValue {

			private String value;

			private String date;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getDate() {
				return this.date;
			}

			public void setDate(String date) {
				this.date = date;
			}
		}
	}

	@Override
	public DescribeDBProxyPerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBProxyPerformanceResponseUnmarshaller.unmarshall(this, context);
	}
}
