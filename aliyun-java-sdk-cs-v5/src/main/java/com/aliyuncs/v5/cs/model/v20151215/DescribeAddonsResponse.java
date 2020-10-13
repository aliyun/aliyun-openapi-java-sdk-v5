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

package com.aliyuncs.v5.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.cs.transform.v20151215.DescribeAddonsResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAddonsResponse extends AcsResponse {

	private String standardComponents;

	private List<ComponentGroupsItem> componentGroups;

	public String getStandardComponents() {
		return this.standardComponents;
	}

	public void setStandardComponents(String standardComponents) {
		this.standardComponents = standardComponents;
	}

	public List<ComponentGroupsItem> getComponentGroups() {
		return this.componentGroups;
	}

	public void setComponentGroups(List<ComponentGroupsItem> componentGroups) {
		this.componentGroups = componentGroups;
	}

	public static class ComponentGroupsItem {

		private String group_name;

		private List<ItemsItem> items;

		private List<String> _default;

		public String getGroup_name() {
			return this.group_name;
		}

		public void setGroup_name(String group_name) {
			this.group_name = group_name;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public List<String> get_Default() {
			return this._default;
		}

		public void set_Default(List<String> _default) {
			this._default = _default;
		}

		public static class ItemsItem {

			private String name;

			private String description;

			private Boolean disabled;

			private String version;

			private String required;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getDisabled() {
				return this.disabled;
			}

			public void setDisabled(Boolean disabled) {
				this.disabled = disabled;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getRequired() {
				return this.required;
			}

			public void setRequired(String required) {
				this.required = required;
			}
		}
	}

	@Override
	public DescribeAddonsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAddonsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
