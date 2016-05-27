package cn.ucai.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * java.io.NotSerializableException:没有序列化异常
 * 序列化：就是将一个对象保存为二进制文件（区别文本文件）的过程
 * 如果一个对象想要被序列化，那么类必须实现Serializable接口
 * 
 * 网络编程：
 * 数据封装在类中。
 * 类就是一种数据结构 其实就是N多数据的集合（载体）
 */
public class TestOISOOS {
	public static void main(String[] args) throws Exception{
		File file = new File("E:/test/stu.data");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student stu1 = new Student("金刚鹏",20);
		Student stu2 = new Student("金刚宇",21);
		Student stu3 = new Student("金刚双",21);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.writeObject(stu3);
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student1 = (Student) ois.readObject();
		Student student2 = (Student) ois.readObject();
		Student student3 = (Student) ois.readObject();
		Student student4 = (Student) ois.readObject();
		// java.io.EOFException:读到文件的末尾，依然继续读
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		oos.close();
		ois.close();
	}
}
