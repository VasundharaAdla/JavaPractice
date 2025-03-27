package com.library.mapTasks;
import java.util.*;
public class MapTask2 {
    public static void main(String[] args) {
        Map<String,Integer> map1 =new TreeMap<>();
        map1.put("Hyderabad",100000);
        map1.put("Delhi",150000);
        map1.put("Banglore",200000);
        map1.put("Mumbai",370000);
        System.out.println("Map 1: "+map1);
        Map<String,Integer> map2 =new TreeMap<>();
        map2.putAll(map1);
        System.out.println("Map 2: "+map2);
    }
}
