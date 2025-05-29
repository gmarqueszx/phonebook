package br.com.gmarqueszx.phonebook.view;

import br.com.gmarqueszx.phonebook.controller.InvalidPhoneNumber;
import br.com.gmarqueszx.phonebook.model.Phonebook;
import br.com.gmarqueszx.phonebook.model.PhonebookList;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner sc = new Scanner(System.in);
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
                    Phonebook phonebook = new Phonebook();

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
                    System.out.println("Contatos salvos: ");
                    list.viewPhonebook();
                    break;
                case 3:
                    System.out.println("Digite o nome do contato que deseja procurar: ");
                    String searchedName = sc.nextLine();
                    list.filterSearchedName(searchedName);
                    break;
                case 4:
                    System.out.println("Digite o nome do contato que deseja excluir: ");
                    String removeName = sc.nextLine();
                    list.removePhonebook(removeName);
                    break;
                case 0:
                    System.out.println("Finalizando aplicação...");
                    break mainMenu;
            }


        }
    }

}

