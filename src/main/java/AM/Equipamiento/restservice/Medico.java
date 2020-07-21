package AM.Equipamiento;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico {
    @Id
    @GeneratedValue(startegy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String cargo;
    private String estado;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return ID;
    }
    public String getName(){
        return nombre;
    }
    public String getState(){
        return estado;
    }
    public String getCharge(){
        return cargo;
    }

}