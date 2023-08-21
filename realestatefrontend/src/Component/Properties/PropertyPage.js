import React, { useState } from 'react';
import './PropertyPage.css'; // Import your CSS file

const PropertyPage = () => {
  const [properties, setProperties] = useState([]);

  // Simulated data, replace with actual property data from your API or database
  const mockProperties = [
    { id: 1, title: 'Beautiful House', location: 'City A, State B', type: 'House' },
    { id: 2, title: 'Luxury Apartment', location: 'City X, State Y', type: 'Apartment' },
    // ... add more properties
  ];

  // Simulated function to fetch property data (replace with actual API call)
  const fetchProperties = () => {
    // Set the fetched properties to the state
    setProperties(mockProperties);
  };

  return (
    <div className="property-page">
      <h2>Properties</h2>
      <button onClick={fetchProperties}>Fetch Properties</button>
      <div className="property-grid">
        {properties.map((property) => (
          <div key={property.id} className="property-card">
            <h3>{property.title}</h3>
            <p>{property.location}</p>
            <p>Type: {property.type}</p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default PropertyPage;
