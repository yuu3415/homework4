package org.example;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        {
            List<String> names = List.of("ami", "mari", "yuu", "yuki", "mac");
            List<String> result = names.stream().sorted().toList();
            System.out.println(result);
        }
        HashMap<String, Integer> map = new HashMap<>();
        map.put("メッシ", 10);
        map.put("ネイマール", 11);
        map.put("クリロナ", 7);
        map.put("イニエスタ", 8);

        map.entrySet().stream().sorted(java.util.Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
