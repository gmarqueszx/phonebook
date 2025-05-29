package br.com.gmarqueszx.phonebook.controller;

public class InvalidContactName extends RuntimeException {
    public InvalidContactName(String message) {
        super(message);
    }
}
