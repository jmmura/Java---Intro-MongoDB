package be.technifutur.mongo.controller;

import be.technifutur.mongo.models.entities.Author;
import be.technifutur.mongo.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @PostMapping
    public String insert(@RequestBody Author author){
        return this.service.insert(author);
    }
}
