package cn.ucai.day15.file;

import java.io.File;

public class TestFile5 {
	public static void main(String[] args) {
		File file = new File("E:/test/");
		m(file);
	}
	
	/**
	 * 使用递归列出所有的文件的方法
	 * 列出所有的文件
	 */
	public static void m(File dir){
		File[] fileArr = dir.listFiles();
		for(int i=0;i<fileArr.length;i++){
			if(fileArr[i].isDirectory()){
				m(fileArr[i]);
			}else{
				System.out.println(fileArr[i].getName());
				fileArr[i].delete();
			}
		}
		dir.delete();
	}
}
