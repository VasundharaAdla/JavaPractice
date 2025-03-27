package com.library.mapTasks;
import java.util.HashMap;
import java.util.Map;
public class MapTask1 {
    public static void main(String[] args) {
        Map<String,Integer> cityPopulation=new HashMap<>();
        cityPopulation.put("Hyderabad",100000);
        cityPopulation.put("Delhi",150000);
        cityPopulation.put("Banglore",200000);
        cityPopulation.put("Mumbai",370000);
        System.out.println("City wise population");
        for(Map.Entry<String,Integer> e:cityPopulation.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
