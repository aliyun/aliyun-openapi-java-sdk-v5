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

package com.aliyuncs.v5.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.rds.model.v20140815.DescribeCrossBackupMetaListResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeCrossBackupMetaListResponse.Meta;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeCrossBackupMetaListResponseUnmarshaller {

	public static DescribeCrossBackupMetaListResponse unmarshall(DescribeCrossBackupMetaListResponse describeCrossBackupMetaListResponse, UnmarshallerContext _ctx) {
		
		describeCrossBackupMetaListResponse.setRequestId(_ctx.stringValue("DescribeCrossBackupMetaListResponse.RequestId"));
		describeCrossBackupMetaListResponse.setDBInstanceName(_ctx.stringValue("DescribeCrossBackupMetaListResponse.DBInstanceName"));
		describeCrossBackupMetaListResponse.setPageNumber(_ctx.integerValue("DescribeCrossBackupMetaListResponse.PageNumber"));
		describeCrossBackupMetaListResponse.setPageRecordCount(_ctx.integerValue("DescribeCrossBackupMetaListResponse.PageRecordCount"));
		describeCrossBackupMetaListResponse.setTotalRecordCount(_ctx.integerValue("DescribeCrossBackupMetaListResponse.TotalRecordCount"));
		describeCrossBackupMetaListResponse.setTotalPageCount(_ctx.integerValue("DescribeCrossBackupMetaListResponse.TotalPageCount"));

		List<Meta> itemsList = new ArrayList<Meta>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossBackupMetaListResponse.Items.Length"); i++) {
			Meta meta = new Meta();
			meta.setDatabase(_ctx.stringValue("DescribeCrossBackupMetaListResponse.Items["+ i +"].Database"));
			meta.setTables(_ctx.stringValue("DescribeCrossBackupMetaListResponse.Items["+ i +"].Tables"));
			meta.setSize(_ctx.stringValue("DescribeCrossBackupMetaListResponse.Items["+ i +"].Size"));

			itemsList.add(meta);
		}
		describeCrossBackupMetaListResponse.setItems(itemsList);
	 
	 	return describeCrossBackupMetaListResponse;
	}
}