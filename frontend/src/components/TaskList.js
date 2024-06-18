import React, { useState, useEffect } from 'react';
import taskService from '../services/taskService';

const TaskList = () => {
    const [tasks, setTasks] = useState([]);

    useEffect(() => {
        taskService.getTasks().then((res) => {
            setTasks(res.data);
        });
    }, []);

    return (
        <div>
            <h2>Tarefas</h2>
            <ul>
                {tasks.map((task) => (
                    <li key={task.id}>{task.description}</li>
                ))}
            </ul>
        </div>
    );
};

export default TaskList;