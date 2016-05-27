package cn.ucai.day15.file;

import java.io.File;
import java.io.IOException;

/**
 * ��ϰ��
 * E:/main/test/a.txt
 * 1�����û���ļ������½��ļ��к��ļ�
 * 2������и��ļ�����ɾ���ļ��к��ļ�
 */
public class TestFileEx {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/main/test/a.txt");
		if(!file.exists()){// ������
			// �ȴ����ļ��� �ٴ����ļ�
			file.getParentFile().mkdirs();
			file.createNewFile();
		}else{// ����
			// ��ɾ���ļ� ��ɾ���ļ���
			file.delete();
			file.getParentFile().delete();
			file.getParentFile().getParentFile().delete();
		}
	}
}
