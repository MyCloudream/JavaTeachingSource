package cn.ucai.day03;

import cn.ucai.tools.InputTools;

public class TestGetDays {
	public static void main(String[] args) {
		System.out.println("�������·ݣ�");
		int month = InputTools.getInputInt();
		switch (month) {
		case 2:
			System.out.println("28��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		default:
			System.out.println("31��");
			break;
		}
	}
}
