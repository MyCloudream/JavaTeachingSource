package cn.ucai.day12;

import java.util.Calendar;
/**
 * Calendar Date 时间戳（相对时间） 之间的相互转换
 * 练习：
 * 计算今天距你出生的天数
 * 1995 3 10
 * 2016 3 17 
 */
public class TestCalendar4 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		c1.set(1995, 3-1, 10);
		long m1 = c1.getTimeInMillis();
		
		Calendar c2 = Calendar.getInstance();
		long m2 = c2.getTimeInMillis();
		
		long days = (m2-m1)/(24*60*60*1000);
		System.out.println(days);
		/*long m1 = System.currentTimeMillis();
		Date date = new Date(m1);
		long m2 = date.getTime();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Date date2 = cal.getTime();
		
		long m3 = cal.getTimeInMillis();
		cal.setTimeInMillis(m3);
		*/
		
	}
}
