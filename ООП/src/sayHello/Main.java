package sayHello;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        name = name.toLowerCase();
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println("Привет, " + name);

    }
}
