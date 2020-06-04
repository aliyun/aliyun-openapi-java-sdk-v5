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

package com.aliyuncs.v5.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.vod.model.v20170321.GetAttachedMediaInfoResponse;
import com.aliyuncs.v5.vod.model.v20170321.GetAttachedMediaInfoResponse.AttachedMedia;
import com.aliyuncs.v5.vod.model.v20170321.GetAttachedMediaInfoResponse.AttachedMedia.Category;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetAttachedMediaInfoResponseUnmarshaller {

	public static GetAttachedMediaInfoResponse unmarshall(GetAttachedMediaInfoResponse getAttachedMediaInfoResponse, UnmarshallerContext _ctx) {
		
		getAttachedMediaInfoResponse.setRequestId(_ctx.stringValue("GetAttachedMediaInfoResponse.RequestId"));

		List<String> nonExistMediaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAttachedMediaInfoResponse.NonExistMediaIds.Length"); i++) {
			nonExistMediaIds.add(_ctx.stringValue("GetAttachedMediaInfoResponse.NonExistMediaIds["+ i +"]"));
		}
		getAttachedMediaInfoResponse.setNonExistMediaIds(nonExistMediaIds);

		List<AttachedMedia> attachedMediaListList = new ArrayList<AttachedMedia>();
		for (int i = 0; i < _ctx.lengthValue("GetAttachedMediaInfoResponse.AttachedMediaList.Length"); i++) {
			AttachedMedia attachedMedia = new AttachedMedia();
			attachedMedia.setMediaId(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].MediaId"));
			attachedMedia.setTitle(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Title"));
			attachedMedia.setType(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Type"));
			attachedMedia.setTags(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Tags"));
			attachedMedia.setURL(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].URL"));
			attachedMedia.setDescription(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Description"));
			attachedMedia.setFileSize(_ctx.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].FileSize"));
			attachedMedia.setStorageLocation(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].StorageLocation"));
			attachedMedia.setCreationTime(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].CreationTime"));
			attachedMedia.setModificationTime(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].ModificationTime"));
			attachedMedia.setAppId(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].AppId"));
			attachedMedia.setStatus(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Status"));
			attachedMedia.setOnlineStatus(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].OnlineStatus"));
			attachedMedia.setIcon(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Icon"));
			attachedMedia.setRegionId(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].RegionId"));

			List<Category> categoriesList = new ArrayList<Category>();
			for (int j = 0; j < _ctx.lengthValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories.Length"); j++) {
				Category category = new Category();
				category.setCateId(_ctx.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories["+ j +"].CateId"));
				category.setCateName(_ctx.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories["+ j +"].CateName"));
				category.setLevel(_ctx.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories["+ j +"].Level"));
				category.setParentId(_ctx.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories["+ j +"].ParentId"));

				categoriesList.add(category);
			}
			attachedMedia.setCategories(categoriesList);

			attachedMediaListList.add(attachedMedia);
		}
		getAttachedMediaInfoResponse.setAttachedMediaList(attachedMediaListList);
	 
	 	return getAttachedMediaInfoResponse;
	}
}