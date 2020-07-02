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

import com.aliyuncs.v5.dataworks_public.model.v20200518.EstablishRelationTableToBusinessResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class EstablishRelationTableToBusinessResponseUnmarshaller {

	public static EstablishRelationTableToBusinessResponse unmarshall(EstablishRelationTableToBusinessResponse establishRelationTableToBusinessResponse, UnmarshallerContext _ctx) {
		
		establishRelationTableToBusinessResponse.setRequestId(_ctx.stringValue("EstablishRelationTableToBusinessResponse.RequestId"));
		establishRelationTableToBusinessResponse.setSuccess(_ctx.booleanValue("EstablishRelationTableToBusinessResponse.Success"));
		establishRelationTableToBusinessResponse.setErrorCode(_ctx.stringValue("EstablishRelationTableToBusinessResponse.ErrorCode"));
		establishRelationTableToBusinessResponse.setErrorMessage(_ctx.stringValue("EstablishRelationTableToBusinessResponse.ErrorMessage"));
		establishRelationTableToBusinessResponse.setHttpStatusCode(_ctx.integerValue("EstablishRelationTableToBusinessResponse.HttpStatusCode"));
	 
	 	return establishRelationTableToBusinessResponse;
	}
}