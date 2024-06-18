import React, { useState, useEffect } from 'react';
import projectService from '../services/projectService';

const ProjectList = () => {
    const [projects, setProjects] = useState([]);

    useEffect(() => {
        projectService.getProjects().then((res) => {
            setProjects(res.data);
        });
    }, []);

    return (
        <div>
            <h2>Projetos</h2>
            <ul>
                {projects.map((project) => (
                    <li key={project.id}>{project.name}</li>
                ))}
            </ul>
        </div>
    );
};

export default ProjectList;