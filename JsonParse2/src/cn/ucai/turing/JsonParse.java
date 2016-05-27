package cn.ucai.turing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;

public class JsonParse {
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
	}
}
