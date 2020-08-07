import {api} from '../helpers/api';
const basePath = '/api';


function getAll() {
    //return api.get(`http://localhost:8080/api/equipamiento`);
    /*esa no iba. Pónganse vios con las prácticas*/
    return api.get(`${basePath}/equipamiento`);
}

function show(equipamientoId) {
    return(
        api.get(`${basePath}/?id=${equipamientoId}`)
    );
}

function create(data) {
    return(
        api.post(`${basePath}/`,data)
    );
}

const equipamientosService = {getAll, show, create,};
export default equipamientosService;