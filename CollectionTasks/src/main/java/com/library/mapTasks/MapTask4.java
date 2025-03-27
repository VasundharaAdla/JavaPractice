package com.library.mapTasks;
import java.util.*;
public class MapTask4 {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();
        map.put("Bob",6.0);
        map.put("Alice",5.6);
        map.put("Charlie",5.9);
        System.out.println(map);
        map.remove("Charlie");
        System.out.println("After deleting Charlie: "+map);
        Map<String,Double> sortedMap=new TreeMap<>(map);
        System.out.println("Sorted Map: "+sortedMap);
    }
}
