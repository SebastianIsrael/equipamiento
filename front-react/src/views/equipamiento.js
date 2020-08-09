import React, {Component} from 'react';
import Tabla from '../components/tabla';
import Add_equipment from '../components/add_equipment'
import './equipamiento.css';
class Equipamiento extends Component {
    render(){
        return(
            <div className="equipamiento"> 
                <body className="equipamiento-body">
                    <Tabla/> 
                    <Add_equipment/>

                </body>             
            </div>
        )
    }
}

export default Equipamiento;