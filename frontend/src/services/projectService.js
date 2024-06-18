import axios from 'axios';

const API_URL = 'http://localhost:8080/api/projects';

class ProjectService {
    getProjects() {
        return axios.get(API_URL);
    }
}

export default new ProjectService();