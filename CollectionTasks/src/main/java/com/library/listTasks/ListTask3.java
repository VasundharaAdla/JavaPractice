package com.library.listTasks;
import java.util.*;
public class ListTask3 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,4,8,3,4,9));
        List<Integer> list2=new ArrayList<>(Arrays.asList(11,5,4,7,3,2,9));
        List<Integer> list3=new ArrayList<>(Arrays.asList(1,2,4,8,3,4,9));
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));
        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);
        list1.addAll(list2);
        System.out.println("Joined list: "+list1);
        List<Integer> clonedList=new ArrayList<>(list1);
        System.out.println("Cloned List: "+clonedList);
    }
}
