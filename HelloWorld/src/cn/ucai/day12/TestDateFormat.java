package cn.ucai.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ͨ��SimpleDateFormat
 * ���԰��չ̶���ģ����ʽ�����String��Date�໥֮���ת��
 * ��ϰ��
 * ���ʱ�䣺2016-03-17 15:30:21 234 ת��Ϊ��2016��3��17��15ʱ30��21��234����
 */
public class TestDateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// pattern:���� ��ʽ ģ�� ����  
		// �����Date��String��ת��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��SSS���� E");
		String str = sdf.format(date);
		System.out.println(str);
		
		// StringתDate
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
