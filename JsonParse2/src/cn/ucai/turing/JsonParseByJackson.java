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
		// ���� תΪ json
		String jsonResult = gson.toJson(student);
		System.out.println(jsonResult);
		
		// Ч�ʱ�gson�ߺܶ�
		// ʹ��jackson��ɶ����json���໥ת��
		// json ת ����
		ObjectMapper om = new ObjectMapper();
		Student stu = om.readValue(jsonResult, Student.class);
		System.out.println(stu);
		// ����תjson
		String res = om.writeValueAsString(stu);
		System.out.println(res);
		
	}
}
