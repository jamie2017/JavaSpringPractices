package hello;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by JMYE on 6/20/17.
 */

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface JobRepository extends CrudRepository<Jobs, Long> {

}
