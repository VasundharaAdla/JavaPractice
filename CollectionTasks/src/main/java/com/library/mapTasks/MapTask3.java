package com.library.mapTasks;
import java.util.*;
public class MapTask3 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Hyderabad",100000);
        map.put("Delhi",150000);
        map.put("Banglore",200000);
        map.put("Mumbai",370000);
        System.out.println(map.containsKey("Banglore"));
        System.out.println(map.containsValue(100000));
        System.out.println("Hyderabad population: "+map.get("Hyderabad"));
        Map<String,Integer> map2=new TreeMap<>(map);
        System.out.println(map2);
        Map<String,Integer> map3 =new TreeMap<>(Comparator.reverseOrder());
        map3.putAll(map);
        System.out.println(map3);
        map.clear();
        System.out.println(map);
    }
}
