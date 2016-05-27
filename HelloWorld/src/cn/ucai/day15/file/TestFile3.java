package cn.ucai.day15.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class TestFile3 {
	public static void main(String[] args) {
		File file = new File("E:/test/");
		String[] fileNameArr = file.list();// 列车当前文件夹中的文件及子文件夹的名称
//		System.out.println(fileNameArr.length);
		for(String fileName:fileNameArr){
//			System.out.println(fileName);
		}
		// FilenameFilter : 文件名称过滤器
		String[] fileNameArr2 = file.list(new FilenameFilter() {
			// 如果该方法返回true，则选中存入数组
			// 返回false 则过滤（不存入）
			@Override
			public boolean accept(File dir, String name) {// 回调
				if(name.endsWith(".java") || name.endsWith(".py")){
					return true;
				}
				return false;
			}
		});
		
		for(String fileName:fileNameArr2){
//			System.out.println(fileName);
		}
		
		File[] fileArr = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if(pathname.getName().endsWith(".java")){
					return true;
				}
				return false;
			}
		});
		
		for(File f : fileArr){
			System.out.println(f.getName());
		}
		
	}
}
