package cn.ucai.day12;

import java.util.Calendar;
/**
 * ע���·ݴ�0��ʼ����ʾ1��
 * ���ڴ�1��ʼ����ʾ������ 2��ʾ����һ �Դ�����
 */
public class TestCalendar2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		cal.set(2016, 2, 37);
//		cal.set(Calendar.MONTH, 3);
		// ������ 1
		// ����һ 2
		cal.set(Calendar.DAY_OF_WEEK, 6);
		System.out.println(cal.getTime());
		
		
	}
}
