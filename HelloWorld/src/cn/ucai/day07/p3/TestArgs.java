package cn.ucai.day07.p3;

public class TestArgs {
	public static void main(String[] args) {
		int a = 10;
//		m(a);
		int b = a;
		b = 100;
		System.out.println(a);
	}
	
	public static void m(int b){
		b = 100;
	}
}
