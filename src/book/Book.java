package book;

import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Book {
	
	public static void main(String args[]){
		
		// 1. Create a client
		//If any configuration required to the client then we can create a 
		//configuration class and pass the object to new client.
		//In this example we are not using any configuration.
		
		Client client = ClientBuilder.newClient();
		
		// 2. Next we need to set a target
		
		 Scanner sc = new Scanner(System.in);
		 String bookType;
		 String url;
		 System.out.println("Enter Type of Book JAVA/PHP");
		 bookType = sc.nextLine();
		 url = "http://localhost:8080/WSDemo/book/"+bookType.toUpperCase();
		 
		 WebTarget target = client.target(url);
		 
		// 3. We need to get the response.
		 
		 
		 System.out.println(
				 
				 target.request(MediaType.TEXT_XML).get(String.class)
				 
				 );
		 
		 
	}

}
