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

package com.aliyuncs.v5.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.arms.model.v20190808.ListPrometheusAlertRulesResponse;
import com.aliyuncs.v5.arms.model.v20190808.ListPrometheusAlertRulesResponse.PrometheusAlertRule;
import com.aliyuncs.v5.arms.model.v20190808.ListPrometheusAlertRulesResponse.PrometheusAlertRule.Annotation;
import com.aliyuncs.v5.arms.model.v20190808.ListPrometheusAlertRulesResponse.PrometheusAlertRule.Label;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListPrometheusAlertRulesResponseUnmarshaller {

	public static ListPrometheusAlertRulesResponse unmarshall(ListPrometheusAlertRulesResponse listPrometheusAlertRulesResponse, UnmarshallerContext _ctx) {
		
		listPrometheusAlertRulesResponse.setRequestId(_ctx.stringValue("ListPrometheusAlertRulesResponse.RequestId"));

		List<PrometheusAlertRule> prometheusAlertRulesList = new ArrayList<PrometheusAlertRule>();
		for (int i = 0; i < _ctx.lengthValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules.Length"); i++) {
			PrometheusAlertRule prometheusAlertRule = new PrometheusAlertRule();
			prometheusAlertRule.setAlertId(_ctx.longValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].AlertId"));
			prometheusAlertRule.setAlertName(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].AlertName"));
			prometheusAlertRule.setMessage(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Message"));
			prometheusAlertRule.setType(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Type"));
			prometheusAlertRule.setExpression(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Expression"));
			prometheusAlertRule.setDuration(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Duration"));
			prometheusAlertRule.setClusterId(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].ClusterId"));
			prometheusAlertRule.setStatus(_ctx.integerValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Status"));
			prometheusAlertRule.setDispatchRuleId(_ctx.longValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].DispatchRuleId"));
			prometheusAlertRule.setNotifyType(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].NotifyType"));

			List<Label> labelsList = new ArrayList<Label>();
			for (int j = 0; j < _ctx.lengthValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Labels.Length"); j++) {
				Label label = new Label();
				label.setName(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Labels["+ j +"].Name"));
				label.setValue(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Labels["+ j +"].Value"));

				labelsList.add(label);
			}
			prometheusAlertRule.setLabels(labelsList);

			List<Annotation> annotationsList = new ArrayList<Annotation>();
			for (int j = 0; j < _ctx.lengthValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Annotations.Length"); j++) {
				Annotation annotation = new Annotation();
				annotation.setName(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Annotations["+ j +"].Name"));
				annotation.setValue(_ctx.stringValue("ListPrometheusAlertRulesResponse.PrometheusAlertRules["+ i +"].Annotations["+ j +"].Value"));

				annotationsList.add(annotation);
			}
			prometheusAlertRule.setAnnotations(annotationsList);

			prometheusAlertRulesList.add(prometheusAlertRule);
		}
		listPrometheusAlertRulesResponse.setPrometheusAlertRules(prometheusAlertRulesList);
	 
	 	return listPrometheusAlertRulesResponse;
	}
}