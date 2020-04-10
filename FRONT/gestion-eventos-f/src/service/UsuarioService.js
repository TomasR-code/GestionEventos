import axios from 'axios';

export class UsuarioService {
    baseUrl = "http://localhost:8081/api/usuario/";
    getAll() {
        return axios.get('this.baseUrl + "all').then(res => res.data.data)
    }
}