package com.bookstore.books.service;

import com.bookstore.books.model.Book;
import com.bookstore.books.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> list() {
        return bookRepository.findAll();
    }

    public Book listID(long id) {
        return bookRepository.findById(id).orElseThrow();
    }
}
