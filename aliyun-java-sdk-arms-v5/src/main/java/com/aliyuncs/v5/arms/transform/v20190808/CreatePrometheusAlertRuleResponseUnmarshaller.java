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

import com.aliyuncs.v5.arms.model.v20190808.CreatePrometheusAlertRuleResponse;
import com.aliyuncs.v5.arms.model.v20190808.CreatePrometheusAlertRuleResponse.PrometheusAlertRule;
import com.aliyuncs.v5.arms.model.v20190808.CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Annotation;
import com.aliyuncs.v5.arms.model.v20190808.CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Label;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreatePrometheusAlertRuleResponseUnmarshaller {

	public static CreatePrometheusAlertRuleResponse unmarshall(CreatePrometheusAlertRuleResponse createPrometheusAlertRuleResponse, UnmarshallerContext _ctx) {
		
		createPrometheusAlertRuleResponse.setRequestId(_ctx.stringValue("CreatePrometheusAlertRuleResponse.RequestId"));

		PrometheusAlertRule prometheusAlertRule = new PrometheusAlertRule();
		prometheusAlertRule.setAlertId(_ctx.longValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.AlertId"));
		prometheusAlertRule.setAlertName(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.AlertName"));
		prometheusAlertRule.setMessage(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Message"));
		prometheusAlertRule.setType(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Type"));
		prometheusAlertRule.setExpression(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Expression"));
		prometheusAlertRule.setDuration(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Duration"));
		prometheusAlertRule.setClusterId(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.ClusterId"));
		prometheusAlertRule.setStatus(_ctx.integerValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Status"));
		prometheusAlertRule.setDispatchRuleId(_ctx.longValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.DispatchRuleId"));
		prometheusAlertRule.setNotifyType(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.NotifyType"));

		List<Label> labelsList = new ArrayList<Label>();
		for (int i = 0; i < _ctx.lengthValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Labels.Length"); i++) {
			Label label = new Label();
			label.setName(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Labels["+ i +"].Name"));
			label.setValue(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Labels["+ i +"].Value"));

			labelsList.add(label);
		}
		prometheusAlertRule.setLabels(labelsList);

		List<Annotation> annotationsList = new ArrayList<Annotation>();
		for (int i = 0; i < _ctx.lengthValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Annotations.Length"); i++) {
			Annotation annotation = new Annotation();
			annotation.setName(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Annotations["+ i +"].Name"));
			annotation.setValue(_ctx.stringValue("CreatePrometheusAlertRuleResponse.PrometheusAlertRule.Annotations["+ i +"].Value"));

			annotationsList.add(annotation);
		}
		prometheusAlertRule.setAnnotations(annotationsList);
		createPrometheusAlertRuleResponse.setPrometheusAlertRule(prometheusAlertRule);
	 
	 	return createPrometheusAlertRuleResponse;
	}
}