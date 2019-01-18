package com.kaufland.myLibrary.services;

import com.kaufland.myLibrary.domain.Author;
import com.kaufland.myLibrary.dto.AuthorDTO;
import com.kaufland.myLibrary.repository.AuthorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;
    private ModelMapper modelMapper;

    public AuthorServiceImpl(AuthorRepository authorRepository,ModelMapper modelMapper) {
        this.authorRepository = authorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AuthorDTO> getAllAuthors() {
        List<Author> authors = this.authorRepository.findAll();
        return authors
                .stream()
                .map(author -> this.modelMapper.map(author, AuthorDTO.class))
                .collect(Collectors.toList());
    }
}
