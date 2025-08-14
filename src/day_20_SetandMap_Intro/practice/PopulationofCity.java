package src.day_20_SetandMap_Intro.practice;

import java.util.Map;
import java.util.HashMap;

public class PopulationofCity {
    public static void main(String[] args) {
        Map<String, Integer> population = new HashMap<>();

        population.put("New York", 8500000);
        population.put("Los Angeles", 4000000);
        population.put("Chicago", 2700000);
        population.put("Houston", 2100000);
        population.put("Philadelphia", 1500000);

        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("--------------------------------------------------");
    }
}
