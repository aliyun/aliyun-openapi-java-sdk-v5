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

package com.aliyuncs.v5.dts.transform.v20200101;

import com.aliyuncs.v5.dts.model.v20200101.DescribeEndpointSwitchStatusResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeEndpointSwitchStatusResponseUnmarshaller {

	public static DescribeEndpointSwitchStatusResponse unmarshall(DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatusResponse, UnmarshallerContext _ctx) {
		
		describeEndpointSwitchStatusResponse.setRequestId(_ctx.stringValue("DescribeEndpointSwitchStatusResponse.RequestId"));
		describeEndpointSwitchStatusResponse.setErrCode(_ctx.stringValue("DescribeEndpointSwitchStatusResponse.ErrCode"));
		describeEndpointSwitchStatusResponse.setErrMessage(_ctx.stringValue("DescribeEndpointSwitchStatusResponse.ErrMessage"));
		describeEndpointSwitchStatusResponse.setErrorMessage(_ctx.stringValue("DescribeEndpointSwitchStatusResponse.ErrorMessage"));
		describeEndpointSwitchStatusResponse.setStatus(_ctx.stringValue("DescribeEndpointSwitchStatusResponse.Status"));
		describeEndpointSwitchStatusResponse.setSuccess(_ctx.stringValue("DescribeEndpointSwitchStatusResponse.Success"));
	 
	 	return describeEndpointSwitchStatusResponse;
	}
}