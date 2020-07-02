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

package com.aliyuncs.v5.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dataworks_public.model.v20200518.ListDataServiceApiAuthoritiesResponse;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListDataServiceApiAuthoritiesResponse.Data;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorization;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorization.AuthorizationRecord;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListDataServiceApiAuthoritiesResponseUnmarshaller {

	public static ListDataServiceApiAuthoritiesResponse unmarshall(ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthoritiesResponse, UnmarshallerContext _ctx) {
		
		listDataServiceApiAuthoritiesResponse.setRequestId(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.RequestId"));
		listDataServiceApiAuthoritiesResponse.setErrorCode(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.ErrorCode"));
		listDataServiceApiAuthoritiesResponse.setErrorMessage(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.ErrorMessage"));
		listDataServiceApiAuthoritiesResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceApiAuthoritiesResponse.HttpStatusCode"));
		listDataServiceApiAuthoritiesResponse.setSuccess(_ctx.booleanValue("ListDataServiceApiAuthoritiesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListDataServiceApiAuthoritiesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListDataServiceApiAuthoritiesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDataServiceApiAuthoritiesResponse.Data.TotalCount"));

		List<ApiAuthorization> apiAuthorizationListList = new ArrayList<ApiAuthorization>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList.Length"); i++) {
			ApiAuthorization apiAuthorization = new ApiAuthorization();
			apiAuthorization.setApiId(_ctx.longValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].ApiId"));
			apiAuthorization.setApiName(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].ApiName"));
			apiAuthorization.setApiPath(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].ApiPath"));
			apiAuthorization.setApiStatus(_ctx.integerValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].ApiStatus"));
			apiAuthorization.setCreatedTime(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].CreatedTime"));
			apiAuthorization.setCreatorId(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].CreatorId"));
			apiAuthorization.setGroupId(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].GroupId"));
			apiAuthorization.setModifiedTime(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].ModifiedTime"));
			apiAuthorization.setProjectId(_ctx.longValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].ProjectId"));
			apiAuthorization.setTenantId(_ctx.longValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].TenantId"));

			List<AuthorizationRecord> authorizationRecordsList = new ArrayList<AuthorizationRecord>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].AuthorizationRecords.Length"); j++) {
				AuthorizationRecord authorizationRecord = new AuthorizationRecord();
				authorizationRecord.setCreatedTime(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].AuthorizationRecords["+ j +"].CreatedTime"));
				authorizationRecord.setCreatorId(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].AuthorizationRecords["+ j +"].CreatorId"));
				authorizationRecord.setEndTime(_ctx.stringValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].AuthorizationRecords["+ j +"].EndTime"));
				authorizationRecord.setProjectId(_ctx.longValue("ListDataServiceApiAuthoritiesResponse.Data.ApiAuthorizationList["+ i +"].AuthorizationRecords["+ j +"].ProjectId"));

				authorizationRecordsList.add(authorizationRecord);
			}
			apiAuthorization.setAuthorizationRecords(authorizationRecordsList);

			apiAuthorizationListList.add(apiAuthorization);
		}
		data.setApiAuthorizationList(apiAuthorizationListList);
		listDataServiceApiAuthoritiesResponse.setData(data);
	 
	 	return listDataServiceApiAuthoritiesResponse;
	}
}