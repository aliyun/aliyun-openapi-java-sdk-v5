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

package com.aliyuncs.v5.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.vod.transform.v20170321.DeleteMezzaninesResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteMezzaninesResponse extends AcsResponse {

	private String requestId;

	private List<String> nonExistVideoIds;

	private List<String> unRemoveableVideoIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getNonExistVideoIds() {
		return this.nonExistVideoIds;
	}

	public void setNonExistVideoIds(List<String> nonExistVideoIds) {
		this.nonExistVideoIds = nonExistVideoIds;
	}

	public List<String> getUnRemoveableVideoIds() {
		return this.unRemoveableVideoIds;
	}

	public void setUnRemoveableVideoIds(List<String> unRemoveableVideoIds) {
		this.unRemoveableVideoIds = unRemoveableVideoIds;
	}

	@Override
	public DeleteMezzaninesResponse getInstance(UnmarshallerContext context) {
		return	DeleteMezzaninesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
