package quizes.q3.lizi_lobzhanidze_3;

public class Room {
    private int roomNumber;
    private boolean isOccupied;
    private Person occupant;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
        this.occupant = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Person getOccupant() {
        return occupant;
    }

    public void checkIn(Person person) {
        if (!isOccupied()) {
            occupant = person;
            isOccupied = true;
            System.out.println(person.getName() + " " + person.getSurname() + " checked into room number " + roomNumber);
        } else {
            System.out.println("Room " + roomNumber + " is already occupied.");
        }
    }

    public void checkOut() {
        if (isOccupied()) {
            System.out.println(occupant.getName() + " " + occupant.getSurname() + " checked out from room number " + roomNumber);
            occupant = null;
            isOccupied = false;
        } else {
            System.out.println("Room " + roomNumber + " is already vacant.");
        }
    }
}
