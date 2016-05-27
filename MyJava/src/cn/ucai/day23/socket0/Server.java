package cn.ucai.day23.socket0;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务端
 */
public class Server {
	public static void main(String[] args) {
		try {
			//创建服务端套接字对象 
			// 8899 端口号  2个字节  16位 2^16 0-65535 21 22
			// 1024以下 
			ServerSocket server=new ServerSocket(8888);
			System.out.println("接受客户端的连接......");
			// 用于接收客户端的连接  阻塞方法
			Socket socket=server.accept();
			System.out.println(socket);
			//关闭套接字
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
