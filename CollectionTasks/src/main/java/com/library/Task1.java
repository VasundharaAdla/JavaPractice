package com.library;
import java.util.*;
public class Task1{
    public static List<Integer> findDuplicates(List<Integer> list) {
        List<Integer> duplicates=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(Integer element:list) {
            if(!set.contains(element))
                set.add(element);
            else
                duplicates.add(element);
        }
        return duplicates;
    }
    public static List<Integer> replaceAllOccurrences(List<Integer> list,int oldElement,int newElement) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==oldElement)
                list.set(i,newElement);
        }
        return list;
    }
    public static void main(String[] args) {
        //1.Write a Java program to trim the capacity of an array list to the current list size.
        List<Integer> list=new ArrayList<>(10);
        System.out.println("Initial capacity: "+list.size());
        list=Arrays.asList(2,1,4,5,7,2,3,7,9,8,7,5,4,3,1,1);//Array list trims its capacity to its current capacity while adding the elements
        System.out.println("Size: "+list.size());

        //2.Write a Java program to replace all occurrences of a specified element in an array list with another element.
        System.out.println("\nBefore Replacing: "+list);
        int newElement=6,oldElement=1;//replace the
        List<Integer> replacedList=replaceAllOccurrences(list,oldElement,newElement);
        System.out.println("After replacing: "+replacedList);

        //3.Create a Java program that finds the duplicate elements in a list.
        System.out.println("\nDuplicates elements in the list: "+findDuplicates(list));

        //

    }
}
