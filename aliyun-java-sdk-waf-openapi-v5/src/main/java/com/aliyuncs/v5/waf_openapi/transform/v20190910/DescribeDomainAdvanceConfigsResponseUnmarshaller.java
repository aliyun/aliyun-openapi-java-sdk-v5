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

package com.aliyuncs.v5.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.waf_openapi.model.v20190910.DescribeDomainAdvanceConfigsResponse;
import com.aliyuncs.v5.waf_openapi.model.v20190910.DescribeDomainAdvanceConfigsResponse.DomainConfig;
import com.aliyuncs.v5.waf_openapi.model.v20190910.DescribeDomainAdvanceConfigsResponse.DomainConfig.Profile;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDomainAdvanceConfigsResponseUnmarshaller {

	public static DescribeDomainAdvanceConfigsResponse unmarshall(DescribeDomainAdvanceConfigsResponse describeDomainAdvanceConfigsResponse, UnmarshallerContext _ctx) {
		
		describeDomainAdvanceConfigsResponse.setRequestId(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.RequestId"));

		List<DomainConfig> domainConfigsList = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setDomain(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Domain"));

			Profile profile = new Profile();
			profile.setIpv6Status(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Ipv6Status"));
			profile.setGSLBStatus(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.GSLBStatus"));
			profile.setVipServiceStatus(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.VipServiceStatus"));
			profile.setClusterType(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.ClusterType"));
			profile.setExclusiveVipStatus(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.ExclusiveVipStatus"));
			profile.setCname(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Cname"));
			profile.setCertStatus(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.CertStatus"));
			profile.setResolvedType(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.ResolvedType"));

			List<Integer> http2Port = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Http2Port.Length"); j++) {
				http2Port.add(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Http2Port["+ j +"]"));
			}
			profile.setHttp2Port(http2Port);

			List<Integer> httpPort = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.HttpPort.Length"); j++) {
				httpPort.add(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.HttpPort["+ j +"]"));
			}
			profile.setHttpPort(httpPort);

			List<String> rs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Rs.Length"); j++) {
				rs.add(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Rs["+ j +"]"));
			}
			profile.setRs(rs);

			List<Integer> httpsPort = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.HttpsPort.Length"); j++) {
				httpsPort.add(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.HttpsPort["+ j +"]"));
			}
			profile.setHttpsPort(httpsPort);
			domainConfig.setProfile(profile);

			domainConfigsList.add(domainConfig);
		}
		describeDomainAdvanceConfigsResponse.setDomainConfigs(domainConfigsList);
	 
	 	return describeDomainAdvanceConfigsResponse;
	}
}