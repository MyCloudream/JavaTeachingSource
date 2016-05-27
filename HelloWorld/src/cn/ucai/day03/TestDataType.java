package cn.ucai.day03;

/**
 * Java中的数据类型
 * 1、基本数据类型
 * 2、引用数据类型：类、接口、枚举、数组
 * 
 * 
 * 基本数据类型：8种
 * 1、整数类型
 * byte short int long 
 * 2、布尔类型
 * boolean：true/false
 * 3、字符类型
 * char 
 * 4、小数类型  （浮点类型）
 * float double 
 */
public class TestDataType {
	public static void main(String[] args) {
		// 位 bit 比特   1byte = 8bit
		byte b1 = 2;// 占1个字节     2^8=256  -128--127
		short s1 = 3;// 占2个字节   -2的15次方--2的15次方-1    -32768--32767  
		System.out.println(Math.pow(2,16));// 65536
		int i1 = 4; // 占4个字节
		// -2147483648--2147483647
		System.out.println(Math.pow(2, 31));
		long i2 = 5L;// 占8个字节
		
		boolean bool1 = true;
		boolean bool2 = false;

		// java中使用'' 表示一个字符
		char ch1 = 'a';
		char ch2 = '中';// 20013
		// char有了数字和字符的双重特点
		System.out.println(ch2+1); // 20014
		char ch3 = '\u4E2D';
		System.out.println(ch3);
		// unicode  万国码   使用2个字节来表示  （0-65535）
		// 1.2 默认的是double类型
		float f1 = 1.2f;// 占4个字节   单精度，精确到7位
		double d1 = 2.6;// 占8个字节  双精度 精确到15位
		// 0.6000000000000001
		System.out.println(d1-2);
	}
}
