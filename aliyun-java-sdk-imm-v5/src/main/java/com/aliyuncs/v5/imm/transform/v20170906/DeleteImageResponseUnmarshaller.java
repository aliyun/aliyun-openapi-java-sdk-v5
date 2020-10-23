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

import com.aliyuncs.v5.imm.model.v20170906.DeleteImageResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DeleteImageResponseUnmarshaller {

	public static DeleteImageResponse unmarshall(DeleteImageResponse deleteImageResponse, UnmarshallerContext _ctx) {
		
		deleteImageResponse.setRequestId(_ctx.stringValue("DeleteImageResponse.RequestId"));
		deleteImageResponse.setSetId(_ctx.stringValue("DeleteImageResponse.SetId"));
		deleteImageResponse.setImageUri(_ctx.stringValue("DeleteImageResponse.ImageUri"));
	 
	 	return deleteImageResponse;
	}
}