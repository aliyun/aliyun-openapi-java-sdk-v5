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

import com.aliyuncs.v5.dataworks_public.model.v20200518.ListFileVersionsResponse;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListFileVersionsResponse.Data;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListFileVersionsResponse.Data.FileVersion;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListFileVersionsResponseUnmarshaller {

	public static ListFileVersionsResponse unmarshall(ListFileVersionsResponse listFileVersionsResponse, UnmarshallerContext _ctx) {
		
		listFileVersionsResponse.setRequestId(_ctx.stringValue("ListFileVersionsResponse.RequestId"));
		listFileVersionsResponse.setSuccess(_ctx.booleanValue("ListFileVersionsResponse.Success"));
		listFileVersionsResponse.setErrorCode(_ctx.stringValue("ListFileVersionsResponse.ErrorCode"));
		listFileVersionsResponse.setErrorMessage(_ctx.stringValue("ListFileVersionsResponse.ErrorMessage"));
		listFileVersionsResponse.setHttpStatusCode(_ctx.integerValue("ListFileVersionsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListFileVersionsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListFileVersionsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListFileVersionsResponse.Data.TotalCount"));

		List<FileVersion> fileVersionsList = new ArrayList<FileVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListFileVersionsResponse.Data.FileVersions.Length"); i++) {
			FileVersion fileVersion = new FileVersion();
			fileVersion.setFileVersion(_ctx.integerValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].FileVersion"));
			fileVersion.setFileContent(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].FileContent"));
			fileVersion.setCommitTime(_ctx.longValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].CommitTime"));
			fileVersion.setCommitUser(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].CommitUser"));
			fileVersion.setFileName(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].FileName"));
			fileVersion.setStatus(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].Status"));
			fileVersion.setChangeType(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].ChangeType"));
			fileVersion.setIsCurrentProd(_ctx.booleanValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].IsCurrentProd"));
			fileVersion.setNodeId(_ctx.longValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].NodeId"));
			fileVersion.setComment(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].Comment"));
			fileVersion.setNodeContent(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].NodeContent"));
			fileVersion.setFilePropertyContent(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].FilePropertyContent"));
			fileVersion.setUseType(_ctx.stringValue("ListFileVersionsResponse.Data.FileVersions["+ i +"].UseType"));

			fileVersionsList.add(fileVersion);
		}
		data.setFileVersions(fileVersionsList);
		listFileVersionsResponse.setData(data);
	 
	 	return listFileVersionsResponse;
	}
}