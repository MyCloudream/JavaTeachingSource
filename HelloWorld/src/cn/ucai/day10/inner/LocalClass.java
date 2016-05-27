package cn.ucai.day10.inner;
/**
 * 局部内部类
 * 局部内部类只能使用外部类的属性或final修饰的局部变量
 * 特殊的局部内部类：
 * 匿名内部类
 */
public class LocalClass {
	private int age;
	public void method(){
		final int a = 2;
		class Local{
			public void m(){
				System.out.println("我是局部内部类");
				System.out.println(age);
			}
		}
		
		Local local = new Local();
		local.m();
		
	}
	
	public static void main(String[] args) {
		LocalClass lc = new LocalClass();
		lc.method();
	}
}
