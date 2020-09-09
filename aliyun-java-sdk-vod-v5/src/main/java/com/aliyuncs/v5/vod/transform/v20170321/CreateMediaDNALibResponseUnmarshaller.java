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

import com.aliyuncs.v5.vod.model.v20170321.CreateMediaDNALibResponse;
import com.aliyuncs.v5.vod.model.v20170321.CreateMediaDNALibResponse.AIDNALibInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateMediaDNALibResponseUnmarshaller {

	public static CreateMediaDNALibResponse unmarshall(CreateMediaDNALibResponse createMediaDNALibResponse, UnmarshallerContext _ctx) {
		
		createMediaDNALibResponse.setRequestId(_ctx.stringValue("CreateMediaDNALibResponse.RequestId"));

		AIDNALibInfo aIDNALibInfo = new AIDNALibInfo();
		aIDNALibInfo.setFpDBId(_ctx.stringValue("CreateMediaDNALibResponse.AIDNALibInfo.FpDBId"));
		aIDNALibInfo.setModelType(_ctx.stringValue("CreateMediaDNALibResponse.AIDNALibInfo.ModelType"));
		aIDNALibInfo.setState(_ctx.stringValue("CreateMediaDNALibResponse.AIDNALibInfo.State"));
		createMediaDNALibResponse.setAIDNALibInfo(aIDNALibInfo);
	 
	 	return createMediaDNALibResponse;
	}
}