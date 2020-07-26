package AM.Equipamiento.Equipa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioequipamiento")
public interface EquipamientoRepository extends JpaRepository<Equipamiento, Long> {
    public abstract Equipamiento findById(long id);
    public abstract List<Equipamiento> findAll();

}