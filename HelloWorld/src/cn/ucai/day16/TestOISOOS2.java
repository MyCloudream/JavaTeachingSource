package cn.ucai.day16;

import java.io.EOFException;
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
public class TestOISOOS2 {
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
		// 第一种方式
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		for(;;){
			// 异常处理部分和正常业务逻辑混乱
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
