package com.exercise.todolista;

import java.util.Scanner;

public class ToDoLista {

    private static Scanner scanner = new Scanner(System.in);
    private static ToDoList toDoList = new ToDoList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    toDoList.printToDoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nMake a choice: ");
        System.out.println("\t 0 - Show choice menu.");
        System.out.println("\t 1 - Show to-do-list.");
        System.out.println("\t 2 - Add new to-do.");
        System.out.println("\t 3 - Change a specific to-do.");
        System.out.println("\t 4 - Remove a specific to-do.");
        System.out.println("\t 5 - Search in to-do-list.");
        System.out.println("\t 6 - Terminate program.");
    }

    public static void addItem() {
        System.out.println("Add new to-do.");
        toDoList.addToDoItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("To-do in list: ");
        String itemNo = scanner.nextLine();
        System.out.println("New to-do: ");
        String newItem = scanner.nextLine();
        toDoList.modifyToDoItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter the to-do you want to remove: ");
        String itemNo = scanner.nextLine();
        toDoList.removeToDoItem(itemNo);
    }

    public static void searchForItem() {
        //I just had to do this.
        System.out.println("These are the to-do's you're looking for: ");
        String searchItem = scanner.nextLine();
        if (toDoList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else{
            System.out.println(searchItem + ", isn't in the list.");
        }
    }
}
