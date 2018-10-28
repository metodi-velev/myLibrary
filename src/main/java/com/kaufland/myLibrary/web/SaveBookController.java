package com.kaufland.myLibrary.web;

import com.kaufland.myLibrary.domain.SaveBook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SaveBookController {


    @GetMapping("/saveBook")
    public String saveBook(Model model){
        /*model.addAllAttributes("saveBook" , new SaveBook());*/
        return "saveBook";
    }

    @PostMapping("/saveBook")
    public String saveBookSubmit(@ModelAttribute SaveBook saveBook){
        return "result";
    }
}
