package cn.ucai.day23.socket2.up1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		PrintWriter writer=null;
		OutputStream out=null;
		ServerSocket server=null;
		Scanner scan = new Scanner(System.in);
		try {
			//创建服务端套接字
			server=new ServerSocket(9999);
			System.out.println("等待客户端的连接.....");
			Socket socket=server.accept();
			//获取输出流
			out=socket.getOutputStream(); // 话筒
			//获取文本输出流
			writer=new PrintWriter(out);
			//向客户端发送两行文本
			for(;;){
				String msg = scan.nextLine();// 阻塞
				writer.println(msg);
				writer.flush();//刷新缓冲区
				if(msg.equals("bye")){
					break;
				}
			}
			writer.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
