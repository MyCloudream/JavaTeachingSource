package cn.ucai.day15.file;

import java.io.File;
import java.io.IOException;

public class TestFileRename {
	public static void main(String[] args) throws IOException{
		String path = "E:/test/";
		File fileSrc = new File(path);
		
		File[] fileArr = fileSrc.listFiles();
		for(int i=0;i<fileArr.length;i++){
			String name = fileArr[i].getName();
			String s = name.substring(name.lastIndexOf("."));
			File file = new File(path+i+s);
			fileArr[i].renameTo(file);
			System.out.println(fileArr[i].getName()+"-----"+file.getName());
		}
		// 对于win来说：E:/  叫绝对路径
		// 对于unix/linux  /开头叫绝对路径
		// 相对路径
//		File file = new File("src/a.txt");
//		file.createNewFile();
	}
}
