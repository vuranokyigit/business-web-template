import React from "react";

const Footer = () => {

    return (
        <>
            <footer className="footer">
                <div className="row">
                    <div className="col-md-6" >
                        Contact Us Today
                        <div className="col-md-12">
                            Main Office
                            123 Anywhere St.
                            Any City ST 12345
                        </div>
                        <div className="col-md-12">
                            Tel. (123) 456-7890
                            Email: hello@reallygreatsite.com
                            Social: @reallygreatsite
                        </div>
                        <button type="button" className="btn btn-secondary btn-lg">Get in Touch</button>
                    </div>
                    <div className="col-sm-6">
                        <img className="col-sm-6 rounded float-right" src="/footerimage.jpg" alt="" />
                    </div>
                </div>

                <p className="copyright" style={{color:"blue"}}>&copy; {new Date().getFullYear()} All Right Reserved By Fikri Yigit Vuranok </p>
            </footer>
        </>
    )
}
export default Footer;