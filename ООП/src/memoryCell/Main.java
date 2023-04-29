package memoryCell;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter first num: ");
        String firstNum = scanner1.nextLine();
        System.out.println("Enter second num: ");
        String secondNum = scanner1.nextLine();
        System.out.println("Enter third num: ");
        String thirdNum = scanner1.nextLine();
        MemoryCell cell = new MemoryCell(firstNum, secondNum, thirdNum);
        if (MemoryCell.checkForEmptyCell()) {
        } else {
            MemoryCell.smallestNumber();
        }
        System.out.println("Your cell is: " + cell);
    }
}
