package com.cg.beans;

public class Librarian {
    private int librarianId;
    private String name;
    Book book;

    public Librarian() {
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public void issueBook(){
        System.out.println("Librarian ID: "+librarianId);
        System.out.println("Librarian name: "+name);
        System.out.println("Book details are:");
        book.displayBookDetails();
    }
}
