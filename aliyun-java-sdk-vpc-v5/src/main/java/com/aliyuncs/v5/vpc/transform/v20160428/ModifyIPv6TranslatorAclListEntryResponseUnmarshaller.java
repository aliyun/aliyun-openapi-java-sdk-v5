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

import com.aliyuncs.v5.vpc.model.v20160428.ModifyIPv6TranslatorAclListEntryResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifyIPv6TranslatorAclListEntryResponseUnmarshaller {

	public static ModifyIPv6TranslatorAclListEntryResponse unmarshall(ModifyIPv6TranslatorAclListEntryResponse modifyIPv6TranslatorAclListEntryResponse, UnmarshallerContext _ctx) {
		
		modifyIPv6TranslatorAclListEntryResponse.setRequestId(_ctx.stringValue("ModifyIPv6TranslatorAclListEntryResponse.RequestId"));
	 
	 	return modifyIPv6TranslatorAclListEntryResponse;
	}
}