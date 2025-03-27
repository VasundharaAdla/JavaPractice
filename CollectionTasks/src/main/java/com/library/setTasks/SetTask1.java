package com.library.setTasks;
import java.util.*;
public class SetTask1 {
    public static void main(String[] args) {
        Set<String> months=new HashSet<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        System.out.println("Months: "+months);
        System.out.println("\nUsing Iterator\nMonths in a year: ");
        Iterator<String> itr=months.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
