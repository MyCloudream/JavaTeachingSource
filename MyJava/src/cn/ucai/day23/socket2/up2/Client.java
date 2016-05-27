package cn.ucai.day23.socket2.up2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		InputStream in=null;
		InputStreamReader isr=null;
		BufferedReader reader=null;
		Socket socket=null;
		PrintWriter writer=null;
		OutputStream out=null;
		try {
			socket=new Socket("127.0.0.1", 9999);
			in=socket.getInputStream();// ��Ͳ
			isr=new InputStreamReader(in);
			reader=new BufferedReader(isr);
			String back = reader.readLine();
			System.out.println("����˷��������ַ�����"+back);
			
			//��ȡ�����
			out=socket.getOutputStream(); // ��Ͳ
			//��ȡ�ı������
			writer=new PrintWriter(out);
			//��ͻ��˷��������ı�
			writer.println("�ͻ������ݣ���");
			writer.flush();//ˢ�»�����

			reader.close();
			writer.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
