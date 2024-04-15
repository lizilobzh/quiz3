package quizes.q3.lizi_lobzhanidze_3;



import java.util.List;

public class WorkshopTester {
    public static void main(String[] args) {
        // Create a HotelManager instance
        HotelManager hotelManager = new HotelManager();

        // Create a list of persons
        List<Person> persons = PersonManager.getPersons();

        // Create a new person with your name or surname
        Person me = new Person();
        me.setId("YOUR_ID");
        me.setName("YourName");
        me.setSurname("YourSurname");

        // Check-in the new person along with another person from the list
        if (!persons.isEmpty()) {
            // Assuming room 1 is available
            Room room = new Room(1);
            hotelManager.checkIn(me, room);
            Person otherPerson = persons.get(0); // Get the first person from the list
            hotelManager.checkIn(otherPerson, room); // Check-in the other person to the same room
        }

        // Print hotel guests and room information
        hotelManager.displayInfo();
    }
}
