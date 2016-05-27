package cn.ucai.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.NotSerializableException:û�����л��쳣
 * ���л������ǽ�һ�����󱣴�Ϊ�������ļ��������ı��ļ����Ĺ���
 * ���һ��������Ҫ�����л�����ô�����ʵ��Serializable�ӿ�
 * 
 * �����̣�
 * ���ݷ�װ�����С�
 * �����һ�����ݽṹ ��ʵ����N�����ݵļ��ϣ����壩
 */
public class TestOISOOS3 {
	public static void main(String[] args) throws Exception{
		File file = new File("E:/test/stu.data");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student stu1 = new Student("�����",20);
		Student stu2 = new Student("�����",21);
		Student stu3 = new Student("���˫",21);
		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		oos.writeObject(list);
		
		// �ڶ��ַ�ʽ
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Student> list2 = (List<Student>) ois.readObject();
		for(Student s : list2){
			System.out.println(s);
		}
		oos.close();
		ois.close();
	}
}
