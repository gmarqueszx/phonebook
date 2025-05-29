package br.com.gmarqueszx.phonebook.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Phonebook {
    private String name;
    private String phone;

    public void changePhone(String newPhone) {
        this.phone = newPhone;
        System.out.println("Número de telefone alterado para: " + this.phone);
    }



}
