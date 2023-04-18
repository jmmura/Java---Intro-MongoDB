package be.technifutur.mongo.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.*;

@Document
@Getter @Setter
public class Author {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    @DBRef      //liste de références à des Book pour ne pas surcharger la DB
    private List<Book> books;
}
