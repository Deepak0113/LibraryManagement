package com.deepak.librarymanagement.login;

import java.util.Scanner;

public class LoginView {
    Scanner scanner = new Scanner(System.in);
    private LoginController loginController;

    LoginView(){
        loginController = new LoginController(this);
    }

    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.checkForLogin();
    }

    // check login
    private void checkForLogin(){
        System.out.println("Welcome to library management system -----");
        System.out.println("Enter username");
        String userName = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        loginController.checkCredentials(userName, password);
    }

    public void loginSuccessfully(String userName) {
        System.out.println("\n--> Welcome " + userName + "<--\n");
        System.out.println("Thanks for Login.");
    }

    public void loginFailed(){
        System.out.println("\nInvalid Credentials. Please try again!\n");
    }
}
