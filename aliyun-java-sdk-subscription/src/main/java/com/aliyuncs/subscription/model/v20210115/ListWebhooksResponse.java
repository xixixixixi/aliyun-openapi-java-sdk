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

package com.aliyuncs.subscription.model.v20210115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.subscription.transform.v20210115.ListWebhooksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWebhooksResponse extends AcsResponse {

	private Integer totalCount;

	private String message;

	private Integer nextToken;

	private String requestId;

	private String code;

	private Boolean success;

	private List<Webhook> webhooks;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Integer nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Webhook> getWebhooks() {
		return this.webhooks;
	}

	public void setWebhooks(List<Webhook> webhooks) {
		this.webhooks = webhooks;
	}

	public static class Webhook {

		private String serverUrl;

		private Long webhookId;

		private String name;

		public String getServerUrl() {
			return this.serverUrl;
		}

		public void setServerUrl(String serverUrl) {
			this.serverUrl = serverUrl;
		}

		public Long getWebhookId() {
			return this.webhookId;
		}

		public void setWebhookId(Long webhookId) {
			this.webhookId = webhookId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public ListWebhooksResponse getInstance(UnmarshallerContext context) {
		return	ListWebhooksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
