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

package com.aliyuncs.v5.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dds.model.v20151201.DescribeKernelReleaseNotesResponse;
import com.aliyuncs.v5.dds.model.v20151201.DescribeKernelReleaseNotesResponse.ReleaseNote;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeKernelReleaseNotesResponseUnmarshaller {

	public static DescribeKernelReleaseNotesResponse unmarshall(DescribeKernelReleaseNotesResponse describeKernelReleaseNotesResponse, UnmarshallerContext _ctx) {
		
		describeKernelReleaseNotesResponse.setRequestId(_ctx.stringValue("DescribeKernelReleaseNotesResponse.RequestId"));

		List<ReleaseNote> releaseNotesList = new ArrayList<ReleaseNote>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKernelReleaseNotesResponse.ReleaseNotes.Length"); i++) {
			ReleaseNote releaseNote = new ReleaseNote();
			releaseNote.setKernelVersion(_ctx.stringValue("DescribeKernelReleaseNotesResponse.ReleaseNotes["+ i +"].KernelVersion"));
			releaseNote.setReleaseNote(_ctx.stringValue("DescribeKernelReleaseNotesResponse.ReleaseNotes["+ i +"].ReleaseNote"));

			releaseNotesList.add(releaseNote);
		}
		describeKernelReleaseNotesResponse.setReleaseNotes(releaseNotesList);
	 
	 	return describeKernelReleaseNotesResponse;
	}
}