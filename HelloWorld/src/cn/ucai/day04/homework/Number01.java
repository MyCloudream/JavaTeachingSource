package cn.ucai.day04.homework;

import java.util.Scanner;

public class Number01 {

	public static void main(String[] args) {
		int year, mouth, day, sun = 0;
		Scanner mScanner = new Scanner(System.in);
		
		System.out.println("请输入日期的年份，月份与天数，以空格分隔（XXXX XX XX）");
		year = mScanner.nextInt();
		mouth = mScanner.nextInt();
		day = mScanner.nextInt();
		mScanner.close();
		switch(mouth){
		case 12:
			sun = sun + 30;
		case 11:
			sun = sun + 31;
		case 10:
			sun = sun + 30;
		case 9:
			sun = sun + 31;
		case 8:
			sun = sun + 31;
		case 7:
			sun = sun + 30;
		case 6:
			sun = sun + 31;
		case 5:
			sun = sun + 30;
		case 4:
			sun = sun + 31;
		case 3:
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				sun = sun + 29;
			}else {
				sun = sun + 28;
			}
		case 2:
			sun = sun + 31;
		case 1:
			sun = sun + day;
		}
		System.out.println("输入的日期是" + year + "年的第" + sun + "天");
	}
}
