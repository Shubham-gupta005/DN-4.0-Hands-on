import React from 'react';
import './App.css'; 
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: 'INTADMF10',
      type: '.NET FSD',
      startedOn: '22-Feb-2022',
      status: 'Scheduled',
      coach: 'Aathma',
      trainer: 'Jojo Jose',
    },
    {
      name: 'ADM21JF014',
      type: 'Java FSD',
      startedOn: '10-Sep-2021',
      status: 'Ongoing',
      coach: 'Apoorv',
      trainer: 'Elisa Smith',
    },
    {
      name: 'CDBJF21025',
      type: 'Java FSD',
      startedOn: '24-Dec-2021',
      status: 'Ongoing',
      coach: 'Aathma',
      trainer: 'John Doe',
    },
  ];

  return (
    <div className="App">
      <h1>Cohorts Details</h1>
      <div style={{ display: 'flex', flexWrap: 'wrap', justifyContent: 'center' }}>
        {cohorts.map((cohort, index) => (
          <CohortDetails key={index} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;