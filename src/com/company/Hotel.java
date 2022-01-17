package com.company;

public class Hotel extends Family implements Pay {

    public Hotel(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Hotel() {
    }

    @Override
    public void method1() {
        {
            System.out.println("гоцнитсада жашагандар аренда толойт;");
        }
    }
}
