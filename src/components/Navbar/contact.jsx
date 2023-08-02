import React from 'react';

const Contact = (props) => {
    const {contactClose} = props;
    return (
        <>
             {/* <div className="modal fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true"> */}
                    <div className="modal-dialog">
                        <div className="modal-content">
                            <div className='modal-header'>
                                <h4 className='modal-title'>CONTACT</h4>
                                <button type='button' className="btn-close" onClick={props.contactClose} aria-label='Close'></button>
                            </div>
                            <div className="modal-body">
                                <div className="mb-3">
                                    <label htmlFor="exampleFormControlInput1" className="form-label">Name & Surname</label>
                                    <input type="email" className="form-control" id="exampleFormControlInput1"  />
                                </div>
                                <div className="mb-3">
                                    <label htmlFor="exampleFormControlInput1" className="form-label">Email address</label>
                                    <input type="email" className="form-control" id="exampleFormControlInput1" placeholder="name@example.com" />
                                </div>
                                <div className="mb-3">
                                    <label htmlFor="exampleFormControlInput1" className="form-label">Topic</label>
                                    <input type="email" className="form-control" id="exampleFormControlInput1"  />
                                </div>
                                <div className="mb-3">
                                    <label htmlFor="exampleFormControlTextarea1" className="form-label">Explanation</label>
                                    <textarea className="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
                                </div>
                            </div>
                            <div className="modal-footer">
                                <button type='button' className="btn btn-secondary" onClick={props.contactClose}>Cancel</button>
                                <button type='button' className="btn btn-primary" data-bs-dismiss="modal">Send</button>
                            </div>
                        </div>
                    </div>
                {/* </div> */}
        </>
    )
};

export default Contact;