package com.bookstore.books.controller;

import com.bookstore.books.service.BookInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book-inventory")
public class BookInventoryController {

    private final BookInventoryService bookInventoryService;

    //TODO SALVAR INVENTÓRIO
    //TODO BUSCAR INVENTÓRIO
    //TODO LISTAR INVENTÓRIOS

    //TODO ATUALIZAR INVENTÓRIOS
    //TODO DELETAR INVENTÓRIOS

}
