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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.drds.model.v20190123.DescribePreCheckResultResponse;
import com.aliyuncs.v5.drds.model.v20190123.DescribePreCheckResultResponse.PreCheckResult;
import com.aliyuncs.v5.drds.model.v20190123.DescribePreCheckResultResponse.PreCheckResult.SubCheckItemsItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribePreCheckResultResponseUnmarshaller {

	public static DescribePreCheckResultResponse unmarshall(DescribePreCheckResultResponse describePreCheckResultResponse, UnmarshallerContext _ctx) {
		
		describePreCheckResultResponse.setRequestId(_ctx.stringValue("DescribePreCheckResultResponse.RequestId"));
		describePreCheckResultResponse.setSuccess(_ctx.booleanValue("DescribePreCheckResultResponse.Success"));

		PreCheckResult preCheckResult = new PreCheckResult();
		preCheckResult.setPreCheckName(_ctx.stringValue("DescribePreCheckResultResponse.PreCheckResult.PreCheckName"));
		preCheckResult.setState(_ctx.stringValue("DescribePreCheckResultResponse.PreCheckResult.State"));

		List<SubCheckItemsItem> subCheckItemsList = new ArrayList<SubCheckItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePreCheckResultResponse.PreCheckResult.SubCheckItems.Length"); i++) {
			SubCheckItemsItem subCheckItemsItem = new SubCheckItemsItem();
			subCheckItemsItem.setPreCheckItemName(_ctx.stringValue("DescribePreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].PreCheckItemName"));
			subCheckItemsItem.setState(_ctx.stringValue("DescribePreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].State"));
			subCheckItemsItem.setErrorMsgCode(_ctx.stringValue("DescribePreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].ErrorMsgCode"));

			List<String> errorMsgParams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].ErrorMsgParams.Length"); j++) {
				errorMsgParams.add(_ctx.stringValue("DescribePreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].ErrorMsgParams["+ j +"]"));
			}
			subCheckItemsItem.setErrorMsgParams(errorMsgParams);

			subCheckItemsList.add(subCheckItemsItem);
		}
		preCheckResult.setSubCheckItems(subCheckItemsList);
		describePreCheckResultResponse.setPreCheckResult(preCheckResult);
	 
	 	return describePreCheckResultResponse;
	}
}