package com.shellcore.java.librarymanager.book;

/**
 * Created by Cesar. 09/05/2017.
 * A book which narrates possible events developed in a imaginary situation.
 */
public class ScienceFictionBook extends Book {

    private String subject; // (technology, timetravel, ...)

    public ScienceFictionBook(String title, String author, int yearOfPublication, String subject) {
        super(title, author, yearOfPublication);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Subject: " + subject);
    }
}
