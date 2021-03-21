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

package com.aliyuncs.v5.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.imm.model.v20170906.ListFaceGroupsResponse;
import com.aliyuncs.v5.imm.model.v20170906.ListFaceGroupsResponse.FaceGroupsItem;
import com.aliyuncs.v5.imm.model.v20170906.ListFaceGroupsResponse.FaceGroupsItem.GroupCoverFace;
import com.aliyuncs.v5.imm.model.v20170906.ListFaceGroupsResponse.FaceGroupsItem.GroupCoverFace.FaceBoundary;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListFaceGroupsResponseUnmarshaller {

	public static ListFaceGroupsResponse unmarshall(ListFaceGroupsResponse listFaceGroupsResponse, UnmarshallerContext _ctx) {
		
		listFaceGroupsResponse.setRequestId(_ctx.stringValue("ListFaceGroupsResponse.RequestId"));
		listFaceGroupsResponse.setNextMarker(_ctx.stringValue("ListFaceGroupsResponse.NextMarker"));

		List<FaceGroupsItem> faceGroupsList = new ArrayList<FaceGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceGroupsResponse.FaceGroups.Length"); i++) {
			FaceGroupsItem faceGroupsItem = new FaceGroupsItem();
			faceGroupsItem.setGroupId(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupId"));
			faceGroupsItem.setGroupName(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupName"));
			faceGroupsItem.setFaceCount(_ctx.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].FaceCount"));
			faceGroupsItem.setCreateTime(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].CreateTime"));
			faceGroupsItem.setModifyTime(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].ModifyTime"));
			faceGroupsItem.setRemarksA(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].RemarksA"));
			faceGroupsItem.setRemarksB(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].RemarksB"));
			faceGroupsItem.setRemarksC(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].RemarksC"));
			faceGroupsItem.setRemarksD(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].RemarksD"));
			faceGroupsItem.setRemarksArrayA(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].RemarksArrayA"));
			faceGroupsItem.setRemarksArrayB(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].RemarksArrayB"));
			faceGroupsItem.setExternalId(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].ExternalId"));
			faceGroupsItem.setImageCount(_ctx.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].ImageCount"));
			faceGroupsItem.setGender(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].Gender"));
			faceGroupsItem.setMaxAge(_ctx.floatValue("ListFaceGroupsResponse.FaceGroups["+ i +"].MaxAge"));
			faceGroupsItem.setAverageAge(_ctx.floatValue("ListFaceGroupsResponse.FaceGroups["+ i +"].AverageAge"));
			faceGroupsItem.setMinAge(_ctx.floatValue("ListFaceGroupsResponse.FaceGroups["+ i +"].MinAge"));

			GroupCoverFace groupCoverFace = new GroupCoverFace();
			groupCoverFace.setFaceId(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceId"));
			groupCoverFace.setImageUri(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.ImageUri"));
			groupCoverFace.setExternalId(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.ExternalId"));

			FaceBoundary faceBoundary = new FaceBoundary();
			faceBoundary.setLeft(_ctx.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceBoundary.Left"));
			faceBoundary.setTop(_ctx.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceBoundary.Top"));
			faceBoundary.setWidth(_ctx.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceBoundary.Width"));
			faceBoundary.setHeight(_ctx.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceBoundary.Height"));
			groupCoverFace.setFaceBoundary(faceBoundary);
			faceGroupsItem.setGroupCoverFace(groupCoverFace);

			faceGroupsList.add(faceGroupsItem);
		}
		listFaceGroupsResponse.setFaceGroups(faceGroupsList);
	 
	 	return listFaceGroupsResponse;
	}
}