package cn.ucai.day04;

/**
 * 逻辑运算符 
 * 1、与    &&
 * 2、或    || 
 * 3、非   !
 * 
 * 位运算符（操作数字）
 * 1、与 &
 * 2、或 | 
 * 3、按位取反  ~
 * 4、异或 ^
 */
public class TestLogic {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println(a>0&&b>0); // true
		System.out.println(true&&false); // false
		System.out.println(false&&true); // false
		System.out.println(false&&false); // false
		
		// 偏科：
		// 语文>=90&&数学<60||语文<60&&数学>=90
		System.out.println(true||true); // true
		System.out.println(true||false); // true
		System.out.println(false||true); // true
		System.out.println(false||false); // false
		
		// 注册 登录
		boolean reg = false;
		System.out.println(!true); // false
		System.out.println(!false); // true
		if(!reg){
			System.out.println("登录成功");
		}
		
		System.out.println(a>0&b>0); // true
		System.out.println(true&false); // false
		System.out.println(false&true); // false
		System.out.println(false&false); // false
		
		System.out.println(true^true); // false
		System.out.println(true^false); // true
		System.out.println(false^true); // true
		System.out.println(false^false); // false
		
		
	}
}
