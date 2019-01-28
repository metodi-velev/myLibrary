package com.kaufland.myLibrary.web;

import org.hibernate.validator.internal.util.logging.formatter.TypeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private TypeFormatter authorFormatter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter((Formatter<?>) authorFormatter);
    }
}