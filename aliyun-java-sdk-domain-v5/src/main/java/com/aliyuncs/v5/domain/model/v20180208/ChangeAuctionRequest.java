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

package com.aliyuncs.v5.domain.model.v20180208;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeAuctionRequest extends RpcAcsRequest<ChangeAuctionResponse> {
	   

	private List<AuctionList> auctionList;
	public ChangeAuctionRequest() {
		super("Domain", "2018-02-08", "ChangeAuction", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<AuctionList> getAuctionList() {
		return this.auctionList;
	}

	public void setAuctionList(List<AuctionList> auctionList) {
		this.auctionList = auctionList;	
		if (auctionList != null) {
			for (int depth1 = 0; depth1 < auctionList.size(); depth1++) {
				putBodyParameter("AuctionList." + (depth1 + 1) + ".Winner" , auctionList.get(depth1).getWinner());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".ReserveRange" , auctionList.get(depth1).getReserveRange());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".DomainName" , auctionList.get(depth1).getDomainName());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".EndTime" , auctionList.get(depth1).getEndTime());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".TimeLeft" , auctionList.get(depth1).getTimeLeft());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".IsReserve" , auctionList.get(depth1).getIsReserve());
				if (auctionList.get(depth1).getBidRecords() != null) {
					for (int depth2 = 0; depth2 < auctionList.get(depth1).getBidRecords().size(); depth2++) {
						putBodyParameter("AuctionList." + (depth1 + 1) + ".BidRecords." + (depth2 + 1) + ".CreateTime" , auctionList.get(depth1).getBidRecords().get(depth2).getCreateTime());
						putBodyParameter("AuctionList." + (depth1 + 1) + ".BidRecords." + (depth2 + 1) + ".Price" , auctionList.get(depth1).getBidRecords().get(depth2).getPrice());
						putBodyParameter("AuctionList." + (depth1 + 1) + ".BidRecords." + (depth2 + 1) + ".UserId" , auctionList.get(depth1).getBidRecords().get(depth2).getUserId());
					}
				}
				putBodyParameter("AuctionList." + (depth1 + 1) + ".WinnerPrice" , auctionList.get(depth1).getWinnerPrice());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".Status" , auctionList.get(depth1).getStatus());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".ReservePrice" , auctionList.get(depth1).getReservePrice());
			}
		}	
	}

	public static class AuctionList {

		private String winner;

		private String reserveRange;

		private String domainName;

		private String endTime;

		private Long timeLeft;

		private Integer isReserve;

		private List<BidRecords> bidRecords;

		private Float winnerPrice;

		private String status;

		private Float reservePrice;

		public String getWinner() {
			return this.winner;
		}

		public void setWinner(String winner) {
			this.winner = winner;
		}

		public String getReserveRange() {
			return this.reserveRange;
		}

		public void setReserveRange(String reserveRange) {
			this.reserveRange = reserveRange;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Long getTimeLeft() {
			return this.timeLeft;
		}

		public void setTimeLeft(Long timeLeft) {
			this.timeLeft = timeLeft;
		}

		public Integer getIsReserve() {
			return this.isReserve;
		}

		public void setIsReserve(Integer isReserve) {
			this.isReserve = isReserve;
		}

		public List<BidRecords> getBidRecords() {
			return this.bidRecords;
		}

		public void setBidRecords(List<BidRecords> bidRecords) {
			this.bidRecords = bidRecords;
		}

		public Float getWinnerPrice() {
			return this.winnerPrice;
		}

		public void setWinnerPrice(Float winnerPrice) {
			this.winnerPrice = winnerPrice;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Float getReservePrice() {
			return this.reservePrice;
		}

		public void setReservePrice(Float reservePrice) {
			this.reservePrice = reservePrice;
		}

		public static class BidRecords {

			private String createTime;

			private Float price;

			private String userId;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Float getPrice() {
				return this.price;
			}

			public void setPrice(Float price) {
				this.price = price;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public Class<ChangeAuctionResponse> getResponseClass() {
		return ChangeAuctionResponse.class;
	}

}
