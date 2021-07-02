package guru.springframework.spring5webapp.model.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositories extends CrudRepository<Author,Long> {
}
