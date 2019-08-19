package guru.springframework.spring5simpleapp.repositories;

import guru.springframework.spring5simpleapp.models.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
