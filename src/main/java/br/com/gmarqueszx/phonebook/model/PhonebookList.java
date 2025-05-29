package br.com.gmarqueszx.phonebook.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PhonebookList {
    private List<Phonebook> phonebooks = new ArrayList<>();

    public void addPhonebook(Phonebook phonebook) {
        phonebooks.add(phonebook);
    }

    public void removePhonebook(Phonebook phonebook) {
        phonebooks.remove(phonebook);
    }

    public void viewPhonebook() {
        for (Phonebook phonebook : phonebooks) {
            System.out.println(phonebook);
        }
    }

}
