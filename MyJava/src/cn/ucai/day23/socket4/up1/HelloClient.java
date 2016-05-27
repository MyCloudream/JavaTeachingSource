package cn.ucai.day23.socket4.up1;

import java.net.Socket;

public class HelloClient {

	/**
	 * 客户端
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1",8888);
		System.out.println("客户端******");
		new SendThread(socket).start();
		new ReceiveThread(socket).start();
		//用完关闭
//		socket.close();
	}

}
