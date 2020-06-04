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

import com.aliyuncs.v5.vod.model.v20170321.CreateUploadAttachedMediaResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateUploadAttachedMediaResponseUnmarshaller {

	public static CreateUploadAttachedMediaResponse unmarshall(CreateUploadAttachedMediaResponse createUploadAttachedMediaResponse, UnmarshallerContext _ctx) {
		
		createUploadAttachedMediaResponse.setRequestId(_ctx.stringValue("CreateUploadAttachedMediaResponse.RequestId"));
		createUploadAttachedMediaResponse.setMediaId(_ctx.stringValue("CreateUploadAttachedMediaResponse.MediaId"));
		createUploadAttachedMediaResponse.setMediaURL(_ctx.stringValue("CreateUploadAttachedMediaResponse.MediaURL"));
		createUploadAttachedMediaResponse.setUploadAddress(_ctx.stringValue("CreateUploadAttachedMediaResponse.UploadAddress"));
		createUploadAttachedMediaResponse.setUploadAuth(_ctx.stringValue("CreateUploadAttachedMediaResponse.UploadAuth"));
		createUploadAttachedMediaResponse.setFileURL(_ctx.stringValue("CreateUploadAttachedMediaResponse.FileURL"));
	 
	 	return createUploadAttachedMediaResponse;
	}
}