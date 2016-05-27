package cn.ucai.day04.homework;

import cn.ucai.tools.InputTools;

public class Test01 {
	public static void main(String[] args) {
//		输入某年某月某日，判断这一天是这一年的第几天？ （考虑闰年）
		System.out.println("请输入年份：");
		int year = InputTools.getInputInt();
		System.out.println("月份");
		int month = InputTools.getInputInt();
		System.out.println("天数");
		int day = InputTools.getInputInt();
		int days2 = 28;
		int days = 0;
		// 闰年：
		if(year%4==0&&year%100!=0 || year%400==0){
			days2 = 29;
		}
		
		/*switch (month) {
		case 1:
			days = day;
			break;
		case 2:
			days = 31+day;
			break;
		case 3:
			days = 31 + days2 + day;
		default:
			break;
		}*/
	}
}
