package com.deepak.librarymanagement.login;

public class LoginModel {
    private LoginController loginController;

    LoginModel(LoginController loginController){
        this.loginController = loginController;
    }

    public void checkCredentials(String userName, String password){
        boolean canLogin = false;
        if(userName.equals("admin") && password.equals("ZSGS")){
            loginController.loginSuccessfully(userName);
        } else if(userName.equals("deepak") && password.equals("ZSGS")){
            loginController.loginSuccessfully(userName);
        } else{
            loginController.loginFailed();
        }
    }
}
