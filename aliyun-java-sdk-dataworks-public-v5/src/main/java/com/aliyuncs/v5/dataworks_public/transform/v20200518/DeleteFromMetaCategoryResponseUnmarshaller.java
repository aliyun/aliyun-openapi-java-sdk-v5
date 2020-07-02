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

package com.aliyuncs.v5.dataworks_public.transform.v20200518;

import com.aliyuncs.v5.dataworks_public.model.v20200518.DeleteFromMetaCategoryResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DeleteFromMetaCategoryResponseUnmarshaller {

	public static DeleteFromMetaCategoryResponse unmarshall(DeleteFromMetaCategoryResponse deleteFromMetaCategoryResponse, UnmarshallerContext _ctx) {
		
		deleteFromMetaCategoryResponse.setRequestId(_ctx.stringValue("DeleteFromMetaCategoryResponse.RequestId"));
		deleteFromMetaCategoryResponse.setErrorCode(_ctx.stringValue("DeleteFromMetaCategoryResponse.ErrorCode"));
		deleteFromMetaCategoryResponse.setErrorMessage(_ctx.stringValue("DeleteFromMetaCategoryResponse.ErrorMessage"));
		deleteFromMetaCategoryResponse.setHttpStatusCode(_ctx.integerValue("DeleteFromMetaCategoryResponse.HttpStatusCode"));
		deleteFromMetaCategoryResponse.setSuccess(_ctx.booleanValue("DeleteFromMetaCategoryResponse.Success"));
		deleteFromMetaCategoryResponse.setData(_ctx.booleanValue("DeleteFromMetaCategoryResponse.Data"));
	 
	 	return deleteFromMetaCategoryResponse;
	}
}