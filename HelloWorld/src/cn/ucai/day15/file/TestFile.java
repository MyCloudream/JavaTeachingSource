package cn.ucai.day15.file;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException{
		/*// 只是表示该文件
		File file = new File("E:/a.txt");
		System.out.println(file.exists());
		try {
			// 当文件不存在时新建文件，存在则不新建
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("文件创建成功");*/
		// File：文件或文件夹
//		File filePa = new File("E:/");
//		File fileCh = new File(filePa,"a.txt");
//		fileCh.createNewFile();
//		System.out.println("文件创建成功");
		
		
		File file = new File("E:/a.txt");
//		file.mkdir();
//		System.out.println("文件夹创建成功");
		// 区别文件夹或文件
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	}
}
