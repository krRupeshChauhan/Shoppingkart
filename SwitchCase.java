package JavaProject;

public class SwitchCase {
    public static void main(String[] args) {

        int choice = 3;
        switch (choice) {
            case 1:
                System.out.println("this is case 1");
                break;
            case 2:
                System.out.println("this is case 2");
                break;
            case 3:
                System.out.println("this is case 3");
                break;
            default:
                System.out.println("wrong choice");
        }
        System.out.println("end of switch case");
    }
}

