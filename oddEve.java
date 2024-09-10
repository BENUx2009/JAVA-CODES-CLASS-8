import java.util.Scanner;
public class oddEve{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int num = sc.nextInt();
    int result = num%2;
    if(result == 0){
        System.out.println(num+" This number is a even number");
    }
    else{
        System.out.println(num+" This number is a odd number ");


    }
}
}