package cn.ucai.day04.homework;

import cn.ucai.tools.InputTools;

public class Test01 {
	public static void main(String[] args) {
//		����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿 ���������꣩
		System.out.println("��������ݣ�");
		int year = InputTools.getInputInt();
		System.out.println("�·�");
		int month = InputTools.getInputInt();
		System.out.println("����");
		int day = InputTools.getInputInt();
		int days2 = 28;
		int days = 0;
		// ���꣺
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
