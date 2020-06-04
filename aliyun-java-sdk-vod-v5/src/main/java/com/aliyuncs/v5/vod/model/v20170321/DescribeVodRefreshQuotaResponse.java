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

package com.aliyuncs.v5.vod.model.v20170321;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.vod.transform.v20170321.DescribeVodRefreshQuotaResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodRefreshQuotaResponse extends AcsResponse {

	private String requestId;

	private String urlQuota;

	private String dirQuota;

	private String urlRemain;

	private String dirRemain;

	private String preloadQuota;

	private String blockQuota;

	private String preloadRemain;

	private String blockRemain;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUrlQuota() {
		return this.urlQuota;
	}

	public void setUrlQuota(String urlQuota) {
		this.urlQuota = urlQuota;
	}

	public String getDirQuota() {
		return this.dirQuota;
	}

	public void setDirQuota(String dirQuota) {
		this.dirQuota = dirQuota;
	}

	public String getUrlRemain() {
		return this.urlRemain;
	}

	public void setUrlRemain(String urlRemain) {
		this.urlRemain = urlRemain;
	}

	public String getDirRemain() {
		return this.dirRemain;
	}

	public void setDirRemain(String dirRemain) {
		this.dirRemain = dirRemain;
	}

	public String getPreloadQuota() {
		return this.preloadQuota;
	}

	public void setPreloadQuota(String preloadQuota) {
		this.preloadQuota = preloadQuota;
	}

	public String getBlockQuota() {
		return this.blockQuota;
	}

	public void setBlockQuota(String blockQuota) {
		this.blockQuota = blockQuota;
	}

	public String getPreloadRemain() {
		return this.preloadRemain;
	}

	public void setPreloadRemain(String preloadRemain) {
		this.preloadRemain = preloadRemain;
	}

	public String getBlockRemain() {
		return this.blockRemain;
	}

	public void setBlockRemain(String blockRemain) {
		this.blockRemain = blockRemain;
	}

	@Override
	public DescribeVodRefreshQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodRefreshQuotaResponseUnmarshaller.unmarshall(this, context);
	}
}
