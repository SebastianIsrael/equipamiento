package AM.Equipamiento.Equipa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipamientoService {
    @Autowired
    private EquipamientoRepository equipamietoRepository;

    public Equipamiento saveOrUpdateEquipamiento(Equipamiento equipamiento){
        return equipamietoRepository.save(equipamiento);
    }

    public Iterable<Equipamiento> listAll(){
        return equipamietoRepository.findAll();
    }
}