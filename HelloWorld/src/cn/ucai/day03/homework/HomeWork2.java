package cn.ucai.day03.homework;

import cn.ucai.tools.InputTools;

/**
 * ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿 ���������꣩
 */
public class HomeWork2 {
	// ctrl + m : �������
	public static void main(String[] args) {
		System.out.println("�������·ݣ�");
		int month = InputTools.getInputInt();
		System.out.println("���������ڣ�");
		int day = InputTools.getInputInt();
		// 1 15 --> 15
		// 3 15 --> 31+28+15
		// 10 18 --> (9)+18
		int days = 0;
		switch (month) {
		case 1:
//			days = day;
			break;
		case 2:
			days = 31;
			break;
		case 3:
			days = 31 + 28;
			break;
		case 11: // 1 2 3 4 5 6 7 8 9 10 
			days = 6*31 + 3*30 + 28;
		}
		System.out.println("������Ϊ��"+(days+day));
	}
}
