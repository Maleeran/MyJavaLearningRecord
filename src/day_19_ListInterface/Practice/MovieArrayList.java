package src.day_19_ListInterface.Practice;

import java.util.*;

public class MovieArrayList {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();

        movies.add("The Godfather");
        movies.add("The Godfather: Part II");
        movies.add("The Dark Knight");
        movies.add("Pulp Fiction");
        movies.add("Lala Land");

        // 在第二个位置插入一个新电影
        movies.add(1, "The Godfather: Part III");

        // 修改第四个位置的电影
        movies.set(3, "Waterloo Bridge");

        // 删除第一个电影，并输出最终列表
        movies.remove(0);
        System.out.println("Final List : " +  movies);
    }
}
