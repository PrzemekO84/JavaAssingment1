import java.io.Console;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Map<String, char[]> users = new HashMap<String, char[]>();

        users.put("Przemek1", "Haslo1".toCharArray());
        users.put("Przemek2", "Haslo2".toCharArray());
        users.put("Przemek3", "Haslo3".toCharArray());
        users.put("Przemek4", "Haslo4".toCharArray());
        users.put("Przemek5", "Haslo5".toCharArray());


        Console console = System.console();

        System.out.println("Please enter your username: ");

        String username = console.readLine();

        System.out.println("Please enter your Password");

        char[] password = console.readPassword();

        if(users.containsKey(username)){
            if (Arrays.equals(users.get(username), password)){
                System.out.println("Successfully logged in!");
            }
            else{
                System.out.println("Wrong password!");
            }
        }
        else{
            System.out.println("Invalid credentials!");
        }
        
    }
}