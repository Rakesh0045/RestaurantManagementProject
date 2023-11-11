package RestaurantManagement;

import java.util.Scanner;
public class OrderingSystem {
    
    public static Scanner input = new Scanner(System.in);
    public static int choose,quantity;
    public static String again;
    public static double total,pay,change,rem;
    public static void menu(){
        
        System.out.println("\t\t\t\t+==================================+");
        System.out.println("\t\t\t\t             MENU                   ");
        System.out.println("\t\t\t\t  1. Chicken Butter Masala    Rs.250");
        System.out.println("\t\t\t\t  2. Paneer Butter Masala     Rs.200");
        System.out.println("\t\t\t\t  3. Garlic Naan              Rs.60 ");
        System.out.println("\t\t\t\t  4. Plain Naan               Rs.30 ");
        System.out.println("\t\t\t\t  5. Gulab Jamun              Rs.20 ");
    }
    
    public static void order(){
        
        System.out.println(" Press 1 for Chicken Butter Masala\n Press 2 for Paneer Butter Masala\n Press 3 for Garlic Naan\n Press 4 for Plain Naan\n Press 5 for Gulab Jamun");
        System.out.println("Place your order: ");
        choose = input.nextInt();
        
        if(choose==1){
            System.out.println("Order quantity: ");
            quantity = input.nextInt();
            total = total + (quantity*250);
            
            System.out.println("Do you want to order anything else: ");
            System.out.println("Press Y for Yes and N for No");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();              
            }
            else {
                System.out.println("Enter your payment: ");
                pay = input.nextDouble();
                while (pay < total) {
                    rem = total-pay;
                    System.out.println("Your paid amount is less than the Total amount!!\n Please pay the remaining amount: "+rem);
                    System.out.println("Enter the remaining amount: ");
                    double remainingAmount = input.nextDouble();
                    pay += remainingAmount;
                }

                change = pay - total;
                System.out.println("Your order total is: " + total);
                if(change>0)
                System.out.println("Your remaining amount is: " + change);

                System.out.println("THANK YOU FOR VISITING US!!");
            }
            
    }
            
            else if(choose==2){
            System.out.println("Order quantity: ");
            quantity = input.nextInt();
            total = total + (quantity*250);
            
            System.out.println("Do you want to order anything else: ");
            System.out.println("Press Y for Yes and N for No");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();              
            }
            else{
                System.out.println("Enter your payment: ");
                pay = input.nextDouble();
                if(pay<total)
                    System.out.println("Your paid amount is less than the Total amount!!\n Please pay the remaining amount");
                else{
                change = pay - total;
                System.out.println("Your order total is: "+total);
                if(change>0)
                System.out.println("Your remaining amount is: "+change);
                
                System.out.println("THANK YOU FOR VISITING US!!");
                
            }
        }
            
    }
        
            else if(choose==3){
            System.out.println("Order quantity: ");
            quantity = input.nextInt();
            total = total + (quantity*250);
            
            System.out.println("Do you want to order anything else: ");
            System.out.println("Press Y for Yes and N for No");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();              
            }
            else {
                System.out.println("Enter your payment: ");
                pay = input.nextDouble();
                while (pay < total) {
                    rem = total-pay;
                    System.out.println("Your paid amount is less than the Total amount!!\n Please pay the remaining amount: "+rem);
                    System.out.println("Enter the remaining amount: ");
                    double remainingAmount = input.nextDouble();
                    pay += remainingAmount;
                }

                change = pay - total;
              
                System.out.println("Your order total is: " + total);
                if(change>0)
                System.out.println("Your remaining amount is: " + change);

                System.out.println("THANK YOU FOR VISITING US!!");
            }
            
    }
        
            else if(choose==4){
            System.out.println("Order quantity: ");
            quantity = input.nextInt();
            total = total + (quantity*250);
            
            System.out.println("Do you want to order anything else: ");
            System.out.println("Press Y for Yes and N for No");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();              
            }
           else {
                System.out.println("Enter your payment: ");
                pay = input.nextDouble();
                while (pay < total) {
                    rem = total-pay;
                    System.out.println("Your paid amount is less than the Total amount!!\n Please pay the remaining amount: "+rem);
                    System.out.println("Enter the remaining amount: ");
                    double remainingAmount = input.nextDouble();
                    pay += remainingAmount;
                }

                change = pay - total;
                
                System.out.println("Your order total is: " + total);
                if(change>0)
                System.out.println("Your remaining amount is: " + change);

                System.out.println("THANK YOU FOR VISITING US!!");
            }
            
    }
        
            else if(choose==5){
            System.out.println("Order quantity: ");
            quantity = input.nextInt();
            total = total + (quantity*250);
            
            System.out.println("Do you want to order anything else: ");
            System.out.println("Press Y for Yes and N for No");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();              
            }
            else {
                System.out.println("Enter your payment: ");
                pay = input.nextDouble();
                while (pay < total) {
                    rem = total-pay;
                    System.out.println("Your paid amount is less than the Total amount!!\n Please pay the remaining amount: "+rem);
                    System.out.println("Enter the remaining amount: ");
                    double remainingAmount = input.nextDouble();
                    pay += remainingAmount;
                }

                change = pay - total;
                System.out.println("Your order total is: " + total);
                if(change>0)
                System.out.println("Your remaining amount is: " + change);

                System.out.println("THANK YOU FOR VISITING US!!");
            }
            
    }
        while(choose>5)
        {
            System.out.println("Your requested item is not on the menu Please order from the menu");
            order();
        }
            
        
  }
    public static void main(String[] args) {
        
     menu();
     order();
    }
}    

