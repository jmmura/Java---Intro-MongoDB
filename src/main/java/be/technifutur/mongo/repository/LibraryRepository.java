package be.technifutur.mongo.repository;

import be.technifutur.mongo.models.entities.Library;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends MongoRepository<Library,String> {
}
