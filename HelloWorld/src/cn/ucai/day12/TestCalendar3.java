package cn.ucai.day12;

import java.util.Calendar;
/**
 * 注意月份从0开始，表示1月
 * 星期从1开始，表示星期天 2表示星期一 以此类推
 */
public class TestCalendar3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR,-10);
		System.out.println(cal.getTime());
		
		Calendar ca2 = Calendar.getInstance();
		
		boolean b1 = cal.before(ca2);
		boolean b2 = cal.after(ca2);
		System.out.println(b1);
		System.out.println(b2);
	}
}
