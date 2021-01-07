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

package com.aliyuncs.v5.waf_openapi.model.v20190910;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.waf_openapi.transform.v20190910.DescribeWafSourceIpSegmentResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWafSourceIpSegmentResponse extends AcsResponse {

	private String requestId;

	private String ips;

	private String ipV6s;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIps() {
		return this.ips;
	}

	public void setIps(String ips) {
		this.ips = ips;
	}

	public String getIpV6s() {
		return this.ipV6s;
	}

	public void setIpV6s(String ipV6s) {
		this.ipV6s = ipV6s;
	}

	@Override
	public DescribeWafSourceIpSegmentResponse getInstance(UnmarshallerContext context) {
		return	DescribeWafSourceIpSegmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
