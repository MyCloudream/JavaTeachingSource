package cn.ucai.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertiesUtil {
	// ͨ��keyȡvalue
	public static String getValue(String key,String fileName){
		// ·��
		String path = PropertiesUtil.class.getResource("/").getPath();
		Properties p = new Properties();
		String value = null;
		try {
			p.load(new FileInputStream(new File(path+"/"+fileName)));
			value = p.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
