package com.deepak.librarymanagement.login;

public class LoginController {
    private LoginView loginView;
    private LoginModel loginModel;

    LoginController(LoginView loginView){
        this.loginView = loginView;
        this.loginModel = new LoginModel(this);
    }

    public void checkCredentials(String userName, String password){
        loginModel.checkCredentials(userName, password);
    }

    public void loginSuccessfully(String userName){
        loginView.loginSuccessfully(userName);
    }

    public void loginFailed(){
        loginView.loginFailed();
    }
}
