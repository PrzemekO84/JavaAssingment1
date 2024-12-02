import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String username = scanner.nextLine();

        if(username == ""){
            System.out.println("Hello World!");
        }
        else{
            System.out.println("Hello " + username);
        }

    }
}
