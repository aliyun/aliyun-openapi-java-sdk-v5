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

import com.aliyuncs.v5.vod.model.v20170321.SubmitTranscodeJobsResponse;
import com.aliyuncs.v5.vod.model.v20170321.SubmitTranscodeJobsResponse.TranscodeJob;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SubmitTranscodeJobsResponseUnmarshaller {

	public static SubmitTranscodeJobsResponse unmarshall(SubmitTranscodeJobsResponse submitTranscodeJobsResponse, UnmarshallerContext _ctx) {
		
		submitTranscodeJobsResponse.setRequestId(_ctx.stringValue("SubmitTranscodeJobsResponse.RequestId"));
		submitTranscodeJobsResponse.setTranscodeTaskId(_ctx.stringValue("SubmitTranscodeJobsResponse.TranscodeTaskId"));

		List<TranscodeJob> transcodeJobsList = new ArrayList<TranscodeJob>();
		for (int i = 0; i < _ctx.lengthValue("SubmitTranscodeJobsResponse.TranscodeJobs.Length"); i++) {
			TranscodeJob transcodeJob = new TranscodeJob();
			transcodeJob.setJobId(_ctx.stringValue("SubmitTranscodeJobsResponse.TranscodeJobs["+ i +"].JobId"));

			transcodeJobsList.add(transcodeJob);
		}
		submitTranscodeJobsResponse.setTranscodeJobs(transcodeJobsList);
	 
	 	return submitTranscodeJobsResponse;
	}
}