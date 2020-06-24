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

import com.aliyuncs.v5.domain.model.v20180129.SaveSingleTaskForUpdatingContactInfoResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SaveSingleTaskForUpdatingContactInfoResponseUnmarshaller {

	public static SaveSingleTaskForUpdatingContactInfoResponse unmarshall(SaveSingleTaskForUpdatingContactInfoResponse saveSingleTaskForUpdatingContactInfoResponse, UnmarshallerContext _ctx) {
		
		saveSingleTaskForUpdatingContactInfoResponse.setRequestId(_ctx.stringValue("SaveSingleTaskForUpdatingContactInfoResponse.RequestId"));
		saveSingleTaskForUpdatingContactInfoResponse.setTaskNo(_ctx.stringValue("SaveSingleTaskForUpdatingContactInfoResponse.TaskNo"));
	 
	 	return saveSingleTaskForUpdatingContactInfoResponse;
	}
}