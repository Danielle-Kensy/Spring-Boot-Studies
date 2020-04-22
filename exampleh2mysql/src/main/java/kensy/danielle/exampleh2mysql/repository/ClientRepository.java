package kensy.danielle.exampleh2mysql.repository;

import kensy.danielle.exampleh2mysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}
