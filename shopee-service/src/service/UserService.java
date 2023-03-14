package service;

import entity.*;

import java.util.*;

public class UserService {
    private static final HashMap<String, User> userMap = new HashMap<>();
    private final Scanner input = new Scanner(System.in);
    public boolean checkSignUp(String userName, String password){
        if(userMap.isEmpty()){
            return true;
        } else return !userMap.containsKey(userName);
    }

    private static void createAccountAndSave(String userName, String password) {
        User newUser = new User(userName, password);
        userMap.put(newUser.getUserName(), newUser);
    }

    public void signUp(){
        System.out.println("Sign Up: ");
        String username = inputAndGetString("User Name: ");
        String password = inputAndGetString("Password: ");
        if(checkSignUp(username, password)){
            createAccountAndSave(username, password);
            System.out.println("Successful registration with username " + username);
        } else {
            System.out.println(username + " has been registered.");
            System.out.println("Please enter another username!");
            signUp();
        }
    }
    public boolean checkAccount(String userName, String password){
        if(userMap.containsKey(userName)){
            User currentUser = userMap.get(userName);
            if(password.equals(currentUser.getPassword())){
                System.out.println("Logged in successfully!");
                return true;
            } else {
                System.out.println("Wrong password");
                return false;
            }
        } else {
            System.out.println("Username" + userName + "does not exist");
            return false;
        }
    }
    public void signIn(){
        String username = inputAndGetString("User Name: ");
        String password = inputAndGetString("Password: ");
        if(checkAccount(username, password)){
            System.out.println("Welcome " + username);
        }
    }

    private String inputAndGetString(String inputString) {
        System.out.println(inputString);
        return input.nextLine();
    }
}
