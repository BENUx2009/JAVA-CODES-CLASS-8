import java.util.Scanner;
class exam1{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int num1 = sc.nextInt();      
    if(num1%2==0){
        System.out.println(num1+" is a even number");
    }
    else {
        System.out.println(num1+" is a odd number");
    }
  }
}