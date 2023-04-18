package be.technifutur.mongo.service;

import be.technifutur.mongo.models.entities.Author;
import be.technifutur.mongo.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository){
        this.repository = repository;
    }
    public String insert (Author author){
        author.setBooks(new ArrayList<>());
        Author entity = repository.save(author);
        return entity.getId();
    }

    public List<Author> getAll() {
        return this.repository.findAll();
    }
}
