package cn.ucai.day23.socket0;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			//�����ͻ����׽��֣�ָ�����ӵķ���˵�ַ�Ͷ˿ں�
			// ������һ����ָ��ip�Ͷ˿ںŵ�����
			Socket socket=new Socket("127.0.0.1", 8888);
			System.out.println(socket);
			socket.close();//�ر��׽��ֶ���
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
