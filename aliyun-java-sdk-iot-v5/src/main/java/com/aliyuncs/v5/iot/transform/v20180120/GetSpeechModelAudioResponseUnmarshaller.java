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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.iot.model.v20180120.GetSpeechModelAudioResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetSpeechModelAudioResponseUnmarshaller {

	public static GetSpeechModelAudioResponse unmarshall(GetSpeechModelAudioResponse getSpeechModelAudioResponse, UnmarshallerContext _ctx) {
		
		getSpeechModelAudioResponse.setRequestId(_ctx.stringValue("GetSpeechModelAudioResponse.RequestId"));
		getSpeechModelAudioResponse.setSuccess(_ctx.booleanValue("GetSpeechModelAudioResponse.Success"));
		getSpeechModelAudioResponse.setCode(_ctx.stringValue("GetSpeechModelAudioResponse.Code"));
		getSpeechModelAudioResponse.setErrorMessage(_ctx.stringValue("GetSpeechModelAudioResponse.ErrorMessage"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSpeechModelAudioResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetSpeechModelAudioResponse.Data["+ i +"]"));
		}
		getSpeechModelAudioResponse.setData(data);
	 
	 	return getSpeechModelAudioResponse;
	}
}