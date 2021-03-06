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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListCASSlsProjectResponse;
import com.aliyuncs.sofa.model.v20190815.ListCASSlsProjectResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCASSlsProjectResponseUnmarshaller {

	public static ListCASSlsProjectResponse unmarshall(ListCASSlsProjectResponse listCASSlsProjectResponse, UnmarshallerContext _ctx) {
		
		listCASSlsProjectResponse.setRequestId(_ctx.stringValue("ListCASSlsProjectResponse.RequestId"));
		listCASSlsProjectResponse.setResultCode(_ctx.stringValue("ListCASSlsProjectResponse.ResultCode"));
		listCASSlsProjectResponse.setResultMessage(_ctx.stringValue("ListCASSlsProjectResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCASSlsProjectResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("ListCASSlsProjectResponse.Data["+ i +"].Description"));
			dataItem.setName(_ctx.stringValue("ListCASSlsProjectResponse.Data["+ i +"].Name"));

			data.add(dataItem);
		}
		listCASSlsProjectResponse.setData(data);
	 
	 	return listCASSlsProjectResponse;
	}
}