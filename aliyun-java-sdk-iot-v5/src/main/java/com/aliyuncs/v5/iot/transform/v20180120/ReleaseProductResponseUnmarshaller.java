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

package com.aliyuncs.v5.iot.transform.v20180120;

import com.aliyuncs.v5.iot.model.v20180120.ReleaseProductResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ReleaseProductResponseUnmarshaller {

	public static ReleaseProductResponse unmarshall(ReleaseProductResponse releaseProductResponse, UnmarshallerContext _ctx) {
		
		releaseProductResponse.setRequestId(_ctx.stringValue("ReleaseProductResponse.RequestId"));
		releaseProductResponse.setSuccess(_ctx.booleanValue("ReleaseProductResponse.Success"));
		releaseProductResponse.setErrorMessage(_ctx.stringValue("ReleaseProductResponse.ErrorMessage"));
		releaseProductResponse.setCode(_ctx.stringValue("ReleaseProductResponse.Code"));
	 
	 	return releaseProductResponse;
	}
}