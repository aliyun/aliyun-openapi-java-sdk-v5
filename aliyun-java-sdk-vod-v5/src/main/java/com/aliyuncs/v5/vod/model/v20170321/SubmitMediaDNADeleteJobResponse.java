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
import com.aliyuncs.v5.vod.transform.v20170321.SubmitMediaDNADeleteJobResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitMediaDNADeleteJobResponse extends AcsResponse {

	private String requestId;

	private String mediaId;

	private String jobId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	@Override
	public SubmitMediaDNADeleteJobResponse getInstance(UnmarshallerContext context) {
		return	SubmitMediaDNADeleteJobResponseUnmarshaller.unmarshall(this, context);
	}
}
