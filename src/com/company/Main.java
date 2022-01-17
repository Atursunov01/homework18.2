package com.company;

public class Main {

    public static void main(String[] args) {

        Apartment apartment1 = new Apartment("Akzhol",20,"мырза");
        Apartment apartment2 = new Apartment("Akzhol",20,"мырза");
        Apartment apartment3 = new Apartment("Akzhol",20,"мырза");
        Apartment apartment4 = new Apartment("Akzhol",20,"мырза");

        Hostel hostel1 = new Hostel("Almaz",23,"мырза");
        Hostel hostel2 = new Hostel("Almaz",23,"мырза");
        Hostel hostel3 = new Hostel("Almaz",23,"мырза");
        Hostel hostel4 = new Hostel("Almaz",23,"мырза");


        Hotel hotel1 = new Hotel("Ravshan",20,"мырза");
        Hotel hotel2 = new Hotel("Ravshan",20,"мырза");
        Hotel hotel3 = new Hotel("Ravshan",20,"мырза");
        Hotel hotel4 = new Hotel("Ravshan",20,"мырза");


        Apartment[] apartments = {apartment1,apartment2,apartment3,apartment4};
        Hotel[] hotels = {hotel1,hotel2,hotel3,hotel4};
        Hostel[] hostels = {hostel1,hostel2,hostel3,hostel4};

        Pay pay = new Apartment();
        pay.method1();

        for (Apartment a:apartments) {
            System.out.println(a);

        }
        System.out.println("" +
                "________________________________");
        Pay pay1 = new Hotel();
        pay1.method1();


        for (Hotel b: hotels) {
            System.out.println(b);

        }
        System.out.println("" +
                "________________________________");
        Pay pay2 = new Hostel();
        pay2.method1();


        for (Hostel s:hostels) {
            System.out.println(s);
        }


    }
}
