package cn.ucai.day11;

/**
 * 处理机制：
 * try-catch-finally
 * 
 * RuntimeException：运行时异常：可以处理可以不处理
 * 非运行时异常、检查时异常、编译时异常：必须处理
 */
public class TestException4 {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		// 1、连接数据库  2、操作数据库中的数据 3、关闭连接
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {// 无论如何，肯定会执行的代码
			// 一般用来关闭资源，或处理临时文件
			System.out.println("finally");
		}
	}
	
	
}
