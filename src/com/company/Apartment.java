package com.company;

public class Apartment extends Family implements  Pay {


    public Apartment(String name, int age, String gender) {
        super(name, age, gender);


    }
    public Apartment () {
    }
    @Override
    public void method1() {
        System.out.println("квартирада жашагандар комуслуга толойт;");
    }

}
