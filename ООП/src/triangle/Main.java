package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point coordinates: ");
        String coordinatesA = sc.nextLine();
        Triangle triangle = new Triangle(coordinatesA);
        System.out.println(triangle.findingBarycenter());
    }
}
