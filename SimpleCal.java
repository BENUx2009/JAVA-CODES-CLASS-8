import java.util.Scanner;
class SimpleCal{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number : ");
    float num1 = sc.nextFloat();
    System.out.print("Enter Second Number : ");
    float num2 = sc.nextFloat();
    System.out.println("Choose the option to perform arthematical operation");
    System.out.println("1. Addidtion");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.print("Choose your option : ");
    int ch = sc.nextInt();
    switch(ch){
        case 1: System.out.print("Addidtion = "+(num1+num2));
        break;
        case 2: System.out.print("Subtraction = "+(num1-num2));
        break;
        case 3: System.out.print("Multiplication = "+(num1*num2));
        break;
        case 4: System.out.print("Division = "+(num1/num2));
        break;
        default: System.out.print("Wrong Input");
    }

  }
}




    





    
