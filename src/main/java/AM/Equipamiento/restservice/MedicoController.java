package AM.Equipamiento;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation;

@RestController
@GetMapping("/medico") 

public class MedicoController {

    @Autowired
    private MedicoService medicoservice;

    @PostMapping("")
    public ResponseEntity<medico> addMedico (@RequestBody Medico medico){
        Medico med = medicoService.saveOrUpdateMedico(medico);
        return new ResponseEntiry<medico>(med, HttpStatus.CREATED);
    }

    @GetMapping("")
    public Iterable<medico> getMedicos(){
        return medicosService.listAll();
    }

}