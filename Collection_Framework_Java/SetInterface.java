package Collection_Framework_Java;

import java.util.*;

class Book{
		int book_id;
		String title, author, publisher;
		int quantity;
		
		public Book(int book_id, String title, String author, String publisher, int quantity){
			this.book_id = book_id;
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}
		
		public String toString(){
			return book_id + "-->" + title + "-->" + author + "-->" + publisher + "-->" + quantity;
		}
		
		public boolean equals(Object O){
			return (this.book_id == ((Book)O).book_id);
		}
		
		public int hashCode(){
			return book_id;
		}
}


class SetDemo{
	public static void main(String [] args){
		HashSet<Book> libary = new HashSet<Book>();
		Book b1 = new Book(101,"Let us C","Yashwant Kanetkar", "BPB",10);
		Book b2 = new Book(102,"The Class of Java","Pravin Jain","Oxford",5);
		Book b3 = new Book(103,"Concepts of OOP","Bhushan Trivedi","Wiley",10);
		
		//add to set
		libary.add(b1);
		libary.add(b2);
		libary.add(b3);
		
		for (Book b:libary)
			System.out.println(b);
		
		Book b4 = new Book(103,"Concepts of OOP","Bhushan Trivedi","Wiley",10);
		libary.add(b4);
		libary.add(b3);
		
		Iterator<Book> iter = libary.iterator();
		System.out.println("After Adding Object with Same Data");
		while(iter.hasNext()){
			Book b = iter.next();
			System.out.println(b);
		}
		
		
		HashSet<Integer> fewNumbers = new HashSet<Integer>();
		fewNumbers.add(10);
		fewNumbers.add(20);
		fewNumbers.add(30);
		fewNumbers.add(30);
		
		for (int no:fewNumbers)
			System.out.println(no);
			
	}
}