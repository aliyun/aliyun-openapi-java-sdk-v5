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

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.rds.transform.v20140815.DescribeResourceUsageResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceUsageResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String engine;

	private Long diskUsed;

	private Long dataSize;

	private Long logSize;

	private Long backupSize;

	private Long backupOssDataSize;

	private Long backupOssLogSize;

	private Long sQLSize;

	private Long coldBackupSize;

	private Long backupDataSize;

	private Long backupLogSize;

	private Long paidBackupSize;

	private Long archiveBackupSize;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Long getDiskUsed() {
		return this.diskUsed;
	}

	public void setDiskUsed(Long diskUsed) {
		this.diskUsed = diskUsed;
	}

	public Long getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(Long dataSize) {
		this.dataSize = dataSize;
	}

	public Long getLogSize() {
		return this.logSize;
	}

	public void setLogSize(Long logSize) {
		this.logSize = logSize;
	}

	public Long getBackupSize() {
		return this.backupSize;
	}

	public void setBackupSize(Long backupSize) {
		this.backupSize = backupSize;
	}

	public Long getBackupOssDataSize() {
		return this.backupOssDataSize;
	}

	public void setBackupOssDataSize(Long backupOssDataSize) {
		this.backupOssDataSize = backupOssDataSize;
	}

	public Long getBackupOssLogSize() {
		return this.backupOssLogSize;
	}

	public void setBackupOssLogSize(Long backupOssLogSize) {
		this.backupOssLogSize = backupOssLogSize;
	}

	public Long getSQLSize() {
		return this.sQLSize;
	}

	public void setSQLSize(Long sQLSize) {
		this.sQLSize = sQLSize;
	}

	public Long getColdBackupSize() {
		return this.coldBackupSize;
	}

	public void setColdBackupSize(Long coldBackupSize) {
		this.coldBackupSize = coldBackupSize;
	}

	public Long getBackupDataSize() {
		return this.backupDataSize;
	}

	public void setBackupDataSize(Long backupDataSize) {
		this.backupDataSize = backupDataSize;
	}

	public Long getBackupLogSize() {
		return this.backupLogSize;
	}

	public void setBackupLogSize(Long backupLogSize) {
		this.backupLogSize = backupLogSize;
	}

	public Long getPaidBackupSize() {
		return this.paidBackupSize;
	}

	public void setPaidBackupSize(Long paidBackupSize) {
		this.paidBackupSize = paidBackupSize;
	}

	public Long getArchiveBackupSize() {
		return this.archiveBackupSize;
	}

	public void setArchiveBackupSize(Long archiveBackupSize) {
		this.archiveBackupSize = archiveBackupSize;
	}

	@Override
	public DescribeResourceUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceUsageResponseUnmarshaller.unmarshall(this, context);
	}
}
