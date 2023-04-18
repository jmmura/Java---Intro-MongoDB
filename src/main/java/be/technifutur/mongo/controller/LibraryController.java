package be.technifutur.mongo.controller;


import be.technifutur.mongo.models.entities.Library;
import be.technifutur.mongo.service.BookService;
import be.technifutur.mongo.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;
    private final BookService bookService;

    public LibraryController(LibraryService libraryService, BookService bookService) {
        this.libraryService = libraryService;
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryService.getAll();
    }

    @PostMapping("/add/{idLibrary}/{idBook}")
    public void insertBook(@PathVariable("idLibrary") String idLibrary, @PathVariable("idBook") String idBook){
        libraryService.getOne(idLibrary).getBooks().add(bookService.getOne(idBook));
    }

    @PostMapping("/new")
    public void newLibrary(@RequestBody Library library){
        libraryService.insert(library);
    }
}
