package com.deepak.librarymanagement.managebooks;

import java.util.Scanner;

public class ManageBooksView {
    Scanner scanner = new Scanner(System.in);
    private ManageBooksController manageBooksController;

    ManageBooksView(){
        manageBooksController = new ManageBooksController(this);
    }

    public void addBook(){
        System.out.println("Enter book name: ");
        String bookName = scanner.nextLine();
        System.out.println("Enter book id: ");
        String bookId = scanner.nextLine();
        manageBooksController.addBook(bookName, bookId);
    }

    public void removeBook(){
        System.out.println("Enter book id: ");
        String bookId = scanner.nextLine();
        manageBooksController.removeBook(bookId);
    }

    public void bookAlreadyExist() {
        System.out.println("Book already exist");
    }

    public void bookSuccessfullyAdded() {
        System.out.println("Book added successfully");
    }

    public void bookSuccessfullyRemoved() {
        System.out.println("Book removed successfully");
    }

    public void bookDoesNotExist() {
        System.out.println("Book doesn't exist");
    }

    public static void main(String[] args) {
        ManageBooksView manageBooksView = new ManageBooksView();
        manageBooksView.addBook();
//        manageBooksView.removeBook();
    }
}
