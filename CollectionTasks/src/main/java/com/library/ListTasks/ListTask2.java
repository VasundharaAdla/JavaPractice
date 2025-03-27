package com.library.ListTasks;

public class ListTask2 {
    public static void main(String[] args) {
        ClubMembers clubMembers=new ClubMembers();
        System.out.println("Club members: "+clubMembers.getClubMembers());
        clubMembers.addMember("Vasu");
        clubMembers.addMember("Mani");
        clubMembers.addMember("Pranav");
        clubMembers.addMember("Praneeth");
        clubMembers.addMember("Ditya");
        System.out.println("Club members: "+clubMembers.getClubMembers());
        clubMembers.deleteMember("Praneeth");
        System.out.println("Club members: "+clubMembers.getClubMembers());
        String member="Mani";
        if(clubMembers.searchMembers(member))
            System.out.println(member+" is part of club");
        else
            System.out.println(member+" is not a part of club");
        clubMembers.updateMembers(member,"Dhamodhar");
        System.out.println("Club members: "+clubMembers.getClubMembers());
        clubMembers.sortMembers();
        System.out.println("Club members: "+clubMembers.getClubMembers());
    }
}
