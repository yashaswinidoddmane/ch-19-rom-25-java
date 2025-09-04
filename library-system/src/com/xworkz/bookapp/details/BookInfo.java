package com.xworkz.bookapp.details;

//import com.xworkz.bookapp.bookvalidation.BookValidation;

import com.xworkz.bookapp.book.Book;

public class BookInfo {

    Book[] books = new Book[14];
    int index;

    public boolean addBook(Book book) {
        boolean isBookAdded = false;
        if (book != null) {
            books[index++] = book;
            isBookAdded = true;
        } else {
            System.out.println("Invalid trainee details");
        }
        return isBookAdded;
    }

    public void getBookDetails() {
        System.out.println("list of Book's are");
        for (Book book : books) {
            System.out.println("Book name is: " + book.getBookName());
            System.out.println("Book Id is:"+ book.getBookId());
            System.out.println("Book language is:"+ book.getLanguage());
            System.out.println("Book Genre is:"+book.getGenre());
            System.out.println("Book author is:"+ book.getAuthor());
            System.out.println("Book Publisher is:"+ book.getPublisher());
            System.out.println("-----------------------------------");
        }
    }
}
    /*
    Book book;

    public boolean createBookInfo(Book book) {

        boolean isBookCreated = false;
        boolean isBookInfoValid = false;

        BookValidation bookInfo = new BookValidation();
        isBookInfoValid = bookInfo.validateBook(book);
        if(isBookInfoValid){
            this.book = book;
            isBookCreated = true;
        }
        return  isBookCreated;
    }

    public void fetchBookDetails() {
        System.out.println("book name : "+book.getBookName());
        System.out.println("book id : "+book.getBookId());
        System.out.println("language : "+book.getLanguage());
        System.out.println("genre : "+book.getGenre());
        System.out.println("title : "+book.getTitle());
        System.out.println("author : "+book.getAuthor());
        System.out.println("publisher : "+book.getPublisher());
    }

         */