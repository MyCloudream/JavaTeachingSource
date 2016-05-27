package cn.ucai.day01;
// 所有单词首字母大写 不和官方已有类重名
public class TestMathMethod {
	public static void main(String[] args) {
		// Math点来调用方法
		System.out.println(Math.pow(0.5,2));
		// 绝对值
		System.out.println(Math.abs(-5));
		// 平方根
		System.out.println(Math.sqrt(25));
		// 取两个数的最大值 最小值
		System.out.println(Math.max(4, 10));
		System.out.println(Math.min(4, 10));
		System.out.println(Math.min(1, Math.min(2, 3)));
		System.out.println(Math.max(1, Math.max(2, 3)));
		// 中间值
		System.out.println(Math.min(Math.max(3, 4), Math.max(5, 4)));
		
		// 1、ceil
		System.out.println(Math.ceil(1.4));
		// 2、floor
		System.out.println(Math.floor(1.4));// 1
		// 3、round
		System.out.println(Math.round(1.4));// 1
		System.out.println(Math.round(1.5));// 2
		System.out.println(Math.round(-1.4));// -1
		System.out.println(Math.round(-1.5));// -1
		System.out.println(Math.round(-1.6));// -2
	}
}