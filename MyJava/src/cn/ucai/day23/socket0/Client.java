package cn.ucai.day23.socket0;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			//创建客户端套接字，指明连接的服务端地址和端口号
			// 发起了一个向指定ip和端口号的连接
			Socket socket=new Socket("127.0.0.1", 8888);
			System.out.println(socket);
			socket.close();//关闭套接字对象
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
