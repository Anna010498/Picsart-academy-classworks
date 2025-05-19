package am.picsartacademy.oop1.models1;

public class Hotel extends Building {
    private int starRating;
    private int roomCount;
    private char roomService24_7;
    private String location;
    private boolean airportTransfer;

    @Override
    public void greeting() {
        System.out.println("Welcome dear guests!");
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public String getLocation() {
        return location;

    }

    public void setAirportTransfer(boolean transfer) {
        airportTransfer = transfer;
    }
    public boolean getAirportTransfer() {
        return airportTransfer;
    }

    public void setStarRating(int rating) {
        starRating = rating;
    }
    public int getStarRating() {
        return starRating;
    }

    public void setRoomService24_7(char service) {
        roomService24_7 = service;
    }
    public char getRoomService24_7() {
        return roomService24_7;
    }

}
