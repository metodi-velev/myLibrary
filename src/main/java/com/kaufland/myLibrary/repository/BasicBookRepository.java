package com.kaufland.myLibrary.repository;

import com.kaufland.myLibrary.domain.Author;
import com.kaufland.myLibrary.domain.Book;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BasicBookRepository<T extends Book> extends BasicRepository<T> {

    List<Book> findAllByAuthor(Author author);
    List<Book> findAllByPages(int pages);
}
