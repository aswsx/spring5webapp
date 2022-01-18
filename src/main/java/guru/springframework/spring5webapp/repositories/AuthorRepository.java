package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 17/01/2022 - 21:34
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
