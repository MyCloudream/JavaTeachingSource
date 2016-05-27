package cn.ucai.day23.socket4;

import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
	/**
	 * 服务器
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		Socket socket = ss.accept();
		new SendThread(socket).start();
		new ReceiveThread(socket).start();
		//用完要关闭
//		socket.close();
	}

}
