package service;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(8888);
			Socket socket = null;

			int count = 0;
			System.out.println("服务器即将启动，等待客户端的连接....");

			while (true) {
				socket = serverSocket.accept();

				ServerThread serverThread = new ServerThread(socket);
				serverThread.start();
				
				count++;
				System.out.println("客户端 的数量：" + count);
				InetAddress address = socket.getInetAddress();
				System.out.println("当前客户端的IP：" + address.getHostAddress());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (serverSocket != null) {
				serverSocket.close();
			}
		}
	}

}
