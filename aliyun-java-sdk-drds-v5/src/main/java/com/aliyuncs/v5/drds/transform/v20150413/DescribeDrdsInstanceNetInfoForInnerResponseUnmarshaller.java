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

package com.aliyuncs.v5.drds.transform.v20150413;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.drds.model.v20150413.DescribeDrdsInstanceNetInfoForInnerResponse;
import com.aliyuncs.v5.drds.model.v20150413.DescribeDrdsInstanceNetInfoForInnerResponse.NetInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDrdsInstanceNetInfoForInnerResponseUnmarshaller {

	public static DescribeDrdsInstanceNetInfoForInnerResponse unmarshall(DescribeDrdsInstanceNetInfoForInnerResponse describeDrdsInstanceNetInfoForInnerResponse, UnmarshallerContext _ctx) {
		
		describeDrdsInstanceNetInfoForInnerResponse.setRequestId(_ctx.stringValue("DescribeDrdsInstanceNetInfoForInnerResponse.RequestId"));
		describeDrdsInstanceNetInfoForInnerResponse.setSuccess(_ctx.booleanValue("DescribeDrdsInstanceNetInfoForInnerResponse.Success"));
		describeDrdsInstanceNetInfoForInnerResponse.setDrdsInstanceId(_ctx.stringValue("DescribeDrdsInstanceNetInfoForInnerResponse.DrdsInstanceId"));
		describeDrdsInstanceNetInfoForInnerResponse.setNetworkType(_ctx.stringValue("DescribeDrdsInstanceNetInfoForInnerResponse.NetworkType"));

		List<NetInfo> netInfosList = new ArrayList<NetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsInstanceNetInfoForInnerResponse.NetInfos.Length"); i++) {
			NetInfo netInfo = new NetInfo();
			netInfo.setIP(_ctx.stringValue("DescribeDrdsInstanceNetInfoForInnerResponse.NetInfos["+ i +"].IP"));
			netInfo.setPort(_ctx.stringValue("DescribeDrdsInstanceNetInfoForInnerResponse.NetInfos["+ i +"].Port"));
			netInfo.setType(_ctx.stringValue("DescribeDrdsInstanceNetInfoForInnerResponse.NetInfos["+ i +"].Type"));
			netInfo.setIsForVpc(_ctx.booleanValue("DescribeDrdsInstanceNetInfoForInnerResponse.NetInfos["+ i +"].IsForVpc"));

			netInfosList.add(netInfo);
		}
		describeDrdsInstanceNetInfoForInnerResponse.setNetInfos(netInfosList);
	 
	 	return describeDrdsInstanceNetInfoForInnerResponse;
	}
}