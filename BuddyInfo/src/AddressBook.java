import java.util.ArrayList;

public class AddressBook{

    private BuddyInfo buddy;
    private ArrayList<BuddyInfo> addresses;

    public AddressBook(){
        addresses = new ArrayList<>();
        buddy = new BuddyInfo();

    }

    public void addBuddy(BuddyInfo buddy){
        addresses.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        addresses.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}


