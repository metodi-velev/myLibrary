package com.kaufland.myLibrary.formatter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.Instant;
import java.util.Locale;

@Service
public class DateFormatter implements Formatter<Instant> {

    @Override
    public Instant parse(String text, Locale locale) throws ParseException {
        Instant year = Instant.parse(text);
        return year;
    }

    @Override
    public String print(Instant object, Locale locale) {
        return object.toString();
    }
}
