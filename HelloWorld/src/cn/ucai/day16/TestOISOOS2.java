package cn.ucai.day16;

import java.io.EOFException;
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
public class TestOISOOS2 {
	public static void main(String[] args) throws Exception{
		File file = new File("E:/test/stu.data");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student stu1 = new Student("�����",20);
		Student stu2 = new Student("�����",21);
		Student stu3 = new Student("���˫",21);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.writeObject(stu3);
		// ��һ�ַ�ʽ
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		for(;;){
			// �쳣�����ֺ�����ҵ���߼�����
			try {
				Student student = (Student) ois.readObject();
				System.out.println(student);
			} catch (EOFException e) {
				break;
			}
		}
		
		oos.close();
		ois.close();
	}
}
