import React from "react";
import { useState } from "react";
import '../components.css';
import Footer from "../Footer/footer";
import Contact from "../Navbar/contact";



const Main = () => {
    const [openContactModal, setOpenContactModal] = useState(false);

    const contactClick = () => {
        setOpenContactModal(!openContactModal);
        console.log("clicked");

    }
    const closeContactModal = () => {
        setOpenContactModal(null);
    }

    return (
        <>
            {openContactModal && (<Contact contactClose={closeContactModal}/>
            )}
            <div className="main">
                <div className="container-fluid">
                    <div className="background-image">
                        <div className="firstPage" id="firstPage">
                            <h2>
                                Your business needs expert legal advice.
                            </h2>
                            <h4>
                                We're a Venston Bay-based law firm that's always available to answer your questions, review contracts, and help you with anything on your mind.
                            </h4>
                            <button type="button" className="btn btn-secondary"
                                onClick={contactClick}
                                
                            >Contact Us</button>
                        </div>
                    </div>
                </div>
               

                <div className="container-fluid">
                    <div className="secondPage" id="secondPage">
                        <h2 className="col-lg-12">ATTORNEYS</h2>
                        <div className="card-group">
                            <div className="card">
                                <img className="card-img-top" src="/zeus16.jpg" alt="" />
                                <div className="card-body">
                                    <h5 className="card-title">Card title</h5>
                                    <p className="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                </div>
                            </div>
                            <div className="card">
                                <img className="card-img-top" src="/zeus16.jpg" alt="" />
                                <div className="card-body">
                                    <h5 className="card-title">Card title</h5>
                                    <p className="card-text">This card has supporting text below as a natural lead-in to additional content.</p>

                                </div>
                            </div>
                            <div className="card">
                                <img className="card-img-top" src="/zeus16.jpg" alt="" />
                                <div className="card-body">
                                    <h5 className="card-title">Card title</h5>
                                    <p className="card-text">This card has supporting text below as a natural lead-in to additional content.</p>

                                </div>
                            </div>
                            <div className="card">
                                <img className="card-img-top" src="/zeus16.jpg" alt="" />
                                <div className="card-body">
                                    <h5 className="card-title">Card title</h5>
                                    <p className="card-text">This card has supporting text below as a natural lead-in to additional content.</p>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div className="container-fluid" >
                    <div className="thirdPage" id="thirdPage">
                        <h2>BLOGS</h2>
                        <h3 className="col-md-4">Get the legal knowledge and advice your business deserves.</h3>
                        <div className="row" id="">
                            <div className="col-md-4" id="cardId">
                                <div className="card" >
                                    <div className="card-body">
                                        <h5 className="card-title">Card title</h5>
                                        <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <button className="btn btn-secondary">Go somewhere</button>
                                    </div>
                                </div>
                            </div>
                            <div className="col-md-4" id="cardId">
                                <div className="card" >
                                    <div className="card-body">
                                        <h5 className="card-title">Card title</h5>
                                        <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <button className="btn btn-secondary">Go somewhere</button>
                                    </div>
                                </div>
                            </div>
                            <div className="col-md-4" id="cardId">
                                <div className="card" >
                                    <div className="card-body">
                                        <h5 className="card-title">Card title</h5>
                                        <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <button className="btn btn-secondary">Go somewhere</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div className="container-fluid">
                    <div className="fourthPage" id="fourthPage">
                        <h2>WORKS</h2>
                        <h3 className="col-md-4">Practice Area</h3>
                        <div className="row" id="">
                            <div className="col-md-3">
                                <img className="col-md-10 rounded float-left " src="/apollon.jpg" alt="" />
                            </div>
                            <div className="col-md-6">
                                Lorem, ipsum dolor sit amet consectetur adipisicing elit. Facere sed rerum odit modi iure velit alias cum corporis architecto quia! Provident dignissimos accusamus quibusdam labore amet saepe eum perspiciatis praesentium.
                                Similique autem vitae distinctio dolorem. Commodi, mollitia, corporis necessitatibus ipsum debitis omnis pariatur odit beatae obcaecati quae, error exercitationem earum possimus sit deserunt laborum iusto perspiciatis! Repudiandae, veritatis! At, reiciendis!
                                Incidunt enim consequuntur dolorum magni tenetur voluptate aperiam. Ipsam blanditiis a beatae! Est consequatur eaque doloremque facere, eveniet, aspernatur facilis ipsa nisi, ad fugiat officiis reprehenderit fugit exercitationem sed assumenda.
                                Inventore, culpa illum! Amet, nulla minus rerum suscipit quaerat quis maxime! Pariatur facere dolorem et temporibus qui perspiciatis nisi quis mollitia, necessitatibus aspernatur libero voluptas cum voluptatem, ab asperiores tempora!
                                Ipsum accusantium porro, mollitia quidem repellendus in soluta ipsam provident nemo veritatis. Nam illum sint explicabo assumenda temporibus dolores, numquam eius officia consequuntur, doloribus commodi autem blanditiis. Libero, eveniet magni.
                            </div>
                        </div>
                    </div>
                </div>
                <div className="container-fluid">
                    <div className="fifthPage" id="fifthPage">
                        <div className="row" id="">
                            <h3 className="col-md-4">Client Testimonials</h3>
                            <h6 className="col-sm-8">See why we're the best
                                in Venston Bay</h6>
                        </div>
                        <div className="row" id="">
                            <div className="col-md-4">
                                <div className="card" >
                                    <div className="card-body">
                                        <h5 className="card-title">Card title</h5>
                                        <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <button
                                            className="btn btn-secondary"
                                        >Go somewhere</button>
                                    </div>
                                </div>
                            </div>
                            <div className="col-md-4">
                                <div className="card" >
                                    <div className="card-body">
                                        <h5 className="card-title">Card title</h5>
                                        <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <button className="btn btn-secondary">Go somewhere</button>
                                    </div>
                                </div>
                            </div>
                            <div className="col-md-4">
                                <div className="card" >
                                    <div className="card-body">
                                        <h5 className="card-title">Card title</h5>
                                        <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                        <button className="btn btn-secondary">Go somewhere</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <Footer footerContactClick={contactClick} footerCloseContactModal={closeContactModal} />
        </>
    )
}
export default Main;