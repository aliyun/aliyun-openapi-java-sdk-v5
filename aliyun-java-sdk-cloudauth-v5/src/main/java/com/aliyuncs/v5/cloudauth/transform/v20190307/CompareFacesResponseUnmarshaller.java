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

package com.aliyuncs.v5.cloudauth.transform.v20190307;

import com.aliyuncs.v5.cloudauth.model.v20190307.CompareFacesResponse;
import com.aliyuncs.v5.cloudauth.model.v20190307.CompareFacesResponse.Data;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CompareFacesResponseUnmarshaller {

	public static CompareFacesResponse unmarshall(CompareFacesResponse compareFacesResponse, UnmarshallerContext _ctx) {
		
		compareFacesResponse.setRequestId(_ctx.stringValue("CompareFacesResponse.RequestId"));
		compareFacesResponse.setSuccess(_ctx.booleanValue("CompareFacesResponse.Success"));
		compareFacesResponse.setCode(_ctx.stringValue("CompareFacesResponse.Code"));
		compareFacesResponse.setMessage(_ctx.stringValue("CompareFacesResponse.Message"));

		Data data = new Data();
		data.setSimilarityScore(_ctx.floatValue("CompareFacesResponse.Data.SimilarityScore"));
		data.setConfidenceThresholds(_ctx.stringValue("CompareFacesResponse.Data.ConfidenceThresholds"));
		compareFacesResponse.setData(data);
	 
	 	return compareFacesResponse;
	}
}