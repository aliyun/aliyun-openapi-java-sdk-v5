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

import com.aliyuncs.v5.polardbx.model.v20200202.DescribeAccountListResponse;
import com.aliyuncs.v5.polardbx.model.v20200202.DescribeAccountListResponse.Account;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeAccountListResponseUnmarshaller {

	public static DescribeAccountListResponse unmarshall(DescribeAccountListResponse describeAccountListResponse, UnmarshallerContext _ctx) {
		
		describeAccountListResponse.setRequestId(_ctx.stringValue("DescribeAccountListResponse.RequestId"));
		describeAccountListResponse.setMessage(_ctx.stringValue("DescribeAccountListResponse.Message"));
		describeAccountListResponse.setSuccess(_ctx.booleanValue("DescribeAccountListResponse.Success"));

		List<Account> dataList = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountListResponse.Data.Length"); i++) {
			Account account = new Account();
			account.setAccountDescription(_ctx.stringValue("DescribeAccountListResponse.Data["+ i +"].AccountDescription"));
			account.setAccountName(_ctx.stringValue("DescribeAccountListResponse.Data["+ i +"].AccountName"));
			account.setAccountPrivilege(_ctx.stringValue("DescribeAccountListResponse.Data["+ i +"].AccountPrivilege"));
			account.setAccountType(_ctx.stringValue("DescribeAccountListResponse.Data["+ i +"].AccountType"));
			account.setDBInstanceName(_ctx.stringValue("DescribeAccountListResponse.Data["+ i +"].DBInstanceName"));
			account.setDBName(_ctx.stringValue("DescribeAccountListResponse.Data["+ i +"].DBName"));

			dataList.add(account);
		}
		describeAccountListResponse.setData(dataList);
	 
	 	return describeAccountListResponse;
	}
}