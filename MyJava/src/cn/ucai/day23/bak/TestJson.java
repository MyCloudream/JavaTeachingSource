package cn.ucai.day23.bak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

public class TestJson {
	public static void main(String[] args) {
		List<Student> list = getStudents();
		Gson gson = new Gson();
		String json = gson.toJson(list);
		System.out.println(json);
		
		List<Student> listBack=gson.fromJson(json, List.class);
		System.out.println(listBack);
		
		List<HashMap<String,Object>> list2 = getStudentHahMap();
		String json2 = gson.toJson(list2);
		System.out.println(json2);
		
		String json3 = gson.toJson(getHashMap());
		System.out.println(json3);
	}
	
	public static HashMap<String,String> getHashMap(){
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("name", "尚鹏");
		map.put("age","20");
		return map;
	}
	
	public static List<HashMap<String,Object>> getStudentHahMap(){
		List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
		for(int i=0;i<5;i++){
			HashMap<String,Object> map = new HashMap<String,Object>();
			map.put("name", "张三"+i);
			map.put("age", 20+i);
			list.add(map);
		}
		return list;
	}
	
	public static List<Student> getStudents(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(20,"张三1"));
		list.add(new Student(21,"张三2"));
		list.add(new Student(22,"张三3"));
		list.add(new Student(23,"张三4"));
		list.add(new Student(24,"张三5"));
		return list;
	}
	
}
