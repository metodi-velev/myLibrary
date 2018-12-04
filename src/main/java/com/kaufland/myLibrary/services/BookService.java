package com.kaufland.myLibrary.services;

import com.kaufland.myLibrary.domain.Author;
import com.kaufland.myLibrary.domain.Book;
import com.kaufland.myLibrary.domain.ChildBook;
import com.kaufland.myLibrary.domain.Novel;
import com.kaufland.myLibrary.dto.BookDTO;
import com.kaufland.myLibrary.dto.BookDetailDTO;

import java.util.List;
import java.util.Map;

public interface BookService {

    List<BookDTO> findLatestAuthorBooks();
    List<BookDTO> findSuggestedBooks();
    List<BookDTO> findLatestBookByGenre();

    BookDTO findById(long id);

    void saveBookDTO(String title, String authorFirstName, String authorLastName, String summary, String image);

    BookDetailDTO findBookById(Long id);
    List<ChildBook> allChildBooks();
    List<Novel> allNovels();
    Book findBookByTitle(String title);
    Book findBookByAuthorAndTitle(String title , Author author);
    Book theLatestBook();
    List<Book> findBookByAlias(String alias);
    List<Book> findBookByPages(int min, int max);


}
