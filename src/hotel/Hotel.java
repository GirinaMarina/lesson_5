package hotel;

import java.util.Scanner;

public class Hotel {
    Room[] rooms = {
            new Room(11, 2, true, true, true),
            new Room(12, 1, false, true, false),
            new Room(13, 3, true, true, true),
            new Room(21, 2, true, false, true),
            new Room(22, 3, true, true, true),
            new Room(23, 3, true, false, true),
            new Room(31, 3, true, true, false),
            new Room(32, 1, true, true, true),
            new Room(33, 2, true, true, false)
    };

    public void getFreeRooms() {
        for (Room room : rooms) {
            if (!room.isReserved()) {
                System.out.print(room.getNumber() + " ");
            }
        }
        System.out.println();
    }

    public void reserve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер комнаты: ");
        int num = scanner.nextInt();
        for (Room room : rooms) {
            if (!room.isReserved() && num == room.getNumber()) {
                room.setReserved(true);
                System.out.println("Комната " + num + " забронирована");
            } else if (room.isReserved() && num == room.getNumber()) {
                room.setReserved(false);
                System.out.println("Комната " + num + " уже забронирована. Введите другой номер комнаты.");
                break;
            }
        }
    }

    public void reserved() {
        System.out.println("Забронированные комнаты: ");
        for (Room room : rooms) {
            if (room.isReserved()) {
                System.out.println(room.getNumber());
            }
        }
    }
}
