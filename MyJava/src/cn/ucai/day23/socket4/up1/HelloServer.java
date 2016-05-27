package cn.ucai.day23.socket4.up1;

import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
	/**
	 * ·þÎñÆ÷
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		for(;;){
			Socket socket = ss.accept();
			new SendThread(socket).start();
			new ReceiveThread(socket).start();
		}
//		socket.close();
	}

}
