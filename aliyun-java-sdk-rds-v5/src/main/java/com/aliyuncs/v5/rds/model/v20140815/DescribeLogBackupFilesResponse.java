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

package com.aliyuncs.v5.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.rds.transform.v20140815.DescribeLogBackupFilesResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogBackupFilesResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Long totalFileSize;

	private List<BinLogFile> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Long getTotalFileSize() {
		return this.totalFileSize;
	}

	public void setTotalFileSize(Long totalFileSize) {
		this.totalFileSize = totalFileSize;
	}

	public List<BinLogFile> getItems() {
		return this.items;
	}

	public void setItems(List<BinLogFile> items) {
		this.items = items;
	}

	public static class BinLogFile {

		private Long fileSize;

		private String logBeginTime;

		private String logEndTime;

		private String downloadLink;

		private String intranetDownloadLink;

		private String linkExpiredTime;

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getLogBeginTime() {
			return this.logBeginTime;
		}

		public void setLogBeginTime(String logBeginTime) {
			this.logBeginTime = logBeginTime;
		}

		public String getLogEndTime() {
			return this.logEndTime;
		}

		public void setLogEndTime(String logEndTime) {
			this.logEndTime = logEndTime;
		}

		public String getDownloadLink() {
			return this.downloadLink;
		}

		public void setDownloadLink(String downloadLink) {
			this.downloadLink = downloadLink;
		}

		public String getIntranetDownloadLink() {
			return this.intranetDownloadLink;
		}

		public void setIntranetDownloadLink(String intranetDownloadLink) {
			this.intranetDownloadLink = intranetDownloadLink;
		}

		public String getLinkExpiredTime() {
			return this.linkExpiredTime;
		}

		public void setLinkExpiredTime(String linkExpiredTime) {
			this.linkExpiredTime = linkExpiredTime;
		}
	}

	@Override
	public DescribeLogBackupFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogBackupFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
