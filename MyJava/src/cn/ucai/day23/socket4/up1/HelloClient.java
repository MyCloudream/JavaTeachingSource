package cn.ucai.day23.socket4.up1;

import java.net.Socket;

public class HelloClient {

	/**
	 * �ͻ���
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1",8888);
		System.out.println("�ͻ���******");
		new SendThread(socket).start();
		new ReceiveThread(socket).start();
		//����ر�
//		socket.close();
	}

}
