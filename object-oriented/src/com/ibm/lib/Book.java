package com.ibm.lib;

public class Book {
	private String title;
	private Member mbr; // reference of other object

	public Book(String title) {
		this.title = title;
		}
	
	public void status() {
		if(mbr == null)
			System.out.println(title + "is not issued to anyone");
		else 
			System.out.println(title +"is issued to " + mbr.getName());
	}

 
	// issued a book to member

	public String getTitle() {
		return title;
	}

	public void issueBook(Member m) {
		if(mbr != null)
			System.out.println(title + "is already issued");
		else if(m.getBook() != null)
			System.out.println(m.getName() + " had already issued a book");
		else {
			mbr = m;
			m.setBook(this);
			System.out.println("Book issued");
			
		}
		
		}

	public void returnBook(Member m) {
		if(mbr ==null)//if member is null book is not issued
			System.out.println(title + "is not issued to anyone");
		else if(m.getBook() ==null)
			System.out.println(m.getName() + " had not issued a book");
		else if(!m.getName().equals(mbr.getName()))
			System.out.println(title + "was not issued to" + m.getName());
		else if(!m.getBook().getTitle().equals(title))
			System.out.println(m.getName() + "has not issued" + title);
			
		else {
			m.setBook(this);
			mbr = null;
			System.out.println("Book returned.");
		}

	

}
}
