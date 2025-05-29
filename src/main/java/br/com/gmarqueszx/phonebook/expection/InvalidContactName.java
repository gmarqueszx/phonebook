package br.com.gmarqueszx.phonebook.expection;

public class InvalidContactName extends RuntimeException {
    public InvalidContactName(String message) {
        super(message);
    }
}
