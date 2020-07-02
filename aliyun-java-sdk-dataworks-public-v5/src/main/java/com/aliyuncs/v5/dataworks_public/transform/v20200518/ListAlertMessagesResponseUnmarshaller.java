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

package com.aliyuncs.v5.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dataworks_public.model.v20200518.ListAlertMessagesResponse;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem.InstancesItem;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem.NodesItem;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem.SlaAlert;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem.TopicsItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListAlertMessagesResponseUnmarshaller {

	public static ListAlertMessagesResponse unmarshall(ListAlertMessagesResponse listAlertMessagesResponse, UnmarshallerContext _ctx) {
		
		listAlertMessagesResponse.setRequestId(_ctx.stringValue("ListAlertMessagesResponse.RequestId"));
		listAlertMessagesResponse.setSuccess(_ctx.booleanValue("ListAlertMessagesResponse.Success"));
		listAlertMessagesResponse.setErrorCode(_ctx.stringValue("ListAlertMessagesResponse.ErrorCode"));
		listAlertMessagesResponse.setErrorMessage(_ctx.stringValue("ListAlertMessagesResponse.ErrorMessage"));
		listAlertMessagesResponse.setHttpStatusCode(_ctx.integerValue("ListAlertMessagesResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.stringValue("ListAlertMessagesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.stringValue("ListAlertMessagesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.stringValue("ListAlertMessagesResponse.Data.TotalCount"));

		List<AlertMessagesItem> alertMessagesList = new ArrayList<AlertMessagesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertMessagesResponse.Data.AlertMessages.Length"); i++) {
			AlertMessagesItem alertMessagesItem = new AlertMessagesItem();
			alertMessagesItem.setAlertId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertId"));
			alertMessagesItem.setAlertTime(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertTime"));
			alertMessagesItem.setSource(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Source"));
			alertMessagesItem.setRemindId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].RemindId"));
			alertMessagesItem.setRemindName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].RemindName"));
			alertMessagesItem.setAlertUser(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertUser"));
			alertMessagesItem.setAlertMethod(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertMethod"));
			alertMessagesItem.setAlertMessageStatus(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertMessageStatus"));
			alertMessagesItem.setContent(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Content"));

			SlaAlert slaAlert = new SlaAlert();
			slaAlert.setBaselineId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.BaselineId"));
			slaAlert.setBaselineName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.BaselineName"));
			slaAlert.setBaselineOwner(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.BaselineOwner"));
			slaAlert.setBizdate(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.Bizdate"));
			slaAlert.setInGroupId(_ctx.integerValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.InGroupId"));
			slaAlert.setProjectId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.ProjectId"));
			slaAlert.setStatus(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.Status"));
			alertMessagesItem.setSlaAlert(slaAlert);

			List<InstancesItem> instancesList = new ArrayList<InstancesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances.Length"); j++) {
				InstancesItem instancesItem = new InstancesItem();
				instancesItem.setNodeId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].NodeId"));
				instancesItem.setNodeName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].NodeName"));
				instancesItem.setProjectId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].ProjectId"));
				instancesItem.setStatus(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].Status"));
				instancesItem.setInstanceId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].InstanceId"));

				instancesList.add(instancesItem);
			}
			alertMessagesItem.setInstances(instancesList);

			List<TopicsItem> topicsList = new ArrayList<TopicsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics.Length"); j++) {
				TopicsItem topicsItem = new TopicsItem();
				topicsItem.setNodeId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].NodeId"));
				topicsItem.setInstanceId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].InstanceId"));
				topicsItem.setTopicId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].TopicId"));
				topicsItem.setTopicName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].TopicName"));
				topicsItem.setTopicOwner(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].TopicOwner"));
				topicsItem.setTopicStatus(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].TopicStatus"));

				topicsList.add(topicsItem);
			}
			alertMessagesItem.setTopics(topicsList);

			List<NodesItem> nodesList = new ArrayList<NodesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes.Length"); j++) {
				NodesItem nodesItem = new NodesItem();
				nodesItem.setNodeId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes["+ j +"].NodeId"));
				nodesItem.setNodeName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes["+ j +"].NodeName"));
				nodesItem.setOwner(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes["+ j +"].Owner"));
				nodesItem.setProjectId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes["+ j +"].ProjectId"));

				nodesList.add(nodesItem);
			}
			alertMessagesItem.setNodes(nodesList);

			alertMessagesList.add(alertMessagesItem);
		}
		data.setAlertMessages(alertMessagesList);
		listAlertMessagesResponse.setData(data);
	 
	 	return listAlertMessagesResponse;
	}
}