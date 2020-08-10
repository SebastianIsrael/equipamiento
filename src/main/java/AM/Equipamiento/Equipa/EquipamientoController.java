package AM.Equipamiento.Equipa;

import java.util.List;

import javax.validation.Valid;

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
@RequestMapping("/apiEquipamiento")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })

public class EquipamientoController {
    @Autowired
    @Qualifier("servicioequipamiento")
    EquipamientoService equipamientoservice;

    @GetMapping("/")
    public Equipamiento obtenerEquipamiento(@RequestParam(name="id", required=true) long id) {
        return equipamientoservice.obtenerporId(id);
    }
    @GetMapping("/equipment")
    public List<Equipamiento> getAllEquipamiento(){
        return equipamientoservice.obtenerAll();
    }

/*
    @PostMapping("/equipment")
    public ResponseEntity<Equipamiento> addEquipamiento(@RequestBody Equipamiento equipment){
        Equipamiento equip = equipamientoservice.crear(equipment);
        return new ResponseEntity<Equipamiento>(equip, HttpStatus.CREATED);
    }*/

    @PostMapping("/equipment")
    public boolean agregarEquipamiento(@RequestBody @Valid Equipamiento equipo){
        return equipamientoservice.crear(equipo);
    }


    @PutMapping("/")
    public boolean actualizarEquipamiento(@RequestBody @Valid Equipamiento equipamiento){
        return equipamientoservice.actualizar(equipamiento);
    }

    @DeleteMapping("/{id}")
    public boolean borrarEquipamiento(@PathVariable("id") long id){
        return equipamientoservice.borrar(id);
    }

}