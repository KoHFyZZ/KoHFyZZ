package services;

import libraryUnit.Library;
import libraryUnit.LibraryBook;
import libraryUnit.LibraryUser;

public class LibraryService {
	 private int maxBooksCount = 100;
	  private int maxReadersCount = 100;
	  
	  private Library library;
	  
	  public LibraryService(Library library) {
	  }
	  
	  public void setMaxBooksCount(int maxBooksCount) {
	    this.maxBooksCount = maxBooksCount;
	  }

	  public void setMaxReadersCount(int maxReadersCount) {
	    this.maxReadersCount = maxReadersCount;
	  }

	  public void initLibrary() {
	    this.library = new Library(maxReadersCount, maxBooksCount);
	  }

	  public void addBook(String bookName) {
	    for (int i = 0; i < library.getBooks().length; i++) {
	      if (library.getBooks()[i] == null) {
	        LibraryBook newBook = new LibraryBook();
	        newBook.setId(i + 1);
	        newBook.setName(bookName);
	        newBook.setLibrary(library);
	        library.getBooks()[i] = newBook; 
	        break;
	      }
	    }
	  }

	  public void addReader(String fullName, int maxBooksCount) {
	    for (int i = 0; i < library.getReaders().length; i++) {
	      if (library.getReaders()[i] == null) {
	        LibraryUser newReader = new LibraryUser(maxBooksCount);
	        newReader.setId(i + 1);
	        newReader.setFullName(fullName);
	        library.getReaders()[i] = newReader; 
	        break;
	      }
	    }
	  }

	  public void takeBook(int bookId, int readerId) {
	    LibraryUser reader = getReader(readerId);
	    LibraryBook book = getBook(bookId);
	    for (int i = 0; i < reader.getBooks().length; i++) {
	      if (reader.getBooks()[i] == null) {
	        reader.getBooks()[i] = book;
	        book.setReader(reader);
	        break;
	      }
	    }
	  }

	  public void giveBook(int bookId, int readerId) {
	    LibraryBook book = getBook(bookId);
	    LibraryUser reader = getReader(readerId);
	    for (int i = 0; i < reader.getBooks().length; i++) {
	      if (reader.getBooks()[i] != null && reader.getBooks()[i].getId() == bookId) {
	        reader.getBooks()[i] = null;
	        book.setReader(null);
	        break;
	      }
	    }
	  }

	  public LibraryBook[] getBooksByReaderId(int readerId) {
	    LibraryUser reader = getReader(readerId);
	    return reader != null ? getNotNullBooks(reader.getBooks()) : new LibraryBook[0];
	  }

	  public LibraryUser getReaderByBookId(int bookId) {
	    LibraryBook result = getBook(bookId);
	    return result != null ? result.getReader() : null;
	  }

	  public LibraryBook[] getBooks() {
	    return getNotNullBooks(library.getBooks());
	  }

	  public LibraryUser[] getReaders() {
	    LibraryUser[] result = new LibraryUser[getNotNullCount(library.getReaders())];
	    fillResultByNotNull(result, library.getReaders());
	    return result;
	  }

	  //------------------------------------------------------------------------------
	  
	  private LibraryBook[] getNotNullBooks(LibraryBook[] books) {
	    LibraryBook[] result = new LibraryBook[getNotNullCount(books)];  
	    fillResultByNotNull(result, books);
	    return result;
	  }
	  
	  private void fillResultByNotNull(Object[] result, Object[] resource) {
	    int i = 0;
	    for (Object object : resource) {
	      if (object != null) {
	        result[i] = object;
	        i++;
	      }
	    }
	  }
	  
	  private int getNotNullCount(Object[] objects) {
	    int count = 0;
	    for (Object object : objects) {
	      if (object != null) {
	        count++;
	      }
	    }
	    return count;
	  }
	  
	  private LibraryUser getReader(int readerId) {
	    return readerId > 0 && readerId <= library.getReaders().length ? library.getReaders()[readerId - 1] : null;
	  }
	  
	  private LibraryBook getBook(int bookId) {
	    return bookId > 0 && bookId <= library.getBooks().length ? library.getBooks()[bookId - 1] : null;
	  }
}
