package com.bookstore.books.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany
    private List<Author> authors;

    @ManyToOne
    private Publisher publisher;

    private int publicationYear;
    private String summary;

}
