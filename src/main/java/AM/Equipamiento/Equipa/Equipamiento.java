package AM.Equipamiento.Equipa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String n){
        this.nombre =  n;
    }
    public void setDescription(String d){
        this.descripcion =  d;
    }
    public String getName(){
        return this.nombre;
    }

    public String getDescription(){
        return this.descripcion;
    }

}