package be.technifutur.mongo.service;

import be.technifutur.mongo.models.entities.Book;
import be.technifutur.mongo.models.entities.Library;
import be.technifutur.mongo.repository.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private final LibraryRepository repository;
    private final BookRepository bookRepository;

    public LibraryService(LibraryRepository repository, BookRepository bookRepository) {
        this.repository = repository;
        this.bookRepository = bookRepository;
    }



    public void insert(Library library){
        library.setBooks(new ArrayList<>());
        repository.insert(library);
    }

    public List<Library> getAll(){
        return repository.findAll();
    }

    public Library getOne(String libraryId){
        return repository.findById(libraryId).orElseThrow();
    }

    /*
    * public String insert(Book book, String authorId){
        Book entity = this.bookRepository.save(book);
        Author author = this.authorRepository.findById(authorId).orElseThrow();
        author.getBooks().add(entity);
        this.authorRepository.save(author);
        return entity.getId();
    }

    public List<Author> getAll(){
        return this.authorRepository.findAll();
    }
    * */
}
