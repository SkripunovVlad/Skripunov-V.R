import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {6, 10}, {11, 15}};
        int count = countNumbersBetweenIntervals(intervals);
        System.out.println("Количество чисел между интервалами: " + count);
    }
    public static int countNumbersBetweenIntervals(int[][] intervals) {
        int[] sorted = new int[intervals.length * 2];
        int index = 0;
        for (int[] interval : intervals) {
            sorted[index++] = interval[0];
            sorted[index++] = interval[1];
        }
        Arrays.sort(sorted);
        int count = 0;
        for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] != sorted[i + 1]) {
                count += sorted[i + 1] - sorted[i] - 1;
            }
        }
        return count;
    }
}
