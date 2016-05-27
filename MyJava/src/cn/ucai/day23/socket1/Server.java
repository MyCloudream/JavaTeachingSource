package cn.ucai.day23.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		//声明字符缓冲输入流
		BufferedReader reader=null;
		//声明输入流
		InputStream in=null;
		try {
			//创建服务端套接字对象
			ServerSocket server=new ServerSocket(8899);
			System.out.println("接受客户端的连接......");
			Socket socket=server.accept();
			System.out.println(socket);
			//与客户端建立连接后，获取输入流
			in=socket.getInputStream();// 拿到了听筒
			//创建字符缓冲输入流，包装输入流
			reader=new BufferedReader(new InputStreamReader(in));
			//读取从客户端发送的字符串并打印
			System.out.println("客户端发送的消息："+reader.readLine());
			//关闭套接字
			server.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
