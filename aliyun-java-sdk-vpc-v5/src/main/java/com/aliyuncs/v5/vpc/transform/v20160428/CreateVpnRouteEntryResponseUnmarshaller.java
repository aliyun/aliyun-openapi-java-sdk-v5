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

package com.aliyuncs.v5.vpc.transform.v20160428;

import com.aliyuncs.v5.vpc.model.v20160428.CreateVpnRouteEntryResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateVpnRouteEntryResponseUnmarshaller {

	public static CreateVpnRouteEntryResponse unmarshall(CreateVpnRouteEntryResponse createVpnRouteEntryResponse, UnmarshallerContext _ctx) {
		
		createVpnRouteEntryResponse.setRequestId(_ctx.stringValue("CreateVpnRouteEntryResponse.RequestId"));
		createVpnRouteEntryResponse.setVpnInstanceId(_ctx.stringValue("CreateVpnRouteEntryResponse.VpnInstanceId"));
		createVpnRouteEntryResponse.setRouteDest(_ctx.stringValue("CreateVpnRouteEntryResponse.RouteDest"));
		createVpnRouteEntryResponse.setNextHop(_ctx.stringValue("CreateVpnRouteEntryResponse.NextHop"));
		createVpnRouteEntryResponse.setWeight(_ctx.integerValue("CreateVpnRouteEntryResponse.Weight"));
		createVpnRouteEntryResponse.setOverlayMode(_ctx.stringValue("CreateVpnRouteEntryResponse.OverlayMode"));
		createVpnRouteEntryResponse.setDescription(_ctx.stringValue("CreateVpnRouteEntryResponse.Description"));
		createVpnRouteEntryResponse.setState(_ctx.stringValue("CreateVpnRouteEntryResponse.State"));
		createVpnRouteEntryResponse.setCreateTime(_ctx.longValue("CreateVpnRouteEntryResponse.CreateTime"));
	 
	 	return createVpnRouteEntryResponse;
	}
}