package cn.ucai.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * java.io.NotSerializableException:û�����л��쳣
 * ���л������ǽ�һ�����󱣴�Ϊ�������ļ��������ı��ļ����Ĺ���
 * ���һ��������Ҫ�����л�����ô�����ʵ��Serializable�ӿ�
 * 
 * �����̣�
 * ���ݷ�װ�����С�
 * �����һ�����ݽṹ ��ʵ����N�����ݵļ��ϣ����壩
 */
public class TestOISOOS4 {
	public static void main(String[] args) throws Exception{
		File file = new File("E:/test/stu.data");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Address address = new Address("����","������");
		Student stu1 = new Student("�����",20,address);
		oos.writeObject(stu1);
		
		// �ڶ��ַ�ʽ
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student) ois.readObject();
		System.out.println(student);
//		oos.close();
		ois.close();
	}
}
