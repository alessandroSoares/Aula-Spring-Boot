package guru.springframework.spring5simpleapp.repositories;

import guru.springframework.spring5simpleapp.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
