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

package com.aliyuncs.v5.arms.model.v20190808;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMultipleTraceRequest extends RpcAcsRequest<GetMultipleTraceResponse> {
	   

	private List<String> traceIDs;
	public GetMultipleTraceRequest() {
		super("ARMS", "2019-08-08", "GetMultipleTrace", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTraceIDs() {
		return this.traceIDs;
	}

	public void setTraceIDs(List<String> traceIDs) {
		this.traceIDs = traceIDs;	
		if (traceIDs != null) {
			for (int i = 0; i < traceIDs.size(); i++) {
				putQueryParameter("TraceIDs." + (i + 1) , traceIDs.get(i));
			}
		}	
	}

	@Override
	public Class<GetMultipleTraceResponse> getResponseClass() {
		return GetMultipleTraceResponse.class;
	}

}
