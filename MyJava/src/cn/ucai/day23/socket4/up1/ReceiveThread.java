package cn.ucai.day23.socket4.up1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
//������Ϣ�߳�
public class ReceiveThread extends Thread {
	private Socket socket;
	public ReceiveThread(Socket socket) {
		super();
		this.socket = socket;
	}
	public void run(){
		try {
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while(true){
				String str = dis.readUTF();//��writeUTF�ر��ʺ������紫���ַ���
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
