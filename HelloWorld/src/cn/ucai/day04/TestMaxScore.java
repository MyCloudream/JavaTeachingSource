package cn.ucai.day04;

import cn.ucai.tools.InputTools;

/**
 * 键盘输入三门成绩，输出最大值 
 */
public class TestMaxScore {
	public static void main(String[] args) {
		System.out.println("请输入javase成绩：");
		int a = InputTools.getInputInt();
		System.out.println("请输入android成绩：");
		int b = InputTools.getInputInt();
		System.out.println("请输入javaee成绩：");
		int c = InputTools.getInputInt();
		// 2 6 8 
		int max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		System.out.println(max);
		System.out.println(Math.max(a, Math.max(b, c)));
		
		int max2 = (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(max2);
		int max3 = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(max3);
	}
}
