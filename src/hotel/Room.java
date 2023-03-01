package hotel;

public class Room {
    private int number;
    private int place;
    private boolean wc;
    private boolean tv;
    private boolean conditioner;
    private boolean reserved;

    public Room(int number, int place, boolean wc, boolean tv, boolean conditioner) {
        this.number = number;
        this.place = place;
        this.wc = wc;
        this.tv = tv;
        this.conditioner = conditioner;
        this.reserved = false;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getNumber() {
        return number;
    }

    public int getPlace() {
        return place;
    }

    public boolean isWc() {
        return wc;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public boolean isReserved() {
        return reserved;
    }
}
