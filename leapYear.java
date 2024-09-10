/*
 * Check whether yesr is leap year or not
 */
import java.util.Scanner;
public class leapYear {
    public  static void main(String args [] ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two digit number : ");
        int num = sc.nextInt();
        int temp = num;
        num = num/10;
        //System.out.println("num = "+num);
        temp = temp%10;
        //System.out.println("temp = "+temp);
        if(num == temp){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}
