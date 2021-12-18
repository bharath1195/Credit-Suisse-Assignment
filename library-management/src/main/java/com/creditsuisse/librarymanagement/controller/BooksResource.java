package com.creditsuisse.librarymanagement.controller;


import java.util.List;

import com.creditsuisse.librarymanagement.model.Book;
import org.springframework.http.ResponseEntity;



public interface BooksResource {

    ResponseEntity<Book> getBookByIsbn(String isbn);
    ResponseEntity<Book> addBook(Book book);
    ResponseEntity<List<Book>> getAllBooks();
    ResponseEntity<Book> updateBook(String isbn, Book book);   
    ResponseEntity<Void> deleteBook(String isbn);
    ResponseEntity<List<Book>> getBooksByTitleAuthor(String name);

}
