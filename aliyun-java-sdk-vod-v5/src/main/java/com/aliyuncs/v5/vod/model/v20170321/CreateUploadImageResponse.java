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
import com.aliyuncs.v5.vod.transform.v20170321.CreateUploadImageResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUploadImageResponse extends AcsResponse {

	private String requestId;

	private String imageId;

	private String imageURL;

	private String uploadAddress;

	private String uploadAuth;

	private String fileURL;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getUploadAddress() {
		return this.uploadAddress;
	}

	public void setUploadAddress(String uploadAddress) {
		this.uploadAddress = uploadAddress;
	}

	public String getUploadAuth() {
		return this.uploadAuth;
	}

	public void setUploadAuth(String uploadAuth) {
		this.uploadAuth = uploadAuth;
	}

	public String getFileURL() {
		return this.fileURL;
	}

	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
	}

	@Override
	public CreateUploadImageResponse getInstance(UnmarshallerContext context) {
		return	CreateUploadImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
