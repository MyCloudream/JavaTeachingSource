package cn.ucai.day15.file;

import java.io.File;

public class TestFile4 {
	public static void main(String[] args) {
		File file = new File("E:/test/a.txt");
		System.out.println(file.getFreeSpace()/1024/1024/1024);
		System.out.println(file.getTotalSpace()/1024/1024/1024);
		System.out.println(file.isHidden());
		System.out.println(file.lastModified());
		System.out.println(System.currentTimeMillis());
		System.out.println(file.length());
	}
}
