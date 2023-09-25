package unit3menu;

import java.util.Scanner;

public class Unit3Menu {

    public static void main(String[] args) {
        final int OPT1_CHICHEN_BOWL = 1;
        final int OPT2_CHIC_PARM = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Pizza Luce");
        System.out.println("Menu: ");
        System.out.println("1: Gochuchang Chicken Bowl");
        System.out.println("2: Chicken Parmigiana");
        System.out.println("3: Pesto Turkey");
        System.out.println("4: Veggieball Parmigiana");
        System.out.println("5: Baked Potato Pizza");
        System.out.println("What would you like to order?");
        int menuOrderNum = input.nextInt();
        
        if (menuOrderNum == 1) {
            System.out.println("Your Gochuchang Chicken Bowl will be ready soon");
        } else if (menuOrderNum == 2) {
            System.out.println("Your Chicken Parmigiana will be ready soon");
        } else if (menuOrderNum == 3) {
            System.out.println("Your Pesto Turkey will be ready soon");
        }  else if (menuOrderNum == 4) {
            System.out.println("Your Veggieball Parmigiana will be ready soon");
        }  else if (menuOrderNum == 5) {
            System.out.println("Your Baked Potato Pizza will be ready soon");
        }  else {
            System.out.println("Sorry you must select something on the menu");
        }       
        
    }
    
}
