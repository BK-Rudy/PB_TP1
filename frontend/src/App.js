import React from 'react';
import ProjectList from './components/ProjectList';
import TaskList from './components/TaskList';

function App() {
  return (
      <div className="App">
        <h1>Gestão de Tarefas e Projetos</h1>
        <ProjectList />
        <TaskList />
      </div>
  );
}

export default App;
