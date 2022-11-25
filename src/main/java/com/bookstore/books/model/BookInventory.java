package com.bookstore.books.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BookInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Book book;

    private int quantity;

}
