package org.example;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("ami", "mari", "yui", "yuki", "mac", "yuri", "yumi");
        names.stream()
                .sorted()
                .filter(str -> str.length() >= 4)
                .forEach(System.out::println);
        names.stream()
                .sorted()
                .filter(name -> name.endsWith("i"))
                .forEach(System.out::println);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("メッシ", 10);
        map.put("ネイマール", 11);
        map.put("クリロナ", 7);
        map.put("イニエスタ", 8);

        map.entrySet().stream().sorted(java.util.Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }


}
