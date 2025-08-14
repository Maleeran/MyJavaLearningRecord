package src.day_20_SetandMap_Intro.practice;

import java.util.Set;
import java.util.TreeSet;

public class Words {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();

        words.add("Watermelon");
        words.add("Orange");
        words.add("Apple");
        words.add("Banana");
        words.add("Apple");
        words.add("Mango");
        words.add("Pear");
        words.add("Grapes");


        System.out.println("Words List(alphabetical):");
        System.out.println(words);

        for(String word : words){
            System.out.println(word);
        }
    }
}
