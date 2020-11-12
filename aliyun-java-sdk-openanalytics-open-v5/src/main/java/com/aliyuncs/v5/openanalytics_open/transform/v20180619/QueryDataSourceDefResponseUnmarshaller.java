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

package com.aliyuncs.v5.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.openanalytics_open.model.v20180619.QueryDataSourceDefResponse;
import com.aliyuncs.v5.openanalytics_open.model.v20180619.QueryDataSourceDefResponse.RegionListItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryDataSourceDefResponseUnmarshaller {

	public static QueryDataSourceDefResponse unmarshall(QueryDataSourceDefResponse queryDataSourceDefResponse, UnmarshallerContext _ctx) {
		
		queryDataSourceDefResponse.setRequestId(_ctx.stringValue("QueryDataSourceDefResponse.RequestId"));
		queryDataSourceDefResponse.setRegionId(_ctx.stringValue("QueryDataSourceDefResponse.RegionId"));

		List<RegionListItem> regionListList = new ArrayList<RegionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDataSourceDefResponse.RegionList.Length"); i++) {
			RegionListItem regionListItem = new RegionListItem();
			regionListItem.setDataSourceName(_ctx.stringValue("QueryDataSourceDefResponse.RegionList["+ i +"].dataSourceName"));
			regionListItem.setRoleArn(_ctx.stringValue("QueryDataSourceDefResponse.RegionList["+ i +"].roleArn"));
			regionListItem.setAuthorizedURL(_ctx.stringValue("QueryDataSourceDefResponse.RegionList["+ i +"].authorizedURL"));

			regionListList.add(regionListItem);
		}
		queryDataSourceDefResponse.setRegionList(regionListList);
	 
	 	return queryDataSourceDefResponse;
	}
}