package be.technifutur.mongo.controller;

import be.technifutur.mongo.models.entities.Book;
import be.technifutur.mongo.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping("/{idAuthor}")
    public String insert(@RequestBody Book book, @PathVariable("idAuthor") String idAuthor){
        return this.service.insert(book,idAuthor);
    }


}
