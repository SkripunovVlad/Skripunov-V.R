package triangle;

public class Triangle {
    public static final int[] allPoints = new int[6];

    public Triangle(String points) {
        char check;
        int checkDit = 0;
        int StringToDit;
        int x = 0;
        for (int i = 0; i < points.length(); i++) {
            check = points.charAt(i);
            if (check == ',') {
                StringToDit = Integer.parseInt(points.substring(checkDit, i));
                allPoints[x] = StringToDit;
                checkDit = i + 2;
                x++;
            }
            if (i == points.length() - 1) {
                StringToDit = Integer.parseInt(points.substring(checkDit, i + 1));
                allPoints[x] = StringToDit;
                checkDit = i + 2;
            }
        }
    }

    public String findingBarycenter() {
        String result = "";
        double x0 = (((double) allPoints[0] + (double) allPoints[2] + (double) allPoints[4]) / 3);
        double y0 = (( (double) allPoints[1] + (double) allPoints[3] + (double) allPoints[5]) / 3);
        String x = String.format("%.4f", x0);
        String y = String.format("%.4f", y0);
        result += x + "," + y;
        return result;
    }
}
