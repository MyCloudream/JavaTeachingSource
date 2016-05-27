package cn.ucai.day06;
/**
 * public:权限修饰符
 * 1、本类中 同包的其他类中 不同包的类中  --》 都可以调
 * 
 * default:
 * 本类中 同包的其他类中
 * 
 * private 
 * 本类中可见 其他的都不行
 * 
 * protected
 */
public class TestPublic {
	public static void main(String[] args) {
		m();
		m2();
		m3();
	}
	
	public static void m(){
		System.out.println("public method ");
	}
	
	static void m2(){
		System.out.println("default method ");
	}
	
	private static void m3(){
		System.out.println("private method");
	}
}
