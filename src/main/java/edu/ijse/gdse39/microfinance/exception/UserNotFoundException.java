package edu.ijse.gdse39.microfinance.exception;

/**
 * @author Pahansith on 3/25/2018
 * @project MicroFinance-master
 */

public class UserNotFoundException extends Exception {
    Long id;
    String message;

    public UserNotFoundException(Long id, String message) {
        super(message);
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
