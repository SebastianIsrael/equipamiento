import React, {Component} from 'react';
import equipamientosService from '../services/equipamientos.service';
import Tabla from '../components/tabla';
class Equipamiento extends Component {
    render(){
        return(
            <div>
                <h1>
                    Equipamiento page. 
                </h1>
                <h3>
                    Aquí va una componente tabla
                    <Tabla/>
                </h3>
                
            </div>
        )
    }
}

export default Equipamiento;