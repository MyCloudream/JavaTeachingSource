package cn.ucai.day12;

import java.util.Calendar;
/**
 * 注意月份从0开始，表示1月
 * 星期从1开始，表示星期天 2表示星期一 以此类推
 */
public class TestCalendar2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		cal.set(2016, 2, 37);
//		cal.set(Calendar.MONTH, 3);
		// 星期天 1
		// 星期一 2
		cal.set(Calendar.DAY_OF_WEEK, 6);
		System.out.println(cal.getTime());
		
		
	}
}
