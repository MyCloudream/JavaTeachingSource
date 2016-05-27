package cn.ucai.day04;

import cn.ucai.tools.InputTools;

public class TestIf {
	// alt + / ： 提示
	public static void main(String[] args) {
		System.out.println("请输入成绩：");
		int score = InputTools.getInputInt();
		if (score >= 90) {
			System.out.println("优秀");
		} else if (score >= 80) {// 0-N
			System.out.println("良好");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {// 0-1
			System.out.println("不及格");
		}
		/*if(score>=90){
			System.out.println("优秀");
		}
		
		if(score>=80){
			System.out.println("良好");
		}
		
		if(score>=60){
			System.out.println("及格");
		}*/
		
	}
}
