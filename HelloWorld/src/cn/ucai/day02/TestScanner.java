package cn.ucai.day02;

// ctrl + shift + o : ���루�޳�����
import cn.ucai.tools.InputTools;

// ���� ����
// ��java.lang���ͱ���֮����������࣬��Ҫʹ�ã��ͱ���ʹ��import����
//import cn.ucai.tools.InputTools;// ����.����
// �ؼ��֣�ȫ��Сд ��Eclipse�б�ɫ
public class TestScanner {
	public static void main(String[] args) {
		System.out.println("������������");
		String name = InputTools.getInputString();
		System.out.println("�����������Ϊ��"+name);
		System.out.println("�������������䣺");
		int age = InputTools.getInputInt();
		System.out.println("����Ϊ��"+age);
	}
}
