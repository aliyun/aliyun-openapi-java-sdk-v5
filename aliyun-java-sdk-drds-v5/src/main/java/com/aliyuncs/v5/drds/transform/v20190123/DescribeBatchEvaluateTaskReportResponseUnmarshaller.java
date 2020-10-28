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

import com.aliyuncs.v5.drds.model.v20190123.DescribeBatchEvaluateTaskReportResponse;
import com.aliyuncs.v5.drds.model.v20190123.DescribeBatchEvaluateTaskReportResponse.EvaluateResults;
import com.aliyuncs.v5.drds.model.v20190123.DescribeBatchEvaluateTaskReportResponse.EvaluateResults.RdsInstInfosItem;
import com.aliyuncs.v5.drds.model.v20190123.DescribeBatchEvaluateTaskReportResponse.EvaluateResults.TableShardResultsItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeBatchEvaluateTaskReportResponseUnmarshaller {

	public static DescribeBatchEvaluateTaskReportResponse unmarshall(DescribeBatchEvaluateTaskReportResponse describeBatchEvaluateTaskReportResponse, UnmarshallerContext _ctx) {
		
		describeBatchEvaluateTaskReportResponse.setRequestId(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.RequestId"));
		describeBatchEvaluateTaskReportResponse.setSuccess(_ctx.booleanValue("DescribeBatchEvaluateTaskReportResponse.Success"));

		List<EvaluateResults> dataList = new ArrayList<EvaluateResults>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBatchEvaluateTaskReportResponse.Data.Length"); i++) {
			EvaluateResults evaluateResults = new EvaluateResults();
			evaluateResults.setTaskId(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TaskId"));
			evaluateResults.setTaskName(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TaskName"));
			evaluateResults.setInstId(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].InstId"));
			evaluateResults.setDbName(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].DbName"));
			evaluateResults.setTaskStatus(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TaskStatus"));
			evaluateResults.setGmtCreate(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].GmtCreate"));
			evaluateResults.setGmtModified(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].GmtModified"));
			evaluateResults.setRdsType(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsType"));
			evaluateResults.setRdsCount(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsCount"));
			evaluateResults.setRdsTotalSpace(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsTotalSpace"));
			evaluateResults.setDrdsType(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].DrdsType"));
			evaluateResults.setDrdsCount(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].DrdsCount"));
			evaluateResults.setAllSqlCount(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].AllSqlCount"));
			evaluateResults.setSlowSqlCount(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].SlowSqlCount"));

			List<TableShardResultsItem> tableShardResultsList = new ArrayList<TableShardResultsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults.Length"); j++) {
				TableShardResultsItem tableShardResultsItem = new TableShardResultsItem();
				tableShardResultsItem.setTable(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].Table"));
				tableShardResultsItem.setShardType(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].ShardType"));
				tableShardResultsItem.setDbShardKey(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].DbShardKey"));
				tableShardResultsItem.setTbShardKey(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].TbShardKey"));
				tableShardResultsItem.setTbpartitions(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].Tbpartitions"));
				tableShardResultsItem.setDbpartitions(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].Dbpartitions"));
				tableShardResultsItem.setCreateTableSql(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].CreateTableSql"));
				tableShardResultsItem.setRowCount(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].RowCount"));
				tableShardResultsItem.setSqlCount(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].SqlCount"));
				tableShardResultsItem.setShardKeyType(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].ShardKeyType"));
				tableShardResultsItem.setDbShardMethod(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].DbShardMethod"));
				tableShardResultsItem.setTbShardMethod(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].TbShardMethod"));
				tableShardResultsItem.setOriginDbShardMethod(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].OriginDbShardMethod"));
				tableShardResultsItem.setOriginTbShardMethod(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].OriginTbShardMethod"));

				tableShardResultsList.add(tableShardResultsItem);
			}
			evaluateResults.setTableShardResults(tableShardResultsList);

			List<RdsInstInfosItem> rdsInstInfosList = new ArrayList<RdsInstInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos.Length"); j++) {
				RdsInstInfosItem rdsInstInfosItem = new RdsInstInfosItem();
				rdsInstInfosItem.setInstId(_ctx.stringValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].InstId"));
				rdsInstInfosItem.setRdsUsedSpace(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].RdsUsedSpace"));
				rdsInstInfosItem.setRdsPeakIopsWeekly(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].RdsPeakIopsWeekly"));
				rdsInstInfosItem.setRdsPeakQpsWeekly(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].RdsPeakQpsWeekly"));
				rdsInstInfosItem.setRdsPeakSessionsWeekly(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].RdsPeakSessionsWeekly"));
				rdsInstInfosItem.setDataGrowthScale(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].DataGrowthScale"));
				rdsInstInfosItem.setAvgQpsGrowthScale(_ctx.integerValue("DescribeBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].AvgQpsGrowthScale"));

				rdsInstInfosList.add(rdsInstInfosItem);
			}
			evaluateResults.setRdsInstInfos(rdsInstInfosList);

			dataList.add(evaluateResults);
		}
		describeBatchEvaluateTaskReportResponse.setData(dataList);
	 
	 	return describeBatchEvaluateTaskReportResponse;
	}
}