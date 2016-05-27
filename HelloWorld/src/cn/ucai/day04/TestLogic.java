package cn.ucai.day04;

/**
 * �߼������ 
 * 1����    &&
 * 2����    || 
 * 3����   !
 * 
 * λ��������������֣�
 * 1���� &
 * 2���� | 
 * 3����λȡ��  ~
 * 4����� ^
 */
public class TestLogic {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println(a>0&&b>0); // true
		System.out.println(true&&false); // false
		System.out.println(false&&true); // false
		System.out.println(false&&false); // false
		
		// ƫ�ƣ�
		// ����>=90&&��ѧ<60||����<60&&��ѧ>=90
		System.out.println(true||true); // true
		System.out.println(true||false); // true
		System.out.println(false||true); // true
		System.out.println(false||false); // false
		
		// ע�� ��¼
		boolean reg = false;
		System.out.println(!true); // false
		System.out.println(!false); // true
		if(!reg){
			System.out.println("��¼�ɹ�");
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
