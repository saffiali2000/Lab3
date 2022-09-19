import java.util.*;

public class AddressBook{
    private ArrayList<BuddyInfo> buddyInfoArray;

    public AddressBook() {
        buddyInfoArray = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddyInfoArray.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyInfoArray.remove(buddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}