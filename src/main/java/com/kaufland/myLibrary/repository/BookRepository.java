package com.kaufland.myLibrary.repository;

import com.kaufland.myLibrary.domain.Author;
import com.kaufland.myLibrary.domain.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends BasicBookRepository<Book> {

    Book findBookByAuthorAndTitle(String title, Author author);

    List<Book> findAllByAuthorAlias(String alias);

    List<Book> findBookByPagesBetween(int min, int max);

    @Query("SELECT b FROM Book AS b where b.rating >= 4")
    List<Book> findSuggestedBooks();
}
