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

package com.aliyuncs.v5.aliyuncvc.transform.v20191030;

import com.aliyuncs.v5.aliyuncvc.model.v20191030.GetMeetingMemberResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetMeetingMemberResponseUnmarshaller {

	public static GetMeetingMemberResponse unmarshall(GetMeetingMemberResponse getMeetingMemberResponse, UnmarshallerContext _ctx) {
		
		getMeetingMemberResponse.setRequestId(_ctx.stringValue("GetMeetingMemberResponse.RequestId"));
		getMeetingMemberResponse.setMessage(_ctx.stringValue("GetMeetingMemberResponse.Message"));
		getMeetingMemberResponse.setSuccess(_ctx.booleanValue("GetMeetingMemberResponse.Success"));
		getMeetingMemberResponse.setErrorCode(_ctx.integerValue("GetMeetingMemberResponse.ErrorCode"));
		getMeetingMemberResponse.setMembers(_ctx.stringValue("GetMeetingMemberResponse.Members"));
	 
	 	return getMeetingMemberResponse;
	}
}