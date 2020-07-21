package AM.Equipamiento;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoservice;

    @PostMapping("")
    public ResponseEntity<Medico> addMedico (@RequestBody Medico medico){
        Medico med = medicoservice.saveOrUpdateMedico(medico);
        return new ResponseEntity<Medico>(med, HttpStatus.CREATED);
    }
 
    @GetMapping("")
    public Iterable<Medico> getMedicos(){
        return medicoservice.listAll();
    }

}