package com.kaufland.myLibrary.services;

import com.kaufland.myLibrary.dto.AuthorDTO;
import com.kaufland.myLibrary.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorDTO authorDTO;

    public AuthorDTO getAll(){
        return this.authorDTO;
    }
}
