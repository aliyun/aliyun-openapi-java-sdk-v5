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

package com.aliyuncs.v5.drds.transform.v20190123;

import com.aliyuncs.v5.drds.model.v20190123.SubmitSwitchTableShardingKeyModifyResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SubmitSwitchTableShardingKeyModifyResponseUnmarshaller {

	public static SubmitSwitchTableShardingKeyModifyResponse unmarshall(SubmitSwitchTableShardingKeyModifyResponse submitSwitchTableShardingKeyModifyResponse, UnmarshallerContext _ctx) {
		
		submitSwitchTableShardingKeyModifyResponse.setRequestId(_ctx.stringValue("SubmitSwitchTableShardingKeyModifyResponse.RequestId"));
		submitSwitchTableShardingKeyModifyResponse.setSuccess(_ctx.booleanValue("SubmitSwitchTableShardingKeyModifyResponse.Success"));
		submitSwitchTableShardingKeyModifyResponse.setData(_ctx.booleanValue("SubmitSwitchTableShardingKeyModifyResponse.Data"));
	 
	 	return submitSwitchTableShardingKeyModifyResponse;
	}
}