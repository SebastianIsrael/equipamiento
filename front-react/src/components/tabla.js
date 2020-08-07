import React, {Component} from 'react';
import equipamientosService from '../services/equipamientos.service';


class Tabla extends Component{
    constructor(props){
        super(props);
        this.state = {
            count: 0,
            equipment: [],
        }
    }

    componentDidMount(){
        //axios.get(`http://localhost:8080/api/equipamiento`)
        equipamientosService.getAll()
            .then(res => {
                const equipment = res.data;
                this.setState({equipment})
        });
    }


    render(){
        return(
            <div className="panel panel-default p50 uth-panel">
                <table className="table table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Descripción</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.equipment.map(equipment =>
                                <tr key={equipment.id}>
                                    <td>{equipment.id}</td>
                                    <td>{equipment.nombre}</td>
                                    <td>{equipment.descripcion}</td>
                                </tr>)
                        }
                    </tbody>
                </table>
            </div>
        );
    }
}
export default Tabla;
/*

<div className="panel panel-default p50 uth-panel">
    <table className="table table-hover">
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Categoría</th>
            </tr>
        </thead>
        <tbody>
            {this.state.items.map(items =>
                <tr key={items.item_id}>
                    <td>{items.name}</td>
                    <td>{items.category} </td>
                </tr>
            )}
        </tbody>
    </table>
</div>


*/