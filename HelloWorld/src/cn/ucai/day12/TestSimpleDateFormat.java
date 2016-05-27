package cn.ucai.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 请把时间：2016-03-17 15:30:21 234 转换为：2016年3月17日15时30分21秒234毫秒
 */
public class TestSimpleDateFormat {
	public static void main(String[] args) {
		String str1 = "2016-03-17 15:30:21 234";
		System.out.println(str1);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		try {
			Date date = sdf1.parse(str1);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒");
			String str2 = sdf2.format(date);
			System.out.println(str2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
