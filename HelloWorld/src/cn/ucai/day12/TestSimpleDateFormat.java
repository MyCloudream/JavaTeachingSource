package cn.ucai.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ʱ�䣺2016-03-17 15:30:21 234 ת��Ϊ��2016��3��17��15ʱ30��21��234����
 */
public class TestSimpleDateFormat {
	public static void main(String[] args) {
		String str1 = "2016-03-17 15:30:21 234";
		System.out.println(str1);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		try {
			Date date = sdf1.parse(str1);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��SSS����");
			String str2 = sdf2.format(date);
			System.out.println(str2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
