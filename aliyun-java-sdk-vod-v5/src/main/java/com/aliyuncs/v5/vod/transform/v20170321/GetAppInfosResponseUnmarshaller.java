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

import com.aliyuncs.v5.vod.model.v20170321.GetAppInfosResponse;
import com.aliyuncs.v5.vod.model.v20170321.GetAppInfosResponse.AppInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetAppInfosResponseUnmarshaller {

	public static GetAppInfosResponse unmarshall(GetAppInfosResponse getAppInfosResponse, UnmarshallerContext _ctx) {
		
		getAppInfosResponse.setRequestId(_ctx.stringValue("GetAppInfosResponse.RequestId"));

		List<String> nonExistAppIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInfosResponse.NonExistAppIds.Length"); i++) {
			nonExistAppIds.add(_ctx.stringValue("GetAppInfosResponse.NonExistAppIds["+ i +"]"));
		}
		getAppInfosResponse.setNonExistAppIds(nonExistAppIds);

		List<AppInfo> appInfoListList = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInfosResponse.AppInfoList.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setAppId(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].AppId"));
			appInfo.setAppName(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].AppName"));
			appInfo.setType(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Type"));
			appInfo.setDescription(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Description"));
			appInfo.setStatus(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Status"));
			appInfo.setCreationTime(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].CreationTime"));
			appInfo.setModificationTime(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].ModificationTime"));

			appInfoListList.add(appInfo);
		}
		getAppInfosResponse.setAppInfoList(appInfoListList);
	 
	 	return getAppInfosResponse;
	}
}