package com.wcs.springrestquest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.wcs.springrestquest.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // custom query to search to book post by title or content
    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);

}