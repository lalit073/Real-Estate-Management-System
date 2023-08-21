import React, { useState } from 'react';
import './PostProperty.css'; // Import your CSS file

const PostProperty = () => {
  const [propertyType, setPropertyType] = useState('');
  const [bhkDetails, setBhkDetails] = useState('');
  const [address, setAddress] = useState('');
  const [city, setCity] = useState('');
  const [state, setState] = useState('');
  const [price, setPrice] = useState('');
  const [area, setArea] = useState('');
  const [photos, setPhotos] = useState([]);
  const [successMessage, setSuccessMessage] = useState('');

  const handlePhotoUpload = (e) => {
    const selectedPhotos = Array.from(e.target.files);
    setPhotos(selectedPhotos);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Perform property submission logic here
    console.log('Property details submitted:', {
      propertyType,
      bhkDetails,
      address,
      city,
      state,
      price,
      area,
      photos
    });
    setSuccessMessage('Property details submitted successfully!');
  };

  return (
    <div className="post-property">
      <h2>Post a Property</h2>
      {successMessage && <p className="success-message">{successMessage}</p>}
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label>Property Type:</label>
          <input
            type="text"
            value={propertyType}
            onChange={(e) => setPropertyType(e.target.value)}
            required
          />
        </div>
        {/* Add more form fields for other property details */}
        <button type="submit">Post Property</button>
      </form>
    </div>
  );
};

export default PostProperty;
