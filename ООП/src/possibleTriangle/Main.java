package possibleTriangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        int firstSide = sc.nextInt();
        System.out.println("Enter the second side: ");
        int secondSide = sc.nextInt();
        System.out.println("One more side pls :) :");
        int thirdSide = sc.nextInt();
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        if (triangle.isTriangle()){
            System.out.println("Its possible triangle." + "\n" + "Largest external angle = " + triangle.largestAngle());
        } else {
            System.out.println("Its impossible triangle, sorry");
        }

    }
}
