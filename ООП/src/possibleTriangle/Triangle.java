package possibleTriangle;

public class Triangle {
    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle (int firstSide, int secondSide, int thirdSide){

        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    public boolean isTriangle(){
        return ((firstSide < secondSide + thirdSide) || (secondSide < firstSide + thirdSide) || (thirdSide < firstSide + secondSide));
    }
    public int largestAngle() {
        double alfa = ((Math.pow(firstSide, 2) + Math.pow(thirdSide, 2) - Math.pow(secondSide, 2)) / (2 * firstSide * thirdSide));
        double betta = ((Math.pow(firstSide, 2) + Math.pow(secondSide, 2) - Math.pow(thirdSide, 2)) / (2 * firstSide * secondSide));
        double gamma = ((Math.pow(secondSide, 2) + Math.pow(thirdSide, 2) - Math.pow(firstSide, 2)) / (2 * thirdSide * secondSide));

        double angleA = 180 - (Math.acos(alfa) * (180 / Math.PI));
        double angleB = 180 - (Math.acos(betta) * (180 / Math.PI));
        double angleC = 180 - (Math.acos(gamma) * (180 / Math.PI));

        int maxDitForTwo = Math.max((int) angleA, (int) angleB);
        return Math.max(maxDitForTwo, (int) angleC);

    }
}
