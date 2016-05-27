package cn.ucai.day11;
/**
 * 处理机制：
 * try-catch-finally
 */
public class TestException2 {
	public static void main(String[] args) {
		m1();
	}
	
	public static void m1(){
		m2();
	}
	
	public static void m2(){
		m3();
	}
	
	
	public static void m3(){
		int a = 2;
		int b = 0;
		try{// 可能会发生异常的代码
			System.out.println(a/b);// new ArithmeticException()
		}catch(Exception e){// 捕获异常之后的处理   Exception e = new ArithmeticException();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
