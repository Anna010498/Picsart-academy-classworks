package am.picsartacademy.oop1.models1;

public class School extends Building {
    private int countClassrooms;
    private boolean buffetService;
    private char library;
    private String education;

    @Override
    public void greeting() {
        System.out.println("Welcome dear pupils!");
    }

    public void setCountClassrooms(int rooms) {
        countClassrooms = rooms;
    }
    public int getCountClassrooms() {
        return countClassrooms;
    }

    public void setBuffetService(boolean buffet) {
        buffetService = buffet;
    }
    public boolean getBuffetService() {
        return buffetService;
    }

    public void setEducation(String edu) {
        education = edu;
    }
    public String getEducation() {
        return education;
    }

    public void setLibrary(char lib) {
        library = lib;
    }
    public char getLibrary() {
        return library;
    }
}
