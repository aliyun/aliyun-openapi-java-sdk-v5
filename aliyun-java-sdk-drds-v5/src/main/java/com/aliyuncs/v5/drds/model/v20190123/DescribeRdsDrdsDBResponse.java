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

package com.aliyuncs.v5.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.drds.transform.v20190123.DescribeRdsDrdsDBResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsDrdsDBResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<RdsDrdsDb> rdsDrdsDbs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<RdsDrdsDb> getRdsDrdsDbs() {
		return this.rdsDrdsDbs;
	}

	public void setRdsDrdsDbs(List<RdsDrdsDb> rdsDrdsDbs) {
		this.rdsDrdsDbs = rdsDrdsDbs;
	}

	public static class RdsDrdsDb {

		private String rdsId;

		private List<String> dBList;

		public String getRdsId() {
			return this.rdsId;
		}

		public void setRdsId(String rdsId) {
			this.rdsId = rdsId;
		}

		public List<String> getDBList() {
			return this.dBList;
		}

		public void setDBList(List<String> dBList) {
			this.dBList = dBList;
		}
	}

	@Override
	public DescribeRdsDrdsDBResponse getInstance(UnmarshallerContext context) {
		return	DescribeRdsDrdsDBResponseUnmarshaller.unmarshall(this, context);
	}
}
