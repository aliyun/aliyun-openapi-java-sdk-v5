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

package com.aliyuncs.v5.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.domain.model.v20180129.FuzzyMatchDomainSensitiveWordResponse;
import com.aliyuncs.v5.domain.model.v20180129.FuzzyMatchDomainSensitiveWordResponse.MatchedSensitiveWord;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class FuzzyMatchDomainSensitiveWordResponseUnmarshaller {

	public static FuzzyMatchDomainSensitiveWordResponse unmarshall(FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWordResponse, UnmarshallerContext _ctx) {
		
		fuzzyMatchDomainSensitiveWordResponse.setRequestId(_ctx.stringValue("FuzzyMatchDomainSensitiveWordResponse.RequestId"));
		fuzzyMatchDomainSensitiveWordResponse.setKeyword(_ctx.stringValue("FuzzyMatchDomainSensitiveWordResponse.Keyword"));
		fuzzyMatchDomainSensitiveWordResponse.setExist(_ctx.booleanValue("FuzzyMatchDomainSensitiveWordResponse.Exist"));

		List<MatchedSensitiveWord> matchedSentiveWordsList = new ArrayList<MatchedSensitiveWord>();
		for (int i = 0; i < _ctx.lengthValue("FuzzyMatchDomainSensitiveWordResponse.MatchedSentiveWords.Length"); i++) {
			MatchedSensitiveWord matchedSensitiveWord = new MatchedSensitiveWord();
			matchedSensitiveWord.setWord(_ctx.stringValue("FuzzyMatchDomainSensitiveWordResponse.MatchedSentiveWords["+ i +"].Word"));

			matchedSentiveWordsList.add(matchedSensitiveWord);
		}
		fuzzyMatchDomainSensitiveWordResponse.setMatchedSentiveWords(matchedSentiveWordsList);
	 
	 	return fuzzyMatchDomainSensitiveWordResponse;
	}
}