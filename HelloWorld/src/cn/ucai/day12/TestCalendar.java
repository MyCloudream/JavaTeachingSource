package cn.ucai.day12;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) {
		// ��������ķ�ʽ
		// �򵥹������ģʽ
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		Date date = c1.getTime();
		System.out.println(date);
		// �·ݴ�0��ʼ
		c1.set(2006, 3-1, 40);
		System.out.println(c1.getTime());
		
		c1.set(Calendar.YEAR, 2016);
		c1.set(Calendar.MONTH,3-1);
		c1.set(Calendar.DATE,10);
		c1.set(Calendar.DAY_OF_MONTH,10);
		// ����ʱ���룿
		c1.set(Calendar.HOUR,1);
		c1.set(Calendar.MINUTE,30);
		c1.set(Calendar.SECOND,20);
		System.out.println(c1.getTime());
		// ͨ��get(field)��ʽ��ӡ ������ʱ����
		System.out.println(c1.get(Calendar.MONTH)+1);
	}
}
