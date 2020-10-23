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

import com.aliyuncs.v5.imm.model.v20170906.IndexVideoResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class IndexVideoResponseUnmarshaller {

	public static IndexVideoResponse unmarshall(IndexVideoResponse indexVideoResponse, UnmarshallerContext _ctx) {
		
		indexVideoResponse.setRequestId(_ctx.stringValue("IndexVideoResponse.RequestId"));
		indexVideoResponse.setSetId(_ctx.stringValue("IndexVideoResponse.SetId"));
		indexVideoResponse.setVideoUri(_ctx.stringValue("IndexVideoResponse.VideoUri"));
		indexVideoResponse.setRemarksA(_ctx.stringValue("IndexVideoResponse.RemarksA"));
		indexVideoResponse.setRemarksB(_ctx.stringValue("IndexVideoResponse.RemarksB"));
		indexVideoResponse.setCreateTime(_ctx.stringValue("IndexVideoResponse.CreateTime"));
		indexVideoResponse.setModifyTime(_ctx.stringValue("IndexVideoResponse.ModifyTime"));
		indexVideoResponse.setInterval(_ctx.floatValue("IndexVideoResponse.Interval"));
		indexVideoResponse.setGrabType(_ctx.stringValue("IndexVideoResponse.GrabType"));
		indexVideoResponse.setStartTime(_ctx.stringValue("IndexVideoResponse.StartTime"));
		indexVideoResponse.setEndTime(_ctx.stringValue("IndexVideoResponse.EndTime"));
		indexVideoResponse.setSaveType(_ctx.booleanValue("IndexVideoResponse.SaveType"));
		indexVideoResponse.setTgtUri(_ctx.stringValue("IndexVideoResponse.TgtUri"));
		indexVideoResponse.setRemarksC(_ctx.stringValue("IndexVideoResponse.RemarksC"));
		indexVideoResponse.setRemarksD(_ctx.stringValue("IndexVideoResponse.RemarksD"));
		indexVideoResponse.setExternalId(_ctx.stringValue("IndexVideoResponse.ExternalId"));
	 
	 	return indexVideoResponse;
	}
}