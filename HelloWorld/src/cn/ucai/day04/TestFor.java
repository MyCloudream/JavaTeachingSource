package cn.ucai.day04;

/**
 * 循环结构：
 */
public class TestFor {
	public static void main(String[] args) {
		// for(循环变量初始化;循环条件判断;步进语句){}
		// for(int i=0;i<100;i=i+1){
		// for运算顺序：1 2 4 3 2 4 3 2 4 3 2    
		for(int i=0/*1*/;i<1/*2*/;i=i+1/*3*/){
			System.out.println("hello world "+i);// 4
		}
		
		/*int ni = 97;
		char ch = (char)ni;
		int ni2 = 98;
		char ch2 = (char)ni2;
		System.out.println(ch);
		System.out.println(ch2);*/
		
		/**
		 * 使用for循环，打印26个小写字母
		 */
		for(int i=0;i<26;i++){
			// 97 98 ~  122 123 
			System.out.print((char)(97+i)+" ");
		}
		System.out.println();
		char ch = 'A';
		for(int i=0;i<26;i++){
			System.out.print((char)(ch+i)+" ");
		}
		System.out.println();
		for(int i=97;i<123;i++){
			System.out.print((char)i+" ");
		}
	}
}
