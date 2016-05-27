package cn.ucai.day03;

import cn.ucai.tools.InputTools;
/**
 * 1、包名全小写
 * 2、类名、接口名 各单词首字母大写 
 * 3、变量名、方法名   第一个单词首字母小写，其他单词首字母大写
 */
public class TestDesc {
	public static void main(String[] args) {
//		System.out.println("请输入您的姓名：");
//		String name = InputTools.getInputString();
//		System.out.println("请输入您的故乡：");
//		String from = InputTools.getInputString();
//		System.out.println("请输入您的特长：");
//		String skill = InputTools.getInputString();
//		System.out.println("请输入您的Java成绩：");
//		int javaScore = InputTools.getInputInt();
//		System.out.println("我叫"+name+",来自"+from+",擅长"+skill+",java成绩为："+javaScore);
//		
		System.out.println("请输入Boolean类型");
		String strBoolean = InputTools.getInputString();
		boolean bool = Boolean.parseBoolean(strBoolean);
		System.out.println(bool);
	}
}
