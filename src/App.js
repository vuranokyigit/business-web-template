import React from 'react';
import './App.css';
 import Navbar from "./components/Navbar/navbar";
 import Main from "./components/Main/main";
 import Footer from "./components/Footer/footer";

const App =()=> {
  return (
    <>
      <div className='App'>
        <Navbar />
        <Main />
      </div>
    </>
  );
}

export default App;
