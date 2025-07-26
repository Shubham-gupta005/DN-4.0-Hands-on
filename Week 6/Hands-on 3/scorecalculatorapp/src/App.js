import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <h1>Student Score Calculator</h1>
      <CalculateScore Name="Alice" School="High School A" Total={85} Goal={100} />
      <CalculateScore Name="Bob" School="High School B" Total={92} Goal={100} />
    </div>
  );
}

export default App;