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

package com.aliyuncs.v5.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.domain.model.v20180129.QueryDomainSuffixResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryDomainSuffixResponseUnmarshaller {

	public static QueryDomainSuffixResponse unmarshall(QueryDomainSuffixResponse queryDomainSuffixResponse, UnmarshallerContext _ctx) {
		
		queryDomainSuffixResponse.setRequestId(_ctx.stringValue("QueryDomainSuffixResponse.RequestId"));

		List<String> suffixList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainSuffixResponse.SuffixList.Length"); i++) {
			suffixList.add(_ctx.stringValue("QueryDomainSuffixResponse.SuffixList["+ i +"]"));
		}
		queryDomainSuffixResponse.setSuffixList(suffixList);
	 
	 	return queryDomainSuffixResponse;
	}
}