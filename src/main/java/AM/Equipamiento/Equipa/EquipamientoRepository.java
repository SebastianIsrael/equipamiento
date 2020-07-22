package AM.Equipamiento.Equipa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamientoRepository extends CrudRepository<Equipamiento, Long> {

}