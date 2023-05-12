package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> distances = Arrays.asList(57, 55, 67, 98, 60);
        int maxDistance = 175;
        int numCities = 3;
        int result = chooseBestSum(maxDistance, numCities, distances);
        System.out.println(result);
    }

    public static int chooseBestSum(int maxDistance, int numCities, List<Integer> distances) {
        List<List<Integer>> combinations = generateCombinations(numCities, distances);
        int maxSum = 0;
        for (List<Integer> combination : combinations) {
            int sum = 0;
            for (int distance : combination) {
                sum += distance;
            }
            if (sum <= maxDistance && sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static List<List<Integer>> generateCombinations(int size, List<Integer> distances) {
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinationsHelper(size, distances, new ArrayList<>(), combinations);
        return combinations;
    }

    public static void generateCombinationsHelper(int size, List<Integer> distances, List<Integer> currentCombination, List<List<Integer>> combinations) {
        if (currentCombination.size() == size) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }
        for (int i = 0; i < distances.size(); i++) {
            int distance = distances.get(i);
            if (!currentCombination.isEmpty() && distance <= currentCombination.get(currentCombination.size() - 1)) {
                continue;
            }
            currentCombination.add(distance);
            generateCombinationsHelper(size, distances, currentCombination, combinations);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
