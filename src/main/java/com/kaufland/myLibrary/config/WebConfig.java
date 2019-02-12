package com.kaufland.myLibrary.config;

import com.kaufland.myLibrary.dto.AuthorDTO;
import com.kaufland.myLibrary.formatter.AuthorFormatter;
import com.kaufland.myLibrary.formatter.DateFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private AuthorFormatter authorFormatter;

    @Autowired
    private DateFormatter dateFormatter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter((Formatter<?>) authorFormatter);
    }

    public void addDateFormatter(FormatterRegistry registry) {
        registry.addFormatter((Formatter<?>) dateFormatter);
    }
}