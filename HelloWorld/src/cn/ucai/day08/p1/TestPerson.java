package cn.ucai.day08.p1;
/**
 * 1�������������ͱȽ���==
 * 2�������������� 
 * 		���ʹ��==���Ƚϵ����ڴ��еĵ�ַ
 * 		���ʹ��Object��equals�Ƚϣ��൱��==
 * 		��дequals���Զ���ȽϹ���ʵ���߼��ϵ����
 * 3�������������ͺ�null�Ƚ� ʹ��== �� !=
 */	
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("����",20);
		Person p2 = new Person("����2",20);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3==s4);
		
		// �����˼�������
		String s5 = new String("abc");
		String s6 = new String("abc");
		
	}
}
