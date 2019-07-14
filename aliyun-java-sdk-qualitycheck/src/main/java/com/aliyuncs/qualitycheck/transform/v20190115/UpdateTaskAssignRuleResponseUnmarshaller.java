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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.UpdateTaskAssignRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskAssignRuleResponseUnmarshaller {

	public static UpdateTaskAssignRuleResponse unmarshall(UpdateTaskAssignRuleResponse updateTaskAssignRuleResponse, UnmarshallerContext _ctx) {
		
		updateTaskAssignRuleResponse.setRequestId(_ctx.stringValue("UpdateTaskAssignRuleResponse.RequestId"));
		updateTaskAssignRuleResponse.setSuccess(_ctx.booleanValue("UpdateTaskAssignRuleResponse.Success"));
		updateTaskAssignRuleResponse.setCode(_ctx.stringValue("UpdateTaskAssignRuleResponse.Code"));
		updateTaskAssignRuleResponse.setMessage(_ctx.stringValue("UpdateTaskAssignRuleResponse.Message"));
	 
	 	return updateTaskAssignRuleResponse;
	}
}