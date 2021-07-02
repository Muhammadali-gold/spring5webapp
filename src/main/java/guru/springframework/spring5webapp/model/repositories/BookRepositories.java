package guru.springframework.spring5webapp.model.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositories extends CrudRepository<Book,Long> {
}
