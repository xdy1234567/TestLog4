package demo.springboot.util;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class ReceiveTransfer {
	public static String receiveTransfer() {
	    String res = HttpConnection.doPost(Core.getUrl_GetTransfer(),
	    GetTransfer.shape("6218129087231776", "6218129084383484", "马云", "10.00", "CNY", "Ieor9494854958dfdjkd9fd98f", "还款", "转账"));


	    System.out.println(res);
		JSONObject jsonObject= JSONObject.parseObject(res);
		Map<String,Object>returnJson=(Map<String,Object>)jsonObject;
		
		Map<String,Object>returnBody=(Map<String,Object>)returnJson.get("Body");
		
		System.out.println(returnBody.get("Transfer"));
		
		return (String) returnBody.get("Transfer");
	}

	
}

