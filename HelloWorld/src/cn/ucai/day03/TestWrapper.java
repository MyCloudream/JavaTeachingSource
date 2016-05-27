package cn.ucai.day03;

/**
 * Java中的包装类：Integer
 * 1、将String类型转为对应基本数据类型
 * 2、取得对应基本数据类型的最大最小值
 * 3、将int转为对应的二/八/十六进制的String格式
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
		
		// 将int转为对应的二/八/十六进制的String格式
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(255));
		
	}
}
