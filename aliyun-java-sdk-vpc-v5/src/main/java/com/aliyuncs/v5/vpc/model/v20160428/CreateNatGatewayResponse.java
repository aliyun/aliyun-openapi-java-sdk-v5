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

package com.aliyuncs.v5.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.vpc.transform.v20160428.CreateNatGatewayResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateNatGatewayResponse extends AcsResponse {

	private String requestId;

	private String natGatewayId;

	private List<String> forwardTableIds;

	private List<String> snatTableIds;

	private List<String> bandwidthPackageIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
	}

	public List<String> getForwardTableIds() {
		return this.forwardTableIds;
	}

	public void setForwardTableIds(List<String> forwardTableIds) {
		this.forwardTableIds = forwardTableIds;
	}

	public List<String> getSnatTableIds() {
		return this.snatTableIds;
	}

	public void setSnatTableIds(List<String> snatTableIds) {
		this.snatTableIds = snatTableIds;
	}

	public List<String> getBandwidthPackageIds() {
		return this.bandwidthPackageIds;
	}

	public void setBandwidthPackageIds(List<String> bandwidthPackageIds) {
		this.bandwidthPackageIds = bandwidthPackageIds;
	}

	@Override
	public CreateNatGatewayResponse getInstance(UnmarshallerContext context) {
		return	CreateNatGatewayResponseUnmarshaller.unmarshall(this, context);
	}
}
