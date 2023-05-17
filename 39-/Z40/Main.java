import java.util.ArrayList;
import java.util.List;
public class Main {
    public static String formatRange(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i < nums.length - 1 && nums[i] + 1 == nums[i+1]) {
                i++;
            }
            int end = nums[i];
            if (start == end) {
                ranges.add(String.valueOf(start));
            } else {
                ranges.add(start + "-" + end);
            }
        }
        return String.join(",", ranges);
    }
    public static void main(String[] args) {
        int[] nums = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        String formattedRange = formatRange(nums);
        System.out.println(formattedRange);
    }
}

