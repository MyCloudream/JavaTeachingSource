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
			//����������׽���
			server=new ServerSocket(9999);
			System.out.println("�ȴ��ͻ��˵�����.....");
			Socket socket=server.accept();
			//��ȡ�����
			out=socket.getOutputStream(); // ��Ͳ
			//��ȡ�ı������
			writer=new PrintWriter(out);
			//��ͻ��˷��������ı�
			for(;;){
				String msg = scan.nextLine();// ����
				writer.println(msg);
				writer.flush();//ˢ�»�����
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
