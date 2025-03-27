package com.library.ListTasks;
import java.util.*;
public class ClubMembers {
    private List<String> clubMembers;
    public ClubMembers() {
        this.clubMembers =new ArrayList<String>();
    }
    public ClubMembers(List<String> clubMembers) {
        setClubMembers(clubMembers);
    }
    public void setClubMembers(List<String> clubMembers) {
        this.clubMembers = clubMembers;
    }
    public List<String> getClubMembers(){
        return clubMembers;
    }
    public void addMember(String member) {
        clubMembers.add(member);
        System.out.println("Member added to club successfully: "+member);
    }
    public void deleteMember(String memeber) {
        clubMembers.remove(memeber);
        System.out.println("Member deleted from club is successful: "+memeber);
    }
    public List<String> listAllMembers() {
        return clubMembers;
    }
    public boolean searchMembers(String member) {
        for(String m:clubMembers)
            if(m.equals(member))
                return true;
        return false;
    }
    public void updateMembers(String oldMember,String newMember) {
        for(int i=0;i<clubMembers.size();i++) {
            if(clubMembers.get(i).equals(oldMember))
                clubMembers.set(i,newMember);
        }
    }
    public void sortMembers() {
        Collections.sort(clubMembers);
    }
}
