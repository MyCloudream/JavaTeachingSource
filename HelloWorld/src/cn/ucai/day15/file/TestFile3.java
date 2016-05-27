package cn.ucai.day15.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class TestFile3 {
	public static void main(String[] args) {
		File file = new File("E:/test/");
		String[] fileNameArr = file.list();// �г���ǰ�ļ����е��ļ������ļ��е�����
//		System.out.println(fileNameArr.length);
		for(String fileName:fileNameArr){
//			System.out.println(fileName);
		}
		// FilenameFilter : �ļ����ƹ�����
		String[] fileNameArr2 = file.list(new FilenameFilter() {
			// ����÷�������true����ѡ�д�������
			// ����false ����ˣ������룩
			@Override
			public boolean accept(File dir, String name) {// �ص�
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
