package cn.ucai.day12;

import java.util.Calendar;
/**
 * ע���·ݴ�0��ʼ����ʾ1��
 * ���ڴ�1��ʼ����ʾ������ 2��ʾ����һ �Դ�����
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
