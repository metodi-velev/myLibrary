package com.kaufland.myLibrary.services;

import com.kaufland.myLibrary.domain.Author;
import com.kaufland.myLibrary.dto.AuthorDTO;
import com.kaufland.myLibrary.repository.AuthorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;
    private ModelMapper modelMapper;

    public AuthorServiceImpl(AuthorRepository authorRepository,ModelMapper modelMapper) {
        this.authorRepository = authorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDTO getAllAuthors() {
        List<Author> authors = this.authorRepository.findAll();
        AuthorDTO authorDTO = this.modelMapper.map(authors, AuthorDTO.class);
        return authorDTO;
    }
}
