import java.util.Scanner;
    public class divBy5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num1 = sc.nextInt();
        if(num1%5==0){
            System.out.println("It is divisible by 5");
            
        }
        else {
             System.out.println("It is not divisible by 5");
        }
    }
}
