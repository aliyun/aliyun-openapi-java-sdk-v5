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

package com.aliyuncs.v5.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.dds.transform.v20151201.DescribeInstanceAutoRenewalAttributeResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAutoRenewalAttributeResponse extends AcsResponse {

	private Integer itemsNumbers;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<Item> items;

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String autoRenew;

		private String dBInstanceType;

		private String duration;

		private String regionId;

		private String dbInstanceId;

		public String getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(String autoRenew) {
			this.autoRenew = autoRenew;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}
	}

	@Override
	public DescribeInstanceAutoRenewalAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAutoRenewalAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
