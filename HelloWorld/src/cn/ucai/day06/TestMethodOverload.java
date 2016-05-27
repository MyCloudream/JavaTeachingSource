package cn.ucai.day06;
/**
 * 方法的重载（overload）：
 * 1、方法名相同、方法的参数不同    （方法的签名）
 * 练习：定义重载的add方法，完成：
 * 两个int的相加，int和String的相加，String和int的相加，int和double类型的相加，三个int的相加
 * 
 * 方法的参数不同：
 * 1、参数的个数不同
 * 2、参数的类型不同
 * 3、参数的顺序不同
 * 
 * 方法的返回值没有要求
 */
public class TestMethodOverload {
	public static void main(String[] args) {
		int r = add(2,3);
		System.out.println(r);
		r = add(2,3,4);
		System.out.println(r);
	}
	public static int add(int a,int b){
		return a+b;
	}
	
	public static String add(int a,String s){
		return a+s;
	}
	
	public static String add(String s,int a){
		return s+a;
	}
	
	public static int add(int a,int b,int c){
		return a+b+c;
	}
	
	public static int add(int a,int b,int c,int d){
		return a+b+c+d;
	}
	
	public static int add(int...a){
		int r = 0;
		for(int i=0;i<a.length;i++){
			r += a[i];
		}
		return r;
	}
}
