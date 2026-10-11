import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = -1000;

        while(celsius < -273.15) {
            System.out.println("Please enter a degree in Celsius:");
            if(input.hasNextDouble()){
                celsius = input.nextDouble();
           if (celsius<-273.15){
               System.out.println("That is below absolute zero. Try again.");}
            }
        }
        else if{
            System.out.println("That is not a number. Try again.");
            input.next();
        }
double Fahrenheit = celsius * 9 / 5 +32;
double Celsius = Fahrenheit;
        System.out.println(celsius + "C is"+ Fahrenheit + "Fahrenheit is");
    }

}

