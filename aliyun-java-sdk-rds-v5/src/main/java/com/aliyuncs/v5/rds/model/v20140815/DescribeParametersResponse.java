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
import com.aliyuncs.v5.rds.transform.v20140815.DescribeParametersResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParametersResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private String engineVersion;

	private List<DBInstanceParameter> configParameters;

	private List<DBInstanceParameter> runningParameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public List<DBInstanceParameter> getConfigParameters() {
		return this.configParameters;
	}

	public void setConfigParameters(List<DBInstanceParameter> configParameters) {
		this.configParameters = configParameters;
	}

	public List<DBInstanceParameter> getRunningParameters() {
		return this.runningParameters;
	}

	public void setRunningParameters(List<DBInstanceParameter> runningParameters) {
		this.runningParameters = runningParameters;
	}

	public static class DBInstanceParameter {

		private String parameterName;

		private String parameterValue;

		private String parameterDescription;

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}
	}

	@Override
	public DescribeParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeParametersResponseUnmarshaller.unmarshall(this, context);
	}
}
