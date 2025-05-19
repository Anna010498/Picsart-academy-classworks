package am.picsartacademy.oop1;

import am.picsartacademy.oop1.models1.Building;
import am.picsartacademy.oop1.models1.Hotel;
import am.picsartacademy.oop1.models1.School;

public class Main1 {
    public static void main(String[] args) {
        Building building = new Building();
        building.buildingName = "Marriott";
        building.buildingProduct = "hotel";
        building.buildingFloors = 12;
        building.users = "guests";
        building.countStaff = 52;
        building.constructionYear = 2001;
        building.parking = true;

        building.greeting();

        System.out.println(building.buildingName + " " + building.buildingProduct);

        Hotel hotel1 = new Hotel();
        hotel1.buildingName = "Radisson";
        hotel1.buildingProduct = "hotel";
        hotel1.buildingFloors = 15;
        hotel1.parking = true;
        hotel1.countStaff = 76;
        hotel1.setLocation("Azatutyan street");
        hotel1.setAirportTransfer(false);
        hotel1.setStarRating(5);
        hotel1.setRoomService24_7('Y');

        System.out.println(hotel1.buildingName + " " + hotel1.buildingProduct);
        System.out.println("The " + hotel1.buildingProduct + " has " + hotel1.buildingFloors + " floors.");
        System.out.println(hotel1.getLocation());
        System.out.println(hotel1.getAirportTransfer());
        System.out.println(hotel1.getRoomService24_7());


        School sch = new School();
        sch.buildingName = "Ohanyan";
        sch.buildingProduct = "Educational complex";
        sch.buildingFloors = 3;
        sch.parking = false;
        sch.users = "pupils";
        sch.constructionYear = 1997;
        sch.setBuffetService(true);
        sch.setEducation("secondary");
        sch.setCountClassrooms(65);
        sch.setLibrary('Y');

        System.out.println(sch.buildingName + " " + sch.buildingProduct);
        System.out.println(sch.buildingFloors + " floors");
        System.out.println(sch.getBuffetService() + " is available for all " + sch.users);


        sch.greeting();
        hotel1.greeting();






    }
}
