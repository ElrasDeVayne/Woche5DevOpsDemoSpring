package ch.zhaw.iwi.devops.demo;

import java.util.*;
import java.util.stream.*;

public class Library {

    private List<Book> books = new ArrayList<>();

    // Fügt ein Buch zur Bibliothek hinzu
    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> searchBooksByTitle(String title) {
        return books.stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                    .collect(Collectors.toList());
    }
}


