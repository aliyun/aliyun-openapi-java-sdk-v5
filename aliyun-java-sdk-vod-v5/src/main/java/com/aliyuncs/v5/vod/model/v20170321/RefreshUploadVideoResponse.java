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

package com.aliyuncs.v5.vod.model.v20170321;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.vod.transform.v20170321.RefreshUploadVideoResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RefreshUploadVideoResponse extends AcsResponse {

	private String requestId;

	private String uploadAuth;

	private String uploadAddress;

	private String videoId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUploadAuth() {
		return this.uploadAuth;
	}

	public void setUploadAuth(String uploadAuth) {
		this.uploadAuth = uploadAuth;
	}

	public String getUploadAddress() {
		return this.uploadAddress;
	}

	public void setUploadAddress(String uploadAddress) {
		this.uploadAddress = uploadAddress;
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	@Override
	public RefreshUploadVideoResponse getInstance(UnmarshallerContext context) {
		return	RefreshUploadVideoResponseUnmarshaller.unmarshall(this, context);
	}
}
