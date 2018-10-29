package com.kaufland.myLibrary.web;

import com.kaufland.myLibrary.dto.BookDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SaveBookController {


    @GetMapping("/saveBook")
    public String saveBook(Model model){
        model.addAttribute("book", new BookDTO());
        return "save/bookForm";
    }

    @PostMapping("/saveBook")
    public String saveBookSubmit(@ModelAttribute BookDTO book){
        return "save/result/result";
    }
}
