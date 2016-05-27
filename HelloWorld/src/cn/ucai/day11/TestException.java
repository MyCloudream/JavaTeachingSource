package cn.ucai.day11;

import java.util.Arrays;

import cn.ucai.day11.homework.Student;

public class TestException {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		if(b!=0){
			System.out.println(a/b);
		}else{
			
		}
		
//		Student stu = null;
//		System.out.println(stu.getName());
		// ∂‡Ã¨
		Object o = new String("abc");
		/*String s = (String)o;
		char ch = s.charAt(0);
		System.out.println(ch);*/
		
//		Integer in = (Integer)o;
//		System.out.println(in);
		
//		String s = "abc";
//		System.out.println(s.charAt(3));
		
//		int[] arr = {1,2,3};
//		System.out.println(arr[3]);
		
//		String s = "abc";
//		int i = Integer.parseInt(s);
//		System.out.println(i+1);
		m(10);
	}
	
	public static int m(int n){
		return n*m(n-1);
	}
}
