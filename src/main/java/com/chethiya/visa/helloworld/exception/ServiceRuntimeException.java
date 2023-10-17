package com.chethiya.visa.helloworld.exception;

/**
 * @author Chethiya
 *
 * This is the runtime exception model for this microsewrvice
 */
public class ServiceRuntimeException extends RuntimeException {


    public ServiceRuntimeException() {
        super();
    }

    public ServiceRuntimeException(String message) {
        super(message);
    }
    public ServiceRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

}
