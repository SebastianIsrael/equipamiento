package AM.Equipamiento.Equipa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/equipamientos")

public class EquipamientoController {
    @Autowired
    private EquipamientoService equipamientoservice;

    @PostMapping("/elrutapost")
    public ResponseEntity<Equipamiento> addEquipamiento (@RequestBody Equipamiento equipamiento){
        Equipamiento equip = equipamientoservice.saveOrUpdateEquipamiento(equipamiento);
        return new ResponseEntity<Equipamiento>(equip, HttpStatus.CREATED);
    }

 
    @GetMapping("")
    public Iterable<Equipamiento> getEquipamientos(){
        return equipamientoservice.listAll(); 
        
    }
}