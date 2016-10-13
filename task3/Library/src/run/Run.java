package run;

import libraryUnit.Library;
import services.LibraryService;

public class Run {

	public static void main(String[] args) {
		LibraryService libraryService = new LibraryService(new Library(5, 5));
	    libraryService.initLibrary();
	    
	
	    libraryService.addBook("A Game Of Thrones");
	    libraryService.addBook("A Clash Of Kings");
	    libraryService.addBook("A Storm Of Swords");
	    libraryService.addBook("A Feast For Crows");
	    libraryService.addBook("A Dance With Dragons");
	    	      
	    libraryService.addReader("Alexander Lukashenko", 2);
	    libraryService.addReader("Vladimir Putin", 2);
	    libraryService.addReader("Barak Obama", 2);
	    libraryService.addReader("Elizaveta II", 2);
	    libraryService.addReader("Joachim Gauck", 2);
	    
	    libraryService.takeBook(1, 1);
	    libraryService.takeBook(2, 2);	    
	    libraryService.takeBook(3, 3);
	    libraryService.takeBook(4, 4);
	    
	    libraryService.giveBook(4, 2);
	    
	    showLinyByLine("Books from reader: ", libraryService.getBooksByReaderId(2));
	    
	    System.out.println("\nReader for book 'A Storm Of Swords': " + libraryService.getReaderByBookId(3));
	    
	 	showLinyByLine("\nAll library books:", libraryService.getBooks());
	    
	    showLinyByLine("\nAll readers:", libraryService.getReaders());
	  }
	  
	  private static void showLinyByLine(String title, Object[] objects) {
	    System.out.println(title);
	    for (Object object : objects) {
	    System.out.println(object);
	    }
	  }

	

}
