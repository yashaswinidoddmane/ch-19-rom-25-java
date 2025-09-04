package com.xworkz.bookapp;

import com.xworkz.bookapp.book.Book;
import com.xworkz.bookapp.details.BookInfo;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Book book6 = new Book();
        Book book7 = new Book();
        Book book8 = new Book();
        Book book9 = new Book();
        Book book10 = new Book();
        Book book11= new Book();
        Book book12 = new Book();
        Book book13 = new Book();

        book.setBookName("Think Like a monk");
        book1.setBookName("To Kill a Mockingbird");
        book2.setBookName("The Great Gatsby");
        book3.setBookName("Jane Eyre");
        book4.setBookName("Beloved She My");
        book5.setBookName("Harry Potter Serie");
        book6.setBookName("The Bible");
        book7.setBookName("The Lord of the Rings");
        book8.setBookName("The Little Prince");
        book9.setBookName("Pride and Prejudice");
        book10.setBookName("The Great Gatsby");
        book11.setBookName("The Odyssey");
        book12.setBookName("And Then There Were None");
        book13.setBookName("Dream of the Red Chamber");

        book.setBookId(1);
        book1.setBookId(2);
        book2.setBookId(3);
        book3.setBookId(4);
        book4.setBookId(5);
        book5.setBookId(6);
        book6.setBookId(7);
        book7.setBookId(8);
        book8.setBookId(9);
        book9.setBookId(10);
        book10.setBookId(11);
        book11.setBookId(12);
        book12.setBookId(13);
        book13.setBookId(14);

        book.setLanguage("english");
        book1.setLanguage("english");
        book2.setLanguage("english");
        book3.setLanguage("english");
        book4.setLanguage("english");
        book5.setLanguage("english");
        book6.setLanguage("english");
        book7.setLanguage("english");
        book8.setLanguage("english");
        book9.setLanguage("english");
        book10.setLanguage("english");
        book11.setLanguage("english");
        book12.setLanguage("english");
        book13.setLanguage("english");

        book.setGenre("Spirituality");
        book1.setGenre("Drama");
        book2.setGenre("Modernist Fiction");
        book3.setGenre("Romance");
        book4.setGenre("Psychological");
        book5.setGenre("Fantasy");
        book6.setGenre("Religious");
        book7.setGenre("Fantasy");
        book8.setGenre("Allegorical");
        book9.setGenre("Romance");
        book10.setGenre("Mythology");
        book11.setGenre("Mystery");
        book12.setGenre("Chinese Classic");
        book13.setGenre("drama");

        book.setAuthor("Jay Shetty");
        book1.setAuthor("Harper Lee");
        book2.setAuthor("F. Scott Fitzgerald");
        book3.setAuthor("Charlotte Brontë");
        book4.setAuthor("Toni Morrison");
        book5.setAuthor("J.K. Rowling");
        book6.setAuthor("Multiple Authors");
        book7.setAuthor("J.R.R. Tolkien");
        book8.setAuthor("Antoine de Saint-Exupéry");
        book9.setAuthor("Jane Austen");
        book10.setAuthor("Homer");
        book11.setAuthor("Agatha Christie");
        book12.setAuthor("Cao Xueqin");
        book13.setAuthor("J.K. Rowling");

        book.setPublisher("Simon & Schuster");
        book1.setPublisher("J.B. Lippincott & Co.");
        book2.setPublisher("Charles Scribner's Sons");
        book3.setPublisher("Smith, Elder & Co.");
        book4.setPublisher("Alfred A. Knopf");
        book5.setPublisher("Bloomsbury / Scholastic");
        book6.setPublisher("Various Publishers");
        book7.setPublisher("George Allen & Unwin");
        book8.setPublisher("Reynal & Hitchcock");
        book9.setPublisher("T. Egerton, Whitehall");
        book10.setPublisher("Ancient Greece");
        book11.setPublisher("Collins Crime Club");
        book12.setPublisher("Qing Dynasty Manuscript");
        book13.setPublisher("T. Egerton, Whitehall");


        BookInfo bookInfo = new BookInfo();
        bookInfo.addBook(book);
        bookInfo.addBook(book1);
        bookInfo.addBook(book2);
        bookInfo.addBook(book3);
        bookInfo.addBook(book4);
        bookInfo.addBook(book5);
        bookInfo.addBook(book6);
        bookInfo.addBook(book7);
        bookInfo.addBook(book8);
        bookInfo.addBook(book9);
        bookInfo.addBook(book10);
        bookInfo.addBook(book11);
        bookInfo.addBook(book12);
        bookInfo.addBook(book13);

        bookInfo.getBookDetails();
        /*
        Book book = new Book();
        book.setBookName("Think Like a monk");
        book.setBookId("JA127");
        book.setLanguage("English");
        book.setGenre("self help");
        book.setTitle("think like a monk");
        book.setAuthor("Jai shetty");
        book.setPublisher("Simon & Schuster");

        BookInfo bookDetails = new BookInfo();
        bookDetails.createBookInfo(book);
        bookDetails.fetchBookDetails();



         */
        System.out.println("main ended");
    }
}
