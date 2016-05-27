package cn.ucai.day11.homework;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[] snoArr = {"101","102","103"};
		String[] nameArr = {"张三","李四","李双"};
		String[] genderArr = {"m","m","m"};
		Student[] stuArr = new Student[3];
		for(int i=0;i<3;i++){
			stuArr[i] = new Student();
			stuArr[i].setSno(snoArr[i]);
			stuArr[i].setName(nameArr[i]);
			stuArr[i].setGender(genderArr[i]);
		}
		System.out.println(Arrays.toString(stuArr));
		/*Student stu2 = new Student();
		stu2.setSno("102");
		stu2.setName("李四");
		stu2.setGender("man");
		
		Student stu3 = new Student();
		stu3.setSno("103");
		stu3.setName("李双");
		stu3.setGender("man");*/
	}
}
