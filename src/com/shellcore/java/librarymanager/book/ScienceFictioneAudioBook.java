package com.shellcore.java.librarymanager.book;

/**
 * Created by Cesar. 09/05/2017.
 */
public class ScienceFictioneAudioBook extends ScienceFictionBook implements eAudioBook {

    private int numberOfTracks;
    private String size;

    public ScienceFictioneAudioBook(String title, String author, int yearOfPublication, String subject, int numberOfTracks, String size) {
        super(title, author, yearOfPublication, subject);
        this.numberOfTracks = numberOfTracks;
        this.size = size;
    }

    @Override
    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Number of tracks: " + numberOfTracks);
        System.out.println("Size: " + size);
    }
}
