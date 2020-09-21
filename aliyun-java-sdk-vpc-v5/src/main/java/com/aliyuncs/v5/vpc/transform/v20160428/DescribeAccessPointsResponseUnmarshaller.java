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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.vpc.model.v20160428.DescribeAccessPointsResponse;
import com.aliyuncs.v5.vpc.model.v20160428.DescribeAccessPointsResponse.AccessPointType;
import com.aliyuncs.v5.vpc.model.v20160428.DescribeAccessPointsResponse.AccessPointType.AccessPointFeatureModel;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeAccessPointsResponseUnmarshaller {

	public static DescribeAccessPointsResponse unmarshall(DescribeAccessPointsResponse describeAccessPointsResponse, UnmarshallerContext _ctx) {
		
		describeAccessPointsResponse.setRequestId(_ctx.stringValue("DescribeAccessPointsResponse.RequestId"));
		describeAccessPointsResponse.setPageNumber(_ctx.integerValue("DescribeAccessPointsResponse.PageNumber"));
		describeAccessPointsResponse.setPageSize(_ctx.integerValue("DescribeAccessPointsResponse.PageSize"));
		describeAccessPointsResponse.setTotalCount(_ctx.integerValue("DescribeAccessPointsResponse.TotalCount"));

		List<AccessPointType> accessPointSetList = new ArrayList<AccessPointType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessPointsResponse.AccessPointSet.Length"); i++) {
			AccessPointType accessPointType = new AccessPointType();
			accessPointType.setAccessPointId(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].AccessPointId"));
			accessPointType.setStatus(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Status"));
			accessPointType.setType(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Type"));
			accessPointType.setAttachedRegionNo(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].AttachedRegionNo"));
			accessPointType.setLocation(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Location"));
			accessPointType.setHostOperator(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].HostOperator"));
			accessPointType.setName(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Name"));
			accessPointType.setDescription(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].Description"));

			List<AccessPointFeatureModel> accessPointFeatureModelsList = new ArrayList<AccessPointFeatureModel>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].AccessPointFeatureModels.Length"); j++) {
				AccessPointFeatureModel accessPointFeatureModel = new AccessPointFeatureModel();
				accessPointFeatureModel.setFeatureKey(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].AccessPointFeatureModels["+ j +"].FeatureKey"));
				accessPointFeatureModel.setFeatureValue(_ctx.stringValue("DescribeAccessPointsResponse.AccessPointSet["+ i +"].AccessPointFeatureModels["+ j +"].FeatureValue"));

				accessPointFeatureModelsList.add(accessPointFeatureModel);
			}
			accessPointType.setAccessPointFeatureModels(accessPointFeatureModelsList);

			accessPointSetList.add(accessPointType);
		}
		describeAccessPointsResponse.setAccessPointSet(accessPointSetList);
	 
	 	return describeAccessPointsResponse;
	}
}