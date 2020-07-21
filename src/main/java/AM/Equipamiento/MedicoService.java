package AM.Equipamiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public Medico saveOrUpdateMedico(Medico medico){
        return medicoRepository.save(medico);
    }

    public Iterable<Medico> listAll(){
        return medicoRepository.findAll();
    }
}