package cn.ucai.day12;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1.toString());
		
		Date date2 = new Date(2016-1900, 3-1, 17);
		System.out.println(date2);
		// 时间戳对Date的相互之间的转换
		long l = System.currentTimeMillis();
		System.out.println(l);
		Date date3 = new Date(l);
		
		System.out.println(date3);
		
		long l2 = date3.getTime();
		System.out.println(l2);
		
		method();
	}
	
	@Deprecated
	public static void method(){
		
	}
}
