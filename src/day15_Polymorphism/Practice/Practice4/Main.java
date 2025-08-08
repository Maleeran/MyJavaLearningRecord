package src.day15_Polymorphism.Practice.Practice4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 创建List存储Playable对象
        List<Playable> instruments = new ArrayList<>();

        instruments.add(new Guitar());
        instruments.add(new Piano());
        instruments.add(new Piano());

        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}
