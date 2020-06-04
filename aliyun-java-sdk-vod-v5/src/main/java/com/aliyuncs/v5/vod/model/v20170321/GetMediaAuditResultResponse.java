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

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.vod.transform.v20170321.GetMediaAuditResultResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaAuditResultResponse extends AcsResponse {

	private String requestId;

	private MediaAuditResult mediaAuditResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaAuditResult getMediaAuditResult() {
		return this.mediaAuditResult;
	}

	public void setMediaAuditResult(MediaAuditResult mediaAuditResult) {
		this.mediaAuditResult = mediaAuditResult;
	}

	public static class MediaAuditResult {

		private String abnormalModules;

		private String label;

		private String suggestion;

		private List<AudioResultItem> audioResult;

		private List<ImageResultItem> imageResult;

		private List<TextResultItem> textResult;

		private VideoResult videoResult;

		public String getAbnormalModules() {
			return this.abnormalModules;
		}

		public void setAbnormalModules(String abnormalModules) {
			this.abnormalModules = abnormalModules;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public List<AudioResultItem> getAudioResult() {
			return this.audioResult;
		}

		public void setAudioResult(List<AudioResultItem> audioResult) {
			this.audioResult = audioResult;
		}

		public List<ImageResultItem> getImageResult() {
			return this.imageResult;
		}

		public void setImageResult(List<ImageResultItem> imageResult) {
			this.imageResult = imageResult;
		}

		public List<TextResultItem> getTextResult() {
			return this.textResult;
		}

		public void setTextResult(List<TextResultItem> textResult) {
			this.textResult = textResult;
		}

		public VideoResult getVideoResult() {
			return this.videoResult;
		}

		public void setVideoResult(VideoResult videoResult) {
			this.videoResult = videoResult;
		}

		public static class AudioResultItem {

			private String label;

			private String scene;

			private String score;

			private String suggestion;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}
		}

		public static class ImageResultItem {

			private String label;

			private String suggestion;

			private String type;

			private String url;

			private List<ResultItem> result;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public List<ResultItem> getResult() {
				return this.result;
			}

			public void setResult(List<ResultItem> result) {
				this.result = result;
			}

			public static class ResultItem {

				private String label;

				private String scene;

				private String score;

				private String suggestion;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getScene() {
					return this.scene;
				}

				public void setScene(String scene) {
					this.scene = scene;
				}

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}
			}
		}

		public static class TextResultItem {

			private String content;

			private String label;

			private String scene;

			private String score;

			private String suggestion;

			private String type;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class VideoResult {

			private String label;

			private String suggestion;

			private PornResult pornResult;

			private AdResult adResult;

			private LogoResult logoResult;

			private LiveResult liveResult;

			private TerrorismResult terrorismResult;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public PornResult getPornResult() {
				return this.pornResult;
			}

			public void setPornResult(PornResult pornResult) {
				this.pornResult = pornResult;
			}

			public AdResult getAdResult() {
				return this.adResult;
			}

			public void setAdResult(AdResult adResult) {
				this.adResult = adResult;
			}

			public LogoResult getLogoResult() {
				return this.logoResult;
			}

			public void setLogoResult(LogoResult logoResult) {
				this.logoResult = logoResult;
			}

			public LiveResult getLiveResult() {
				return this.liveResult;
			}

			public void setLiveResult(LiveResult liveResult) {
				this.liveResult = liveResult;
			}

			public TerrorismResult getTerrorismResult() {
				return this.terrorismResult;
			}

			public void setTerrorismResult(TerrorismResult terrorismResult) {
				this.terrorismResult = terrorismResult;
			}

			public static class PornResult {

				private String averageScore;

				private String label;

				private String maxScore;

				private String suggestion;

				private List<CounterListItem> counterList;

				private List<TopListItem> topList;

				public String getAverageScore() {
					return this.averageScore;
				}

				public void setAverageScore(String averageScore) {
					this.averageScore = averageScore;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getMaxScore() {
					return this.maxScore;
				}

				public void setMaxScore(String maxScore) {
					this.maxScore = maxScore;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public List<CounterListItem> getCounterList() {
					return this.counterList;
				}

				public void setCounterList(List<CounterListItem> counterList) {
					this.counterList = counterList;
				}

				public List<TopListItem> getTopList() {
					return this.topList;
				}

				public void setTopList(List<TopListItem> topList) {
					this.topList = topList;
				}

				public static class CounterListItem {

					private Integer count;

					private String label;

					public Integer getCount() {
						return this.count;
					}

					public void setCount(Integer count) {
						this.count = count;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}
				}

				public static class TopListItem {

					private String label;

					private String score;

					private String timestamp;

					private String url;

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTimestamp() {
						return this.timestamp;
					}

					public void setTimestamp(String timestamp) {
						this.timestamp = timestamp;
					}

					public String getUrl() {
						return this.url;
					}

					public void setUrl(String url) {
						this.url = url;
					}
				}
			}

			public static class AdResult {

				private String averageScore;

				private String label;

				private String maxScore;

				private String suggestion;

				private List<CounterListItem3> counterList1;

				private List<TopListItem4> topList2;

				public String getAverageScore() {
					return this.averageScore;
				}

				public void setAverageScore(String averageScore) {
					this.averageScore = averageScore;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getMaxScore() {
					return this.maxScore;
				}

				public void setMaxScore(String maxScore) {
					this.maxScore = maxScore;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public List<CounterListItem3> getCounterList1() {
					return this.counterList1;
				}

				public void setCounterList1(List<CounterListItem3> counterList1) {
					this.counterList1 = counterList1;
				}

				public List<TopListItem4> getTopList2() {
					return this.topList2;
				}

				public void setTopList2(List<TopListItem4> topList2) {
					this.topList2 = topList2;
				}

				public static class CounterListItem3 {

					private Integer count;

					private String label;

					public Integer getCount() {
						return this.count;
					}

					public void setCount(Integer count) {
						this.count = count;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}
				}

				public static class TopListItem4 {

					private String label;

					private String score;

					private String timestamp;

					private String url;

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTimestamp() {
						return this.timestamp;
					}

					public void setTimestamp(String timestamp) {
						this.timestamp = timestamp;
					}

					public String getUrl() {
						return this.url;
					}

					public void setUrl(String url) {
						this.url = url;
					}
				}
			}

			public static class LogoResult {

				private String averageScore;

				private String label;

				private String maxScore;

				private String suggestion;

				private List<CounterListItem7> counterList5;

				private List<TopListItem8> topList6;

				public String getAverageScore() {
					return this.averageScore;
				}

				public void setAverageScore(String averageScore) {
					this.averageScore = averageScore;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getMaxScore() {
					return this.maxScore;
				}

				public void setMaxScore(String maxScore) {
					this.maxScore = maxScore;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public List<CounterListItem7> getCounterList5() {
					return this.counterList5;
				}

				public void setCounterList5(List<CounterListItem7> counterList5) {
					this.counterList5 = counterList5;
				}

				public List<TopListItem8> getTopList6() {
					return this.topList6;
				}

				public void setTopList6(List<TopListItem8> topList6) {
					this.topList6 = topList6;
				}

				public static class CounterListItem7 {

					private Integer count;

					private String label;

					public Integer getCount() {
						return this.count;
					}

					public void setCount(Integer count) {
						this.count = count;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}
				}

				public static class TopListItem8 {

					private String label;

					private String score;

					private String timestamp;

					private String url;

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTimestamp() {
						return this.timestamp;
					}

					public void setTimestamp(String timestamp) {
						this.timestamp = timestamp;
					}

					public String getUrl() {
						return this.url;
					}

					public void setUrl(String url) {
						this.url = url;
					}
				}
			}

			public static class LiveResult {

				private String averageScore;

				private String label;

				private String maxScore;

				private String suggestion;

				private List<CounterListItem11> counterList9;

				private List<TopListItem12> topList10;

				public String getAverageScore() {
					return this.averageScore;
				}

				public void setAverageScore(String averageScore) {
					this.averageScore = averageScore;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getMaxScore() {
					return this.maxScore;
				}

				public void setMaxScore(String maxScore) {
					this.maxScore = maxScore;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public List<CounterListItem11> getCounterList9() {
					return this.counterList9;
				}

				public void setCounterList9(List<CounterListItem11> counterList9) {
					this.counterList9 = counterList9;
				}

				public List<TopListItem12> getTopList10() {
					return this.topList10;
				}

				public void setTopList10(List<TopListItem12> topList10) {
					this.topList10 = topList10;
				}

				public static class CounterListItem11 {

					private Integer count;

					private String label;

					public Integer getCount() {
						return this.count;
					}

					public void setCount(Integer count) {
						this.count = count;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}
				}

				public static class TopListItem12 {

					private String label;

					private String score;

					private String timestamp;

					private String url;

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTimestamp() {
						return this.timestamp;
					}

					public void setTimestamp(String timestamp) {
						this.timestamp = timestamp;
					}

					public String getUrl() {
						return this.url;
					}

					public void setUrl(String url) {
						this.url = url;
					}
				}
			}

			public static class TerrorismResult {

				private String averageScore;

				private String label;

				private String maxScore;

				private String suggestion;

				private List<CounterListItem15> counterList13;

				private List<TopListItem16> topList14;

				public String getAverageScore() {
					return this.averageScore;
				}

				public void setAverageScore(String averageScore) {
					this.averageScore = averageScore;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getMaxScore() {
					return this.maxScore;
				}

				public void setMaxScore(String maxScore) {
					this.maxScore = maxScore;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public List<CounterListItem15> getCounterList13() {
					return this.counterList13;
				}

				public void setCounterList13(List<CounterListItem15> counterList13) {
					this.counterList13 = counterList13;
				}

				public List<TopListItem16> getTopList14() {
					return this.topList14;
				}

				public void setTopList14(List<TopListItem16> topList14) {
					this.topList14 = topList14;
				}

				public static class CounterListItem15 {

					private Integer count;

					private String label;

					public Integer getCount() {
						return this.count;
					}

					public void setCount(Integer count) {
						this.count = count;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}
				}

				public static class TopListItem16 {

					private String label;

					private String score;

					private String timestamp;

					private String url;

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public String getScore() {
						return this.score;
					}

					public void setScore(String score) {
						this.score = score;
					}

					public String getTimestamp() {
						return this.timestamp;
					}

					public void setTimestamp(String timestamp) {
						this.timestamp = timestamp;
					}

					public String getUrl() {
						return this.url;
					}

					public void setUrl(String url) {
						this.url = url;
					}
				}
			}
		}
	}

	@Override
	public GetMediaAuditResultResponse getInstance(UnmarshallerContext context) {
		return	GetMediaAuditResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
