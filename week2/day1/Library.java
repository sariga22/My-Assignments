package week2.day1;

public class Library {
	
	

	public String addBook() {
		
	       System.out.println("Book added successfully");
	       return "booktitle";
		}
		
		
		public void issueBook() {
			
	    System.out.println("Book issued successfully");
		}
		
		
		
		public static void main(String[] args) {
			Library bookActions=new Library();
			String book = bookActions.addBook();
			bookActions.issueBook();
			
		}

	}