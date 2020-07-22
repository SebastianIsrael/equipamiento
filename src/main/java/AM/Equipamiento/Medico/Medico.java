package AM.Equipamiento.Medico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String cargo;
    private String estado1;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.nombre;
    }
    public String getState(){
        return this.estado1;
    }
    public String getCharge(){
        return this.cargo;
    }

}