package com.bookstore.books.service;

import com.bookstore.books.repository.EBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EBookService {

    private final EBookRepository eBookRepository;

}
