package cn.ucai.day11.homework;

import java.util.Arrays;
import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int count = scanner.nextInt();
		Student[] stuArr = new Student[count];
		for(int i=0;i<count;i++){
			System.out.println("请输入学生信息");
			String msg = scanner.next();
			// 拆分  1,张三,man
			String[] msgArr = msg.split(",");
			stuArr[i] = new Student();
			stuArr[i].setSno(msgArr[0]);
			stuArr[i].setName(msgArr[1]);
			stuArr[i].setGender(msgArr[2]);
		}
		
		System.out.println(Arrays.toString(stuArr));
		for(int i=0;i<count;i++){
			if(stuArr[i].getName().contains("张")){
				System.out.println(stuArr[i].toString());
			}
		}
	}
}
