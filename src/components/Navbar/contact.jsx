import React, { useState } from 'react';
import bwtApiService from '../../service/bwtApiService';

const Contact = (props) => {
    const [name, setName] = useState("");
    const [mail, setMail] = useState("");
    const [topic, setTopic] = useState("");
    const [explanation, setExplanation] = useState("");
    const [validationErrors, setValidationErrors] = useState({});
    const [spinnerData, setSpinnerData] = useState(false);
    const [multipleRequest, setMultipleRequest] = useState(false);
    const { contactClose } = props;

    const onChangeInputValue = (event) => {
        const { name, value } = event.target;
        const backendHandleError = { ...validationErrors };
        backendHandleError[name] = undefined;
        setValidationErrors(backendHandleError);
        if (name === "name") {
            setName(value);
        } else if (name === "mail") {
            setMail(value);
        } else if (name === "topic") {
            setTopic(value);
        } else if (name === "explanation") {
            setExplanation(value);
        }
    }
    const bwtAdd = async (event) => {
        event.preventDefault();
        const bwtDto = {
            name,
            mail,
            topic,
            explanation,
        };
        try {
            setSpinnerData(true);
            setMultipleRequest(false);
            const response = await bwtApiService.bwtServiceCreate(bwtDto);
            if (response.status === 200) {
                setMultipleRequest(true);
                props.history.push("/bwt/list");
            }
        } catch (error) {
            console.error(error);
            setSpinnerData(true);
            const backendError = error.response && error.response.data.validationErrors;
            if (backendError) {
                setValidationErrors(backendError);
                console.log(backendError);
            }
            setSpinnerData(false);
            setMultipleRequest(false);
        }
    }
    return (
        <>

            <div className="modal-dialog">
                <div className="modal-content">
                    <div className='modal-header'>
                        <h4 className='modal-title'>CONTACT</h4>
                        <button type='button' className="btn-close" onClick={contactClose} aria-label='Close'></button>
                    </div>
                    <div className="modal-body">
                        <div className="mb-3">
                            <label htmlFor="exampleFormControlInput1" className="form-label">Name & Surname</label>
                            <input type="text" className="form-control" id="exampleFormControlInput1" name='name' value={name} onChange={onChangeInputValue} />
                            {validationErrors.name && (
                                <span className="error">{validationErrors.name}</span>
                            )}
                        </div>
                        <div className="mb-3">
                            <label htmlFor="exampleFormControlInput1" className="form-label">Email address</label>
                            <input type="email" className="form-control" id="exampleFormControlInput2" placeholder="name@example.com" name='mail' value={mail} onChange={onChangeInputValue} />
                            {validationErrors.mail && (
                                <span className="error">{validationErrors.mail}</span>
                            )}
                        </div>
                        <div className="mb-3">
                            <label htmlFor="exampleFormControlInput1" className="form-label">Topic</label>
                            <input
                                type="text"
                                className="form-control"
                                id="exampleFormControlInput3"
                                name='topic' value={topic}
                                onChange={onChangeInputValue} />
                            {validationErrors.topic && (
                                <span className="error">{validationErrors.topic}</span>
                            )}
                        </div>
                        <div className="mb-3">
                            <label htmlFor="exampleFormControlTextarea1" className="form-label">Explanation</label>
                            <textarea className="form-control" id="exampleFormControlTextarea1" rows="4" name='explanation' value={explanation} onChange={onChangeInputValue}></textarea>
                            {validationErrors.explanation && (
                                <span className="error">{validationErrors.explanation}</span>
                            )}
                        </div>
                    </div>
                    <div className="modal-footer">
                        <button type='button' className="btn btn-secondary" onClick={contactClose}>Cancel</button>
                        <button
                            type='button'
                            className="btn btn-primary"
                            onClick={bwtAdd}
                            disabled={spinnerData}
                        >
                            Send
                            {spinnerData && (
                                <span className="spinner-border spinner-border-sm" role="status"></span>
                            )}</button>
                    </div>
                </div>
            </div>


        </>
    )
};

export default Contact;