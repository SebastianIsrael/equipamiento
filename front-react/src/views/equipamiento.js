import React, {Component} from 'react';
import Tabla from '../components/tabla';
import './equipamiento.css';
class Equipamiento extends Component {
    render(){
        return(
            <div className="equip-body">
                <h1>
                    Equipamiento page. 
                </h1>
                <body>
                    <Tabla/> 
                </body>
                               
            </div>
        )
    }
}

export default Equipamiento;