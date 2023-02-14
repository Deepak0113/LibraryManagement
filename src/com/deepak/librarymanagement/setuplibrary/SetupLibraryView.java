package com.deepak.librarymanagement.setuplibrary;

import java.util.Scanner;

public class SetupLibraryView {
    private final Scanner scanner = new Scanner(System.in);
    private SetupLibraryController setupLibraryController;

    SetupLibraryView(){
        setupLibraryController = new SetupLibraryController(this);
    }

    public void enterLibrary(){
        System.out.println("Enter library name: ");
        String name = scanner.nextLine();
        System.out.println("Enter library address: ");
        String address = scanner.nextLine();
    }

    public void librarySuccessfullyAdded() {
        System.out.println("Library added successfully!!");
    }

    public void libraryAlreadyExist() {
        System.out.println("Library already exist!!");
    }

    public static void main(String[] args) {
        SetupLibraryView setupLibraryView = new SetupLibraryView();
        setupLibraryView.enterLibrary();
    }
}
