package com.bookstore.books.service;

import com.bookstore.books.repository.BookInventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookInventoryService {

    private final BookInventoryRepository bookInventoryRepository;

}
