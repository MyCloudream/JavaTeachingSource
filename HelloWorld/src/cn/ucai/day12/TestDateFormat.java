package cn.ucai.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 通过SimpleDateFormat
 * 可以按照固定的模板或格式来完成String和Date相互之间的转换
 * 练习：
 * 请把时间：2016-03-17 15:30:21 234 转换为：2016年3月17日15时30分21秒234毫秒
 */
public class TestDateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// pattern:类型 样式 模板 正则  
		// 完成了Date到String的转换
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒 E");
		String str = sdf.format(date);
		System.out.println(str);
		
		// String转Date
		String str2 = "2016-03-17 15:21:31 123";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		try {
			Date date2 = sdf2.parse(str2);
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
