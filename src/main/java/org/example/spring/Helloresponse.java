package org.example.spring;

public class Helloresponse {
    private String message;

    public Helloresponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
