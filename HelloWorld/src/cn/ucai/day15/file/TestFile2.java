package cn.ucai.day15.file;

import java.io.File;
import java.io.IOException;


public class TestFile2 {
	public static void main(String[] args) throws IOException{
//		File file = new File("E:"+File.separator+"a.txt");// 
		/*File fileDir = new File("E:/test/");
		fileDir.mkdir();
		File file = new File(fileDir,"a.txt");// 
		file.createNewFile();
		System.out.println("�ļ������ɹ�");*/
		
		/*File file = new File("E:/test/test/test/a.txt");
		System.out.println(file.getParent());
		String parent = file.getParent();// E:/test
		File fileParent = new File(parent);
		fileParent.mkdir();// ֻ�ܴ�������Ŀ¼
*/	
//		File fileParent = file.getParentFile();
		
//		File file = new File("E:/test/test/test/");
//		file.mkdirs();
		// ɾ���ļ��е�ʱ�򣺿��ļ��в���ɾ��
		File file = new File("E:/test/");
		file.delete();
	}
}
