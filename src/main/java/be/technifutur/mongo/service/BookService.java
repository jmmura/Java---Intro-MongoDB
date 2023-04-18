package be.technifutur.mongo.service;

import be.technifutur.mongo.models.entities.Author;
import be.technifutur.mongo.models.entities.Book;
import be.technifutur.mongo.repository.AuthorRepository;
import be.technifutur.mongo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository=authorRepository;
    }
    public String insert(Book book, String authorId){
        Book entity = this.bookRepository.save(book);
        Author author = this.authorRepository.findById(authorId).orElseThrow();
        author.getBooks().add(entity);
        this.authorRepository.save(author);
        return entity.getId();
    }

    public List<Author> getAll(){
        return this.authorRepository.findAll();
    }

    public Book getOne(String id){return bookRepository.findById(id).orElseThrow();}
}
