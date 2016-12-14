package org.jonathanosterman.dao.exception;

public class CustomJPAException
    extends
    Exception {

    private static final long serialVersionUID = -7069756271766967740L;

    public CustomJPAException(
        final String message,
        final Throwable cause) {
        super(message, cause);
    }

    public CustomJPAException(
        final String message) {
        super(message);
    }

    public CustomJPAException(
        final Throwable cause) {
        super(cause);
    }

}
