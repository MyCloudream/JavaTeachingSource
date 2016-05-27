package cn.ucai.day23.socket2.up1;

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
			in=socket.getInputStream();// ÌýÍ²
			isr=new InputStreamReader(in);
			reader=new BufferedReader(isr);
			for(;;){
				String back = reader.readLine();
				System.out.println("·þÎñ¶Ë·¢ËÍµÄ×Ö·û´®£º"+back);
				if(back.equals("bye")){
					break;
				}
			}
			reader.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
