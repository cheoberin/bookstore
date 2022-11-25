package com.bookstore.books.service;

import com.bookstore.books.repository.eBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class eBookService {

    private final eBookRepository eBookRepository;

}
