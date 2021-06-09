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

import com.aliyuncs.v5.iot.model.v20180120.QueryOTAJobResponse;
import com.aliyuncs.v5.iot.model.v20180120.QueryOTAJobResponse.Data;
import com.aliyuncs.v5.iot.model.v20180120.QueryOTAJobResponse.Data.OtaTagDTO;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryOTAJobResponseUnmarshaller {

	public static QueryOTAJobResponse unmarshall(QueryOTAJobResponse queryOTAJobResponse, UnmarshallerContext _ctx) {
		
		queryOTAJobResponse.setRequestId(_ctx.stringValue("QueryOTAJobResponse.RequestId"));
		queryOTAJobResponse.setSuccess(_ctx.booleanValue("QueryOTAJobResponse.Success"));
		queryOTAJobResponse.setCode(_ctx.stringValue("QueryOTAJobResponse.Code"));
		queryOTAJobResponse.setErrorMessage(_ctx.stringValue("QueryOTAJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("QueryOTAJobResponse.Data.JobId"));
		data.setUtcCreate(_ctx.stringValue("QueryOTAJobResponse.Data.UtcCreate"));
		data.setUtcModified(_ctx.stringValue("QueryOTAJobResponse.Data.UtcModified"));
		data.setProductKey(_ctx.stringValue("QueryOTAJobResponse.Data.ProductKey"));
		data.setFirmwareId(_ctx.stringValue("QueryOTAJobResponse.Data.FirmwareId"));
		data.setUtcStartTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcStartTime"));
		data.setUtcEndTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcEndTime"));
		data.setJobStatus(_ctx.stringValue("QueryOTAJobResponse.Data.JobStatus"));
		data.setJobType(_ctx.stringValue("QueryOTAJobResponse.Data.JobType"));
		data.setJobDesc(_ctx.stringValue("QueryOTAJobResponse.Data.JobDesc"));
		data.setName(_ctx.stringValue("QueryOTAJobResponse.Data.Name"));
		data.setUtcScheduleTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcScheduleTime"));
		data.setRetryInterval(_ctx.integerValue("QueryOTAJobResponse.Data.RetryInterval"));
		data.setRetryCount(_ctx.integerValue("QueryOTAJobResponse.Data.RetryCount"));
		data.setTimeoutInMinutes(_ctx.integerValue("QueryOTAJobResponse.Data.TimeoutInMinutes"));
		data.setTargetSelection(_ctx.stringValue("QueryOTAJobResponse.Data.TargetSelection"));
		data.setSelectionType(_ctx.stringValue("QueryOTAJobResponse.Data.SelectionType"));
		data.setGrayPercent(_ctx.stringValue("QueryOTAJobResponse.Data.GrayPercent"));
		data.setMaximumPerMinute(_ctx.integerValue("QueryOTAJobResponse.Data.MaximumPerMinute"));
		data.setDestVersion(_ctx.stringValue("QueryOTAJobResponse.Data.DestVersion"));
		data.setUtcScheduleFinishTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcScheduleFinishTime"));
		data.setOverwriteMode(_ctx.integerValue("QueryOTAJobResponse.Data.OverwriteMode"));
		data.setDynamicMode(_ctx.integerValue("QueryOTAJobResponse.Data.DynamicMode"));
		data.setNeedPush(_ctx.booleanValue("QueryOTAJobResponse.Data.NeedPush"));
		data.setNeedConfirm(_ctx.booleanValue("QueryOTAJobResponse.Data.NeedConfirm"));

		List<String> srcVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryOTAJobResponse.Data.SrcVersions.Length"); i++) {
			srcVersions.add(_ctx.stringValue("QueryOTAJobResponse.Data.SrcVersions["+ i +"]"));
		}
		data.setSrcVersions(srcVersions);

		List<OtaTagDTO> tagsList = new ArrayList<OtaTagDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryOTAJobResponse.Data.Tags.Length"); i++) {
			OtaTagDTO otaTagDTO = new OtaTagDTO();
			otaTagDTO.setKey(_ctx.stringValue("QueryOTAJobResponse.Data.Tags["+ i +"].Key"));
			otaTagDTO.setValue(_ctx.stringValue("QueryOTAJobResponse.Data.Tags["+ i +"].Value"));

			tagsList.add(otaTagDTO);
		}
		data.setTags(tagsList);
		queryOTAJobResponse.setData(data);
	 
	 	return queryOTAJobResponse;
	}
}