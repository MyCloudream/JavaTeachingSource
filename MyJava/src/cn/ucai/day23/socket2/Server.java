package cn.ucai.day23.socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		PrintWriter writer=null;
		OutputStream out=null;
		ServerSocket server=null;
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
			writer.println("���Ƿ���˷�������Ϣ��ע����滹��һ��");
			writer.println("���ǵڶ����ַ���");
			writer.flush();//ˢ�»�����
			
			writer.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
