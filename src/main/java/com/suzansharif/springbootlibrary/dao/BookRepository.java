package com.suzansharif.springbootlibrary.dao;

import com.suzansharif.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
