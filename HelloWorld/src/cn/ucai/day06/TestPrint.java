package cn.ucai.day06;
/**
 * 输出hello 5次
 * 输出world 3次
 * 输出hello 8次
 * 输出world 1次
 * 输出hello 3次
 * 输出world 9次
 * */
public class TestPrint {
	public static void main(String[] args) {
		printHelloWorld();
	}
	
	public static void printHelloWorld(){
		printHello(5);// 方法的使用
		printWorld(3);
		printHello(8);
		printWorld(1);
		printHello(3);
		printWorld(9);
	}
	
	// 方法的定义
	public static void printHello(int n){
		for(int i=0;i<n;i++){
			System.out.println("hello");
		}
	}
	
	public static void printWorld(int n){
		for(int i=0;i<n;i++){
			System.out.println("world");
		}
	}
}
