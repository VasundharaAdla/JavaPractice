package com.library.mapTasks;
import java.util.*;
public class MapTask5 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
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
        System.out.println("Key values between "+low+" and "+high+" (inclusive)");
        for(Map.Entry<Integer,String> e:map.entrySet()){
            if(e.getKey()>=low && e.getKey()<=high)
                System.out.println(e.getKey()+":"+e.getValue());
        }
        System.out.println("Key values between "+low+" and "+high+" (exclusive)");
        for(Map.Entry<Integer,String> e:map.entrySet()){
            if(e.getKey()>low && e.getKey()<high)
                System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
