package com.cg.beans;

public class Book {
    private int bookId;
    private String title;
    private String author;

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails(){
        System.out.println("ID of the book: "+ bookId);
        System.out.println("title of the book: "+title);
        System.out.println("author of the book: "+author);
    }
}
