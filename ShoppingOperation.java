package JavaProject;

import java.util.Scanner;

public class ShoppingOperation {
    static Scanner sc = new Scanner(System.in);


    static void AllMenus() {

        int choice;

        // ProductService productService = new ProductService();
        System.out.println("\t\t~~ Welcome To Shopping Kart~~\t\t");
        while(true){

            System.out.println("============================================");
            System.out.println("Enter 1. for Admin panel\nEnter " +
                    "2. for user panel\n"
                    + "Enter 3. display product Details by id/n" + "Enter 4. update product details \n"
                    + "Enter 5 for quot panel");

            System.out.println("============================================");
            choice = sc.nextInt();
            System.out.println("============================================");

            switch (choice) {
                case 1:
                    AdminPanel.adminOpreation();
                    System.out.println("============================================");
                    break;
                case 2:
                    ProductService.updateProductById();
                    System.out.println("============================================");
                    break;

                case 3:
                    ProductService.deleteProduct();
                    System.out.println("===========================");
                    break;
                case 4:
                    ProductService.getAllproduct();
                    System.out.println("===========================");
                    break;
                case 5:
                    ProductService.getProductById();
                    System.out.println("===========================");
                    break;

                case 6:
                    ProductService.showAllOrder();
                    System.out.println("===========================");
                    break;
                case 7:
                    ShoppingOperation.AllMenus();

                default:System.out.println("Enter your Choice");


            }

        }
    }
}




