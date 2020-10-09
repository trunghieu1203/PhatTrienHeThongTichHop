package lab_3;
import java.net.*;
import java.io.*;
import java.util.*;

public class HeaderViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			try {
			URL u = new URL("https://github.com/trunghieu1203/PhatTrienHeThongTichHop/upload/lab3");
			URLConnection uc = u.openConnection( );
			
			System.out.println("Content-type: " + uc.getContentType( ));
			System.out.println("Contentencoding: " + uc.getContentEncoding( ));
			System.out.println("Date: " + new Date(uc.getDate( )));
			System.out.println("Last modified: " + new Date(uc.getLastModified(
			)));
			System.out.println("Expiration date: " + new Date(uc.getExpiration(
			)));
			System.out.println("Content-length: " + uc.getContentLength( ));
			}
			catch (MalformedURLException ex) {
			System.err.println("https://github.com/trunghieu1203/PhatTrienHeThongTichHop/upload/lab3" + " is not a URL I understand");
			}
			catch (IOException ex) {
			System.err.println(ex);
			}
			System.out.println( );
			
	}

}
