package be.technifutur.mongo.repository;

import be.technifutur.mongo.models.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface AuthorRepository extends MongoRepository<Author,String> {

}
