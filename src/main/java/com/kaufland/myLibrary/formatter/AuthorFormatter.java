package com.kaufland.myLibrary.formatter;

import com.kaufland.myLibrary.dto.AuthorDTO;
import com.kaufland.myLibrary.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class AuthorFormatter implements Formatter<AuthorDTO> {

    @Autowired
    AuthorService authorService;

    @Override
    public AuthorDTO parse(String text, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(text);
        return this.authorService.getById(id);
    }

    @Override
    public String print(AuthorDTO object, Locale locale) {
        return (object != null ? String.valueOf(object.getId()) : "");
    }
}
