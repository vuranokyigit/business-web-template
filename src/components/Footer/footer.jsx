import React from "react";
import '../components.css';

const Footer = () => {

    return (
        <>
            <footer className="footer">
                <div className="container-fluid">
                    <div className="row">
                        <div className="col-md-6" >
                            <h2>Contact Us Today</h2>
                            <div className="col-md-12">
                                <h3>Main Office
                                    123 Anywhere St.
                                    Any City ST 12345</h3>
                            </div>
                            <div className="col-md-12">
                                <h3> Tel. (123) 456-7890
                                    Email: hello@reallygreatsite.com
                                    Social: @reallygreatsite</h3>
                            </div>
                            <button type="button" className="btn btn-secondary btn-lg">Get in Touch</button>
                            <section name="maps" id="maps" class="wow fadeIn">
                                <h3 class="my_heading text-center">LOCATION</h3>
                                <div className="mapouter">
                                    <div className="gmap_canvas">
                                        <iframe
                                            width="100%"
                                            height="150px"
                                            id="gmap_canvas"
                                            src="https://maps.google.com/maps?q=mirdag hukuk&t=k&z=15&ie=UTF8&iwloc=&output=embed"
                                        />

                                        <br />
                                        <style
                                            dangerouslySetInnerHTML={{
                                                __html:
                                                    ".mapouter{position:relative;text-align:right;height:100%;width:100%;}"
                                            }}
                                        />

                                        <style
                                            dangerouslySetInnerHTML={{
                                                __html:
                                                    ".gmap_canvas {overflow:hidden;background:none!important;height:100%;width:100%;}"
                                            }}
                                        />
                                    </div>
                                </div>

                            </section>
                        </div>
                        <div className="col-sm-6">
                            <img className="col-sm-6 rounded float-right" src="/footerimage.jpg" alt="" />
                        </div>
                    </div>

                    <p className="copyright" style={{ color: "blue" }}>&copy; {new Date().getFullYear()} All Right Reserved By Fikri Yigit Vuranok </p>
                </div>
            </footer>
        </>
    )
}
export default Footer;