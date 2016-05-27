package cn.ucai.jsonparse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import cn.ucai.jsonparse.bean.Address;
import cn.ucai.jsonparse.bean.Student;

/**
 * json������
 * 1���ļ��е����ݶ�����(IO��)
 * 2��������ݽ���
 */
public class JsonParse {
	public static void main(String[] args) throws Exception{
		String path = "E:/test/homework.json";
		// ��ȡָ��·����json����
		String json = getJsonString(path);
		List<Student> list = getStudents(json);
		System.out.println(list);
	}
	
	public static List<Student> getStudents(String json) throws Exception{
		List<Student> list = new ArrayList<Student>();
		JSONArray jsonArray = new JSONArray(json);
		for(int i=0;i<jsonArray.length();i++){
			JSONObject object = jsonArray.getJSONObject(i);
			String jsonObject = object.toString();
			Student student = parseJson(jsonObject);
			list.add(student);
		}
		return list;
	}
	
	/**
	 * ���json���ݵĽ���������װΪStudent����
	 * @param json json����
	 * @return Student����
	 * @throws Exception
	 */
	public static Student parseJson(String json) throws Exception{
		// object��ʾ����json����
		// json���ݵĽ���
		JSONObject object = new JSONObject(json);
		String name = object.getString("name");
		int age = object.getInt("age");
		JSONArray addressArray = object.getJSONArray("address");
		List<Address> list = new ArrayList<Address>();
		for(int i=0;i<addressArray.length();i++){
			JSONObject jsonAddress = addressArray.getJSONObject(i);
			String city = jsonAddress.getString("city");
			String street = jsonAddress.getString("street");
			Address address = new Address(city,street);
			list.add(address);
		}
		
		// Student���������
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		student.setList(list);
		return student;
	}
	
	
	/**
	 * ��ȡָ��·����json��ʽ���ļ�
	 * @param path ·��
	 * @return String��ʽ��json����
	 * @throws Exception
	 */
	public static String getJsonString(String path) throws Exception{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(new File(path))));
		String str = null;
		StringBuilder builder = new StringBuilder();
		while((str=br.readLine())!=null){
			builder.append(str);
		}
		br.close();
		return builder.toString(); 
	}
}
