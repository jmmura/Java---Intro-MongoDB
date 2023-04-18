package be.technifutur.mongo.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document
@Getter @Setter
public class Book {

    @Id
    private String id;
    private String title;
    private String resume;
    private List<String> categories;
}
