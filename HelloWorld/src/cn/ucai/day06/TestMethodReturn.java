package cn.ucai.day06;

/**
 * 方法名和变量名 命名规则一致 
 */
public class TestMethodReturn {
	public static void main(String[] args) {
		int r = add(4,5);
		System.out.println(r+10);
	}
	
	public static int add(int a,int b){
		int c = a+b;
		return c;
	}
	
	public static void method(){
		return ;// 经常用于方法的结束
	}
}
