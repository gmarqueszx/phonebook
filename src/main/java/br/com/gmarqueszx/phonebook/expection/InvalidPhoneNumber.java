package br.com.gmarqueszx.phonebook.expection;

public class InvalidPhoneNumber extends RuntimeException {
    public InvalidPhoneNumber(String message) {
        super(message);
    }
}
