package cn.ucai.day04;

import cn.ucai.tools.InputTools;

public class TestIf {
	// alt + / �� ��ʾ
	public static void main(String[] args) {
		System.out.println("������ɼ���");
		int score = InputTools.getInputInt();
		if (score >= 90) {
			System.out.println("����");
		} else if (score >= 80) {// 0-N
			System.out.println("����");
		} else if (score >= 60) {
			System.out.println("����");
		} else {// 0-1
			System.out.println("������");
		}
		/*if(score>=90){
			System.out.println("����");
		}
		
		if(score>=80){
			System.out.println("����");
		}
		
		if(score>=60){
			System.out.println("����");
		}*/
		
	}
}
