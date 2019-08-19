package guru.springframework.spring5simpleapp.repositories;

import guru.springframework.spring5simpleapp.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author, Long> {
}
