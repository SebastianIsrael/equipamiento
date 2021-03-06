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
    private String estado;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getEstado(){
        return this.estado;
    }
    public String getCargo(){
        return this.cargo;
    }

}