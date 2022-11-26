package com.bookstore.books.controller;


import com.bookstore.books.service.EBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ebook")
public class EBookController {

    private final EBookService eBookService;

}
