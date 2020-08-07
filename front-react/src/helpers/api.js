import axios from 'axios';

const endpoints = {
    develoment: 'http://localhost:8080'
};

export const api = axios.create({
    baseURL: endpoints['develoment'],
    timeout: 20000,
    headers: {Authorization: 'Bearer ...'},
});
