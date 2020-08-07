import React from 'react';
import axios from 'axios';

export default class Equipamiento extends React.Component {
    state = {
        Equipamientos: []
    }


    componentDidMount() {
        axios.get(`url`)
            .then(res => {
                const Equipamientos = res.data;
                this.setState({ Equipamientos });
            })
    }
    render() {
        return (
            <ul>
                {this.state.Equipamientos.map(Equipamientos => <h1>{Equipamientos.id}</h1>)}
            </ul>
        )
    }
}