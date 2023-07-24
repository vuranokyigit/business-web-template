import React from "react";

const Navbar = () => {


    return (
        <>
        <div className="collapse" id="navbarToggleExternalContent">
          <div className="bg-dark p-4">
            <h5 className="text-white h4">Collapsed content</h5>
            <span className="text-muted">
              Toggleable via the navbar brand.
            </span>
          </div>
        </div>
        <nav className="navbar navbar-dark bg-dark">
          <div className="container-fluid">
            <div className="togglePage">
              <div className="home">
        
              </div>
              <div className="list" >
               
              </div>
            </div>
          </div>
        </nav>
      </>
    )
}
export default Navbar