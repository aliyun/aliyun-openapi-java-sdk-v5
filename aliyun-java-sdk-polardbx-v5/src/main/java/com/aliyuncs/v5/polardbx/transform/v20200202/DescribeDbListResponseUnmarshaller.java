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

package com.aliyuncs.v5.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.polardbx.model.v20200202.DescribeDbListResponse;
import com.aliyuncs.v5.polardbx.model.v20200202.DescribeDbListResponse.DB;
import com.aliyuncs.v5.polardbx.model.v20200202.DescribeDbListResponse.DB.Account;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDbListResponseUnmarshaller {

	public static DescribeDbListResponse unmarshall(DescribeDbListResponse describeDbListResponse, UnmarshallerContext _ctx) {
		
		describeDbListResponse.setRequestId(_ctx.stringValue("DescribeDbListResponse.RequestId"));
		describeDbListResponse.setSuccess(_ctx.booleanValue("DescribeDbListResponse.Success"));
		describeDbListResponse.setMessage(_ctx.stringValue("DescribeDbListResponse.Message"));

		List<DB> dataList = new ArrayList<DB>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDbListResponse.Data.Length"); i++) {
			DB dB = new DB();
			dB.setDBName(_ctx.stringValue("DescribeDbListResponse.Data["+ i +"].DBName"));
			dB.setDBDescription(_ctx.stringValue("DescribeDbListResponse.Data["+ i +"].DBDescription"));
			dB.setDBInstanceName(_ctx.stringValue("DescribeDbListResponse.Data["+ i +"].DBInstanceName"));
			dB.setCharacterSetName(_ctx.stringValue("DescribeDbListResponse.Data["+ i +"].CharacterSetName"));

			List<Account> accountsList = new ArrayList<Account>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDbListResponse.Data["+ i +"].Accounts.Length"); j++) {
				Account account = new Account();
				account.setAccountName(_ctx.stringValue("DescribeDbListResponse.Data["+ i +"].Accounts["+ j +"].AccountName"));
				account.setAccountPrivilege(_ctx.stringValue("DescribeDbListResponse.Data["+ i +"].Accounts["+ j +"].AccountPrivilege"));

				accountsList.add(account);
			}
			dB.setAccounts(accountsList);

			dataList.add(dB);
		}
		describeDbListResponse.setData(dataList);
	 
	 	return describeDbListResponse;
	}
}