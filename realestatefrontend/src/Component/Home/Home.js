import React, { useState } from 'react';
import './Home.css'; // Import your CSS file for styling

const Home = () => {
  const [location, setLocation] = useState('');
  const [propertyType, setPropertyType] = useState('');
  const [selectedCity, setSelectedCity] = useState(null); // Newly added state

  const cities = [
    { id: 1, name: 'New York' },
    { id: 2, name: 'Los Angeles' },
    { id: 3, name: 'Chicago' },
    // Add more cities here
  ];

  const propertiesByCity = {
    1: [
      { id: 101, type: 'house', title: 'Luxury Home in NYC', price: '$2,500,000' },
      { id: 102, type: 'apartment', title: 'Modern Apartment in Manhattan', price: '$1,200,000' },
      // Add more properties for New York
    ],
    2: [
      { id: 201, type: 'house', title: 'Hollywood Hills Mansion', price: '$5,800,000' },
      { id: 202, type: 'apartment', title: 'Downtown LA Loft', price: '$800,000' },
      // Add more properties for Los Angeles
    ],
    3: [
      { id: 301, type: 'house', title: 'Spacious House in Chicago Suburbs', price: '$1,600,000' },
      { id: 302, type: 'condo', title: 'Downtown Chicago Condo', price: '$950,000' },
      // Add more properties for Chicago
    ],
    // Add more cities and properties here
  };

  const handleSearch = () => {
    // Perform a search using the location and propertyType values
    console.log('Search Criteria:', location, propertyType);
  };

  const handleCitySelect = (cityId) => {
    setSelectedCity(cityId);
  };

  return (
    <div className="home">
      <div className="home-content">
        <h1>Welcome to RealEstate Management</h1>
        <p>Your trusted partner for finding your dream property.</p>
        <div className="search-form">
          <input
            type="text"
            placeholder="Enter city or state"
            value={location}
            onChange={(e) => setLocation(e.target.value)}
          />
          <select
            value={propertyType}
            onChange={(e) => setPropertyType(e.target.value)}
          >
            <option value="">Select property type</option>
            <option value="house">House</option>
            <option value="apartment">Apartment</option>
            <option value="condo">Condo</option>
          </select>
          <button onClick={handleSearch}>Search</button>
        </div>
        <div className="city-list">
          <h2>Select a City</h2>
          <ul>
            {cities.map(city => (
              <li key={city.id} onClick={() => handleCitySelect(city.id)}>
                {city.name}
              </li>
            ))}
          </ul>
        </div>
        {selectedCity && (
          <div className="property-list">
            <h2>Properties in {cities.find(city => city.id === selectedCity).name}</h2>
            <ul>
              {propertiesByCity[selectedCity].map(property => (
                <li key={property.id}>
                  <div>{property.title}</div>
                  <div>{property.price}</div>
                </li>
              ))}
            </ul>
          </div>
        )}
      </div>
    </div>
  );
};

export default Home;









// import React, { useState } from 'react';
// import './Home.css'; // Import your CSS file for styling

// const Home = () => {

//     const [location, setLocation] = useState('');
//     const [propertyType, setPropertyType] = useState('');
  
//     const handleSearch = () => {
//       // Perform a search using the location and propertyType values
//       console.log('Search Criteria:', location, propertyType);
//     };

//   return (
//     <div className="home">
//       <div className="home-content">
//         <h1>Welcome to RealEstate Management</h1>
//         <p>Your trusted partner for finding your dream property.</p>
//         <div className="search-form">
//           <input
//             type="text"
//             placeholder="Enter city or state"
//             value={location}
//             onChange={(e) => setLocation(e.target.value)}
//           />
//           <select
//             value={propertyType}
//             onChange={(e) => setPropertyType(e.target.value)}
//           >
//             <option value="">Select property type</option>
//             <option value="house">House</option>
//             <option value="apartment">Apartment</option>
//             <option value="condo">Condo</option>
//           </select>
//           <button onClick={handleSearch}>Search</button>
//         </div>
//       </div>
//     </div>
//   );
// };

// export default Home;
