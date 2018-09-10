package com.kaufland.myLibrary.repository;

import com.kaufland.myLibrary.domain.Author;
import com.kaufland.myLibrary.domain.Book;
import com.kaufland.myLibrary.domain.Genre;
import com.kaufland.myLibrary.domain.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Collection;
import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findAllByFirstName(String firstName);
    List<Author> findAllByLastName(String lastName);
    List<Author> findAllByYear (Instant year);
//    List<Author> findByBooks (Collection<Book> books);
   // List<Author> findAllByGenres (List<Genre> genre);
    List<Author> findAllByNationality (Nationality nationality);
}
