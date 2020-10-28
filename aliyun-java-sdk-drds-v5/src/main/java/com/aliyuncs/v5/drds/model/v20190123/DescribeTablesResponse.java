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
import com.aliyuncs.v5.drds.transform.v20190123.DescribeTablesResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTablesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<ListItem> list;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String table;

		private String shardKey;

		private Boolean isShard;

		private Boolean isLocked;

		private Integer dbInstType;

		private Boolean broadcast;

		private Boolean allowFullTableScan;

		private Integer status;

		public String getTable() {
			return this.table;
		}

		public void setTable(String table) {
			this.table = table;
		}

		public String getShardKey() {
			return this.shardKey;
		}

		public void setShardKey(String shardKey) {
			this.shardKey = shardKey;
		}

		public Boolean getIsShard() {
			return this.isShard;
		}

		public void setIsShard(Boolean isShard) {
			this.isShard = isShard;
		}

		public Boolean getIsLocked() {
			return this.isLocked;
		}

		public void setIsLocked(Boolean isLocked) {
			this.isLocked = isLocked;
		}

		public Integer getDbInstType() {
			return this.dbInstType;
		}

		public void setDbInstType(Integer dbInstType) {
			this.dbInstType = dbInstType;
		}

		public Boolean getBroadcast() {
			return this.broadcast;
		}

		public void setBroadcast(Boolean broadcast) {
			this.broadcast = broadcast;
		}

		public Boolean getAllowFullTableScan() {
			return this.allowFullTableScan;
		}

		public void setAllowFullTableScan(Boolean allowFullTableScan) {
			this.allowFullTableScan = allowFullTableScan;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribeTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
