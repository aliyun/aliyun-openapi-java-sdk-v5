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

package com.aliyuncs.v5.imagerecog.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.imagerecog.model.v20190930.DetectFruitsResponse;
import com.aliyuncs.v5.imagerecog.model.v20190930.DetectFruitsResponse.Data;
import com.aliyuncs.v5.imagerecog.model.v20190930.DetectFruitsResponse.Data.Element;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DetectFruitsResponseUnmarshaller {

	public static DetectFruitsResponse unmarshall(DetectFruitsResponse detectFruitsResponse, UnmarshallerContext _ctx) {
		
		detectFruitsResponse.setRequestId(_ctx.stringValue("DetectFruitsResponse.RequestId"));

		Data data = new Data();

		List<Element> elementsList = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectFruitsResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setName(_ctx.stringValue("DetectFruitsResponse.Data.Elements["+ i +"].Name"));
			element.setScore(_ctx.floatValue("DetectFruitsResponse.Data.Elements["+ i +"].Score"));

			List<Float> box = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DetectFruitsResponse.Data.Elements["+ i +"].Box.Length"); j++) {
				box.add(_ctx.floatValue("DetectFruitsResponse.Data.Elements["+ i +"].Box["+ j +"]"));
			}
			element.setBox(box);

			elementsList.add(element);
		}
		data.setElements(elementsList);
		detectFruitsResponse.setData(data);
	 
	 	return detectFruitsResponse;
	}
}