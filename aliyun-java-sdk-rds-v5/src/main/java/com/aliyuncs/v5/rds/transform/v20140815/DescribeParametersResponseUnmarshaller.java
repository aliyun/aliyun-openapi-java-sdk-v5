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

package com.aliyuncs.v5.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.rds.model.v20140815.DescribeParametersResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeParametersResponse.DBInstanceParameter;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext _ctx) {
		
		describeParametersResponse.setRequestId(_ctx.stringValue("DescribeParametersResponse.RequestId"));
		describeParametersResponse.setEngine(_ctx.stringValue("DescribeParametersResponse.Engine"));
		describeParametersResponse.setEngineVersion(_ctx.stringValue("DescribeParametersResponse.EngineVersion"));

		List<DBInstanceParameter> configParametersList = new ArrayList<DBInstanceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.ConfigParameters.Length"); i++) {
			DBInstanceParameter dBInstanceParameter = new DBInstanceParameter();
			dBInstanceParameter.setParameterName(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterName"));
			dBInstanceParameter.setParameterValue(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterValue"));
			dBInstanceParameter.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterDescription"));

			configParametersList.add(dBInstanceParameter);
		}
		describeParametersResponse.setConfigParameters(configParametersList);

		List<DBInstanceParameter> runningParametersList = new ArrayList<DBInstanceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.RunningParameters.Length"); i++) {
			DBInstanceParameter dBInstanceParameter_ = new DBInstanceParameter();
			dBInstanceParameter_.setParameterName(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterName"));
			dBInstanceParameter_.setParameterValue(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterValue"));
			dBInstanceParameter_.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterDescription"));

			runningParametersList.add(dBInstanceParameter_);
		}
		describeParametersResponse.setRunningParameters(runningParametersList);
	 
	 	return describeParametersResponse;
	}
}