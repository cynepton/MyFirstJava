class ContactsManager {

    // Fields:
    Contact [] myFriends;
    int friendsCount;

    /**
     * Default Constructor
     */
    ContactsManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:

    /**
     * Add a new contact
     * @param contact The new contact to be added
     */
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    /**
     * Search a contact name to see if the contact is in the list of contacts.
     * @param searchName The contact name to search for.
     * @return the contact if found or null
     */
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
