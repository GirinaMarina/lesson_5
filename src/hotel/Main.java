package hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        String command;
        while (true) {
            System.out.println("Введите команду: ");
            command = scanner.nextLine();
            if (command.equals("/getFreeRooms")) {
                hotel.getFreeRooms();
            } else if (command.equals("/reserve")) {
                hotel.reserve();
            } else if (command.equals("/reserved")) {
                hotel.reserved();
            }
        }
    }
}