import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operation of choice (a,s,m,d) or 'x' to exit:");
        String choice = scanner.nextLine();
        
        while(
            !choice.equals("a") &&
            !choice.equals("s") &&
            !choice.equals("m") &&
            !choice.equals("d") &&
            !choice.equals("x")
        ){
            System.out.println("Invalid Choice, please select a correct option");
            choice = scanner.next();
        }
        
        while (!choice.equals("x")) {

            System.out.println("Enter your first number:");
            double input1 = scanner.nextDouble();
            System.out.println("Enter your second number:");
            double input2 = scanner.nextDouble();

            if(choice.equals("a")){
                System.out.println(calculator.add(input1, input2));
            }
            else if(choice.equals("s")){
                System.out.println(calculator.subtract(input1, input2));
            }
            else if(choice.equals("m")){
                System.out.println(calculator.multiply(input1, input2));
            }
            else if(choice.equals("d")){
                System.out.println(calculator.divide(input1, input2));
            }
            else{
                System.out.println("Invalid choice");
            }

            System.out.println("Enter operation of choice (a,s,m,d) or 'x' to exit:");
            choice = scanner.next();
        }
    }
}
