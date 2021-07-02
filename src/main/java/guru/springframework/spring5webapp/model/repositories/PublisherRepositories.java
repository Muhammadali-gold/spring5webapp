package guru.springframework.spring5webapp.model.repositories;

import guru.springframework.spring5webapp.model.Publishers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepositories extends CrudRepository<Publishers,Long> {
}
