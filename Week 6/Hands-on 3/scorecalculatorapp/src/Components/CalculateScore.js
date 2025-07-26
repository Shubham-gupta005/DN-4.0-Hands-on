import React from 'react';
import '../Stylesheets/mystyle.css'; // Import the stylesheet

function CalculateScore(props) {
  const { Name, School, Total, Goal } = props;
  const averageScore = Total / Goal;

  return (
    <div className="score-container">
      <h2>Student Details</h2>
      <p>Name: {Name}</p>
      <p>School: {School}</p>
      <p>Total Score: {Total}</p>
      <p>Goal Score: {Goal}</p>
      <h3>Average Score: {averageScore.toFixed(2)}</h3>
    </div>
  );
}

export default CalculateScore;