import java.util.Scanner;
public class circle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius = ");
        float radi = sc.nextFloat();
        if(radi>0){
            float area = 22/7*radi*radi;
         System.out.println("Area of the circle is = "+area);
         float circum = 2*(22/7)*radi;
          System.out.println("Circumference of the circle is = "+circum);
        }
        else{
            System.out.println("Measurement must be in positive");
        }
        sc.close();
     }
}
