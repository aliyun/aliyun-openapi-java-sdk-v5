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

package com.aliyuncs.v5.polardbx.transform.v20200202;

import com.aliyuncs.v5.polardbx.model.v20200202.DescribeDBInstanceConfigResponse;
import com.aliyuncs.v5.polardbx.model.v20200202.DescribeDBInstanceConfigResponse.Data;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDBInstanceConfigResponseUnmarshaller {

	public static DescribeDBInstanceConfigResponse unmarshall(DescribeDBInstanceConfigResponse describeDBInstanceConfigResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceConfigResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceConfigResponse.RequestId"));

		Data data = new Data();
		data.setDbInstanceName(_ctx.stringValue("DescribeDBInstanceConfigResponse.Data.DbInstanceName"));
		data.setConfigValue(_ctx.stringValue("DescribeDBInstanceConfigResponse.Data.ConfigValue"));
		data.setConfigName(_ctx.stringValue("DescribeDBInstanceConfigResponse.Data.ConfigName"));
		describeDBInstanceConfigResponse.setData(data);
	 
	 	return describeDBInstanceConfigResponse;
	}
}