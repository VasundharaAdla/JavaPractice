package com.library.setTasks;
import java.util.*;
public class SetTask2 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(45,78,90,1,8,0,23);
        Set<Integer> set1=new LinkedHashSet<>(list);
        Set<Integer> set2=new TreeSet<>(list);
        Iterator<Integer> itr1=set1.iterator();
        System.out.println("Set1: ");
        while(itr1.hasNext()) {
            System.out.print(itr1.next()+" ");
        }
        System.out.println("\nSet2: ");
        Iterator<Integer> itr2=set2.iterator();
        while(itr2.hasNext()) {
            System.out.print(itr2.next()+" ");
        }
        System.out.println();
    }
}
