package com.shellcore.java.librarymanager.book;

/**
 * Created by Cesar. 09/05/2017.
 * A class describing all kinds of books
 */
public class Book {

    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void print() {
        System.out.println("");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of publication: " + yearOfPublication);
    }
}
