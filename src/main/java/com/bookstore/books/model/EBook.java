package com.bookstore.books.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Data
public class EBook extends Book{

    private String format;

}
