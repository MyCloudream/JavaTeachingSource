package cn.ucai.day03;

/**
 * 算术运算符
 * + - * / %  ++ -- 
 * 
 * 赋值运算符
 * = += -= *= /= %=
 */
public class TestArithOpe {
	public static void main(String[] args) {
		System.out.println(2.0/0.0);// Infinity 无限大
		// ++ 的用法   自增运算符
		int a = 2;
		a++;// a = a + 1;
		System.out.println(a);
		a++;
		System.out.println(a);
		// a = 4;
		// 前++  后++ 
		int b = a++; // 后++ ： 先运算，再自增
		System.out.println(b);
		System.out.println(a);
		// a = 5;
		++a;
		System.out.println(a);
		// a = 6;
		int c = ++a;// 前++ ： 先自增，再运算
		System.out.println(c);
		System.out.println(a);
		a = 2;
		// 2+4+5+5
		int d = a++ + ++a + ++a + a++ ;
		System.out.println(a); // 6
		System.out.println(d); // 16
		// a = 6;
		// 6-4
		int e = a-- - --a;
		System.out.println(e);
		
		
		int n = 2;
		n += 2;// n = n + 2;
		System.out.println(n);
		n *= 2;// n = n*2;
	}
}
