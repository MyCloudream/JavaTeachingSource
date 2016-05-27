package cn.ucai.day08.pa2;

public class B{
	final static int MAX_VALUE = 4;// 不可变的变量 常量
	final static int b;
//	final static int c ;
	static{
		b = 3;
	}
	
	/*public B(){
		c = 2;
	}
	
	public B(int c){
		this.c = c;
	}*/
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
	}
}
