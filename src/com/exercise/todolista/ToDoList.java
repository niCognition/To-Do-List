package com.exercise.todolista;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> toDoList = new ArrayList<String>();

    public void addToDoItem(String item) {

        toDoList.add(item);
    }

    public void printToDoList() {
        System.out.println("You have " + toDoList.size() + " things to-do.");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
    }


    public void modifyToDoItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyToDoItem(position, newItem);
        }
    }

    private void modifyToDoItem(int position, String newItem) {
        toDoList.set(position, newItem);
        System.out.println("To-do " + (position+1) + " have been modified." );
    }

    public void removeToDoItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeToDoItem(position);
        }
    }

    private void removeToDoItem(int position) {
        toDoList.remove(position);
    }

    private int findItem(String searchItem) {
        return toDoList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }

        return false;
    }
}
