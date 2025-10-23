package br.com.studiesjava.javacore.exception.exception.tests;

import br.com.studiesjava.javacore.exception.exception.domain.LoginWrongException;

import javax.security.auth.login.LoginException;
import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        }catch (LoginWrongException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginWrongException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Wallace";
        String passwordDB = "thaliaLinda";

        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        if(!usernameDB.equals(username) || !passwordDB.equals(password)){
            throw new LoginWrongException("User or password invalid");
        }

        System.out.println("Login Successful");
    }
}
