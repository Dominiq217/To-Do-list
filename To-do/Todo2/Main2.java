package Todo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    // test

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Dodać zadanie");
            System.out.println("2. Usunąć zadanie");
            System.out.println("3. Wyświetlić listę zadań");
            System.out.println("4. Zakończyć program");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Wpisz nowe zadanie:");
                    String newTask = scanner.nextLine();
                    toDoList.add(newTask);
                    System.out.println("Zadanie dodane do listy.");
                    break;
                case "2":
                    System.out.println("Które zadanie chcesz usunąć?");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i));
                    }
                    int taskIndex = scanner.nextInt();
                    toDoList.remove(taskIndex - 1);
                    System.out.println("Zadanie usunięte z listy.");
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Twoja lista zadań:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i));
                    }
                    break;
                case "4":
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór.");
                    break;
            }

        } while (!choice.equals("4"));

        scanner.close();

    }

}
