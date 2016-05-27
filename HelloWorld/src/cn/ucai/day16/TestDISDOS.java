package cn.ucai.day16;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 如何快速写小数？
 */
public class TestDISDOS {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/test/a.ucai");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeDouble(3.1415);
		dos.writeBoolean(true);
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		double d = dis.readDouble();
		boolean bool = dis.readBoolean();
		System.out.println(d);
		System.out.println(bool);
		
		dos.close();
		dis.close();
	}
}
