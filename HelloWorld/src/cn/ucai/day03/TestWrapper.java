package cn.ucai.day03;

/**
 * Java�еİ�װ�ࣺInteger
 * 1����String����תΪ��Ӧ������������
 * 2��ȡ�ö�Ӧ�����������͵������Сֵ
 * 3����intתΪ��Ӧ�Ķ�/��/ʮ�����Ƶ�String��ʽ
 */
public class TestWrapper {
	public static void main(String[] args) {
		String s1 = "123";
		int a = Integer.parseInt(s1);
		System.out.println(a*2);
		
		String s2 = "1.5";
		double d= Double.parseDouble(s2);
		System.out.println(d+1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// ��intתΪ��Ӧ�Ķ�/��/ʮ�����Ƶ�String��ʽ
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(255));
		
	}
}
