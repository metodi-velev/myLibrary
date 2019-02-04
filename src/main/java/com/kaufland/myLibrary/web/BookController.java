package com.kaufland.myLibrary.web;

import com.kaufland.myLibrary.domain.Novel;
import com.kaufland.myLibrary.domain.Read;
import com.kaufland.myLibrary.dto.BasicBookDTO;
import com.kaufland.myLibrary.services.AuthorServiceImpl;
import com.kaufland.myLibrary.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("books")
public class BookController {
    private final BookService bookService;
    private final AuthorServiceImpl authorService;


    public BookController(BookService bookService, AuthorServiceImpl authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping("/save")
    public String save(Model model){
        model.addAttribute("book", new BasicBookDTO());
        model.addAttribute("authors", authorService.getAllAuthors());
        model.addAttribute("year", null);
        return "forms/novel";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BasicBookDTO book){
        this.bookService.save(book);
        return "redirect:/";
    }
}

