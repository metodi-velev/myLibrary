package com.kaufland.myLibrary.formatter;

import com.kaufland.myLibrary.util.DateUtility;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.Instant;
import java.util.Locale;

@Component

public class DateFormatter implements Formatter<Instant> {

    @Override
    public Instant parse(String text, Locale locale) throws ParseException {
        Instant year = DateUtility.toInstant(text);
        return year;
    }

    @Override
    public String print(Instant object, Locale locale) {
        return object.toString();
    }
}
