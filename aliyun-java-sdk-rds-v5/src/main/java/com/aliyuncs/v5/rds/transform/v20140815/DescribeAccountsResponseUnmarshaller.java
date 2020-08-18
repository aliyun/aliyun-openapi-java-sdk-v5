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

package com.aliyuncs.v5.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.rds.model.v20140815.DescribeAccountsResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAccountsResponse.DBInstanceAccount;
import com.aliyuncs.v5.rds.model.v20140815.DescribeAccountsResponse.DBInstanceAccount.DatabasePrivilege;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAccountsResponse.setRequestId(_ctx.stringValue("DescribeAccountsResponse.RequestId"));
		describeAccountsResponse.setSystemAdminAccountStatus(_ctx.stringValue("DescribeAccountsResponse.SystemAdminAccountStatus"));
		describeAccountsResponse.setSystemAdminAccountFirstActivationTime(_ctx.stringValue("DescribeAccountsResponse.SystemAdminAccountFirstActivationTime"));

		List<DBInstanceAccount> accountsList = new ArrayList<DBInstanceAccount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			DBInstanceAccount dBInstanceAccount = new DBInstanceAccount();
			dBInstanceAccount.setDBInstanceId(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DBInstanceId"));
			dBInstanceAccount.setAccountName(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			dBInstanceAccount.setAccountStatus(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			dBInstanceAccount.setAccountType(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));
			dBInstanceAccount.setAccountDescription(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			dBInstanceAccount.setPrivExceeded(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].PrivExceeded"));

			List<DatabasePrivilege> databasePrivilegesList = new ArrayList<DatabasePrivilege>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges.Length"); j++) {
				DatabasePrivilege databasePrivilege = new DatabasePrivilege();
				databasePrivilege.setDBName(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].DBName"));
				databasePrivilege.setAccountPrivilege(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilege"));
				databasePrivilege.setAccountPrivilegeDetail(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilegeDetail"));

				databasePrivilegesList.add(databasePrivilege);
			}
			dBInstanceAccount.setDatabasePrivileges(databasePrivilegesList);

			accountsList.add(dBInstanceAccount);
		}
		describeAccountsResponse.setAccounts(accountsList);
	 
	 	return describeAccountsResponse;
	}
}