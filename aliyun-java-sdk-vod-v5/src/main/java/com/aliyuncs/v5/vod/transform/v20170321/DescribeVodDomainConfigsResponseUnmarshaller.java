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

package com.aliyuncs.v5.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.vod.model.v20170321.DescribeVodDomainConfigsResponse;
import com.aliyuncs.v5.vod.model.v20170321.DescribeVodDomainConfigsResponse.DomainConfig;
import com.aliyuncs.v5.vod.model.v20170321.DescribeVodDomainConfigsResponse.DomainConfig.FunctionArg;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeVodDomainConfigsResponseUnmarshaller {

	public static DescribeVodDomainConfigsResponse unmarshall(DescribeVodDomainConfigsResponse describeVodDomainConfigsResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainConfigsResponse.setRequestId(_ctx.stringValue("DescribeVodDomainConfigsResponse.RequestId"));

		List<DomainConfig> domainConfigsList = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setFunctionName(_ctx.stringValue("DescribeVodDomainConfigsResponse.DomainConfigs["+ i +"].FunctionName"));
			domainConfig.setConfigId(_ctx.stringValue("DescribeVodDomainConfigsResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setStatus(_ctx.stringValue("DescribeVodDomainConfigsResponse.DomainConfigs["+ i +"].Status"));

			List<FunctionArg> functionArgsList = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVodDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeVodDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeVodDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgsList.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgsList);

			domainConfigsList.add(domainConfig);
		}
		describeVodDomainConfigsResponse.setDomainConfigs(domainConfigsList);
	 
	 	return describeVodDomainConfigsResponse;
	}
}