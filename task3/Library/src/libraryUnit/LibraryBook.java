package libraryUnit;

public class LibraryBook {
	private long id;
	  private String name;
	  private LibraryUser reader;
	  private Library library;
	  
	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }
	  
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public LibraryUser getReader() {
	    return reader;
	  }
	  
	  public void setReader(LibraryUser reader) {
	    this.reader = reader;
	  }

	  public Library getLibrary() {
	    return library;
	  }

	  public void setLibrary(Library library) {
	    this.library = library;
	  }

	  @Override
	  public String toString() {
	    return name + " : " + (reader != null ? reader : " in library");
	  }
}
