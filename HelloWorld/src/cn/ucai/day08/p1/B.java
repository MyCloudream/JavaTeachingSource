package cn.ucai.day08.p1;
/**
 * 静态方法中，不能使用this和super关键字
 */
public class B extends A{
	private int age;
	// 静态方法被继承了。
	public static void main(String[] args) {
		B.m();
	}
	
	// 不能够被重写
	// 如果父类中有静态方法 子类中定义相同名字方法时，只能定义为静态的
	// "hide"
	public static void m(){
		System.out.println("static method A");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
//		B.method2();
		B b = null;
		// The static method method2() from the type B should be accessed in a static way
		b.method2();// B.method2();
		
		B b1 = new B();
		b1.method1();
	}
	
	public void method1(){
		
	}
	
	public static void method2(){
		System.out.println("ok");
	}*/
}
