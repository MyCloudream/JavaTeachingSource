package cn.ucai.day23.socket0;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * �����
 */
public class Server {
	public static void main(String[] args) {
		try {
			//����������׽��ֶ��� 
			// 8899 �˿ں�  2���ֽ�  16λ 2^16 0-65535 21 22
			// 1024���� 
			ServerSocket server=new ServerSocket(8888);
			System.out.println("���ܿͻ��˵�����......");
			// ���ڽ��տͻ��˵�����  ��������
			Socket socket=server.accept();
			System.out.println(socket);
			//�ر��׽���
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
