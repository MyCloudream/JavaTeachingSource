package cn.ucai.day23.socket4.up1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

//������Ϣ�߳�
public class SendThread  extends Thread {
	private Socket socket;
	public SendThread(Socket socket) {
		this.socket = socket;
	}
	public void run(){
		try {
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				// utf-8 unicode char a
				dos.writeUTF(br.readLine());//writeUTF�ر��ʺ������紫���ַ���
				dos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
