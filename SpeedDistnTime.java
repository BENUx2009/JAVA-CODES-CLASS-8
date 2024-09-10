import java.util.Scanner;
public class SpeedDistnTime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Distance = ");
         float Dist = sc.nextFloat();
         System.out.print("Enter the Time = ");
          float Time = sc.nextFloat();
          float Speed = Dist/Time;
          System.out.println(Speed+" km/hr ");
          float Speed2 = Speed*5/18;
          System.out.println(Speed2+" m/s ");
          sc.close();
     }
}
