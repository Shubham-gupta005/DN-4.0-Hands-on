import './App.css';

function App() {
  const office = {
    name: 'DBS',
    rent: 50000,
    address: 'Chennai',
    image: 'https://images.unsplash.com/photo-1549488344-934c2642a84c'
  };

  const offices = [
    { name: 'DBS', rent: 50000, address: 'Chennai' },
    { name: 'TCS', rent: 70000, address: 'Bangalore' },
    { name: 'Infosys', rent: 65000, address: 'Pune' }
  ];

  return (
    <div className="App">
      <h1>Office Space, at Affordable Range</h1>
      <img src={office.image} alt="Office Space" style={{ width: '200px', height: '200px' }} />
      <div>
        <h2>Name: {office.name}</h2>
        <h3 style={{ color: office.rent < 60000 ? 'red' : 'green' }}>Rent: Rs. {office.rent}</h3>
        <h3>Address: {office.address}</h3>
      </div>

      <hr />

      <h1>Multiple Offices</h1>
      {offices.map((o, index) => (
        <div key={index}>
          <h2>Name: {o.name}</h2>
          <h3 style={{ color: o.rent < 60000 ? 'red' : 'green' }}>Rent: Rs. {o.rent}</h3>
          <h3>Address: {o.address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;