package com.library.mapTasks;
import java.util.*;
public class MapTask5 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1,"Vasu");
        map.put(6,"Mani");
        map.put(4,"Pranav");
        map.put(15,"Ditya");
        map.put(11,"Sushanth");
        map.put(16,"Vanshika");
        map.put(7,"Krithik");
        map.put(5,"Praneeth");
        System.out.println(map);
        int low=5,high=15;
        System.out.println("\nKey values between "+low+" and "+high);
        for(Map.Entry<Integer,String> e:map.entrySet()){
            if(e.getKey()>=low && e.getKey()<high)
                System.out.println(e.getKey()+":"+e.getValue());
        }
        System.out.println("\nKey values between "+low+" and "+high);
        System.out.println(map.subMap(low,high));
    }
}
