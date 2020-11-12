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

package com.aliyuncs.v5.openanalytics_open.transform.v20200928;

import com.aliyuncs.v5.openanalytics_open.model.v20200928.DropPartitionResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DropPartitionResponseUnmarshaller {

	public static DropPartitionResponse unmarshall(DropPartitionResponse dropPartitionResponse, UnmarshallerContext _ctx) {
		
		dropPartitionResponse.setRequestId(_ctx.stringValue("DropPartitionResponse.RequestId"));
		dropPartitionResponse.setMessage(_ctx.stringValue("DropPartitionResponse.Message"));
		dropPartitionResponse.setData(_ctx.booleanValue("DropPartitionResponse.Data"));
		dropPartitionResponse.setCode(_ctx.stringValue("DropPartitionResponse.Code"));
		dropPartitionResponse.setSuccess(_ctx.booleanValue("DropPartitionResponse.Success"));
	 
	 	return dropPartitionResponse;
	}
}