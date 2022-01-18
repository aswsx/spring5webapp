package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 17/01/2022 - 22:44
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
