package com.bookstore.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookstore.books.model.eBook;

@Repository
public interface eBookRepository extends JpaRepository<eBook, Long> {
}
