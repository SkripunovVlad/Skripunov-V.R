package memoryCell;

public class MemoryCell {
    private static int [] array = new int[3];
    public MemoryCell(String firstNum, String secondNum, String thirdNum) {
        if (firstNum.isEmpty()) {
            array[0] = 0;
        } else {
            int first = Integer.parseInt(firstNum);
            array[0] = first;
        }

        if (secondNum.isEmpty()) {
            array[1] = 0;
        } else {
            int second = Integer.parseInt(secondNum);
            array[1] = second;
        }

        if (thirdNum.isEmpty()) {
            array[2] = 0;
        } else {
            int third = Integer.parseInt(thirdNum);
            array[2] = third;
        }
    }
    public static boolean checkForEmptyCell() {
        int check = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                check += i + 1;
            }
        }
        if (array[0] == 0) {
            if (array[1] == 0) {
                array[0] = array[2];
                array[1] = array[2];
            } else {
                array[0] = array[2];
            }
        }
        if (array[1] == 0) {
            if (array[2] == 0) {
                array[1] = array[0];
                array[2] = array[0];
            } else {
                array[1] = array[0];
            }
        }
        if (array[2] == 0) {
            if (array[0] == 0) {
                array[0] = array[1];
                array[2] = array[1];
            } else {
                array[2] = array[0];
            }
        }

        return (check > 0);

    }

    public static void smallestNumber() {
        int dit1 = array[0];
        int dit2 = array[1];
        int dit3 = array[2];
        int lesserNumber = Math.min(dit1, dit2);
        int dit5 = Math.min(lesserNumber, dit3);
        array[0] = dit5;
        array[1] = dit5;
        array[2] = dit5;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return result;
    }
}
