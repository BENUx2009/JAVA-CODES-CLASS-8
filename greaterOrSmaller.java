import java.util.Scanner;
public class greaterOrSmaller{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out .print("Enter the first number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter the first number = ");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("First number is greater");
        }
        else if(num1<num2){
            System.out.println("Second number is greater");
        }
        else{
            System.out.println("Both are equal");
        }


    }
}

    