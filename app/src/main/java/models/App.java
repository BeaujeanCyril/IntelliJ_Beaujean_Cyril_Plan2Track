package models;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue");

        do {
            System.out.println("Veuillez faire un choix:");
            System.out.println("1. Créer un montage");
            System.out.println("2. Sortir du programme");
            choice = scanner.nextInt();

            choiceMenu(choice);

        } while (choice == 2);

    }

    private static void choiceMenu(int choice) {
        switch (choice){
            case 1:
                System.out.println("Création d'un montage");
                createAssembly();
                break;

            case 2:
                System.out.println("Fin du programme");
                scanner.close();
                break;

            default:
                System.out.println("Erreur, veuillez recommencer votre choix");
        }
    }

    public static Assembly createAssembly(){
        System.out.println("Nom du montage?");
        String nom = scanner.nextLine();
        Tasks tasks = new Tasks();
        Assembly assembly = new Assembly(nom, tasks);
    }



}
