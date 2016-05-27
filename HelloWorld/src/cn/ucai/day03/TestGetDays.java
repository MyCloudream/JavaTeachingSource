package cn.ucai.day03;

import cn.ucai.tools.InputTools;

public class TestGetDays {
	public static void main(String[] args) {
		System.out.println("请输入月份：");
		int month = InputTools.getInputInt();
		switch (month) {
		case 2:
			System.out.println("28天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		default:
			System.out.println("31天");
			break;
		}
	}
}
