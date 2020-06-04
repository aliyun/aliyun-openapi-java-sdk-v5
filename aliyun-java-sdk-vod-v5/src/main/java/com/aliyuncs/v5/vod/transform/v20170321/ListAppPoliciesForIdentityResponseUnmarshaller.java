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

import com.aliyuncs.v5.vod.model.v20170321.ListAppPoliciesForIdentityResponse;
import com.aliyuncs.v5.vod.model.v20170321.ListAppPoliciesForIdentityResponse.AppPolicy;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListAppPoliciesForIdentityResponseUnmarshaller {

	public static ListAppPoliciesForIdentityResponse unmarshall(ListAppPoliciesForIdentityResponse listAppPoliciesForIdentityResponse, UnmarshallerContext _ctx) {
		
		listAppPoliciesForIdentityResponse.setRequestId(_ctx.stringValue("ListAppPoliciesForIdentityResponse.RequestId"));

		List<AppPolicy> appPolicyListList = new ArrayList<AppPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListAppPoliciesForIdentityResponse.AppPolicyList.Length"); i++) {
			AppPolicy appPolicy = new AppPolicy();
			appPolicy.setAppId(_ctx.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].AppId"));
			appPolicy.setCreationTime(_ctx.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].CreationTime"));
			appPolicy.setPolicyName(_ctx.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].PolicyName"));
			appPolicy.setPolicyType(_ctx.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].PolicyType"));
			appPolicy.setPolicyValue(_ctx.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].PolicyValue"));
			appPolicy.setDescription(_ctx.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].Description"));
			appPolicy.setModificationTime(_ctx.stringValue("ListAppPoliciesForIdentityResponse.AppPolicyList["+ i +"].ModificationTime"));

			appPolicyListList.add(appPolicy);
		}
		listAppPoliciesForIdentityResponse.setAppPolicyList(appPolicyListList);
	 
	 	return listAppPoliciesForIdentityResponse;
	}
}