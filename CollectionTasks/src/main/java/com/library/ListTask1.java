package com.library;
import java.util.*;
import java.util.stream.Collectors;

public class ListTask1 {
    public static List<Integer> rotateArray(List<Integer> list,int k) {
        int n=list.size();
        k=k%n;
        List<Integer> result=new ArrayList<>();
        result.addAll(list.subList(k,n-1));
        result.addAll(list.subList(0,k-1));
        return result;
    }
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
    public static List<Integer> getUniqueElements(List<Integer> list1,List<Integer> list2) {
        List<Integer> result=new ArrayList<Integer>();
        Set<Integer> set=new HashSet<>();
        for(Integer num:list1) {
            if(!set.contains(num)) {
                set.add(num);
                result.add(num);
            }
        }
        for(Integer num:list2) {
            if(!set.contains(num)) {
                set.add(num);
                result.add(num);
            }
        }
        return result;
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

        //4.Write a program that compares two lists of integers. The program should return the unique elements from both lists.
        List<Integer> list1=Arrays.asList(2,1,3,4,2,3);
        List<Integer> list2=Arrays.asList(5,6,3,2,8);
        List<Integer> uniqueElements=getUniqueElements(list1,list2);
        System.out.println("\nList1: "+list1);
        System.out.println("List2: "+list2);
        System.out.println("Unique Elements: "+uniqueElements);

        //5.How to convert a List to a Set and a Set to a List in Java?
        //List to Set
        List<Integer> list3=Arrays.asList(2,1,3,4,2,3,6,3,1,7);
        Set<Integer> set1=new HashSet<>(list3);
        System.out.println("\nList to Set\nList: "+list3);
        System.out.println("Set: "+set1);
        //Set to List
        Set<Integer> set2=Set.of(1,2,3,4);
        List<Integer> list4=new ArrayList<>(set2);
        System.out.println("\nSet to List\nSet: "+set2);
        System.out.println("List: "+list4);

        //6.Write a program to rotate elements in the list to the left by a given number of positions.
        List<Integer> list6=Arrays.asList(2,1,3,4,2,3,6,3,1,7);
        int rotateBy=3;
        System.out.println("\nBefore rotating: "+list6);
        System.out.println("After rotating: "+rotateArray(list6,rotateBy));
    }
}
