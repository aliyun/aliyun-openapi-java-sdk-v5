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

package com.aliyuncs.v5.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.drds.model.v20190123.DescribeDrdsTasksResponse;
import com.aliyuncs.v5.drds.model.v20190123.DescribeDrdsTasksResponse.Task;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDrdsTasksResponseUnmarshaller {

	public static DescribeDrdsTasksResponse unmarshall(DescribeDrdsTasksResponse describeDrdsTasksResponse, UnmarshallerContext _ctx) {
		
		describeDrdsTasksResponse.setRequestId(_ctx.stringValue("DescribeDrdsTasksResponse.RequestId"));
		describeDrdsTasksResponse.setSuccess(_ctx.booleanValue("DescribeDrdsTasksResponse.Success"));

		List<Task> tasksList = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setId(_ctx.longValue("DescribeDrdsTasksResponse.Tasks["+ i +"].Id"));
			task.setState(_ctx.stringValue("DescribeDrdsTasksResponse.Tasks["+ i +"].State"));
			task.setContent(_ctx.stringValue("DescribeDrdsTasksResponse.Tasks["+ i +"].Content"));

			tasksList.add(task);
		}
		describeDrdsTasksResponse.setTasks(tasksList);
	 
	 	return describeDrdsTasksResponse;
	}
}