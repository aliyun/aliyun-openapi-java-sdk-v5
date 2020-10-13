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

package com.aliyuncs.v5.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.iot.model.v20180120.BatchGetEdgeInstanceDriverConfigsResponse;
import com.aliyuncs.v5.iot.model.v20180120.BatchGetEdgeInstanceDriverConfigsResponse.DriverConfig;
import com.aliyuncs.v5.iot.model.v20180120.BatchGetEdgeInstanceDriverConfigsResponse.DriverConfig.Config;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class BatchGetEdgeInstanceDriverConfigsResponseUnmarshaller {

	public static BatchGetEdgeInstanceDriverConfigsResponse unmarshall(BatchGetEdgeInstanceDriverConfigsResponse batchGetEdgeInstanceDriverConfigsResponse, UnmarshallerContext _ctx) {
		
		batchGetEdgeInstanceDriverConfigsResponse.setRequestId(_ctx.stringValue("BatchGetEdgeInstanceDriverConfigsResponse.RequestId"));
		batchGetEdgeInstanceDriverConfigsResponse.setSuccess(_ctx.booleanValue("BatchGetEdgeInstanceDriverConfigsResponse.Success"));
		batchGetEdgeInstanceDriverConfigsResponse.setCode(_ctx.stringValue("BatchGetEdgeInstanceDriverConfigsResponse.Code"));
		batchGetEdgeInstanceDriverConfigsResponse.setErrorMessage(_ctx.stringValue("BatchGetEdgeInstanceDriverConfigsResponse.ErrorMessage"));

		List<DriverConfig> driverConfigListList = new ArrayList<DriverConfig>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetEdgeInstanceDriverConfigsResponse.DriverConfigList.Length"); i++) {
			DriverConfig driverConfig = new DriverConfig();
			driverConfig.setDriverId(_ctx.stringValue("BatchGetEdgeInstanceDriverConfigsResponse.DriverConfigList["+ i +"].DriverId"));

			List<Config> configListList = new ArrayList<Config>();
			for (int j = 0; j < _ctx.lengthValue("BatchGetEdgeInstanceDriverConfigsResponse.DriverConfigList["+ i +"].ConfigList.Length"); j++) {
				Config config = new Config();
				config.setConfigId(_ctx.stringValue("BatchGetEdgeInstanceDriverConfigsResponse.DriverConfigList["+ i +"].ConfigList["+ j +"].ConfigId"));
				config.setFormat(_ctx.stringValue("BatchGetEdgeInstanceDriverConfigsResponse.DriverConfigList["+ i +"].ConfigList["+ j +"].Format"));
				config.setContent(_ctx.stringValue("BatchGetEdgeInstanceDriverConfigsResponse.DriverConfigList["+ i +"].ConfigList["+ j +"].Content"));
				config.setKey(_ctx.stringValue("BatchGetEdgeInstanceDriverConfigsResponse.DriverConfigList["+ i +"].ConfigList["+ j +"].Key"));

				configListList.add(config);
			}
			driverConfig.setConfigList(configListList);

			driverConfigListList.add(driverConfig);
		}
		batchGetEdgeInstanceDriverConfigsResponse.setDriverConfigList(driverConfigListList);
	 
	 	return batchGetEdgeInstanceDriverConfigsResponse;
	}
}