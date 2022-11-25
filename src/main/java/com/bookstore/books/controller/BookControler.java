package com.bookstore.books.controller;

import com.bookstore.books.BooksApplication;
import com.bookstore.books.model.Book;
import com.bookstore.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookControler {

    private final BookService bookService;

    //TODO INSERT HTTP OUTPUT AND VALIDATION
    @PostMapping("/save")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    //TODO INSERT HTTPOUTPUT AND VALIDATION
    @GetMapping
    public List<Book> list() {
        return bookService.list();
    }

    //TODO INSERT HTTPOUTPUT AND VALIDATION
    @GetMapping("/{id}")
    public Book listId(@PathVariable long id) {
        return bookService.listID(id);
    }

    //TODO ATUALIZAR LIVROS
    //TODO DELETAR LIVROS

}
