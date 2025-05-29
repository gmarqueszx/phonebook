package br.com.gmarqueszx.phonebook.view;

import br.com.gmarqueszx.phonebook.expection.InvalidPhoneNumber;
import br.com.gmarqueszx.phonebook.model.Phonebook;
import br.com.gmarqueszx.phonebook.model.PhonebookList;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();
        PhonebookList list = new PhonebookList();



        mainMenu:
        while (true) {
            System.out.println("===================");
            System.out.println("Agenda Telefônica");
            System.out.println("===================");
            System.out.println("1. Registrar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Procurar Contato");
            System.out.println("4. Excluir Contato");
            System.out.println("0. Sair");
            System.out.println("===================");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    phonebook.setName(sc.nextLine());
                    System.out.println("Digite o telefone do contato com DDD: ");
                    System.out.println("Exemplo: 77999290577");
                    String phone = sc.nextLine();
                    if (phone.length() == 11 && phone.matches("\\d+")) {
                        phonebook.setPhone(phone);
                        list.addPhonebook(phonebook);
                    } else {
                        throw new InvalidPhoneNumber("Número de telefone inválido, tente novamente.");
                    }
                    break;
                case 2:
                    list.viewPhonebook();
                    break;
            }


        }
    }

}

