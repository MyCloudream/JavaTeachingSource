package cn.ucai.day09.oo3;
/**
 * ������������֮��Ƚ���==
 * ������������ʹ��==�Ƚϵ�ʱ�򣬱Ƚϵ����ڴ��ַ
 * ʹ��Object��equals�Ƚϣ��൱��ʹ��==
 */
public class Test {
	public static void main(String[] args) {
		
		Person p1 = new Person("����",20);
		
		Person p2 = new Person("����",20);
		
		Person p3 = new Person("����",20);
		
		System.out.println(p1.equals(p2));
		
	}
}
