package OOP;
import java.util.*;
import java.time.*;

public class Book {
	
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle(){
		return title;	
	}
	
	public void setPrice(float price) {
		this.price=price;
	}
	
	public float getprice() {
		return price;
	}
	
	public void setPublishyear(int year) {
		publishyear=year;
	}
	
	public int getPublishyear() {
		return publishyear;
	}
	public int getTotalYear() {
		int totalYear=Year.now().getValue()-publishyear;
		return totalYear;
	}
	public String toString() {
		return String.format("Title: "+title+" published for"+getTotalYear()+" year ("+price+" baht.)");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
