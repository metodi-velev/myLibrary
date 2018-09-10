package com.kaufland.myLibrary.repository;

import com.kaufland.myLibrary.domain.Author;
import com.kaufland.myLibrary.domain.Book;
import com.kaufland.myLibrary.domain.Genre;
import com.kaufland.myLibrary.domain.Read;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.time.Instant;
import java.util.List;

@NoRepositoryBean
public interface BasicRepository<T extends Read> extends JpaRepository<T, Long> {

    Book findByTitle(String title);
    List<Book> findAllByYear(Instant year);
    List<Book> findAllByLanguage(String language);
    List<Book> findAllByGenre (Genre genre);

}
