package AM.Equipamiento;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repossitory;

@Repository
public interface MedicoRepository extends CrudRepository<Medico, Long> {

}