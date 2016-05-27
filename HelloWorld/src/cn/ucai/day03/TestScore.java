package cn.ucai.day03;

import cn.ucai.tools.InputTools;

/**
 *  比较运算符：
 *  >= > < <= 
 *  == 等于 
 *  != 不等于
 */
public class TestScore {
	public static void main(String[] args) {
		System.out.println("请输入成绩：");
		int score = InputTools.getInputInt();
		// 表达式 语句
		if(score>=90){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
	}
}
