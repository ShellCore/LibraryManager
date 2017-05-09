package com.shellcore.java.librarymanager.book;

/**
 * Created by Cesar. 09/05/2017.
 */
public class DramaPrintedBook extends DramaBook implements PrintedBook {

    private String dimensions;
    private String weight;

    public DramaPrintedBook(String title, String author, int yearOfPublication, String time, String place, String dimensions, String weight) {
        super(title, author, yearOfPublication, time, place);
        this.dimensions = dimensions;
        this.weight = weight;
    }

    @Override
    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight: "+ weight);
        System.out.println("Dimensions: "+ dimensions);
    }
}
