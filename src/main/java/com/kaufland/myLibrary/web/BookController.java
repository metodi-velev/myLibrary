package com.kaufland.myLibrary.web;

import com.kaufland.myLibrary.dto.BookDTO;
import com.kaufland.myLibrary.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {


    @GetMapping("/book")
    public String savе(Model model){
        model.addAttribute("book", new BookDTO());
        return "save/bookForm";
    }

   /* @RequestMapping("/book")*/

    @PostMapping("/save")
    public String savе(@ModelAttribute BookDTO book){
        return "save/result/result";
    }
}

