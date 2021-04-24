package com.cg.ovms.exception;

public class IdNotFoundException extends RuntimeException{

    public IdNotFoundException()
    {

    }

    public IdNotFoundException(String msg)
    {
        super(msg);
    }
}
