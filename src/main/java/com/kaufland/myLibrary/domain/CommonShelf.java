package com.kaufland.myLibrary.domain;

import com.kaufland.myLibrary.exceptions.BookNotAddedException;
import com.kaufland.myLibrary.exceptions.MaxSizeReachedException;

import java.util.List;

public class CommonShelf extends Shelf {


    public CommonShelf(String name, int maxSize) {
        super(name, maxSize * 2);
    }

    @Override
    public void addBooksToShelf(Book... books) throws BookNotAddedException{
        for (Book book : books) {
            int currentBooks = super.books.size();
            if (++currentBooks > maxSize) {
                throw new BookNotAddedException("The max size is reached");
            }

            super.books.add(book);
        }
    }

    @Override
    public void addBooksToShelf(List<Book> books) {
        if (books.size() <= super.maxSize) {
            for (Book book : books) {
                super.books.add(book);
            }
        } else {
            throw new MaxSizeReachedException("The max size is reached");
        }
    }
}
