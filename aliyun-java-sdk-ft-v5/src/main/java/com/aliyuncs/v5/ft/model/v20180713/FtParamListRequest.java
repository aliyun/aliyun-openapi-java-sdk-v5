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

package com.aliyuncs.v5.ft.model.v20180713;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FtParamListRequest extends RpcAcsRequest<FtParamListResponse> {
	   

	private List<Disk> disk;

	private String name;
	public FtParamListRequest() {
		super("Ft", "2018-07-13", "FtParamList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Disk> getDisk() {
		return this.disk;
	}

	public void setDisk(List<Disk> disk) {
		this.disk = disk;	
		if (disk != null) {
			for (int depth1 = 0; depth1 < disk.size(); depth1++) {
				if (disk.get(depth1).getSize() != null) {
					for (int i = 0; i < disk.get(depth1).getSize().size(); i++) {
						putQueryParameter("Disk." + (depth1 + 1) + ".Size." + (i + 1) , disk.get(depth1).getSize().get(i));
					}
				}
				if (disk.get(depth1).getType() != null) {
					for (int i = 0; i < disk.get(depth1).getType().size(); i++) {
						putQueryParameter("Disk." + (depth1 + 1) + ".Type." + (i + 1) , disk.get(depth1).getType().get(i));
					}
				}
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public static class Disk {

		private List<String> size;

		private List<String> type;

		public List<String> getSize() {
			return this.size;
		}

		public void setSize(List<String> size) {
			this.size = size;
		}

		public List<String> getType() {
			return this.type;
		}

		public void setType(List<String> type) {
			this.type = type;
		}
	}

	@Override
	public Class<FtParamListResponse> getResponseClass() {
		return FtParamListResponse.class;
	}

}
