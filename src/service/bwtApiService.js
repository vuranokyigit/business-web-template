// axios
import axios from "axios"

// PERSISTE URL
const REACT_URL = "/bwt/api/v1"

// CLASS
class BwtApiServices {
    // CREATE
    // localhost:3333/todo/api/v1/create
    bwtServiceCreate(bwtDto) {
        return axios.post(REACT_URL + "/create", bwtDto);
    }
    // LIST
    // localhost:3333/todo/api/v1/list
    bwtServiceList() {
        return axios.get(`${REACT_URL}/list`);
    }
    // FIND
    // localhost:3333/todo/api/v1/find/id(0,1,2)
    bwtServiceFindById(id) {
        return axios.get(`${REACT_URL}/find/${id}`);
    }
    // DELETE
    // localhost:3333/todo/api/v1/delete/id(0,1,2)
    bwtServiceDeleteById(id) {
        return axios.delete(`${REACT_URL}/delete/${id}`);
    }
    // DELETE ALL
    // localhost:3333/todo/api/v1/all/delete
    bwtServiceDeleteAll() {
        return axios.get(`${REACT_URL}/all/delete`);
    }
}
export default new BwtApiServices();