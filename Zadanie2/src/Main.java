import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to weather converting program!");

        System.out.println("Please choose what weather converter you want to use:");

        System.out.println("1. Convert Celsius to Fahrenheit or Kelvin");
        System.out.println("2. Convert Fahrenheit to Celsius or Kelvin");
        System.out.println("3. Convert Kelvin to Celsius or Fahrenheit");



        String option = scanner.nextLine();

        switch(option) {
            case "1":
                System.out.println(convertCelsius());
                break;
            case "2":
                System.out.println(convertFahrenheit());
                break;
            case "3":
                System.out.println(convertKelvin());
                break;
            default:
                System.out.println("Invalid option!");
        }


    }
    static String convertCelsius(){

        Scanner scanner = new Scanner(System.in);

        String result;

        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Celsius to Kelvin");

        String choice = scanner.nextLine();

        String message = "Please enter a weather temperature in Celsius:";

        double weatherTemperature = numberValidation(message);

        if(choice.equals("1")){
            double fahrenheitTemperature = (weatherTemperature * 9/5) + 32;
            result = "Weather temperature in Fahrenheit is " + String.format("%.2f", fahrenheitTemperature) + "°F";
        }
        else if(choice.equals("2")){
            double kelvinTemperature = (weatherTemperature + 273.15);
            result = "Weather temperature in Kelvin is " + String.format("%.2f", kelvinTemperature) + "°K";

        }
        else{
            result = "Invalid choice";
        }

        return result;
    }
    static String convertFahrenheit(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Fahrenheit to Kelvin");

        String choice = scanner.nextLine();

        String result;

        String message = "Please enter a weather temperature in Fahrenheit:";

        double weatherTemperature = numberValidation(message);

        if(choice.equals("1")){
            double celsiusTemperature = (weatherTemperature -32) * 5/9;
            result = "Weather temperature in Celsius is " + String.format("%.2f", celsiusTemperature) + "°C";
        }
        else if(choice.equals("2")){
            double kelvinTemperature = (weatherTemperature + 459.67) * 5/9;
            result = "Weather temperature in Kelvin is " + String.format("%.2f", kelvinTemperature) + "°K";
        }
        else{
            result = "Invalid choice";
        }
        return result;
    }

    static String convertKelvin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Convert Kelvin to Celsius");
        System.out.println("2. Convert Kelvin to Fahrenheit");

        String choice = scanner.nextLine();

        String result;

        String message = "Please enter a weather temperature in Kelvin:";

        double weatherTemperature = numberValidation(message);

        if(choice.equals("1")){
            double celsiusTemperature = (weatherTemperature - 273.15);
            result = "Weather temperature in Celsius is " + String.format("%.2f", celsiusTemperature) + "°C";
        }
        else if(choice.equals("2")){
            double fahrenheitTemperature = (weatherTemperature - 273.15) * 9/5 + 32;
            result = "Weather temperature in Fahrenheit is " + String.format("%.2f", fahrenheitTemperature) + "°F";
        }
        else{
            result = "Invalid choice";
        }
        return result;
    }

    static double numberValidation(String message){

        Scanner scanner = new Scanner(System.in);

        double number;

        do{
            try{
                System.out.println(message);
                number = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            catch(Exception e){
                System.out.println("Invalid number");
                scanner.nextLine();
            }
        } while(true);

        return number;
    }
}
