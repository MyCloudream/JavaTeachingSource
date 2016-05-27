package cn.ucai.day15.file;

import java.io.File;
import java.io.IOException;

/**
 * 练习：
 * E:/main/test/a.txt
 * 1、如果没有文件，则新建文件夹和文件
 * 2、如果有该文件，则删除文件夹和文件
 */
public class TestFileEx {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/main/test/a.txt");
		if(!file.exists()){// 不存在
			// 先创建文件夹 再创建文件
			file.getParentFile().mkdirs();
			file.createNewFile();
		}else{// 存在
			// 先删除文件 再删除文件夹
			file.delete();
			file.getParentFile().delete();
			file.getParentFile().getParentFile().delete();
		}
	}
}
