package cn.ucai.turing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonParseByJackson {
	public static void main(String[] args) throws Exception{
		String path = "E:/test/stu.json";
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(new File(path))));
		Gson gson = new Gson();
		Student student = gson.fromJson(br, Student.class);
		System.out.println(student);
		// 对象 转为 json
		String jsonResult = gson.toJson(student);
		System.out.println(jsonResult);
		
		// 效率比gson高很多
		// 使用jackson完成对象和json的相互转换
		// json 转 对象
		ObjectMapper om = new ObjectMapper();
		Student stu = om.readValue(jsonResult, Student.class);
		System.out.println(stu);
		// 对象转json
		String res = om.writeValueAsString(stu);
		System.out.println(res);
		
	}
}
