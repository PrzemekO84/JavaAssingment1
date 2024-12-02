import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String regex = "\\d{4}-\\d{2}-\\d{2}";

        String userDate;
        Integer year;
        Integer month;
        Integer day;



        while(true){

            System.out.println("Please enter a date in this format \"YYYY-MM-DD\": ");

            userDate = scanner.nextLine();

            if(userDate.matches(regex)){
                System.out.println("The format is correct!");
            }
            else{
                System.out.println("Please enter a date with a valid date format. For example 2024-03-05");
                System.out.println();
                continue;
            }

            //Tu sobie po prostu sprawdzam z ciekawosci
            year = Integer.parseInt(userDate.substring(0, 4));
            //System.out.println(year.getClass().getName());
            month = Integer.parseInt(userDate.substring(5, 7));
            //System.out.println(month.getClass().getName());
            day = Integer.parseInt(userDate.substring(8, 10));
            //System.out.println(day.getClass().getName());

            if(month > 12 || month < 1){
                System.out.println("But unfortunately you provided invalid month number");
                System.out.println("Month number needs to be between 01-12");
            }
            else if(day > 31 || day < 1){
                System.out.println("But unfortunately you provided invalid day number");
                System.out.println("Day number needs to be between 01-31");
            }
            else{
                break;
            }

        }

       switch(month){
           case 1:
               System.out.println("The month is January and there are 31 days in a month!");
               break;
           case 2:
               if(year % 4 == 0){
                   System.out.println("The month is February and there are 29 days in a month!");
                   break;
               }
               else{
                   System.out.println("The month is February and there are 28 days in a month!");
                   break;
               }
           case 3:
               System.out.println("The month is March and there are 31 days in a month!");
               break;
           case 4:
               System.out.println("The month is April and there are 30 days in a month!");
               break;
           case 5:
               System.out.println("The month is May and there are 31 days in a month!");
               break;
           case 6:
               System.out.println("The month is June and there are 30 days in a month!");
               break;
           case 7:
               System.out.println("The month is July and there are 31 days in a month!");
               break;
           case 8:
               System.out.println("The month is August and there are 31 days in a month!");
               break;
           case 9:
               System.out.println("The month is September and there are 30 days in a month!");
               break;
           case 10:
               System.out.println("The month is October and there are 31 days in a month!");
               break;
           case 11:
               System.out.println("The month is November and there are 30 days in a month!");
               break;
           case 12:
               System.out.println("The month is December and there are 31 days in a month!");
               break;
       }

    }

}