package AM.Equipamiento.Equipa;

import java.util.List;

import javax.validation.Valid;

//import AM.Equipamiento.Equipa.Equipamiento;
//import AM.Equipamiento.Equipa.EquipamientoService;

/*
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/equipamiento")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })

public class EquipamientoController {
    @Autowired
    @Qualifier("servicioequipamiento")
    EquipamientoService equipamientoservice;

    @GetMapping("/")
    public Equipamiento obtenetEquipamiento(@RequestParam(name = "id", required = true) long id) {
        return equipamientoservice.obtenerporId(id);
    }

    @PostMapping("/elpost")
    public boolean agregarEquipamiento(@RequestParam(name = "id", required = false) Equipamiento equipamiento){
        return equipamientoservice.crear(equipamiento);
    }

    @PutMapping("/")
    public boolean actualizarEquipamiento(@RequestBody @Valid Equipamiento equipamiento){
        return equipamientoservice.actualizar(equipamiento);
    }

    @DeleteMapping("/{id}")
    public boolean borrarEquipamiento(@PathVariable("id") long id){
        return equipamientoservice.borrar(id);
    }
    @GetMapping("/equipamiento")
    public List<Equipamiento> getAllEquipamiento(){
        return equipamientoservice.obtenerAll();
    }

/*
    @PostMapping("")
    public ResponseEntity<Equipamiento> addEquipamiento (@RequestBody Equipamiento equipamiento){
        Equipamiento equip = equipamientoservice.saveOrUpdateEquipamiento(equipamiento);
        return new ResponseEntity<Equipamiento>(equip, HttpStatus.CREATED);
    }

 */
    @GetMapping("")
    public Iterable<Equipamiento> getEquipamientos(){
        return equipamientoservice.obtenerAll(); 
        
    }

}