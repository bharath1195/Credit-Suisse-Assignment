package com.creditsuisse.librarymanagement.controller;



import com.creditsuisse.librarymanagement.model.Book;
import com.creditsuisse.librarymanagement.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsersResource {
	ResponseEntity<User> getUserByIsbn(String isbn);
    ResponseEntity<User> addUser(User user);
    ResponseEntity<List<User>> getAllUsers();
    ResponseEntity<User> updateUser(String isbn, User user);   
    ResponseEntity<Void> deleteUser(String isbn);
	ResponseEntity<User> lendBooksToUsers(String userid, String bookid);
	ResponseEntity<List<Book>> returnBooksToLib(String userid, String bookid);
	ResponseEntity<List<User>> getUsersByName(String name);
	

}
