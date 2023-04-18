package be.technifutur.mongo.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document
@Getter
@Setter
public class Library {
    @Id
    private String id;
    private String name;
    private List<Book> books;

}
