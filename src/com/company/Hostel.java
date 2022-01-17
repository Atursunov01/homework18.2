package com.company;

public class Hostel extends Family implements Pay {

    public Hostel(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Hostel() {
    }

    @Override
    public void method1() {
        {
            System.out.println("обшежитиеде жашагандар аренда толойт;");
        }


    }
}
