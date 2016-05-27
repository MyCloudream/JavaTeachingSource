package cn.ucai.day05;

import java.util.Arrays;

import cn.ucai.tools.InputTools;

public class TestArray4 {
	public static void main(String[] args) {
		// 名字数组  学号数组  10
		System.out.println("请输入班级人数：");
		int nums = InputTools.getInputInt();
		String[] nameArr = new String[nums];
		System.out.println(nameArr[0]);
		int[] noArr = new int[nums];
		// for:完成学生姓名和学号的录入工作
		for(int i=0;i<nameArr.length;i++){
			System.out.println("请输入姓名：");
			String name = InputTools.getInputString();
			nameArr[i] = name;
			System.out.println("请输入学号");
			int no = InputTools.getInputInt();
			noArr[i] = no;
		}
		// 输出两个数组元素
		System.out.println(Arrays.toString(nameArr));
		System.out.println(Arrays.toString(noArr));
		System.out.println("请输入要查找学号的姓名");
		String name = InputTools.getInputString();
		// 查找
		for(int i=0;i<nameArr.length;i++){
			if(nameArr[i].equals(name)){
				System.out.println(name+"同学的学号为："+noArr[i]);
				break;
			}
		}
	}
}
