package com.shellcore.java.librarymanager;

import com.shellcore.java.librarymanager.book.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Cesar. 09/05/2017.
 */
public class ExerciseTest {
    DramaBook dramaBook;
    ScienceFictionBook scienceFictionBook;
    ScienceFictioneAudioBook scienceFictioneAudioBook;
    DramaPrintedBook dramaPrintedBook;

    @Before
    public void setUp() {
        dramaBook = new DramaBook("The Inheritance","A. Carson",1965,"Medieval","Europe");
        scienceFictionBook = new ScienceFictionBook("The Android Invasion","J. Morgan",2017,"Technology");
        dramaPrintedBook = new DramaPrintedBook("The Inheritance","A. Carson",1965,"Medieval","Europe","5.6 x 2.8 x 8.3 inches", "1.6 pounds");
        scienceFictioneAudioBook = new ScienceFictioneAudioBook("The Android Invasion","J. Morgan",2017,"Technology",12,"8mb");
    }

    @Test
    public final void testDramaBookInheritance() {
        assertTrue("Test Drama Book Inheritance", Book.class.isAssignableFrom(DramaBook.class));
    }

    @Test
    public final void testScienceFictionBookInheritance() {
        assertTrue("Test Science Fiction Book Inheritance", Book.class.isAssignableFrom(ScienceFictionBook.class));
    }

    @Test
    public final void testPrintedBookInterface() {
        assertTrue("Test implementation of interface PrintedBook", dramaPrintedBook instanceof PrintedBook);
    }

    @Test
    public final void testEBookInterface() {
        assertTrue("Test implementation of interface eBook", scienceFictioneAudioBook instanceof eBook);
    }

    @Test
    public final void testEAudioBookInterface() {
        assertTrue("Test implementation of interface eAudioBook", scienceFictioneAudioBook instanceof eAudioBook);
    }

    @Test
    public final void testDramaPrintedBookInheritance() {
        assertTrue("Test Drama Book Inheritance", DramaBook.class.isAssignableFrom(DramaPrintedBook.class));
    }

    @Test
    public final void testScienceFictioneAudioBookInheritance() {
        assertTrue("Test Science Fiction Book Inheritance", ScienceFictionBook.class.isAssignableFrom(ScienceFictioneAudioBook.class));
    }

}

