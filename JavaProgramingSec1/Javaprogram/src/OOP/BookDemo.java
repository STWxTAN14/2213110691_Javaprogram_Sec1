package OOP;

import java.util.*;

public class BookDemo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Book book = new Book();
		System.out.print("Input boook title    :");
		book.setTitle(scan.nextLine());
		System.out.print("Input boook title    :");
		book.setPrice(scan.nextFloat());
		System.out.print("Input boook title    :");
		book.setPublishyear(scan.nextInt());
		
		System.out.println();
		System.out.println(book);
	

	}

}
