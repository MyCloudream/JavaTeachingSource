package cn.ucai.day23.socket2.up2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		PrintWriter writer=null;
		OutputStream out=null;
		ServerSocket server=null;
		InputStream in=null;
		InputStreamReader isr=null;
		BufferedReader reader=null;
		try {
			//����������׽���
			server=new ServerSocket(9999);
			System.out.println("�ȴ��ͻ��˵�����.....");
			Socket socket=server.accept();
			//��ȡ�����
			out=socket.getOutputStream(); // ��Ͳ
			//��ȡ�ı������
			writer=new PrintWriter(out);
			//��ͻ��˷��������ı�
			writer.println("��������ݣ���");
			writer.flush();//ˢ�»�����
			
			in=socket.getInputStream();// ��Ͳ
			isr=new InputStreamReader(in);
			reader=new BufferedReader(isr);
			String back = reader.readLine();
			System.out.println("�ͻ��˷��������ַ�����"+back);
			
			writer.close();
			reader.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
