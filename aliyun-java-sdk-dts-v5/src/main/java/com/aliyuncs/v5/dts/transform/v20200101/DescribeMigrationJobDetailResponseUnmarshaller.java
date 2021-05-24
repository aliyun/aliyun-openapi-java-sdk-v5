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

package com.aliyuncs.v5.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dts.model.v20200101.DescribeMigrationJobDetailResponse;
import com.aliyuncs.v5.dts.model.v20200101.DescribeMigrationJobDetailResponse.DataInitializationDetail;
import com.aliyuncs.v5.dts.model.v20200101.DescribeMigrationJobDetailResponse.DataSynchronizationDetail;
import com.aliyuncs.v5.dts.model.v20200101.DescribeMigrationJobDetailResponse.StructureInitializationDetail;
import com.aliyuncs.v5.dts.model.v20200101.DescribeMigrationJobDetailResponse.StructureInitializationDetail.StructureInitializationDetail1;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeMigrationJobDetailResponseUnmarshaller {

	public static DescribeMigrationJobDetailResponse unmarshall(DescribeMigrationJobDetailResponse describeMigrationJobDetailResponse, UnmarshallerContext _ctx) {
		
		describeMigrationJobDetailResponse.setRequestId(_ctx.stringValue("DescribeMigrationJobDetailResponse.RequestId"));
		describeMigrationJobDetailResponse.setErrCode(_ctx.stringValue("DescribeMigrationJobDetailResponse.ErrCode"));
		describeMigrationJobDetailResponse.setErrMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.ErrMessage"));
		describeMigrationJobDetailResponse.setPageNumber(_ctx.integerValue("DescribeMigrationJobDetailResponse.PageNumber"));
		describeMigrationJobDetailResponse.setPageRecordCount(_ctx.integerValue("DescribeMigrationJobDetailResponse.PageRecordCount"));
		describeMigrationJobDetailResponse.setSuccess(_ctx.stringValue("DescribeMigrationJobDetailResponse.Success"));
		describeMigrationJobDetailResponse.setTotalRecordCount(_ctx.longValue("DescribeMigrationJobDetailResponse.TotalRecordCount"));

		List<DataInitializationDetail> dataInitializationDetailListList = new ArrayList<DataInitializationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList.Length"); i++) {
			DataInitializationDetail dataInitializationDetail = new DataInitializationDetail();
			dataInitializationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].DestinationOwnerDBName"));
			dataInitializationDetail.setErrorMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].ErrorMessage"));
			dataInitializationDetail.setFinishRowNum(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].FinishRowNum"));
			dataInitializationDetail.setMigrationTime(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].MigrationTime"));
			dataInitializationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].SourceOwnerDBName"));
			dataInitializationDetail.setStatus(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].Status"));
			dataInitializationDetail.setTableName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].TableName"));
			dataInitializationDetail.setTotalRowNum(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataInitializationDetailList["+ i +"].TotalRowNum"));

			dataInitializationDetailListList.add(dataInitializationDetail);
		}
		describeMigrationJobDetailResponse.setDataInitializationDetailList(dataInitializationDetailListList);

		List<DataSynchronizationDetail> dataSynchronizationDetailListList = new ArrayList<DataSynchronizationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList.Length"); i++) {
			DataSynchronizationDetail dataSynchronizationDetail = new DataSynchronizationDetail();
			dataSynchronizationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].DestinationOwnerDBName"));
			dataSynchronizationDetail.setErrorMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].ErrorMessage"));
			dataSynchronizationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].SourceOwnerDBName"));
			dataSynchronizationDetail.setStatus(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].Status"));
			dataSynchronizationDetail.setTableName(_ctx.stringValue("DescribeMigrationJobDetailResponse.DataSynchronizationDetailList["+ i +"].TableName"));

			dataSynchronizationDetailListList.add(dataSynchronizationDetail);
		}
		describeMigrationJobDetailResponse.setDataSynchronizationDetailList(dataSynchronizationDetailListList);

		List<StructureInitializationDetail> structureInitializationDetailListList = new ArrayList<StructureInitializationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList.Length"); i++) {
			StructureInitializationDetail structureInitializationDetail = new StructureInitializationDetail();
			structureInitializationDetail.setDestinationOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].DestinationOwnerDBName"));
			structureInitializationDetail.setErrorMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ErrorMessage"));
			structureInitializationDetail.setObjectDefinition(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectDefinition"));
			structureInitializationDetail.setObjectName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectName"));
			structureInitializationDetail.setObjectType(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ObjectType"));
			structureInitializationDetail.setSourceOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].SourceOwnerDBName"));
			structureInitializationDetail.setStatus(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].Status"));

			List<StructureInitializationDetail1> constraintListList = new ArrayList<StructureInitializationDetail1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList.Length"); j++) {
				StructureInitializationDetail1 structureInitializationDetail1 = new StructureInitializationDetail1();
				structureInitializationDetail1.setDestinationOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].DestinationOwnerDBName"));
				structureInitializationDetail1.setErrorMessage(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ErrorMessage"));
				structureInitializationDetail1.setObjectDefinition(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectDefinition"));
				structureInitializationDetail1.setObjectName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectName"));
				structureInitializationDetail1.setObjectType(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].ObjectType"));
				structureInitializationDetail1.setSourceOwnerDBName(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].SourceOwnerDBName"));
				structureInitializationDetail1.setStatus(_ctx.stringValue("DescribeMigrationJobDetailResponse.StructureInitializationDetailList["+ i +"].ConstraintList["+ j +"].Status"));

				constraintListList.add(structureInitializationDetail1);
			}
			structureInitializationDetail.setConstraintList(constraintListList);

			structureInitializationDetailListList.add(structureInitializationDetail);
		}
		describeMigrationJobDetailResponse.setStructureInitializationDetailList(structureInitializationDetailListList);
	 
	 	return describeMigrationJobDetailResponse;
	}
}