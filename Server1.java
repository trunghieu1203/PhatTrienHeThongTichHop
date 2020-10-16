package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


//Bài 2

public class Server1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket server = new ServerSocket(1225);
			System.out.println("Server da duoc tao");
			Socket client = server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Nhap ten sach:");
			String name=inFromClient.nextLine();
			BufferedReader br=null;
			br=new BufferedReader(new FileReader("T:\\Hieu1232000\\txt.txt"));
			String txtInALine=br.readLine();
			if(txtInALine.contains(name))
				outToClient.println("co sach");
			else outToClient.println("kong co sach");
					
			} catch (IOException e) {
			
			e.printStackTrace();
			}

	}

}
