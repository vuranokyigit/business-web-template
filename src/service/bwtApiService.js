
import axios from 'axios';

const REACT_URL = 'http://localhost:3333/bwt/api/v1'; // Örnek URL

function BwtApiServices() {
  // CREATE
  const bwtServiceCreate = (bwtDto) => {
    return axios.post(`${REACT_URL}/create`, bwtDto);
  };

  // LIST
  const bwtServiceList = () => {
    return axios.get(`${REACT_URL}/list`);
  };

  // FIND
  const bwtServiceFindById = (id) => {
    return axios.get(`${REACT_URL}/find/${id}`);
  };

  // DELETE
  const bwtServiceDeleteById = (id) => {
    return axios.delete(`${REACT_URL}/delete/${id}`);
  };

  // DELETE ALL
  const bwtServiceDeleteAll = () => {
    return axios.get(`${REACT_URL}/all/delete`);
  };

  return {
    bwtServiceCreate,
    bwtServiceList,
    bwtServiceFindById,
    bwtServiceDeleteById,
    bwtServiceDeleteAll,
  };
}

export default BwtApiServices();
