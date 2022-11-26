package com.bookstore.books.controller;

import com.bookstore.books.model.Book;
import com.bookstore.books.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookControler {

    private final BookService bookService;

    //TODO INSERT HTTP OUTPUT AND VALIDATION
    @PostMapping("/create")
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    //TODO INSERT HTTPOUTPUT AND VALIDATION
    @GetMapping("/list")
    public List<Book> list() {
        return bookService.list();
    }

    //TODO INSERT HTTPOUTPUT AND VALIDATION
    @GetMapping("/{id}")
    public Book listId(@PathVariable long id) {
        return bookService.listID(id);
    }

    //TODO INSERT HTTPOUTPUT AND VALIDATION
    @PutMapping("/save")
    public Book save(@RequestBody Book book){
        return bookService.save(book);
    }


    //TODO ATUALIZAR LIVROS
    //TODO DELETAR LIVROS

}
