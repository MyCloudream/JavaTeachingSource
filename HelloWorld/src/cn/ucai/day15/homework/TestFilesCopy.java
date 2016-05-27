package cn.ucai.day15.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 作业：完成一个文件夹中的指定后缀名的文件的拷贝
 */
public class TestFilesCopy {
	public static void main(String[] args) {
		File file = new File("E:/test/");
		File fileDest = new File("E:/copy/");
		if(!fileDest.exists()){
			fileDest.mkdirs();
		}
		// 得到指定后缀名的文件数组
		File[] fileArr = getFileByPostfix(file, ".mp4");
		if(fileArr!=null){
			for(int i=0;i<fileArr.length;i++){
				File dest = new File(fileDest,fileArr[i].getName());
				fileCopy(fileArr[i],dest);
			}
		}
	}

	/**
	 * 根据后缀名，得到指定文件夹中的指定类型的全部文件
	 * @param dir 指定文件夹
	 * @param postfix 后缀名
	 * @return 文件数组形式的全部文件
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
	 * 为用户提供多种选择 （本题没用到）
	 * @param src 源文件
	 * @param dest 拷贝后生成的目标文件
	 */
	public static void fileCopy(String src,String dest){
		fileCopy(new File(src), new File(dest));
	}
	
	/**
	 * 拷贝指定文件
	 * @param src 源文件
	 * @param dest 拷贝后生成的目标文件
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
