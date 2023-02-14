package com.deepak.librarymanagement.managebooks;

import java.util.HashMap;

public class ManageBooksModel {
    private ManageBooksController manageBooksController;
    private HashMap<String, String> bookMap = new HashMap<>();

    ManageBooksModel(ManageBooksController manageBooksController){
        this.manageBooksController = manageBooksController;
    }

    public void addBook(String bookName, String bookId) {
        if(bookMap.containsKey(bookId)){
            manageBooksController.bookAlreadyExist();
        } else{
            bookMap.put(bookId, bookName);
            manageBooksController.bookSuccessfullyAdded();
        }
    }

    public void removeBook(String bookId) {
        if(bookMap.containsKey(bookId)){
            bookMap.remove(bookId);
            manageBooksController.bookSuccessfullyRemoved();
        } else{
            manageBooksController.bookDoesNotExist();
        }
        System.out.println(bookMap);
    }
}
