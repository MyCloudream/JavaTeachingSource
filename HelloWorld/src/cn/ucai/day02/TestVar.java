package cn.ucai.day02;

public class TestVar {
	public static void main(String[] args) {
		//JAVA_HOME C:\Program Files\Java\jdk1.7.0_79
		// path: C:\Program Files\Java\jdk1.7.0_79\bin
		// %JAVA_HOME%\bin
		// 转义字符\  \t \r \n \\ \" \' 
//		System.out.print("hello \n wor\'ld");
		// 变量   常量1
		// 变量：先声明、再使用
		// 声明：数据类型 变量名 
		// 初始化 之后才能使用
		// = 不是数学中的判断    赋值运算符 运算顺序：从右往左
		// 等价于 String a = "C:\\Program Files\\Java\\jdk1.9.0_23";
		String a ;
		a = "C:\\Program Files\\Java\\jdk1.7.0_79";
		System.out.println("我是path，我需要用JAVA_HOME:"+a);
		System.out.println("我是tomcat，我也需要用JAVA_HOME:"+a);
		System.out.println("我是Eclipse，我也需要用JAVA_HOME:"+a);
		System.out.println("我是oracle，我也需要用JAVA_HOME:"+a);
		
		// ((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))
		System.out.println(Math.sqrt(20)+Math.sqrt(10)/(Math.sqrt(20)-Math.sqrt(10)));
		double d1 = Math.sqrt(20);
		double d2 = Math.sqrt(10);
		double d3 = (d1+d2)/(d1-d2);
		System.out.println(d3);
		// 整数 
		
	}
}
