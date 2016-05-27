package cn.ucai.day15.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * ��ҵ�����һ���ļ����е�ָ����׺�����ļ��Ŀ���
 */
public class TestFilesCopy {
	public static void main(String[] args) {
		File file = new File("E:/test/");
		File fileDest = new File("E:/copy/");
		if(!fileDest.exists()){
			fileDest.mkdirs();
		}
		// �õ�ָ����׺�����ļ�����
		File[] fileArr = getFileByPostfix(file, ".mp4");
		if(fileArr!=null){
			for(int i=0;i<fileArr.length;i++){
				File dest = new File(fileDest,fileArr[i].getName());
				fileCopy(fileArr[i],dest);
			}
		}
	}

	/**
	 * ���ݺ�׺�����õ�ָ���ļ����е�ָ�����͵�ȫ���ļ�
	 * @param dir ָ���ļ���
	 * @param postfix ��׺��
	 * @return �ļ�������ʽ��ȫ���ļ�
	 */
	public static File[] getFileByPostfix(File dir,final String postfix){
		File[] fileArr = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(postfix)){
					return true;
				}
				return false;
			}
		});
		return fileArr;
	}
	
	/**
	 * Ϊ�û��ṩ����ѡ�� ������û�õ���
	 * @param src Դ�ļ�
	 * @param dest ���������ɵ�Ŀ���ļ�
	 */
	public static void fileCopy(String src,String dest){
		fileCopy(new File(src), new File(dest));
	}
	
	/**
	 * ����ָ���ļ�
	 * @param src Դ�ļ�
	 * @param dest ���������ɵ�Ŀ���ļ�
	 */
	public static void fileCopy(File src,File dest){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			int b = 0;
			byte[] byteArr = new byte[8*1024];
			while((b=fis.read(byteArr))!=-1){
				fos.write(byteArr, 0, b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
