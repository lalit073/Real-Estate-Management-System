import React, { useState } from 'react';
import './SignIn.css'; // Import your CSS file for styling

const SignIn = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleUsernameChange = (event) => {
    setUsername(event.target.value);
  };

  const handlePasswordChange = (event) => {
    setPassword(event.target.value);
  };

  const handleSignIn = (event) => {
    event.preventDefault();
    // Here you can add your authentication logic
    console.log('Sign in clicked:', username, password);
  };

  const handleForgotPassword = () => {
    // Here you can implement the "Forgot Password" functionality
    console.log('Forgot password clicked');
  };

  return (
    <div className="signin-container">
      <form className="signin-form" onSubmit={handleSignIn}>
        <h2>Sign In</h2>
        <div className="form-group">
          <label htmlFor="username">Username</label>
          <input
            type="text"
            id="username"
            value={username}
            onChange={handleUsernameChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={handlePasswordChange}
          />
        </div>
        <button type="submit">Sign In</button>
        <button type="button" onClick={handleForgotPassword}>
          Forgot Password
        </button>
      </form>
    </div>
  );
};

export default SignIn;
