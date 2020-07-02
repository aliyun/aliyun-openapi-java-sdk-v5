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

import com.aliyuncs.v5.dataworks_public.model.v20200518.ListDataServiceApplicationsResponse;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListDataServiceApplicationsResponse.Data;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListDataServiceApplicationsResponse.Data.Application;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListDataServiceApplicationsResponseUnmarshaller {

	public static ListDataServiceApplicationsResponse unmarshall(ListDataServiceApplicationsResponse listDataServiceApplicationsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceApplicationsResponse.setRequestId(_ctx.stringValue("ListDataServiceApplicationsResponse.RequestId"));
		listDataServiceApplicationsResponse.setErrorCode(_ctx.stringValue("ListDataServiceApplicationsResponse.ErrorCode"));
		listDataServiceApplicationsResponse.setErrorMessage(_ctx.stringValue("ListDataServiceApplicationsResponse.ErrorMessage"));
		listDataServiceApplicationsResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceApplicationsResponse.HttpStatusCode"));
		listDataServiceApplicationsResponse.setSuccess(_ctx.booleanValue("ListDataServiceApplicationsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListDataServiceApplicationsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListDataServiceApplicationsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDataServiceApplicationsResponse.Data.TotalCount"));

		List<Application> applicationsList = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceApplicationsResponse.Data.Applications.Length"); i++) {
			Application application = new Application();
			application.setApplicationId(_ctx.longValue("ListDataServiceApplicationsResponse.Data.Applications["+ i +"].ApplicationId"));
			application.setApplicationName(_ctx.stringValue("ListDataServiceApplicationsResponse.Data.Applications["+ i +"].ApplicationName"));
			application.setProjectId(_ctx.longValue("ListDataServiceApplicationsResponse.Data.Applications["+ i +"].ProjectId"));

			applicationsList.add(application);
		}
		data.setApplications(applicationsList);
		listDataServiceApplicationsResponse.setData(data);
	 
	 	return listDataServiceApplicationsResponse;
	}
}