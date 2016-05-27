package cn.ucai.day06;

public class TestMethodArgs {
	public static void main(String[] args) {
		method("林志玲");// "林志玲" 实参
	}
	
	// 
	public static void method(String name){// 形参
		System.out.println("我希望明年过年带"+name+"回家");
	}
}
