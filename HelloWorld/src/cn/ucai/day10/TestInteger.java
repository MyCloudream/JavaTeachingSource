package cn.ucai.day10;

public class TestInteger {
	public static void main(String[] args) {
		// 1��Stringתint
		String age = "23";
		int niAge = Integer.parseInt(age);
		System.out.println(niAge+1);
		
		// ת2��8��16����
		int a = 10;// 8+2  1010  12
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		// JDK5.0  �Զ�װ��
		Integer i1 = 1;// ����û����
		Integer i2 = 2;
		int i3 = i1+i2;// ���Զ����䣩
		System.out.println(i3);
		
		// Integer int ʹ��==�Ƚ� :��תint���ٰ���int�Ƚ�
		
		Integer i4 = 2;
		int i5 = 2;
		System.out.println(i4==i5);
	}
}
