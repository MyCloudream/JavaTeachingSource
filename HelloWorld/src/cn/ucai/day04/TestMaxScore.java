package cn.ucai.day04;

import cn.ucai.tools.InputTools;

/**
 * �����������ųɼ���������ֵ 
 */
public class TestMaxScore {
	public static void main(String[] args) {
		System.out.println("������javase�ɼ���");
		int a = InputTools.getInputInt();
		System.out.println("������android�ɼ���");
		int b = InputTools.getInputInt();
		System.out.println("������javaee�ɼ���");
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
