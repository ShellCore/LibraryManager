package com.shellcore.java.librarymanager.book;

/**
 * Created by Cesar. 09/05/2017.
 * A book which contains dramatic stories
 */
public class DramaBook extends Book {

    private String time;
    private String place;

    public DramaBook(String title, String author, int yearOfPublication, String time, String place) {
        super(title, author, yearOfPublication);
        this.time = time;
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Time: " + time);
        System.out.println("Space: " + place);
    }
}
