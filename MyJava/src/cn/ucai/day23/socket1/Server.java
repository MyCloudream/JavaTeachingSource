package cn.ucai.day23.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		//�����ַ�����������
		BufferedReader reader=null;
		//����������
		InputStream in=null;
		try {
			//����������׽��ֶ���
			ServerSocket server=new ServerSocket(8899);
			System.out.println("���ܿͻ��˵�����......");
			Socket socket=server.accept();
			System.out.println(socket);
			//��ͻ��˽������Ӻ󣬻�ȡ������
			in=socket.getInputStream();// �õ�����Ͳ
			//�����ַ���������������װ������
			reader=new BufferedReader(new InputStreamReader(in));
			//��ȡ�ӿͻ��˷��͵��ַ�������ӡ
			System.out.println("�ͻ��˷��͵���Ϣ��"+reader.readLine());
			//�ر��׽���
			server.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
