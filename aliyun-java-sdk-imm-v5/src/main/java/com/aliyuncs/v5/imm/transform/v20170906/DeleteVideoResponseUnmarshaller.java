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

package com.aliyuncs.v5.imm.transform.v20170906;

import com.aliyuncs.v5.imm.model.v20170906.DeleteVideoResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DeleteVideoResponseUnmarshaller {

	public static DeleteVideoResponse unmarshall(DeleteVideoResponse deleteVideoResponse, UnmarshallerContext _ctx) {
		
		deleteVideoResponse.setRequestId(_ctx.stringValue("DeleteVideoResponse.RequestId"));
		deleteVideoResponse.setSetId(_ctx.stringValue("DeleteVideoResponse.SetId"));
		deleteVideoResponse.setVideoUri(_ctx.stringValue("DeleteVideoResponse.VideoUri"));
	 
	 	return deleteVideoResponse;
	}
}