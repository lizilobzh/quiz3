package quizes.q3.lizi_lobzhanidze_3;


import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    private Map<String, Room> guestRooms;

    public HotelManager() {
        guestRooms = new HashMap<>();
    }

    public void checkIn(Person person, Room room) {
        if (room.isOccupied()) {
            System.out.println("Room " + room.getRoomNumber() + " is already occupied.");
            return;
        }
        room.checkIn(person);
        guestRooms.put(person.getId(), room);
    }

    public void checkOut(String personId) {
        Room room = guestRooms.get(personId);
        if (room == null) {
            System.out.println("Person with ID " + personId + " is not checked in.");
            return;
        }
        room.checkOut();
        guestRooms.remove(personId);
    }

    public void displayInfo() {
        System.out.println("Guests Information:");
        for (Map.Entry<String, Room> entry : guestRooms.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            Person person = room.getOccupant();
            System.out.println("ID: " + personId + ", Name: " + person.getName() + " " + person.getSurname() + ", Room: " + room.getRoomNumber());
        }
    }
}
