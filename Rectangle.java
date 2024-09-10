/*
 * Write a program to enter length and breadth of rectangular field. Calculate and display 
    its area, perimeter and diagonal.
 */
import java.util.Scanner;
import java.lang.Math;
 public class Rectangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length = ");
        float l = sc.nextFloat();
        System.out.print("Enter the Breadth = ");
        float b = sc.nextFloat();
        if(l>0 && b>0){
            float peri = 2*(l+b);
            System.out.println("Perimeter of the rectangle = "+peri+" units");
            float area = l*b;
            System.out.println("Area of the rectangle = "+area+" sq. units");
            float diagonal = (float)Math.sqrt(l*l+b*b);
            System.out.println("Length of diagonal  = "+diagonal+" units");
        }
        else{
            System.out.println("Oh ho wrong input, Measurements cant be in negative or zero");
        }
        sc.close();
    }
}
