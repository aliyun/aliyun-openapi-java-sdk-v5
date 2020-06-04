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

import com.aliyuncs.v5.vod.model.v20170321.SubmitPreprocessJobsResponse;
import com.aliyuncs.v5.vod.model.v20170321.SubmitPreprocessJobsResponse.PreprocessJob;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SubmitPreprocessJobsResponseUnmarshaller {

	public static SubmitPreprocessJobsResponse unmarshall(SubmitPreprocessJobsResponse submitPreprocessJobsResponse, UnmarshallerContext _ctx) {
		
		submitPreprocessJobsResponse.setRequestId(_ctx.stringValue("SubmitPreprocessJobsResponse.RequestId"));

		List<PreprocessJob> preprocessJobsList = new ArrayList<PreprocessJob>();
		for (int i = 0; i < _ctx.lengthValue("SubmitPreprocessJobsResponse.PreprocessJobs.Length"); i++) {
			PreprocessJob preprocessJob = new PreprocessJob();
			preprocessJob.setJobId(_ctx.stringValue("SubmitPreprocessJobsResponse.PreprocessJobs["+ i +"].JobId"));

			preprocessJobsList.add(preprocessJob);
		}
		submitPreprocessJobsResponse.setPreprocessJobs(preprocessJobsList);
	 
	 	return submitPreprocessJobsResponse;
	}
}