package JavaProject;

import java.util.Scanner;
public class UserPanel {
    static Scanner sc=new Scanner(System.in);
    static void UserOperation() {
        System.out.println("============================================");
        int choice;
        while (true) {
            System.out.println("Enter 1. for  Product\nEnter " +
                    "2. for book Product\n"
                    + "Enter 3. forcancel Product/n" + "Enter 4 for go back to the main menu");

            System.out.println("============================================");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            System.out.println("============================================");

            switch (choice) {
                case 1:
                    ProductService.getAllproduct();

                    System.out.println("============================================");
                    break;
                case 2:
                    ProductService.bookProduct();
                    System.out.println("============================================");
                    break;

                case 3:
                    ProductService.cancelOrder();
                    System.out.println("===========================");
                    break;
                case 4:
                default:
                    ShoppingOperation.AllMenus();


                    System.out.println("================");
            }
        }
        //while(choice != 4) ;


    }
}
