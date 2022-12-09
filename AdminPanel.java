package JavaProject;

import java.util.Scanner;
//this class is for all admin operation
public class AdminPanel {
    static  Scanner sc=new Scanner(System.in);
    static void adminOpreation() {
        int choice;
        do {

            System.out.println("Enter 1. for Add Product\nEnter " +
                    "2. for Update Product\n"
                    + "Enter 3. for delete Product/n" + "Enter 4.Show All product \n"
                    + "Enter 5 for show product by Id\n" + "Enter 6 show all order" +
                    "Enter 7 for go back to the main menu");

            System.out.println("============================================");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            System.out.println("============================================");

            switch (choice) {
                case 1:
                    ProductService.createProduct();

                    System.out.println("============================================");
                    break;
                case 2:
                    ProductService.getAllproduct();
                    System.out.println("============================================");
                    break;

                case 3:
                    ProductService.getProductById();
                    System.out.println("===========================");
                    break;
                case 4:
                    ProductService.updateProductById();
                    System.out.println("===========================");
                    break;
                case 5:
                    ProductService.deleteProduct();
                    System.out.println("===========================");
                    break;
                case 6:
                    ProductService.bookProduct();
                    System.out.println("===========================");
                    break;
                case 8:
                    ProductService.showAllOrder();
                    System.out.println("===========================");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("================");
            }
        }//do
        while (choice!= 9);

    }
}



