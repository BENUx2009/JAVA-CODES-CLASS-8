import java.util.Scanner;
class ProfitLoss {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter CP = ");
       int costPrice = nextInt();
       System.out.print("Enter SP = ");
       int sellingPrice= nextInt();
       if(costPrice>sellingPrice){
        int loss = (costPrice-sellingPrice);
        float lossPercentage = ((float)loss/costPrice)*100;
        System.out.println("Loss = "+loss);
        System.out.println("Loss percentage = "+lossPercentage);
       }
       else{
        int profit = (sellingPrice-costPrice);
        System.out.println("PROFIT");
        float profitpercentage = ((float)profit/costPrice)*100;
        System.out.println("Profit percentage"+profitpercentage);
       }

     }
       }
         
