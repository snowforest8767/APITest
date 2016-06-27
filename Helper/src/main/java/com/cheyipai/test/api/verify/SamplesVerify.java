package com.cheyipai.test.api.verify;


import com.cheyipai.test.api.annotation.Verify;
import com.cheyipai.test.context.ContextUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SamplesVerify extends JsonVerify {

	@Verify(description = "延迟查询db获取response")
	public void delayQuerySetResponse(long millis, String sqlId)
			throws Exception {
		Thread.sleep(millis);
		Map<Integer, String> meta = new HashMap<Integer, String>();
		List<String[]> results = DBVerifyHelper.querySQL(sqlId, meta);
		List<Map<String, String>> l = new ArrayList<Map<String, String>>();
		for (int i = 0; i < results.size(); ++i) {
			Map<String, String> m = new HashMap<String, String>();
			String[] strs = results.get(i);
			for (int j = 0; j < strs.length; ++j) {
				m.put(meta.get(j), strs[j]);
			}
			l.add(m);
		}
		ObjectMapper objMapper = new ObjectMapper();
		ObjectNode objNode = (ObjectNode) objMapper.readTree(response);
		objNode.put(sqlId, objMapper.readTree(objMapper.writeValueAsString(l)));
		response = objMapper.writeValueAsString(objNode);
	}

	@Verify(description = "oracle验证示例")
	public void verifyOracleSample(String brandId) throws Exception {
		List<String[]> result = DBVerifyHelper.querySQL("query_brand");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(result.get(0)[0], brandId);
	}
	
	@Verify(description = "mysql验证示例")
	public void verifyMysqlSample() throws Exception {
		List<String[]> result = DBVerifyHelper.querySQL("query_app");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(result.get(0)[0], ContextUtils.getString("appId"));
	}

    @Verify(description = "判断是否为偶数")
    public void verifyEvenNum(String numStr) {
        Assert.assertEquals(Long.valueOf(numStr)%2, 0);
    }
}
