package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
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





}
