import React from "react";

const Navbar = () => {


    return (
        <>
            
            <nav
                id="navbar_second"
                className="navbar navbar-expand-md navbar-dark  "
            >
                <div className="container">
                    
                        <button
                            className="navbar-toggler d-lg-none"
                            type="button"
                            data-bs-toggle="collapse"
                            data-bs-target="#collapsibleNavId"
                            aria-controls="collapsibleNavId"
                            aria-expanded="false"
                            aria-label="Toggle navigation"
                        >
                            <span className="navbar-toggler-icon" />
                        </button>
                        <div className="collapse navbar-collapse" id="collapsibleNavId">
                            <ul className="navbar-nav me-auto mt-2 mt-lg-0">
                                <li className="nav-item">
                                    <a className="nav-link" href="#first" aria-current="page">
                                        HOME
                                        {/* <span className="visually-hidden">(current)</span> */}
                                    </a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#secondPage" aria-current="page">
                                        ATTORNEYS
                                    </a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#thirdPage">
                                        BLOGS
                                    </a>
                                </li>
                                <li className="nav-item dropdown">
                                    <a
                                        className="nav-link dropdown-toggle"
                                        href="#fourthPage"
                                        id="dropdownId"
                                        data-bs-toggle="dropdown"
                                        aria-haspopup="true"
                                        aria-expanded="false"
                                    >
                                        WORKS
                                    </a>
                                    <div className="dropdown-menu" aria-labelledby="dropdownId">
                                        <a className="dropdown-item" href="#fourthPage">
                                            Own Lawsuit
                                        </a>
                                        <a className="dropdown-item" href="#fourthPage">
                                            Contributed Lawsuit
                                        </a>
                                    </div>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#fifthPage">
                                      CLIENT TESTIMONIALS
                                    </a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#footer">
                                        CONTACT
                                    </a>
                                </li>
                                
                            </ul>
                            <form className="d-flex my-2 my-lg-0" id="search-id-tags">
                                <input
                                    className="form-control me-sm-2"
                                    type="text"
                                    id="tags"
                                    placeholder="SEARCH"
                                    autoComplete=""
                                />
                                <button className="btn btn-outline my-2 my-sm-0" type="submit">
                                    <i className="fa-brands fa-searchengin text-white" />
                                </button>
                                <button className="btn  btn-sm dark_mode">
                                <i
                                    style={{ color: "rgb(214, 214, 210)" }}
                                    className="fa-solid fa-circle-half-stroke"
                                />
                            </button>
                            </form>
                        </div>
                    
                </div>
            </nav>

        </>

    )
}

export default Navbar;