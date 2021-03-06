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

package com.aliyuncs.yundun_ds.model.v20190103;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribePrivilegesRequest extends RpcAcsRequest<DescribePrivilegesResponse> {
	
	public DescribePrivilegesRequest() {
		super("Yundun-ds", "2019-01-03", "DescribePrivileges", "sddp");
	}

	private Long accountId;

	private Long useAccountId;

	private String dataTypeIds;

	private Integer featureType;

	private Integer pageSize;

	private Integer currentPage;

	private String lang;

	private String key;

	public Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId.toString());
		}
	}

	public Long getUseAccountId() {
		return this.useAccountId;
	}

	public void setUseAccountId(Long useAccountId) {
		this.useAccountId = useAccountId;
		if(useAccountId != null){
			putQueryParameter("UseAccountId", useAccountId.toString());
		}
	}

	public String getDataTypeIds() {
		return this.dataTypeIds;
	}

	public void setDataTypeIds(String dataTypeIds) {
		this.dataTypeIds = dataTypeIds;
		if(dataTypeIds != null){
			putQueryParameter("DataTypeIds", dataTypeIds);
		}
	}

	public Integer getFeatureType() {
		return this.featureType;
	}

	public void setFeatureType(Integer featureType) {
		this.featureType = featureType;
		if(featureType != null){
			putQueryParameter("FeatureType", featureType.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	@Override
	public Class<DescribePrivilegesResponse> getResponseClass() {
		return DescribePrivilegesResponse.class;
	}

}
