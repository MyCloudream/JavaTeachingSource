package cn.ucai.day15.dec;

/**
 * 24/1
 * ��װ���ģʽ
 * װ�����ģʽ
 * ������ࡢ���ظ����󣨹��ܣ�
 */
public class Test {
	public static void main(String[] args) {
		// ��õ�Java Ц������ʦ
		JavaTeacher javaTeacher = new JavaTeacher();// ������ �ڵ���
		DecTeacher decTeacher = new DecTeacher(javaTeacher);// ��װ�� ��չ��
		decTeacher.teach();
//		
//		MathTeacher mathTeacher = new MathTeacher();
//		DecTeacher decTeacher2 = new DecTeacher(mathTeacher);
//		decTeacher2.teach();
		
		// ���� java
		JavaTeacher javaTeacher3 = new JavaTeacher();
		SingTeacher singTeacher3 = new SingTeacher(javaTeacher3);
		DecTeacher decTeacher3 = new DecTeacher(singTeacher3);
		decTeacher3.teach();
	}
}
