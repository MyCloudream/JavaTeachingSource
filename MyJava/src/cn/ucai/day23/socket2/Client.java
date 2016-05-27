package cn.ucai.day23.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		InputStream in=null;
		InputStreamReader isr=null;
		BufferedReader reader=null;
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1", 9999);
			in=socket.getInputStream();// 听筒
			isr=new InputStreamReader(in);
			reader=new BufferedReader(isr);
			System.out.println("服务端发送的第一行字符串："+reader.readLine());
			System.out.println("服务端发送的第二行字符串："+reader.readLine());
			reader.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
