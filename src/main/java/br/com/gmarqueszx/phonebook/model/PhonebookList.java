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

    public void removePhonebook(String removeName) {
        phonebooks.removeIf(phonebook -> phonebook.getName().toLowerCase().contains(removeName.toLowerCase()));
    }

    public void viewPhonebook() {
        for (Phonebook phonebook : phonebooks) {
            System.out.println(phonebook);
        }
    }

    public void filterSearchedName(String searchedName) {
        for (Phonebook phonebook : phonebooks) {
            if (phonebook.getName().toLowerCase().contains(searchedName.toLowerCase())) {
                System.out.println(phonebook);
            }
        }

    }

}
