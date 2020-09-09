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
import com.aliyuncs.v5.vod.transform.v20170321.CreateMediaDNALibResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMediaDNALibResponse extends AcsResponse {

	private String requestId;

	private AIDNALibInfo aIDNALibInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AIDNALibInfo getAIDNALibInfo() {
		return this.aIDNALibInfo;
	}

	public void setAIDNALibInfo(AIDNALibInfo aIDNALibInfo) {
		this.aIDNALibInfo = aIDNALibInfo;
	}

	public static class AIDNALibInfo {

		private String fpDBId;

		private String modelType;

		private String state;

		public String getFpDBId() {
			return this.fpDBId;
		}

		public void setFpDBId(String fpDBId) {
			this.fpDBId = fpDBId;
		}

		public String getModelType() {
			return this.modelType;
		}

		public void setModelType(String modelType) {
			this.modelType = modelType;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public CreateMediaDNALibResponse getInstance(UnmarshallerContext context) {
		return	CreateMediaDNALibResponseUnmarshaller.unmarshall(this, context);
	}
}
