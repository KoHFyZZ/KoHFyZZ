package libraryUnit;

public class LibraryUser {
	 private long id;
	  private String fullName;
	  private LibraryBook[] books;

	  public LibraryUser(int maxBooksCount) {
	    this.books = new LibraryBook[maxBooksCount];
	  }
	  
	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getFullName() {
	    return fullName;
	  }

	  public void setFullName(String fullName) {
	    this.fullName = fullName;
	  }

	  public LibraryBook[] getBooks() {
	    return books;
	  }

	  public void setBooks(LibraryBook[] books) {
	    this.books = books;
	  }

	  @Override
	  public String toString() {
	    return fullName;
	  }
}
