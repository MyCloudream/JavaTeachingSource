package cn.ucai.day23.socket1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		//�����ַ������
		PrintWriter writer=null;
		//���������
		OutputStream out=null;
		try {
			//�����ͻ����׽��֣�ָ�����ӵķ���˵�ַ�Ͷ˿ں�
			Socket socket=new Socket("127.0.0.1", 8899);
			System.out.println(socket);
			//��ȡ�����
			out=socket.getOutputStream();// ��Ͳ
			//�����ַ������
			writer=new PrintWriter(out);
			//�������д���ַ��������ַ��������������˵�������
			writer.println("���ǿͻ��ˣ�");
			//ˢ�»�������ȷ��������ַ���д�������
			writer.flush();
			socket.close();//�ر��׽��ֶ���
			writer.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
