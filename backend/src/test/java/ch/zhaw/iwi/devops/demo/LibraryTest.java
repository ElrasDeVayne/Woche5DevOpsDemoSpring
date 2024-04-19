package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testSearchInEmptyLibrary() {
        assertTrue(library.searchBooksByTitle("1984").isEmpty(), "Search in an empty library should return an empty list");
    }

    @Test
    void testFindBookByTitle() {
        library.addBook(new Book("1984", "George Orwell"));
        assertFalse(library.searchBooksByTitle("1984").isEmpty(), "Should find the book by title");
    }
    @Test
    void testFindBookCaseInsensitive() {
        library.addBook(new Book("1984", "George Orwell"));
        assertFalse(library.searchBooksByTitle("1984").isEmpty(), "Should be case-insensitive");
    }
    @Test
    void testBookNotFound() {
        library.addBook(new Book("Animal Farm", "George Orwell"));
        assertTrue(library.searchBooksByTitle("1984").isEmpty(), "Should not find the book that isn't there");
    }

    @Test
    void testFindMultipleCopiesOfTitle() {
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("1984", "George Orwell"));
        assertEquals(2, library.searchBooksByTitle("1984").size(), "Should find multiple copies of the book");
    }
    @Test
    void testHandleEmptyAndNullInput() {
        assertThrows(IllegalArgumentException.class, () -> library.searchBooksByTitle(""), "Empty title should throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> library.searchBooksByTitle(null), "Null title should throw IllegalArgumentException");
    }

    @Test
    void testFindBookWithSpecialCharacters() {
        library.addBook(new Book("Les Misérables", "Victor Hugo"));
        assertFalse(library.searchBooksByTitle("Les Misérables").isEmpty(), "Should correctly handle titles with special characters");
    }

    @Test
    void testSearchBooksPerformance(){
        for (int i = 0; i < 10000; i++) {
            library.addBook(new Book("Book " + i, "Author " + i));
        }
        long startTime = System.nanoTime();
        library.searchBooksByTitle("Book 9999");
        long duration = System.nanoTime() - startTime;
        assertTrue(duration < 1000000000, "Search should be performant and complete in under 1 second");
    }








}
