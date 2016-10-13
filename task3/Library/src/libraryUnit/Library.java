package libraryUnit;

public class Library {
	private LibraryUser[] readers;
	  private LibraryBook[] books;

	  public Library(int maxReadersCount, int maxBooksCount) {
	    this.readers = new LibraryUser[maxBooksCount];
	    this.books = new LibraryBook[maxBooksCount];
	  }

	  public LibraryUser[] getReaders() {
	    return readers;
	  }

	  public void setReaders(LibraryUser[] readers) {
	    this.readers = readers;
	  }

	  public LibraryBook[] getBooks() {
	    return books;
	  }

	  public void setBooks(LibraryBook[] books) {
	    this.books = books;
	  }

}
