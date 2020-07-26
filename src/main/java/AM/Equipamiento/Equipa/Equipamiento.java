package AM.Equipamiento.Equipa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="EQUIPAMIENTO")
@Entity
public class Equipamiento {
    @Id
    @GenericGenerator(name="incrementequipamiento", strategy="increment")
    @GeneratedValue(generator="incrementequipamiento")
    //@GeneratedValue(strategy = GenerationType.AUTO)

    
    @Column(name="id")
    Long id;

    @Column(name="nombre")
    String nombre;
    
    @Column(name="descripcion")
    String descripcion;

/*EN CASO DE RELACIONAR UNO ES A MUCHOS. MODIFICAR VALORES.
    @OneToMany(mappedBy = "equipo")  
    private Set<Jugador> jugadores;
*/
    public Equipamiento(){

    }

    public Equipamiento(long id, String nombre, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre =  n;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String d){
        this.descripcion =  d;
    }
   
}