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

package com.aliyuncs.v5.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.market.model.v20151101.DescribeApplicationResponse;
import com.aliyuncs.v5.market.model.v20151101.DescribeApplicationResponse.Result;
import com.aliyuncs.v5.market.model.v20151101.DescribeApplicationResponse.Result.Properties;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeApplicationResponseUnmarshaller {

	public static DescribeApplicationResponse unmarshall(DescribeApplicationResponse describeApplicationResponse, UnmarshallerContext _ctx) {
		
		describeApplicationResponse.setRequestId(_ctx.stringValue("DescribeApplicationResponse.RequestId"));
		describeApplicationResponse.setSuccess(_ctx.booleanValue("DescribeApplicationResponse.Success"));

		Result result = new Result();
		result.setAppCode(_ctx.stringValue("DescribeApplicationResponse.Result.AppCode"));
		result.setAppType(_ctx.stringValue("DescribeApplicationResponse.Result.AppType"));
		result.setAppName(_ctx.stringValue("DescribeApplicationResponse.Result.AppName"));
		result.setAppTemplate(_ctx.stringValue("DescribeApplicationResponse.Result.AppTemplate"));
		result.setStatus(_ctx.stringValue("DescribeApplicationResponse.Result.Status"));
		result.setAuditStatus(_ctx.stringValue("DescribeApplicationResponse.Result.AuditStatus"));
		result.setGmtCreate(_ctx.longValue("DescribeApplicationResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("DescribeApplicationResponse.Result.GmtModified"));
		result.setSupplierAliUid(_ctx.longValue("DescribeApplicationResponse.Result.SupplierAliUid"));

		List<Properties> appPropertiesList = new ArrayList<Properties>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationResponse.Result.AppProperties.Length"); i++) {
			Properties properties = new Properties();
			properties.setFieldKey(_ctx.stringValue("DescribeApplicationResponse.Result.AppProperties["+ i +"].FieldKey"));
			properties.setFieldValue(_ctx.stringValue("DescribeApplicationResponse.Result.AppProperties["+ i +"].FieldValue"));

			appPropertiesList.add(properties);
		}
		result.setAppProperties(appPropertiesList);
		describeApplicationResponse.setResult(result);
	 
	 	return describeApplicationResponse;
	}
}