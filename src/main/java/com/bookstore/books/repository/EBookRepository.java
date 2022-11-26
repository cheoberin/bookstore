package com.bookstore.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookstore.books.model.EBook;

@Repository
public interface EBookRepository extends JpaRepository<EBook, Long> {
}
