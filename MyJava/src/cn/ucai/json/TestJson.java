package cn.ucai.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {
	public static void main(String[] args) {
		Result result = new Result();
		result.setSuccess(true);
		result.setMsg("³É¹¦");
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			String str = om.writeValueAsString(result);
			System.out.println(str);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
