import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        int seconds = 3662;
        String result = calculateTime(seconds);
        System.out.println(result);
    }
    public static String calculateTime(int seconds) {
        if (seconds == 0) {
            return "0 секунд";
        }
        Map<String, Integer> timeUnits = new LinkedHashMap<>();
        timeUnits.put("год", 365 * 24 * 60 * 60);
        timeUnits.put("месяц", 30 * 24 * 60 * 60);
        timeUnits.put("неделя", 7 * 24 * 60 * 60);
        timeUnits.put("день", 24 * 60 * 60);
        timeUnits.put("час", 60 * 60);
        timeUnits.put("минута", 60);
        timeUnits.put("секунда", 1);
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (Map.Entry<String, Integer> entry : timeUnits.entrySet()) {
            String unit = entry.getKey();
            int unitSeconds = entry.getValue();
            if (seconds >= unitSeconds) {
                int unitCount = seconds / unitSeconds;
                seconds -= unitCount * unitSeconds;
                count++;
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(unitCount).append(" ").append(getPluralForm(unitCount, unit));
            }
            if (count == 2 || seconds == 0) {
                break;
            }
        }
        if (seconds > 0) {
            if (result.length() > 0) {
                result.append(" и ");
            }
            result.append(seconds).append(" ").append(getPluralForm(seconds, "секунда"));
        }
        return result.toString();
    }
    private static String getPluralForm(int count, String unit) {
        if (count % 10 == 1 && count % 100 != 11) {
            return unit;
        } else if (count % 10 >= 2 && count % 10 <= 4 && (count % 100 < 10 || count % 100 >= 20)) {
            return unit + "а";
        } else {
            return unit + "ов";
        }
    }
}
