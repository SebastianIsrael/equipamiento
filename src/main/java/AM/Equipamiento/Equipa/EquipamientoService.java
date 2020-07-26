package AM.Equipamiento.Equipa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicioequipamiento")
public class EquipamientoService {
    @Autowired
    @Qualifier("repositorioequipamiento")
    private EquipamientoRepository equipamietoRepository;

    public boolean actualizar(Equipamiento equipamiento){
        try{
            equipamietoRepository.save(equipamiento);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public boolean crear(Equipamiento equipamiento){
        try{
            equipamietoRepository.save(equipamiento);
            return true;
        }
        catch (Exception e){
            System.out.print(e);
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Equipamiento equipamiento = equipamietoRepository.findById(id);
            equipamietoRepository.delete(equipamiento);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public Equipamiento obtenerporId(long id){
        return equipamietoRepository.findById(id);
    }

    public List<Equipamiento> obtenerAll(){
        return equipamietoRepository.findAll();
    }


    /*
    public Equipamiento saveOrUpdateEquipamiento(Equipamiento equipamiento){
        return equipamietoRepository.save(equipamiento);
    }

    public Iterable<Equipamiento> listAll(){
        return equipamietoRepository.findAll();
    }

    */
    
}